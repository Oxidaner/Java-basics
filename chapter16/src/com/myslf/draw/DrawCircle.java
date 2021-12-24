package com.myslf.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: zhangshibin
 * @Date: 2021/11/6 - 11 - 06 - 23:34
 * @Description: com.myslf.draw
 */
public class DrawCircle extends JFrame {
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序~");
    }
    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);
    }
}
class  MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint 被调用了...");
        g.drawOval(10,10,100,100);
    }
}