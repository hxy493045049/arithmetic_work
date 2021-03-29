package com.example.arithmetic_study.arrays

import org.junit.Test

class Code209 {
    //给定一个含有 n 个正整数的数组和一个正整数 target 。
    //找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。

    class Solution {
        @Test
        fun test(){
            val nums= intArrayOf(2,3,1,2,4,3)
            println(minSubArrayLen(7,nums))
        }

        //此题采用滑动窗口的思想
        fun minSubArrayLen(target: Int, nums: IntArray): Int {
            var left = 0
            var minLength = 0

            var sum = 0
            nums.forEachIndexed { index, i ->
                sum += i
                while(sum >= target){
                    val length = index+1 - left
                    if (minLength == 0) {
                        minLength = length
                    } else {
                        minLength = Math.min(minLength, length)
                    }
                    sum-=nums[left]
                    left++
                }
            }
            return minLength
        }
    }
}