package com.example.arithmetic_study.arrays


import org.junit.Test

class Code35 {
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //你可以假设数组中无重复元素。

    //可以将问题转换为：「在一个有序数组中找第一个大于等于 \textit{target}target 的下标」。
    @Test
    fun test() {
        val nums = intArrayOf(1, 3, 5, 6)
        println(searchInsert(nums, 2))
    }

    fun searchInsert(nums: IntArray, target: Int): Int {
        val len = nums.size

        var start = 0
        var end = len - 1
        var ans = len

        while (start <= end) {
            val mid = (end - start).shr(2) + start
            if (target <= nums[mid]) {
                ans = mid
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return ans
    }
}