
import java.util.Scanner;

public class Test$$no {

    public static void main(String[] args) throws MyException {
        int money = 0;//输入或取出的钱数
        int sum = 0;//取出的总钱数
        Scanner in = new Scanner(System.in);
        Bank bank = new Bank("123456", "123456");
        if(bank.f()==1) {
            System.out.println("由于您多次输入错误，您的账户已被冻结");
        }else {
            for (int i = 0;; i++) {
                System.out.println("请选择您需要办理业务的编号\n1.查询余额\n2.取款\n3.存款\n4.修改密码\n5.退出");
                int m = in.nextInt();
                if (m == 2) {
                    System.out.println("请输入需要取出的钱数");
                    money = in.nextInt();
                    if (money % 100 == 0 && money < 5000) {
                        sum+=money;
                        if(sum>5000) {
                            System.out.println("总额不可超过5000元\n");
                        }
                    }
                } else if (m == 3) {
                    System.out.println("请输入需要存入的钱数");
                    money = in.nextInt();
                }
                switch (m) {
                    case 1:
                        try {
                            System.out.println("余额还剩余" + bank.f1()+ "元\n");
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            if(sum<=5000) {
                                System.out.println("已成功取出" + bank.f2(money) + "元\n");
                            }
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("已成功存入" + bank.f3(money) + "元\n");
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        bank.f4();
                        break;
                    case 5:
                        System.out.println("欢迎您下次光临");break;
                    default:
                        System.out.println("业务编号不存在\n");
                }
                if (m == 5) {
                    break;
                }
            }
        }
    }
}
