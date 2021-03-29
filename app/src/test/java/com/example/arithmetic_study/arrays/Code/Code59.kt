package com.example.arithmetic_study.arrays.Code

import org.junit.Test

class Code59 {
    //螺旋矩阵
    @Test
    fun test() {
        val res = generateMatrix(5)

        println(res.toString())
    }

    //给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
    fun generateMatrix(n: Int): Array<IntArray> {
        val data = IntArray(n * n)
        for (n in 0 until n * n) {
            data[n] = n + 1
        }
        val result = Array(n) { IntArray(n) }

        var left = 0
        var right = n - 1
        var cursor = 0
        while (left <= right) {
            println("--- left=$left , right=$right")
            cursor = fill(left, right, result, cursor, data)
            left++
            right--

        }
        return result
    }

    fun soutArray(res: Array<IntArray>) {
        res.forEach {
            it.forEach { value ->
                print("$value,")
            }
            println()
        }
    }

    fun fill(start: Int, end: Int, array: Array<IntArray>, cursor: Int, data: IntArray): Int {
        var c = cursor
        for (i in start..end) { //top
            array[start][i] = data[c]
            c++
        }
        println("top")
        soutArray(array)
        for (i in (start + 1)..end) { //right
            array[i][end] = data[c]
            c++
        }
        println("right")
        soutArray(array)


        for (i in (end - 1) downTo start) { //bottom
            array[end][i] = data[c]
            c++
        }
        println("bottom")
        soutArray(array)

        for (i in (end - 1) downTo (start + 1)) { //left
            array[i][start] = data[c]
            c++
        }
        println("left")
        soutArray(array)
        return c
    }
}