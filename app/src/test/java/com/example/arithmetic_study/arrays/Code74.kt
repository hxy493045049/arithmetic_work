package com.example.arithmetic_study.arrays

import org.junit.Test

class Code74 {
    //编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
    //每行中的整数从左到右按升序排列。
    //每行的第一个整数大于前一行的最后一个整数。
    //[[1,3,5,7],[10,11,16,20],[23,30,34,60]]
    @Test
    fun test() {
        //        val matrix: Array<IntArray> = arrayOf(
        //            intArrayOf(1, 3, 5, 7),
        //            intArrayOf(10, 11, 16, 20),
        //            intArrayOf(23, 30, 34, 60)
        //        )

        val matrix: Array<IntArray> = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )

        println(searchMatrix(matrix = matrix, 3))
    }

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val len = matrix.size
        val subLen = matrix[0].size
        if (target < matrix[0][0] || target > matrix[len - 1][subLen - 1]) {
            return false
        }
        val column = searchColumn(0, len - 1, matrix, target)
        val result = seachRows(0, subLen - 1, matrix[column], target)
        println("$column , $result")
        return result >= 0
    }

    private fun seachRows(start: Int, end: Int, array: IntArray, target: Int): Int {
        var s = start
        var e = end
        var mid = (s + e) / 2
        while (s <= e) {
            mid = (s + e) / 2
            if (array[mid] == target) {
                return mid
            }
            if (array[mid] > target) {
                e = mid - 1
            } else {
                s = mid + 1
            }
        }
        return -1
    }

    fun searchColumn(start: Int, end: Int, matrix: Array<IntArray>, target: Int): Int {
        var top = start
        var bottom = end
        var mid = (top + bottom) / 2
        val len = matrix[0].size
        while (top <= bottom) {
            mid = (top + bottom) / 2
            if (target >= matrix[mid][0] && target <= matrix[mid][len - 1]) {
                return mid
            }
            if (target < matrix[mid][0]) {
                bottom = mid - 1
            } else {
                top = mid + 1
            }
        }
        return mid
    }
}