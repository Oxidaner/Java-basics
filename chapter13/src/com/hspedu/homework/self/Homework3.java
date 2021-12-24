package com.hspedu.homework.self;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/24 - 10 - 24 - 0:09
 * @Description: com.hspedu.homework.self
 */
public class Homework3 {
    public static void main(String[] args) {
        String str = "han shun ping";
       format(str);
    }
    public static void format(String str){
        if(str == null){
            System.out.println("字符串不能为空");
            return;
        }
        String[] arr ;
        arr = str.split(" ");
        if(arr.length != 3){
            System.out.println("输入的字符串不正确");
            return;
        }
        String format = String.format("%s,%s.%c", arr[2], arr[0], arr[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
