import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class UpDate extends JFrame {

    public UpDate() {
        setLayout(null);
        // 第一个容器
        JPanel p1 = new JPanel();
        JLabel j1 = new JLabel("输入旧密码：");
        final JPasswordField m1 = new JPasswordField(15);
        p1.add(j1);
        p1.add(m1);
        p1.setBounds(100, 70, 400, 35);
        add(p1);
        // 第二个容器
        JPanel p2 = new JPanel();
        JLabel j2 = new JLabel("输入新密码：");
        final JPasswordField m2 = new JPasswordField(15);
        p2.add(j2);
        p2.add(m2);
        p2.setBounds(100, 140, 400, 35);
        // 第三个容器
        JPanel p3 = new JPanel();
        JLabel j3 = new JLabel("再次输入新密码：");
        final JPasswordField m3 = new JPasswordField(15);
        p3.setBounds(85, 210, 400, 35);
        // 第四个容器
        FlowLayout f = new FlowLayout();
        f.setHgap(70);
        JPanel p4 = new JPanel(f);
        JButton b1 = new JButton("确定");
        JButton b2 = new JButton("取消");
        p4.setBounds(100, 280, 400, 35);
        p4.add(b1);
        p4.add(b2);
        p3.add(j3);
        p3.add(m3);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String stpassword = m1.getText();
                String newpassword = m2.getText();
                String new2password = m3.getText();
                char ch[] = newpassword.toCharArray();
                int count = 0;
                for (int i = 1; i < ch.length; i++) {
                    if (ch[i - 1] == ch[i])
                        count++;
                    if (count == ch.length - 1) {
                        JOptionPane.showOptionDialog(null, "密码不能完全相同", "注意", JOptionPane.DEFAULT_OPTION,
                                JOptionPane.WARNING_MESSAGE, null, null, null);
                        m1.setText("");
                        m2.setText("");
                        m3.setText("");
                        return;
                    }
                }
                if (stpassword.equals("") || newpassword.equals("") || new2password.equals("")) {
                    JOptionPane.showOptionDialog(null, "请输入", "注意", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE, null, null, null);
                    return;
                }
                if (Come.startpassword.equals(stpassword)) {
                    if (newpassword.equals(new2password)) {
                        if (newpassword.length() >= 6) {
                            JOptionPane.showMessageDialog(null, "修改密码成功");
                            Come.startpassword=newpassword;
                            dispose();
                            new Come();
                            return;
                        } else {
                            JOptionPane.showMessageDialog(null, "新密码长度不够");
                            m1.setText("");m2.setText("");m3.setText("");
                            return;
                        }
                    } else {
                        JOptionPane.showOptionDialog(null, "两次密码不一致", "注意", JOptionPane.DEFAULT_OPTION,
                                JOptionPane.WARNING_MESSAGE, null, null, null);
                        m1.setText("");m2.setText("");m3.setText("");
                        return;
                    }
                } else {
                    JOptionPane.showOptionDialog(null, "旧密码不正确", "注意", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE, null, null, null);
                    m1.setText("");m2.setText("");m3.setText("");
                    return;
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Panel();
            }
        });
        this.setTitle("修改密码");
        this.setSize(600, 500);
        this.setLocation(700, 300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
