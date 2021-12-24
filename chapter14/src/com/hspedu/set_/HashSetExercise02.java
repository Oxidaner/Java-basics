package com.hspedu.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/30 - 10 - 30 - 11:46
 * @Description: com.hspedu.set_
 */
@SuppressWarnings({"all"})
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        MyDate myDate01 = new MyDate(1,1,1);
        MyDate myDate02 = new MyDate(1,1,1);
        MyDate myDate03 = new MyDate(3,3,3);
        hashSet.add(new Employees("milan",100,myDate01));
        hashSet.add(new Employees("milan",100,myDate02));
        hashSet.add(new Employees("jack",300,myDate03));
        System.out.println("hashset" + hashSet);
    }
}
class Employees {
    private String name;
    private int sal;
    MyDate birthday;

    public Employees(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return sal == employees.sal &&
                Objects.equals(name, employees.name) &&
                Objects.equals(birthday, employees.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}