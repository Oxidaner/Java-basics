package com.zsb.myself;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/25 - 11 - 25 - 17:18
 * @Description: com.zsb.myself
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //读取文件
        String filePath = "D://child.jpg";
        //因为要传入的是一个InputStream类的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //利用Utils吧Buffer类型转换为types数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //获取Socket输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        //写入数组
        bos.write(bytes);

        //创建结束标志
        socket.shutdownOutput();

        //读取
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        //关闭相关的流
        bos.close();
        socket.close();
        bis.close();
    }
}
