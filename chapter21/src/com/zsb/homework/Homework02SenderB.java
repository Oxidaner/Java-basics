package com.zsb.homework;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/27 - 11 - 27 - 12:08
 * @Description: com.zsb.homework
 */
public class Homework02SenderB {
    public static void main(String[] args) {

        try (
                //创建DatagramSocket对象,在9998接受数据
                DatagramSocket socket = new DatagramSocket(9998);
        ) {
            //将要发送的数据包装DatagramPacket对象
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的问题: ");
            String question = scanner.next();
            //创建数据包
            byte[] data = question.getBytes();

            //说明: 封装的 DatagramPacket对象 data 内容字节数组 , data.length , 主机(IP) , 端口
            DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.231.1"),8888);

            //发送
            socket.send(packet);

            //=== 接收从A端回复的信息
            //(1)   构建一个 DatagramPacket 对象，准备接收数据
            //   在前面讲解UDP 协议时，老师说过一个数据包最大 64k
            byte[] buf = new byte[1024];
            packet = new DatagramPacket(buf, buf.length);
            //(2)    调用 接收方法, 将通过网络传输的 DatagramPacket 对象
            //   填充到 packet对象
            //老师提示: 当有数据包发送到 本机的9998端口时，就会接收到数据
            //   如果没有数据包发送到 本机的9998端口, 就会阻塞等待.
            socket.receive(packet);

            //(3)  可以把packet 进行拆包，取出数据，并显示.
            int length = packet.getLength();//实际接收到的数据字节长度
            data = packet.getData();//接收到数据
            String s = new String(data, 0, length);
            System.out.println(s);



        }  catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("B端退出");
    }
}
