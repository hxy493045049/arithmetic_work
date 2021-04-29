package com.example.arithmetic_study.arrays

import org.junit.Test

class Code80 {

    @Test
    fun test() {
        val array = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        val array1 = intArrayOf(1, 1, 1, 2, 2, 3)
        val result = removeDuplicates(array)
        println("size=$result")
    }

    //删除有序数组中的重复项 II
    //给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
    //不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
    private fun removeDuplicates(nums: IntArray): Int {
        if(nums.size<=2){
            return nums.size
        }

        var fast=2
        var slow=2
        while(fast<nums.size){
            if(nums[fast]!=nums[slow-2]){
                nums[slow]=nums[fast]
                slow++
            }
            fast++
        }
        for(i in 0 .. slow){
            print("${nums[i]}  ")
        }
        println("--")
        return slow
    }
}