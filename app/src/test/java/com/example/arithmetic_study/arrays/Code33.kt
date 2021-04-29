package com.example.arithmetic_study.arrays

import org.junit.Test

class Code33 {
    //整数数组 nums 按升序排列，数组中的值 互不相同 。
    //在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
    //给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。

    @Test
    fun test() {
        val data = intArrayOf(3,1)
        println(search(data, 1))
    }

    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1
        if (nums.size == 1) {
            return if (target == nums[0]) {
                0
            } else {
                -1
            }
        }

        var index = 0
        val length = nums.size

        if(nums[0]<nums[length-1]){
            return binarySearch(nums,0,length-1,target)
        }

        for (i in 0 until length - 1) {
            index = i
            if (nums[index] > nums[++index]) {
                break
            }
        }

        if (target > nums[index - 1]) {
            return -1
        } else if (target > nums[length - 1]) {
            return binarySearch(nums, 0, index - 1, target)
        } else {
            return binarySearch(nums, index , length - 1, target)
        }
    }


    fun binarySearch(data: IntArray, start: Int, end: Int, target: Int): Int {
        if (data.isEmpty()) return -1
        assert(start >= 0)
        assert(end < data.size)
        var mid: Int
        var l = start
        var r = end
        while (l <= r) {
            mid = l + (r - l) / 2
            if (data[mid] == target) {
                return mid
            } else if (data[mid] < target) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return -1
    }

    fun search1(nums: IntArray, target: Int): Int {
        val n = nums.size
        if (n == 0) {
            return -1
        }
        if (n == 1) {
            return if (nums[0] == target) 0 else -1
        }
        var l = 0
        var r = n - 1
        while (l <= r) {
            val mid = (l + r) / 2
            if (nums[mid] == target) {
                return mid
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1
                } else {
                    l = mid + 1
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1
                } else {
                    r = mid - 1
                }
            }
        }
        return -1
    }
}