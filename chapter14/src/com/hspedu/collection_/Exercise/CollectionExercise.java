package com.hspedu.collection_.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/24 - 10 - 24 - 14:20
 * @Description: com.hspedu.collection_.Exercise
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小红",18));
        list.add(new Dog("小明",20));
        list.add(new Dog("小蓝",21));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
