package com.hspedu.map_.myself;

import javax.swing.text.Keymap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,new Employee("marry",1000,1));
        hashMap.put(2,new Employee("jack",2000,2));
        hashMap.put(3,new Employee("smith",30000,3));
        
        //增强for
        Set keyset = hashMap.keySet();
        for (Object key : keyset) {
            Employee o = (Employee) hashMap.get(key);
            if(o.getSal() > 18000){
                System.out.println(o);
            }
        }
        //迭代器

        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Employee o = (Employee) hashMap.get(key);
            if(o.getSal() >18000){
                System.out.println(o);
            }
        }
        //entryset迭代器
        Set entrySet = hashMap.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object key =  iterator1.next();
            Map.Entry entry = (Map.Entry) key;
            Employee o = (Employee) hashMap.get(entry.getKey());
            if (o.getSal() > 18000){
                System.out.println(entry.getValue());
            }
        }

    }
}
class Employee{
    private String name;
    private double sal;
    private int id;

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
}
