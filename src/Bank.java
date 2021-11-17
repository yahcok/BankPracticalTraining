import java.util.Scanner;

public class Bank {

    String startname, startpassword;// 初始用户名，初始密码
    int banlance = 10000;// 余额
    Scanner in = new Scanner(System.in);

    // 初始化用户名和密码
    public Bank(String startname, String startpassword) {
        this.startname = startname;
        this.startpassword = startpassword;
    }

    // 登录
    public int f() {
        String startname = "123456";
        for (int i = 2; i >= 0; i--) {
            System.out.println("请输入用户名");
            String name = in.next();
            System.out.println("请输入密码");
            String password = in.next();
            if (name.equals(startname) && password.equals(startpassword)) {
                System.out.println("登录成功\n");
                break;
            } else {
                if (i == 0) {
                    System.out.println("您输入的次数过多，请下次再输");
                    return 1;
                }
                System.out.println("用户名或密码错误，还剩余" + i + "次机会");
                continue;
            }
        }
        return 0;
    }

    // 查询
    public int f1() throws MyException {
        if (banlance < 0) {
            throw new MyException("数据不合法");
        }
        return banlance;
    }

    // 取款
    public int f2(int money) throws MyException {
        if (money < 0) {
            throw new MyException("数据不合理\n");
        }
        if (money % 100 == 0 && money < 5000) {
            banlance -= money;
            return money;
        } else if (money % 100 != 0) {
            System.out.println("只能取100的整数倍");
        } else if (money > 5000) {
            System.out.println("单笔数值不可超过5000元");
        }
        return 0;
    }

    // 存款
    public int f3(int money) throws MyException {
        if (money < 0) {
            throw new MyException("数据不合理\n");
        }
        banlance += money;
        return money;
    }

    // 修改密码
    public int f4() {
        for (int i = 0;; i++) {
            System.out.println("请输入旧密码");
            String oldpassword = in.next();
            if (oldpassword.equals(startpassword)) {
                System.out.println("请输入新密码");
                String newpassword1 = in.next();
                if (newpassword1.length() >= 6) {
                    System.out.println("请重新输入新密码");
                    String newpassword = in.next();
                    if (newpassword.equals(newpassword1)) {
                        System.out.println("修改密码成功\n");
                        Bank bank = new Bank("123456", newpassword);
                        bank.f();
                        break;
                    }
                    System.out.println("两次密码不相同");
                    break;
                }
                System.out.println("密码长度不符合要求");
                break;
            }
            System.out.println("旧密码错误");
            break;
        }
        return 0;
    }
}

