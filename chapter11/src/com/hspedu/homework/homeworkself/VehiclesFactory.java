package com.hspedu.homework.homeworkself;

import com.hspedu.homework.Vehicles;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/16 - 10 - 16 - 23:51
 * @Description: com.hspedu.homework.homeworkself
 * @version: 1.0
 */
class VehiclesFactory{
    private static Horse horse = new Horse();
    private VehiclesFactory(){}
    //要写成static 形式,便于调用
    public static Horse getHorse(){
        return  horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }

}