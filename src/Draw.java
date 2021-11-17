import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Draw extends JFrame{

    //取款
    public Draw() {
        setLayout(new GridLayout(2,1));
        FlowLayout f1 = new FlowLayout();
        f1.setVgap(ERROR);
        FlowLayout f2 = new FlowLayout();
        f2.setHgap(ERROR);
        JPanel j1 = new JPanel(f1);
        JPanel j2 = new JPanel(f2);
        JLabel jb = new JLabel("取款金额：");
        final JTextField wb = new JTextField(15);
        JButton b1 = new JButton("确定");
        JButton b2 = new JButton("取消");
        j1.add(jb);
        j1.add(wb);
        j2.add(b1);
        j2.add(b2);
        add(j1);
        add(j2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = wb.getText();
                if(Check.b>0&&Check.b<=5000) {
                    if(s.equals("")) {
                        JOptionPane.showMessageDialog(null, "请输入");
                        return;
                    }
                    int a = Integer.parseInt(s);
                    if(a<=Check.b&&Draw2.sum<=5000&&a%100==0) {
                        JOptionPane.showMessageDialog(null, "已成功取款");
                    }if(a>5000||a<0){
                        JOptionPane.showOptionDialog(null, "数据不合法", "注意", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, null, null);
                        wb.setText("");
                        return;
                    }
                    if(Draw2.sum>5000||a>Check.b) {
                        JOptionPane.showOptionDialog(null, "余额不足", "注意", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, null, null);
                        wb.setText("");
                        return;
                    }if(a%100!=0&&a<=5000) {
                        JOptionPane.showOptionDialog(null, "您输入的不是整数,已为您取整", "注意", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
                        a = (int)(Math.pow(10, (a+"").length()-1));
                    }
                    Draw2.sum+=a;
                    Check.banlance-=a;
                    Check.b-=a;
                }
                wb.setText("");
            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Panel();
            }
        });
        this.setTitle("取款");
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
