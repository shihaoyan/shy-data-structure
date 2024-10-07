package com.shy.data.structure.service.sort;

import com.shy.data.structure.utils.ArrayUtils;
import org.springframework.stereotype.Service;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:28
 * @description:
 */
@Service
public class SortServiceImpl implements SortService {

    /**
     * 选择排序
     *
     * @param array 待排序数组.
     */
    @Override
    public void selectSort(int[] array) {
        // 为空判断.
        if (ArrayUtils.isEmpty(array)) {
            return;
        }
        int length = array.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;
            // 最开始假设 i 的位置是最小的.
            for (int j = i + 1; j < length; j++) {
                // 找到最小的值.
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换i和最小值的位置.
            ArrayUtils.swap(array, i, minIndex);
        }
    }

    public void insertSort(int[] array) {

    }

    public void binaryInsertSort(int[] array) {

    }

    public void heapSort(int[] array) {

    }

    public void mergeSort(int[] array) {

    }

    public void quickSort(int[] array) {

    }

}
