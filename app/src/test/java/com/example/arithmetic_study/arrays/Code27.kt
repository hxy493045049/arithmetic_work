package com.example.arithmetic_study.arrays

import org.junit.Test

class Code27 {
    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    //不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
    //元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
    @Test
    fun test() {
        val nums = intArrayOf(3, 2, 2, 3)
        println(removeElement(nums, 3))
    }

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var len = nums.size
        if (len == 0) {
            return len
        }
        var newIndex = 0


        for (cursor in nums.indices) {
            if (nums[cursor] != `val`) {
                nums[newIndex] = nums[cursor]
                newIndex++
            }
        }
        return newIndex + 1
    }
}