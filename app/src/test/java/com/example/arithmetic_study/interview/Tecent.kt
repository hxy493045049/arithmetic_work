package com.example.arithmetic_study.interview

import org.junit.Test


class Tecent {

    @Test
    fun entrance() {
        val data = arrayOf(1, 2, 5, 2, 5, 2, 5, 6)
        method(data)
    }

    //找出数组中重复最多的元素 并打印次数
    fun method(data: Array<Int>) {
        val map = mutableMapOf<Int, Int>()
        data.forEach {
            var n = map[it]
            if (n == null) {
                map[it] = 1
            } else {
                map[it] = ++n
            }
        }

        var max = -1
        var target = -1
        map.forEach { (n, value) ->
            if (max < value) {
                max = value
                target = n
            }
        }

        println("数字 = $target, 次数=$max")
    }
}