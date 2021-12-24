package com.zsb.homework;

import java.io.*;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/21 - 11 - 21 - 15:14
 * @Description: com.zsb.homework
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        /**
         * 要求:  使用BufferedReader读取一个文本文件，为每行加上行号，
         * 再连同内容一并输出到屏幕上。
         */
        String line = null;
        int lineNum = 0;
        String filePath = "D:\\hello.txt";
        File file = new File(filePath);
//        FileInputStream fis = new FileInputStream(file);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis,"gbk"));

//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file),"gbk");
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(++lineNum + " " + line);
        }


        bufferedReader.close();

    }
}
