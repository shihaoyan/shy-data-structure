package com.shy.data.structure.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:45
 * @description:
 */
@AllArgsConstructor
@Getter
public enum SortTypeEnum {
    SELECT_SORT("选择排序", 1),
    INSERT_SORT("插入排序", 2),
    BUBBLE_SORT("冒泡排序", 3),
    MERGE_SORT("归并排序", 4),
    SHELL_SORT("希尔排序", 5),
    QUICK_SORT("快速排序", 6),
    HEAP_SORT("堆排序", 7),
    COUNT_SORT("计数排序", 8),
    BUCKET_SORT("桶排序", 9),
    RADIX_SORT("基数排序", 10);

    private final String name;

    private final int code;

    /**
     * 根据给定的代码值获取对应的枚举类型
     *
     * @param code 代码值，用于查找对应的枚举类型
     * @return 如果找到对应的枚举类型，则返回该枚举类型；否则返回快速排序枚举类型
     */
    public static SortTypeEnum getEnum(int code) {
        // 遍历所有枚举类型
        for (SortTypeEnum sortTypeEnum : SortTypeEnum.values()) {
            // 检查当前枚举类型的代码是否与给定的代码值相等
            if (sortTypeEnum.getCode() == code) {
                // 如果相等，则返回该枚举类型
                return sortTypeEnum;
            }
        }
        // 如果没有找到对应的枚举类型，则返回默认的快速排序枚举类型
        return SortTypeEnum.QUICK_SORT;
    }
}
