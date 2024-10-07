package com.shy.data.structure.controller;

import com.shy.data.structure.common.Result;
import com.shy.data.structure.common.SortTypeEnum;
import com.shy.data.structure.common.SortVerify;
import com.shy.data.structure.service.sort.SortServiceImpl;
import com.shy.data.structure.utils.ArrayUtils;
import com.shy.data.structure.service.sort.SortService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:33
 * @description:
 */
@RestController
@Slf4j
public class SortController {

    private final SortService sortService;

    public SortController(SortServiceImpl sortService) {
        this.sortService = sortService;
    }


    /**
     * 排序.
     *
     * @param type   排序方法.
     * @param length 生成数组的大小.
     * @return 排序结果.
     */
    @RequestMapping("/sort")
    @SortVerify
    public Result<Map<String, Object>> selectSort(Integer type, Integer length, Integer numberStart, Integer numberEnd) {
        int i = 1 / 0;
        // 默认排序类型为1
        type = type == null ? 1 : type;
        // 默认数组长度为10
        length = length == null ? 10 : length;

        // 默认数组范围.
        numberStart = numberStart == null ? 0 : numberStart;
        numberEnd = numberEnd == null ? 100 : numberEnd;
        if (numberStart > numberEnd) {
            return Result.fail("起始数字不能大于结束数字");
        }

        // 随机生成数组
        Map<String, Object> map = new HashMap<>();
        int[] array = ArrayUtils.randomArray(length, numberStart, numberEnd);
        int[] originArray = Arrays.copyOf(array, array.length);
        // 打印排序类型和排序前的数组
        log.info("排序类型：{}, 数组长度：{}, 数字范围：{} - {}", SortTypeEnum.getEnum(type).getName(), length, numberStart, numberEnd);
        log.info("排序类型：{}, 排序前：{}", SortTypeEnum.getEnum(type).getName(), Arrays.toString(array));
        // 根据类型选择不同的排序方式
        long sortStartTime = System.currentTimeMillis();
        switch (SortTypeEnum.getEnum(type)) {
            case SELECT_SORT:
                sortService.selectSort(array);
                break;
            case INSERT_SORT:
                sortService.insertSort(array);
                break;
            case BUBBLE_SORT:
                sortService.binaryInsertSort(array);
                break;
            case MERGE_SORT:
                sortService.heapSort(array);
                break;
            case SHELL_SORT:
                sortService.mergeSort(array);
                break;
            case QUICK_SORT:
                sortService.quickSort(array);
                break;
            default:
                // 如果排序类型不存在，返回失败结果
                return Result.fail("排序类型不存在");
        }
        long sortEndTime = System.currentTimeMillis();
        // 填充类型
        map.put("time", sortEndTime - sortStartTime);
        map.put("type", SortTypeEnum.getEnum(type).getName());
        // 填充原始数据
        map.put("origin", originArray);
        // 填充排序后数据
        map.put("sorted", array);
        // 打印排序类型和排序后的数组
        log.info("排序类型：{}, 排序后：{}", SortTypeEnum.getEnum(type).getName(), Arrays.toString(array));
        // 返回成功结果
        return Result.success(map);
    }

}
