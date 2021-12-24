package com.zsb.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/27 - 11 - 27 - 12:09
 * @Description: com.zsb.homework
 */
public class Homework03Client {
    public static void main(String[] args) {

        //接收用户输入,指定文件下载名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载的文件名");
        String downloadFileName = scanner.next();


        try (
                //客户端连接服务器
                Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
                //获取和Socket关联的输出流
                OutputStream outputStream = socket.getOutputStream();
        ) {
            //获取和Socket关联的输出流
            outputStream.write(downloadFileName.getBytes());
            //设置写入结束的标志
            socket.shutdownOutput();
            //读取服务端返回的文件(字节数据)
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            byte[] bytes = StreamUtils.streamToByteArray(bis);
            //得到一个输出流，准备将 bytes 写入到磁盘文件
            //比如你下载的是 高山流水 => 下载的就是 高山流水.mp3
            //    你下载的是 韩顺平 => 下载的就是 无名.mp3  文件名 韩顺平.mp3
            String filePath = "D:\\mydat\\" + downloadFileName + ".mp3";
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
            bos.write(bytes);

            System.out.println("客户端下载完毕，正确退出..");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
