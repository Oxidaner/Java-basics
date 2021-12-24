package com.zsb.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLOutput;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/27 - 11 - 27 - 12:07
 * @Description: com.zsb.homework
 */
public class Homework01Server {
    public static void main(String[] args) {
        System.out.println("服务器在9999端口监听 等待连接...");
        try (
                //创建连接
                ServerSocket serverSocket = new ServerSocket(9999);
                //接受连接
                Socket socket = serverSocket.accept();
                //创建接受流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //创建新的写入流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        ) {


            //读取流中的信息
            String s = br.readLine();
            String answer = "";
            if ("name".equals(s)){
                answer = "我是zsb";
            }else if("hobby".equals(s)) {
                answer = "编写java程序";
            }else{
                answer = "你说的什么";
            }
            //将返回的文件放入输出流
            bw.write(answer);
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
