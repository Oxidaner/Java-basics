package com.hspedu.reflection.classload_;

import com.hspedu.Cat;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {

        String s = "xxxxxx#893#126#zzzzz";
        int n = s.indexOf("#");
        System.out.println(n);
        int k = s.indexOf("#", n+2);
        System.out.println(k);
        String s2 = s.substring(n+2, k);
        System.out.println(s2);


    }
}
