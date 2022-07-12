package com.exp.icu;

/*
 * @author 六川
 * 猜数字游戏gui
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class guessNumber {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("猜数字小游戏");
        jf.setDefaultCloseOperation(3);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);

        //文本
        JLabel jLabel = new JLabel("系统产生了一个1-100 的数字");
        jLabel.setBounds(100, 50, 350, 20);
        jf.add(jLabel);

        Random r = new Random();
        int number = r.nextInt(100) + 1;


        //文本框
        JTextField jTextField = new JTextField();
        jTextField.setBounds(120, 100, 150, 20);
        jf.add(jTextField);

        //按钮
        JButton jButton = new JButton("点击猜测");
        jButton.setBounds(150, 150, 100, 20);
        jf.add(jButton);

        //猜测按钮事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringNumber = jTextField.getText().trim();

                if (stringNumber.equals("")) {
                    JOptionPane.showConfirmDialog(jf, "不能为空");
                    return;
                }
                int guessNumber = Integer.parseInt(stringNumber);
                if (guessNumber > number) {
                    JOptionPane.showConfirmDialog(jf, "猜大了，你猜测的数字是" + guessNumber);
                    jTextField.setText("");
                } else if (guessNumber < number) {
                    JOptionPane.showConfirmDialog(jf, "猜小了，你猜的数字是" + guessNumber);
                    jTextField.setText("");
                } else {
                    JOptionPane.showConfirmDialog(jf, "猜对了");
                }


            }
        });


        jf.setVisible(true);
    }
}
