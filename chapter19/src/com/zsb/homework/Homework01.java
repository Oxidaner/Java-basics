package com.zsb.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/21 - 11 - 21 - 14:53
 * @Description: com.zsb.homework
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        /**
         *(1) 在判断D盘下是否有文件夹mytemp ,如果没有就创建mytemp
         *(2) 在e:\\mytemp 目录下, 创建文件 hello.txt
         *(3) 如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
         *(4) 并且在hello.txt 文件中，写入 hello,world~
         */
        String directoryFile = "D:\\mytemp";
        File file = new File(directoryFile);
        if (!file.exists()){
            file.mkdir();
            System.out.println(directoryFile + "创建成功");
        }else {
            System.out.println(directoryFile + "已经存在");
        }


        String filepath = directoryFile + "\\hello.txt";
        file = new File(filepath);
        if (!file.exists()){
            if (file.createNewFile()) {
                System.out.println("文件创建成功");

                BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
                bw.write("hello,world~");
                bw.close();
            }else{
                System.out.println("文件创建失败");
            }
        }else{
            System.out.println("文件已经存在");
        }


    }
}
