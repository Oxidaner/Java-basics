package com.hspedu.homework.homeworkself;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/17 - 10 - 17 - 1:22
 * @Description: com.hspedu.homework.homeworkself
 * @version: 1.0
 */
/*
有一个Car2类，有属性temperature（温度），车内有Air（空调）类，有吹风的功能flow，
Air会监视车内的温度，如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，
如果在这之间则关掉空调。实例化具有不同温度的Car对象，调用空调的flow方法，
测试空调吹的风是否正确 . //体现 类与类的包含关系的案例 类(内部类【成员内部类】)
 */
public class Homework07 {
    public static void main(String[] args) {
        //实例化不同的car对象
        Car car = new Car(60);
        car.getAir().flow();

    }
}
class Car{
    int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature >= 40){
                System.out.println("大于40° 吹冷气");
            }else if(temperature < 0){
                System.out.println("小于0° 吹热气");
            }else{
                System.out.println("温度适中,关闭空调");
            }
        }
    }
    //返回一个Air对象
    public Air getAir(){
        return new Air();
    }
}