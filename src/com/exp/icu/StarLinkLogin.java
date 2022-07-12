package com.exp.icu;

/*
 *登录界面练习
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StarLinkLogin {
    public static void main(String[] args) {
        JFrame jf = new JFrame();


        jf.setTitle("登录界面");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);

        //用户名文本
        JLabel usernameLable = new JLabel("用户名");
        usernameLable.setBounds(50, 50, 50, 20);
        jf.add(usernameLable);
        //用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 20);
        jf.add(usernameField);

        //密码文本
        JLabel userPassword = new JLabel("密码");
        userPassword.setBounds(50, 100, 50, 20);
        jf.add(userPassword);
        //密码文本
        JTextField passwordField = new JTextField();
        passwordField.setBounds(150, 100, 180, 20);
        jf.add(passwordField);

        //登陆按钮
        JButton jbt = new JButton("点击登陆");
        jbt.setBounds(50, 200, 280, 20);
        jf.add(jbt);
        //已知的用户名密码
        String name = "adminer";
        String passwd = "123456";
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取用户输入的文本框
                String username = usernameField.getText();
                String password = passwordField.getText();
                //限制用户名的长度
                if (username.length() < 6 || username.length() > 12) {
                    //System.out.println("用户名不符合规则");
                    JOptionPane.showConfirmDialog(jf, "用户名必须在6-12位之剑");
                    usernameField.setText("");
                    passwordField.setText("");
                    //结束程序，不再往下执行
                    return;
                }
                //限制密码的长度
                if (password.length() < 6 || password.length() > 22) {
                    JOptionPane.showConfirmDialog(jf, "密码不能小于6位，不能大于22位");
                    passwordField.setText("");
                    usernameField.setText("");
                }
                //判断用户登录是否成功
                //if (username == name && password == passwd) {
                if (username.equals(name) && password.equals(passwd)) {
                    JOptionPane.showConfirmDialog(jf, "登陆成功");
                    //System.out.println("登陆成功");
                } else {
                    JOptionPane.showConfirmDialog(jf, "登陆失败");
                    //System.out.println("用户名或者密码错误");
                }
            }
        });

        jf.setVisible(true);
    }
}
