package com.hspedu.homework.homeworkself;


/**
 * @Author: zhangshibin
 * @Date: 2021/10/16 - 10 - 16 - 23:08
 * @Description: com.hspedu.homework.homeworkself
 * @version: 1.0
 */


//编一个类A，在类中定义局部内部类B，B中有一个私有final常量name，有一个方法show()打印常量name。进行测试
//进阶：A中也定义一个私有的变量name，在show方法中打印测试

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
        new A().f1();
    }
}
class A{
    private String name = "小明";
    public void f1(){
        class B{
            private final String name = "小米";
            public void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}