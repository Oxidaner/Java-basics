package com.hspedu.homework.self;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/23 - 10 - 23 - 22:52
 * @Description: com.hspedu.homework.self
 * @version: 1.0
 */
public class Homework1 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("====交换前====");
        System.out.println(str);

        try {
            str = reserve(1,4,str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("====交换后====");
        System.out.println(str);
    }
    public static String reserve(int start, int end, String str){

        if(!(str != null && end < str.length() && start < end && start > 0)){
            throw new RuntimeException("参数不正确");
        }
        char [] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end ; i < j ; j--, i++) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);

    }
}
