package com.shy.shy.data.structure.utils;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:21
 * @description: 数组个工具.
 */
@SuppressWarnings("all")
public final class ArrayUtils {

    private ArrayUtils() {
    }

    /**
     * 判断数组是否为空.
     *
     * @param array 数组.
     * @return true:为空，false:不为空.
     */
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    /**
     * 对数组的i,j位置进行交换.
     *
     * @param array 数组.
     * @param i     i位置.
     * @param j     j位置.
     */
    public static void swap(Object[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            return;
        }
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
