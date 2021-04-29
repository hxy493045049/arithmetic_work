package com.example.arithmetic_study.base;

import org.junit.Test;

public class Test1 {
    @Test
    public void t(){
        Integer a=Integer.valueOf(63);
        Integer b=Integer.valueOf(63);
        System.out.println(a == b);


        Integer a1=Integer.valueOf(163);
        Integer b1=Integer.valueOf(163);
        System.out.println(a1 == b1);
    }

    @Test
    public void tStr(){

        String st1 = "ab";
        String st2 = "abc";
        String st3 = st1 + "c";
        System.out.println(st2 == st3);
        System.out.println(st2.equals(st3));
    }
}
