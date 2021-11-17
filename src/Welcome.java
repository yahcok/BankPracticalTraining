import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JFrame{

    public static void main(String[] args) {
        new Welcome();
    }
    public Welcome() {
        FlowLayout f = new FlowLayout();
        f.setVgap(ERROR);
        setLayout(new GridLayout(3,1));
        JPanel p = new JPanel(f);
        JPanel p2 = new JPanel(f);
        JPanel p3 = new JPanel();
        JLabel j1 = new JLabel("欢迎使用ATM自动取款机");
        JLabel j2 = new JLabel("按任意键进入登录界面");
        j1.setFont(new Font(null,Font.BOLD,35));
        j1.setForeground(Color.RED);
        p.add(j1);
        p2.add(j2);
        add(p);
        add(p3);
        add(p2);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                dispose();
                new Come();
            }
        });
        setTitle("ATM");
        this.setResizable(false);
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
