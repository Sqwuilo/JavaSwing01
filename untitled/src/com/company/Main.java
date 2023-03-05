package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {
        initFrame();
    }
    public static int count = 0;
    public static JButton button = new JButton("Нажми меня!");


    private static void initFrame() {
        JFrame window = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension myScreenSize = new Dimension();
        JLabel label = new JLabel();

        //получение размера экрана
        //создание переменной с расширением под монитор
        double getWidth = screenSize.getWidth();
        double height = screenSize.getHeight();
        myScreenSize.setSize((int) getWidth, (int) height);
        window.setSize(myScreenSize);
        window.setVisible(true);

        window.setSize(1200, 960);


        button.setBounds(50, 50, 100, 30);
        button.setIcon(new ImageIcon("C:\\Users\\Студент.ENGELS1-418-05.000.001.002.003.004.005.006.007.008.009.010.011.012.013.014.015.016.017.018.019.020.021.022.023.024.025.026.027\\IdeaProjects\\untitled\\2d9c7984b2a598f898b84f07c82ee4.png"));
        button.setSize(400, 300);
        button.setText("НАЖМИ");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Вы нажали" + " " + count + " раз");
                Timer timer = new Timer(100, new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        button.setIcon(new ImageIcon("C:\\Users\\Студент.ENGELS1-418-05.000.001.002.003.004.005.006.007.008.009.010.011.012.013.014.015.016.017.018.019.020.021.022.023.024.025.026.027\\IdeaProjects\\untitled\\249851004_0_196_2030_1211_1920x0_80_0_0_78318b59d4ce0cde91f76a1b092765e7.jpg"));
                    }
                });
                timer.setRepeats(false);
                timer.start();
                button.setIcon(new ImageIcon("C:\\Users\\Студент.ENGELS1-418-05.000.001.002.003.004.005.006.007.008.009.010.011.012.013.014.015.016.017.018.019.020.021.022.023.024.025.026.027\\IdeaProjects\\untitled\\2d9c7984b2a598f898b84f07c82ee4.jpg"));
            }
        });

        button.setVisible(true);
        window.add(button);



        //label.setText("Вы нажали" + " " + count);
        label.setSize(200, 150);
        label.setBounds(400, 100, 200, 200);
        window.add(label);


  }




}
