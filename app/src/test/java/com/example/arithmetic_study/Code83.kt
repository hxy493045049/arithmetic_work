package com.example.arithmetic_study

class Code83 {
    //删除排序链表中的重复元素
    //存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
    //返回同样按升序排列的结果链表。
    fun main() {

    }
}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var n=head?:return null
        while(n.next!=null){
            if(n.`val`==n.next!!.`val`){
                n.next=n.next!!.next
            }else{
                n=n.next!!
            }
        }
        return head
    }
}