package com.hspedu.homework.homeworkself;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/16 - 10 - 16 - 22:13
 * @Description: com.hspedu.homework.homeworkself
 * @version: 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
abstract class Animal{
    abstract void shout();
}
class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("狗会汪汪叫");
    }
}
