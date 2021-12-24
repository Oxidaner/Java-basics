package com.hspedu.generic.myself;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/6 - 11 - 06 - 10:57
 * @Description: com.hspedu.generic.myself
 */
public class Homework {
    public static void main(String[] args) {

    }
    @Test
    public void testList() {
        //说明
        //这里我们给T 指定类型是User
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1,10,"jack"));
        dao.save("002", new User(2,18,"king"));
        dao.save("003", new User(3,38,"smith"));

        List<User> list = dao.list();

        System.out.println("list=" + list);

        dao.update("003", new User(3, 58, "milan"));
        dao.delete("001");//删除
        System.out.println("===修改后====");
        list = dao.list();
        System.out.println("list=" + list);

        System.out.println("id=003 " + dao.get("003"));//milan

    }

}

