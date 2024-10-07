package com.shy.data.structure.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:23
 * @description: 单链表节点.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListNode<T> {

    private T val;

    private ListNode<T> next;

}
