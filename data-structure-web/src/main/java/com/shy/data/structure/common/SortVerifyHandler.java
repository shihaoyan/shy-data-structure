package com.shy.data.structure.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

/**
 * @author: shihaoyan
 * @date: 2024/10/7 13:42
 * @description:
 */
@Aspect
@Component
public class SortVerifyHandler {

    @Pointcut("@annotation(com.shy.data.structure.common.SortVerify)")
    public void sortVerify() {

    }

    @Around("sortVerify()")
    public Object verify(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取结果
        Result<Map<String, Object>> result = (Result<Map<String, Object>>) joinPoint.proceed();
        if (result.getCode() != 1) {
            return result;
        }
        // 获取结果
        Map<String, Object> data = result.getData();
        // 拿到原始数据
        int[] originArray = (int[]) data.get("origin");
        // 拿到排序后数据
        int[] array = (int[]) data.get("sorted");
        // 是否排序成功
        data.put("res", isSortComplete(originArray, array));
        data.put("origin", Arrays.toString(originArray));
        data.put("sorted", Arrays.toString(array));
        return result;
    }

    /**
     * 检查数组是否已正确排序
     * 该方法通过将原始数组排序并与给定数组进行比较来判断数组是否已经按照升序排列
     *
     * @param originArray 原始数组，用于排序比较的基准
     * @param array       待检查数组，判断该数组是否已按升序排列
     * @return boolean 表示数组是否已正确排序，正确则返回true，否则返回false
     */
    private boolean isSortComplete(int[] originArray, int[] array) {
        // 先对原始数组进行排序
        int[] tempArr = Arrays.copyOf(originArray, originArray.length);
        Arrays.sort(tempArr);
        // 比较数组是否相等
        return Arrays.equals(tempArr, array);
    }

}
