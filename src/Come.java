import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Come extends JFrame{

    static String startpassword = "123456";//初始密码
    static String startu = "123456";//初始用户名
    int count=0;
    //登录
    public Come() {
        JPanel n = new JPanel();
        add(n);
        setLayout(new GridLayout(4,1));
        //第一个容器
        JPanel j1 = new JPanel();
        JLabel yhm = new JLabel("用户名：");
        //帐号框
        final JTextField startusers = new JTextField(15);
        j1.add(yhm);j1.add(startusers);
        //第二个容器
        JPanel j2 = new JPanel();
        JLabel mi = new JLabel("密码：");
        //密码框
        final JPasswordField mm = new JPasswordField(15);
        j2.add(mm);j2.add(mi);j2.add(mm);
        //第三个容器
        FlowLayout f = new FlowLayout();
        f.setHgap(70);
        JPanel j3 = new JPanel(f);
        //登录按钮
        JButton dl = new JButton("登录");
        JButton qx = new JButton("取消");
        j3.add(dl);j3.add(qx);
        this.add(j1);
        this.add(j2);
        this.add(j3);
        dl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = startusers.getText();
                String p = mm.getText();
                if(count==2) {
                    JOptionPane.showOptionDialog(null, "账户已被冻结", "警告",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, null, null);
                    dispose();
                    return;
                }
                if(s.equals(startu)&&p.equals(startpassword)) {
                    JOptionPane.showMessageDialog(null, "登录成功");
                    dispose();
                    new Panel();
                }else {
                    if(s.equals("")||p.equals("")) {
                        JOptionPane.showOptionDialog(null, "账号或密码不能为空", "警告",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, null, null);
                    }else{
                        count++;
                        JOptionPane.showOptionDialog(null, "账号或密码错误，剩余"+(3-count)+"次机会", "警告", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, null, null);
                    }
                }
                startusers.setText("");mm.setText("");
            }
        });
        qx.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                dispose();
                new Welcome();
            }
        });
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}