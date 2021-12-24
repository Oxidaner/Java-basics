package com.hspedu.homework.self;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/17 - 10 - 17 - 20:37
 * @Description: com.hspedu.homework.self
 * @version: 1.0
 */

 /*
        编写应用程序EcmDef.java，接收命令行的两个参数(整数)，计算两数相除。
计算两个数相除，要求使用方法 cal(int n1, int n2)
对数据格式不正确(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException)、除0 进行异常处理(ArithmeticException)。
         */
public class Homework01 {
    public static void main(String[] args) {
        try {
            if(!(args.length == 2)){
                throw new ArrayIndexOutOfBoundsException("参数个数不正确");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double result = cal(n1,n2);
            System.out.println("计算结果是" + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();//printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因。
        } catch (NumberFormatException e){
            System.out.println("数据格式不正确");
        } catch (ArithmeticException e){
            System.out.println("出现了除0的异常");
        }
    }
    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
