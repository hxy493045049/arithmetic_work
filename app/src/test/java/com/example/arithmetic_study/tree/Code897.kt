package com.example.arithmetic_study.tree

import com.example.arithmetic_study.base.TreeNode
import org.junit.Test

class Code897 {
    //897. 递增顺序搜索树

    @Test
    fun increasingBST(root: TreeNode?): TreeNode? {
        if (root == null) return null
        if (root.left == null && root.right == null) return root

        val data = arrayListOf<Int>()
        sortNode(root, data)

        val dummyHead = TreeNode(-1)
        var node = dummyHead

        data.forEach {
            val right = TreeNode(it)
            node.right = right
            node = right
        }
        return dummyHead.right
    }

    private fun sortNode(node: TreeNode?, array: ArrayList<Int>) {
        node ?: return
        sortNode(node.left, array)
        array.add(node.`val` ?: -1)
        sortNode(node.right, array)
    }
}