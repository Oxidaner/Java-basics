package com.hspedu.homework.self;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/23 - 10 - 23 - 23:18
 * @Description: com.hspedu.homework.self
 */
public class Homework2 {
    public static void main(String[] args) {
        String name = "abc";
        String pwd = "123456";
        String mails = "ti@i@sohu.com";

        try {
            userReister(name,pwd,mails);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void userReister(String name,String pwd,String mails) {
        int namelength = name.length();

        if(!( pwd != null && mails != null)) {
            throw  new RuntimeException("参数不能为null");
        }
        if (!(namelength >= 2 && namelength <= 4)){
            throw new RuntimeException("姓名长度为2,3,4");
        }
        if(!(pwd.length() == 6 && ifnum(pwd))){
            throw new RuntimeException("密码长度为6,要求全是数字");
        }
        int i = mails.indexOf('.');
        int j = mails.indexOf('@');
        if(!(j < i && j == 0)){
            throw new RuntimeException("邮箱格式不正确");
        }
    }

    public static boolean ifnum(String pwd){
        char [] chars = pwd.toCharArray();
        for(int i:chars){
            if(chars[i] <'0' &&chars[i] > '9'){
                return false;
            }
        }
        return true;
    }

}
