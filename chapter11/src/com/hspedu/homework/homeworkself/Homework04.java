package com.hspedu.homework.homeworkself;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/16 - 10 - 16 - 22:19
 * @Description: com.hspedu.homework.homeworkself
 * @version: 1.0
 */
//public class Homework04 {
//    public static void main(String[] args) {
//        //实现类
//        Cellphone cellphone = new Cellphone();
//        cellphone.testWork(new Computer() {
//            @Override
//            public int work() {
//                return 1020;
//            }
//        });
//
//    }
//}
//interface Computer{
//    public int work();
//}
//class Cellphone{
//    public void testWork(Computer computer){  //要传入一个接口
//        System.out.println(computer.work());
//    };
//}
public class Homework04 {
    public static void main(String[] args) {
        //实现类
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Computer() {
            @Override
            public int work(int n1, int n2) {
                return n1 + n2;
            }
        }, 11, 12);
    }
}
interface Computer {
    public int work(int n1, int n2);
}

class Cellphone {
    public void testWork(Computer computer, int n1, int n2) {  //要传入一个接口
        int result = computer.work(n1, n2);
        System.out.println(result);
    }
}