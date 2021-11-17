import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Panel extends JFrame{

    public Panel() {
        setLayout(null);
        JButton b1 = new JButton("查询");
        b1.setBounds(150, 90, 110, 60);
        JButton b2 = new JButton("存款");
        b2.setBounds(340, 90, 110, 60);
        JButton b3 = new JButton("取款");
        b3.setBounds(150, 190, 110, 60);
        JButton b4 = new JButton("改密");
        b4.setBounds(340, 190, 110, 60);
        JButton b5 = new JButton("退卡");
        b5.setBounds(150, 290, 110, 60);
        JLabel  wb = new JLabel("请选择交易类型");
        wb.setFont(new Font(null,Font.BOLD,30));
        wb.setBounds(180, 30, 400, 30);
        add(wb);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Check();
            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Keep2();
            }
        });
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Draw2();
            }
        });
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new UpDate();
            }
        });
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Welcome();
            }
        });
        this.setTitle("面板");
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
