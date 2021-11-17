import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Check extends JFrame{

    static int banlance = 10000;
    static int b = 5000;
    //查询
    public Check() {
        setLayout(null);
        JLabel j1 = new JLabel("当前账户余额："+String.valueOf(banlance)+"元");
        j1.setFont(new Font(null,Font.BOLD,25));
        j1.setBounds(150, 150, 300, 30);
        add(j1);
        JLabel j2 = new JLabel("可用账户余额："+b+"元");
        j2.setFont(new Font(null,Font.BOLD,25));
        j2.setBounds(150, 230, 300, 30);
        add(j2);
        JButton b1 = new JButton("存款");
        b1.setBounds(0, 60, 130, 60);
        add(b1);
        JButton b2 = new JButton("取款");
        b2.setBounds(465, 60, 130, 60);
        add(b2);
        JButton b3 = new JButton("改密");
        b3.setBounds(0, 300, 130, 60);
        add(b3);
        JButton b4 = new JButton("返回");
        b4.setBounds(465, 300, 130, 60);
        add(b4);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Keep2();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Draw2();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new UpDate();
            }
        });
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Panel();
            }
        });
        this.setTitle("查询");
        this.setSize(600, 500);
        this.setLocation(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
