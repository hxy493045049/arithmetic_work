package com.example.arithmetic_study.arrays

import org.junit.Test

class Code53 {
    class Solution {

        @Test
        fun test(){
            val nums= intArrayOf(4, -1, 2)
            println(maxSubArray1(nums))
        }

        fun maxSubArray1(nums: IntArray): Int {
            var newSum :Int= Int.MIN_VALUE
            var result = 0
            for (n in nums) {
                newSum = Math.max(newSum + n, n)
                result = Math.max(result, newSum)
            }
            return result
        }

        fun maxSubArray(nums: IntArray): Int {
            var pre = 0
            var maxAns = nums[0]
            for (x in nums) {
                pre = Math.max(pre + x, x)
                maxAns = Math.max(maxAns, pre)
            }
            return maxAns
        }
    }

}