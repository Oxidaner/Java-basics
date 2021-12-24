package com.hspedu.arrays_.ArrayExercisemyself;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/22 - 10 - 22 - 18:12
 * @Description: com.hspedu.arrays_.ArrayExercisemyself
 * @version: 1.0
 */

 /*
        案例：自定义Book类，里面包含name和price，按price排序(从大到小)。
        要求使用两种方式排序 , 有一个 Book[] books = 4本书对象.

        使用前面学习过的传递 实现Comparator接口匿名内部类，也称为定制排序。
        [同学们完成这个即可 10min  ],
        可以按照 price (1)从大到小 (2)从小到大 (3) 按照书名长度从大到小

         */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃~", 300);

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2)  { //因为传入的是数组
                Book o11 = (Book) o1;
                Book o21 = (Book) o2;
                double priceVar = o11.getPrice() - o21.getPrice();
                if(priceVar > 0){
                    return 1;
                }else if(priceVar < 0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        /*Arrays.sort(books,new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                Book o11 = (Book) o1;
                Book o21 = (Book) o2;
                return (int)(o21.getPrice() - o11.getPrice());
            }
        });*/
       /* Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book o11 = (Book) o1;
                Book o21 = (Book) o2;
                return o21.getName().length()-o11.getName().length(); //从大到小
            }
        });*/

        System.out.println(Arrays.toString(books));
    }
}
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}