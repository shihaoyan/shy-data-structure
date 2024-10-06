package com.shy.shy.data.structure.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:23
 * @description: 二叉树结构.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode<T> {

    private T data;

    private TreeNode<T> left;

    private TreeNode<T> right;

}
