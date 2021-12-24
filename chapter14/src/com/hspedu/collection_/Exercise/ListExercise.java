package com.hspedu.collection_.Exercise;

import com.hspedu.list_.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/24 - 10 - 24 - 17:05
 * @Description: com.hspedu.collection_.Exercise
 */
@SuppressWarnings({"all"})
public class ListExercise {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 19));
        list.add(new Book("三国", "罗贯中", 80));

        for (Object o : list) {
            System.out.println(o);
        }

        sort(list);

        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static void sort(List list){
        for(int i = 0; i < list.size() - 1; i++){
            for (int j = 0; j < list.size() - i - 1; j++){
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()){
                    list.set(j , book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}
