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

public class Keep extends JFrame{

    //存钱
    public Keep() {
        setLayout(new GridLayout(3,1));
        FlowLayout f1 = new FlowLayout();
        f1.setVgap(ERROR);
        FlowLayout f2 = new FlowLayout();
        f2.setVgap(20);
        f2.setHgap(ERROR);
        JPanel j1 = new JPanel(f1);
        JPanel j2 = new JPanel(f2);
        JLabel b = new JLabel("存款金额：");
        final JTextField wb = new JTextField(15);
        JButton b1 = new JButton("确定");
        JButton b2 = new JButton("返回");
        j1.add(b);
        j1.add(wb);
        j2.add(b1);
        j2.add(b2);
        add(j1);
        add(j2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(wb.getText());//存入的钱
                if(a<0){
                    JOptionPane.showOptionDialog(null, "数据不合法", "注意",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                            null, null, null);
                }else {
                    if(wb.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "请输入");
                        return;
                    }else {
                        JOptionPane.showMessageDialog(null, "存入成功");
                        Check.banlance+=a;
                    }}
                wb.setText("");
            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Keep2();
            }
        });
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

