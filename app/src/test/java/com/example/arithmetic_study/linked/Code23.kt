package com.example.arithmetic_study.linked

import com.example.arithmetic_study.ListNode
import org.junit.Test

class Code23 {
    @Test
    fun test() {
        val v = ListNode(7)
        val v1 = ListNode(7)
        val v2 = ListNode(7)
        val v3 = ListNode(7)
        val v4 = ListNode(7)
        val v5 = ListNode(7)
        val v6 = ListNode(7)
        v.next = v1
        v1.next = v2
        v2.next = v3
        v3.next = v4
        v4.next = v5
        v5.next = v6

        var node = removeElements(v, 7)
        while (node != null) {
            println(node.`val`)
            node = node.next
        }
    }

    //给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var vHead = ListNode(0)
        vHead.next = head
        var pre: ListNode? = vHead
        var next = vHead.next

        while (next != null) {
            if (next.`val` == `val`) {
                pre?.next = next.next
            }else{
                pre = pre?.next
            }

            next = pre?.next
        }

        return vHead.next
    }
}