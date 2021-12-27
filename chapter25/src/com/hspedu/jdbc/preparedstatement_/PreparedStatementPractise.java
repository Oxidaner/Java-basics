package com.hspedu.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author A
 * @date 2021/12/27 - 12 - 27 - 22:18
 * com.hspedu.jdbc.preparedstatement_
 */
public class PreparedStatementPractise {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        /*
            创建admin表
            使用PreparedStatement添加5条数据
            修改tom的记录,将name改成king
            删除 一条 的记录
            查询全部记录并显示在控制台
         */

        Scanner scanner = new Scanner(System.in);


        //通过Properties对象获取配置文件的信息

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //1. 注册驱动
        // 建议写上
        Class.forName(driver);

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = null;

        //使用PreparedStatement添加5条数据
        /*for (int i = 0; i < 5; i++) {
            //让用户输入管理员名和密码
            System.out.print("请输入管理员的名字: ");
            String admin_name = scanner.nextLine();
            System.out.print("请输入管理员的密码: ");
            String admin_pwd = scanner.nextLine();

            String sql = "insert into admin values (?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, admin_name);
            preparedStatement.setString(2, admin_pwd);

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows > 0 ? "执行成功" : "执行失败");
        }*/

        //修改tom的记录,将name改成king
        preparedStatement = connection.prepareStatement("update admin set name = ? where name = ?");
        preparedStatement.setString(1,"king");
        preparedStatement.setString(2,"tom");
        int rows = preparedStatement.executeUpdate();
        System.out.println(rows > 0 ? "执行成功" : "执行失败");

        //删除 一条 的记录
        preparedStatement = connection.prepareStatement("delete  from admin where name = ?");
        preparedStatement.setString(1,"json");
        rows = preparedStatement.executeUpdate();
        System.out.println(rows > 0 ? "执行成功" : "执行失败");

        //查询全部记录并显示在控制台
        preparedStatement = connection.prepareStatement("select * from admin");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString(1);
            int pwd = resultSet.getInt(2);
            System.out.println(name + "\t" + pwd);
        }

        //关闭连接
        preparedStatement.close();
        connection.close();
        resultSet.close();


    }
}
