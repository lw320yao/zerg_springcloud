package com.java.base.thread.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bounce {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
class BounceFrame extends JFrame{
    private BallComponent comp;
    public static final int STEPS = 1000 ;
    public static final int DELAY = 3;

    public BounceFrame(){
        System.out.println("构建窗体");
        setTitle("Bounce");

        comp = new BallComponent();
        add(comp,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "start", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBall();
            }
        });
        addButton(buttonPanel, "close", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

    public void addButton(Container c, String title, ActionListener listener){
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }
    public void addBall(){
        try{
            System.out.println("创建一个球");
            Ball ball = new Ball();
            comp.add(ball);
            for (int i=1;i<=STEPS;i++){
                ball.move(comp.getBounds());
                comp.paint(comp.getGraphics());
                Thread.sleep(DELAY);
            }
        }catch(InterruptedException exc){
            System.out.println(exc.getMessage());
        }
    }
}
