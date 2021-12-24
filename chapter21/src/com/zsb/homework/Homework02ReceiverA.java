package com.zsb.homework;

import java.io.IOException;
import java.net.*;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/27 - 11 - 27 - 12:08
 * @Description: com.zsb.homework
 */
public class Homework02ReceiverA {
    public static void main(String[] args) {

        try (
                //创建一个 DatagramSocket 对象，准备在8888接收数据
                DatagramSocket socket = new DatagramSocket(8888);

        ) {
            //构建一个 DatagramPacket 对象，准备接收数据
            //在前面讲解UDP 协议时，老师说过一个数据包最大 64k
            //创建一个数据包
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf,buf.length);
            //调用 接收方法, 将通过网络传输的 DatagramPacket 对象
            //填充到 packet对象
            System.out.println("接收端 等待接收问题 ");
            socket.receive(packet);

            //可以把packet 进行拆包，取出数据，并显示.
            int length = packet.getLength(); //实际接收到的数据字节长度
            byte[] data = packet.getData();//接收到数据
            String s = new String(data,0, length);

            //判断接收到的数据是什么
            String answer = "";
            if("四大名著".equals(s)) {
                answer = "四大名著 <<红楼梦>> <<三国演示>> <<西游记>> <<水浒传>>";
            } else {
                answer = "what?";
            }


            //===回复信息给B端
            //将需要发送的数据，封装到 DatagramPacket对象
            data = answer.getBytes();
            //说明: 封装的 DatagramPacket对象 data 内容字节数组 , data.length , 主机(IP) , 端口
            packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.231.1"), 9998);

            socket.send(packet);//发送

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("A端退出...");
    }
}
