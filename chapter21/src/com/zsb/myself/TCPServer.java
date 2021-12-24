package com.zsb.myself;

import java.io.*;
import java.lang.invoke.VarHandle;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/25 - 11 - 25 - 17:18
 * @Description: com.zsb.myself
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器在8888端口监听");
        Socket socket = serverSocket.accept();

        //读取客户端发送的数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //用Utils获取的流变成byte[]数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //将bytes数组存放到指定路径
        String desPath = "D:/hello.mp4";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desPath));
        bos.write(bytes);
        bos.close();

        //向用户回复"收到图片"
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.flush();
        socket.shutdownOutput();


        //关闭其他资源
        bw.close();
        bis.close();
        socket.close();
        serverSocket.close();

    }
}
