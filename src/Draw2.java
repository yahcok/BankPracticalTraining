import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Draw2 extends JFrame implements ActionListener{

    static int sum=0;
    public Draw2() {
        setLayout(null);
        JLabel j1 = new JLabel("请选择取款金额");
        j1.setFont(new Font(null,Font.BOLD,30));
        j1.setBounds(190, 50, 300, 30);
        add(j1);
        JButton b1 = new JButton("100");
        b1.setBounds(0, 80, 130, 60);
        //对按钮进行监听
        b1.addActionListener(this);
        b1.setActionCommand("100");
        add(b1);
        JButton b2 = new JButton("2000");
        b2.setBounds(465, 80, 130, 60);
        b2.addActionListener(this);
        b2.setActionCommand("2000");
        add(b2);
        JButton b3 = new JButton("500");
        b3.setBounds(0, 170, 130, 60);
        b3.addActionListener(this);
        b3.setActionCommand("500");
        add(b3);
        JButton b4 = new JButton("5000");
        b4.setBounds(465, 170, 130, 60);
        b4.addActionListener(this);
        b4.setActionCommand("5000");
        add(b4);
        JButton b5 = new JButton("1000");
        b5.setBounds(0, 260, 130, 60);
        b5.addActionListener(this);
        b5.setActionCommand("1000");
        add(b5);
        JButton b6 = new JButton("其他金额");
        b6.setBounds(465, 260, 130, 60);
        b6.addActionListener(this);
        b6.setActionCommand("其他金额");
        add(b6);
        JButton b7 = new JButton("退卡");
        b7.setBounds(0, 350, 130, 60);
        b7.addActionListener(this);
        b7.setActionCommand("退卡");
        add(b7);
        JButton b8 = new JButton("返回");
        b8.setBounds(465, 350, 130, 60);
        b8.addActionListener(this);
        b8.setActionCommand("返回");
        add(b8);
        this.setTitle("取款");
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        int a=0,b=0,c=0,d=0,f=0;
        if(e.getActionCommand().equals("100")) {
            a++;
        }if(e.getActionCommand().equals("500")) {
            b++;
        }if(e.getActionCommand().equals("1000")) {
            c++;
        }if(e.getActionCommand().equals("2000")) {
            d++;
        }if(e.getActionCommand().equals("5000")) {
            f++;
        }if(e.getActionCommand().equals("其他金额")) {
            new Draw();
            dispose();
            return;
        }if(e.getActionCommand().equals("退卡")) {
            new Welcome();
            dispose();
            return;
        }if(e.getActionCommand().equals("返回")) {
            new Panel();
            dispose();
            return;
        }
        sum=100*a+500*b+1000*c+2000*d+5000*f;
        if(Check.b<0) {
            dispose();
        }else if(sum<=5000&&sum<=Check.b) {
            sum=100*a+500*b+1000*c+2000*d+5000*f;
            JOptionPane.showMessageDialog(null, "成功取出");
            Check.banlance-=sum;
            Check.b-=sum;
        }else {
            JOptionPane.showOptionDialog(null, "余额不足", "注意", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, null, null);
            return;
        }
    }
}
