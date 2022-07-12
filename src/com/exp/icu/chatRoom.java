package com.exp.icu;

/*
 * 聊天室练习gui
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chatRoom {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("聊天室");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //聊天区域的文本域
        JTextArea messageArea =new JTextArea();
        messageArea.setBounds(10,10,360,200);
        jf.add(messageArea);

        //输入区域的文本框
        JTextField messageField =new JTextField();
        messageField.setBounds(10,230,180,20);
        jf.add(messageField);

        //发送按钮
        JButton sendButton =new JButton("发送");
        sendButton.setBounds(200,230,70,20);
        jf.add(sendButton);

        //清空按钮
        JButton clearButton =new JButton("清空记录");
        clearButton.setBounds(280,230,70,20);
        jf.add(clearButton);

        //发送按钮的事件
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //不能发送空消息
                //去除信息前面的大小写
                String message =messageField.getText().trim();
                //敏感词替换
                message =message.replace("TMD","****");

                if(message.length()==0){
                    JOptionPane.showConfirmDialog(jf,"发送的消息不能为空");
                }else{
                    messageField.setText("");
                    messageArea.append("客户端："+message+"\n");
                }
            }
        });
        //清空事件
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageArea.setText("");
            }
        });

        jf.setVisible(true);
    }
}
