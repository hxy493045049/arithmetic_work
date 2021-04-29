package com.example.arithmetic_study.linked

import org.junit.Test

class didi {
    //给定一个二叉树，返回其节点的锯齿形层序遍历。
    //  （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间之间交替进行）。


    @Test
    fun test() {
        val node = Node(0)
        val l1 = Node(1)
        val r1 = Node(2)
        node.left = l1
        node.right = r1

        if (node.left == null && node.right == null) {
            return println(node.data)
        }
        d.add(node)
        printN()
    }

    val d = ArrayDeque<Node>()
    val d1 = ArrayDeque<Node>()
    var direction: Boolean=false

    fun printN( ) {
        if (direction) {
            while (!d.isEmpty()) {
                val n = d.removeLast()
                print(n.data)

                n.left?.let {
                    d1.add(it)
                }
                n.right?.let {
                    d1.add(it)
                }
            }
            direction=!direction
            printN()
        }else{

        }
    }


    class Node(val data: Int) {
        var left: Node? = null
        var right: Node? = null
    }


}