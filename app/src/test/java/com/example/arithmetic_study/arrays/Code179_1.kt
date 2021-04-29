package com.example.arithmetic_study.arrays

import java.util.*

class Code179_1 {
    //给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
    //注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。

    fun largestNumber(nums: IntArray): String {
        val result = arrayOfNulls<String>(nums.size)
        nums.forEachIndexed { index, i ->
            result[index] = i.toString()
        }

        val c = Comparator<String> { o1, o2 ->
            val s1="$o1$o2"
            val s2="$o2$o1"
            s1.compareTo(s2)
        }
        Arrays.sort(result){ a:String?,b:String?->
            val sa = a + b
            val sb = b + a
            sb.compareTo(sa)
        }

        val res=java.lang.StringBuilder()
        result.forEach {
            res.append(it)
        }
        val len=res.single()
        val k=0
//        while()
        return ""
    }


    fun largestNumber1(nums: IntArray): String? {
        val n = nums.size
        val ss = arrayOfNulls<String>(n)
        for (i in 0 until n) ss[i] = "" + nums[i]
        Arrays.sort(ss) { a: String?, b: String? ->
            val sa = a + b
            val sb = b + a
            sb.compareTo(sa)
        }
        val sb = StringBuilder()
        for (s in ss) sb.append(s)
        val len = sb.length
        var k = 0
        while (k < len - 1 && sb[k] == '0') k++
        return sb.substring(k)
    }
}