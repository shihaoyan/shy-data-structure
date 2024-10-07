package com.shy.data.structure.service.sort;

/**
 * @author: shihaoyan
 * @date: 2024/10/7 13:35
 * @description:
 */
public interface SortService {

    /**
     * 选择排序.
     *
     * @param array 待排序数组.
     */
    void selectSort(int[] array);

    /**
     * 插入排序.
     *
     * @param array 待排序数组.
     */
    void insertSort(int[] array);

    /**
     * 二分插入排序.
     *
     * @param array 待排序数组.
     */
    void binaryInsertSort(int[] array);

    /**
     * 堆排序.
     *
     * @param array 待排序数组.
     */
    void heapSort(int[] array);

    /**
     * 归并排序.
     *
     * @param array 待排序数组.
     */
    void mergeSort(int[] array);

    /**
     * 快速排序.
     *
     * @param array 待排序数组.
     */
    void quickSort(int[] array);

}
