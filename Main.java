package com.company;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Main{

    int length = 4;
    JLabel label;
    JButton btn;
    Main(){
        JFrame f = new JFrame("OTP Generator");
        label = new JLabel();
        label.setBounds(50,50,300,50);
        btn = new JButton("Generate OTP");
        btn.setBounds(50,100,150,30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] result = MyOTP(length);
                String res = new String(result);
                label.setText("Your four digit OTP :  " + res);

            }
        });
        f.add(label);f.add(btn);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    static char[] MyOTP(int length){

        Random choose_random = new Random();
        String tempInt = "0123456789";
        char[] otpArray = new char[length];

        for (int i = 0; i < length; i++){
            otpArray[i] = tempInt.charAt(choose_random.nextInt(tempInt.length()));
        }
    return otpArray;
    }

    public static void main(String[] args) {
        new Main();
    }
}