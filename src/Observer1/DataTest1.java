/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author user2
 */
public class DataTest1 {
    JFrame frame;
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Можно я нажму эту кнопку???");
        button.addActionListener(new FirstListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
        JButton button1 = new JButton("Нажми эту кнопку!!!");
        button1.addActionListener(new SekondListener());
          frame.getContentPane().add(BorderLayout.EAST, button1);
    }
}
