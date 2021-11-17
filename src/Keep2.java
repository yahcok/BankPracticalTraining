import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Keep2 extends JFrame{

    public Keep2() {
        setLayout(null);
        JLabel j1 = new JLabel("请选择存款金额");
        j1.setFont(new Font(null,Font.BOLD,30));
        j1.setBounds(190, 50, 300, 30);
        add(j1);
        JButton b1 = new JButton("100");
        b1.setBounds(0, 80, 130, 60);
        add(b1);
        JButton b2 = new JButton("2000");
        b2.setBounds(465, 80, 130, 60);
        add(b2);
        JButton b3 = new JButton("500");
        b3.setBounds(0, 170, 130, 60);
        add(b3);
        JButton b4 = new JButton("5000");
        b4.setBounds(465, 170, 130, 60);
        add(b4);
        JButton b5 = new JButton("1000");
        b5.setBounds(0, 260, 130, 60);
        add(b5);
        JButton b6 = new JButton("其他金额");
        b6.setBounds(465, 260, 130, 60);
        add(b6);
        JButton b7 = new JButton("退卡");
        b7.setBounds(0, 350, 130, 60);
        add(b7);
        JButton b8 = new JButton("返回");
        b8.setBounds(465, 350, 130, 60);
        add(b8);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "成功存入");
                Check.banlance+=100;
            }
        });b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "成功存入");
                Check.banlance+=2000;
            }
        });b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "成功存入");
                Check.banlance+=500;
            }
        });b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "成功存入");
                Check.banlance+=5000;
            }
        });b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "成功存入");
                Check.banlance+=1000;
            }
        });b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Keep();
            }
        });b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Welcome();
            }
        });b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Panel();
            }
        });
        this.setTitle("存款");
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
