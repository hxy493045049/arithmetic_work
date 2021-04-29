package com.example.arithmetic_study.arrays

class Code26 {
    //给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
    //不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

    fun removeDuplicates(nums: IntArray): Int {

        if(nums.size==1){
            return nums[0]
        }
        var index=0
        var cursor=index

        for(i in 0 until nums.size){
            if(cursor<nums.size && nums[cursor]!=nums[index]){
                index++
                nums[index]=nums[cursor]
            }
            cursor++
        }
        return index+1
    }
}