package com.zsb.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/27 - 11 - 27 - 12:07
 * @Description: com.zsb.homework
 */
public class Homework01Client {
    public static void main(String[] args)  {
        try (
                //先连接
                Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
                //连接上后 创建写入流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                //创建读取流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            //从键盘读取用户的问题
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的问题");
            String question = scanner.next();

            //将问题写入连接
            bw.write(question);
            bw.newLine();//插入一个换行符，表示写入的内容结束, 注意，要求对方使用readLine()!!!!
            bw.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

            //读取流中的数据
            String s = br.readLine();
            System.out.println(s);

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
