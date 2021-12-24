package com.hspedu.homework.homeworkself;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/16 - 10 - 16 - 21:48
 * @Description: com.hspedu.homework
 * @version: 1.0
 */
public class Homework02 {

}
class Frock{
    //衣服出场信号起始值
    private static int currentNum = 100000;
    int serialNumber;

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
class TestFork{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock01 = new Frock();
        Frock frock02 = new Frock();
        Frock frock03 = new Frock();
        System.out.println(frock01.getSerialNumber());
        System.out.println(frock02.getSerialNumber());
        System.out.println(frock03.getSerialNumber());
    }
}
