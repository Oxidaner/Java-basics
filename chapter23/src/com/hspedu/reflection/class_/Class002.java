package com.hspedu.reflection.class_;

import com.hspedu.Car;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: zhangshibin
 * @Date: 2021/12/23 - 12 - 23 - 10:58
 * @Description: com.hspedu.reflection.class_
 */
public class Class002 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //找到car类
        String classAllPath = "com.hspedu.Car";
        //获取Class对象
        Class<?> cls = Class.forName(classAllPath);
        //输出cls
        System.out.println(cls); //显示是哪个类的Class对象
        System.out.println(cls.getName()); //返回全类名
        System.out.println(cls.getClass()); //返回运行类型
        System.out.println(cls.getPackage().getName());//获取包名

        Object o = cls.getDeclaredConstructor().newInstance();//java9以后 创建对象实例
        //Car car = (Car) cls.getDeclaredConstructor().newInstance();//java9以后 创建对象实例
        //System.out.println(car);

        //通过反射获取属性brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(o));

        //赋值
        brand.set(o,"奔驰");
        System.out.println(brand.get(o));

        //获取所有字段
        Field[] fields = cls.getFields();
        for (Field o1 :fields) {
            System.out.println(o1.getName() + "-" + o1.get(o));
        }

    }
}
