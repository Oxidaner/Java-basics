package com.zsb.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/21 - 11 - 21 - 15:46
 * @Description: com.zsb.homework
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        /**
         * (1) 要编写一个dog.properties   name=tom age=5 color=red
         * (2) 编写Dog 类(name,age,color)  创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化, 并输出
         * (3) 将创建的Dog 对象 ，序列化到 文件 e:\\dog.dat 文件
         */

        String filePath = "chapter19\\src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));

        String name = properties.getProperty("name");//需要将Object类型转型为String类型
        int age = Integer.parseInt(properties.getProperty("age")); //需要将Object类型转型为String类型
        String color = properties.getProperty("color"); //需要将Object类型转型为String类型

        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        String srcFilePath = "D:\\hello.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(srcFilePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("序列化完成~");
    }
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String path = "D:\\hello.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Dog dog = (Dog) ois.readObject();
        System.out.println("反序列化后~");
        System.out.println(dog);
        ois.close();
    }

}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
