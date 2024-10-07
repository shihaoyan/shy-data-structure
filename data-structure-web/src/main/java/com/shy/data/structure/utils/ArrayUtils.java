package com.shy.data.structure.utils;

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
    public static boolean isEmpty(int[] array) {
        return array == null || array.length == 0;
    }

    /**
     * 对数组的i,j位置进行交换.
     *
     * @param array 数组.
     * @param i     i位置.
     * @param j     j位置.
     */
    public static void swap(int[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 生成一个指定长度的随机整数数组
     * 数组中的每个元素都是0到99之间的随机整数
     *
     * @param length 数组的长度
     * @return 生成的随机整数数组
     */
    public static int[] randomArray(int length) {
        // 随机生成length长度的数组
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            // 为数组的每个位置赋一个0到99之间的随机整数
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    /**
     * 生成一个随机整数数组
     * 数组中的每个元素将在指定范围内随机生成
     *
     * @param length 数组的长度，表示生成的数组应包含多少个元素
     * @param start  元素的最小值，生成的元素将不小于此值
     * @param end    元素的最大值，生成的元素将不大于此值
     * @return 返回一个具有指定长度和元素范围的随机整数数组
     */
    public static int[] randomArray(int length, int start, int end) {
        // 随机生成length长度的数组，从start开始到end结束
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            // 对于数组中的每个位置，都随机生成一个start到end范围内的整数
            array[i] = (int) (Math.random() * (end - start + 1) + start);
        }
        return array;
    }

}
