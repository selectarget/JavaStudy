package com.exp.icu;
/*
 *显示时间
 */

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class showDate {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("显示时间");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);

        //提示日期
        JLabel dateLable = new JLabel("日期");
        dateLable.setBounds(50, 50, 100, 20);
        jf.add(dateLable);

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String dateString = sdf.format(d);
        //按照格式显示日期
        JLabel showDateLable = new JLabel(dateString);
        showDateLable.setBounds(50, 80, 200, 20);
        jf.add(showDateLable);

        //提示时间
        JLabel TimeLable = new JLabel("时间");
        TimeLable.setBounds(50, 150, 100, 20);
        jf.add(TimeLable);

        Date d1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf1.format(d1);
        //按照格式显示时间的字符串
        JLabel showTimeLable = new JLabel(timeString);
        showTimeLable.setBounds(50, 180, 200, 20);
        jf.add(showTimeLable);

        jf.setVisible(true);
    }
}
