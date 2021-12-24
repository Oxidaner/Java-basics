package com.hspedu.try_;

import java.util.Scanner;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/17 - 10 - 17 - 17:50
 * @Description: com.hspedu.try_
 * @version: 1.0
 */
public class TryCatchExercise05 {
    public static void main(String[] args) {
        test();
        System.out.println("你输入的是一个整数");
    }
    public static void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String a = scanner.next();
        try {
            int num = Integer.parseInt(a);
        }catch (NumberFormatException e){
            test();
        }

    }
}
