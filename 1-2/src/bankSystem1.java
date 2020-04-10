
/*
1、登录（不登陆不能够进入下面得界面）
    登陆时要求输入账号，密码，如果密码错误，提示“密码错误”，累计输入密码错误次数
    达到5次，账户锁定，如果账户不存在，提示注册；
    1、查询余额
    2、存款
    3、取款
    4、个人信息查询
    5、修改认证手机号
    修改得时候需要再次确认密码
    6、注销账户
    注销得时候，先显示余额，有个确认操作
    7、退出系统
2、注册
    姓名、身份证号、手机号（如果该手机号已经被注册了，则提示不能够注册）、密码
    如果注册成功，则随机出一个18位数字字符串得卡号；
*/

import java.util.ArrayList;
import java.util.Scanner;

public class bankSystem1 {
    public static void main(String[] args) {
        ArrayList<bankAccount> bankAccountList = new ArrayList<bankAccount>();


        bankAccount bankAccount1 = new bankAccount();
        bankAccount1.name = "元儿";
        bankAccount1.id = "159621394033";
        bankAccount1.phoneNum = "123456789";
        bankAccount1.password = "yigexiaotuantuan";
        bankAccount1.isLocked = false;
        bankAccount1.money = 17456984596.0;

        bankAccount bankAccount2 = new bankAccount();
        bankAccount2.name = "饼儿";
        bankAccount2.id = "15483582158";
        bankAccount2.phoneNum = "987654321";
        bankAccount2.password = "yigexiaotuantuan";
        bankAccount2.isLocked = false;
        bankAccount2.money = 17434584596.0;

        bankAccountList.add(bankAccount1);
        bankAccountList.add(bankAccount2);

        //控制录入数据
        Scanner sc = new Scanner(System.in);

        //死循环一直运行
        while(true){
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("请输入您的操作：");
            int select1 = sc.nextInt();

            switch (select1){
                case 1:
                    System.out.println("请输入卡号：");
                    String bankId = sc.next();

                    //判断账号是否存在
                    bankAccount bankAccount = getBankAccountId(bankId,bankAccountList);
                    if(bankAccount == null){
                        System.out.println("该账号不存在，请注册!\n");
                        break;
                    }
                    //如果账号存在则进行密码判断


                    System.out.println("1.查询余额");
                    System.out.println("2.存款");
                    System.out.println("3.取款");
                    System.out.println("4.个人信息查询");
                    System.out.println("5.修改认证手机号");
                    System.out.println("6.注销账户");
                    System.out.println("7.退出系统");

                    System.out.println("请输入您的操作：");
                    int select2 = sc.nextInt();

                    switch (select2){

                    }



                    int errorCount = 0;
                    System.out.println("请输入密码");
                    String input_psd = sc.next();
                    if(!input_psd.equals(bankAccount.password)){
                        System.out.println("密码错误次数：" + (errorCount+1));
                        errorCount++;

                        while(!bankAccount.isLocked){
                            System.out.println("请重新输入密码：");
                            input_psd = sc.next();
                            if(!input_psd.equals(bankAccount.password)){
                                errorCount++;
                                System.out.println("密码错误次数：" + (errorCount));
                                if(errorCount >= 5) {
                                    bankAccount.isLocked = true;
                                    System.out.println("账户已被锁定！");
                                    break;
                                }
                            }else{
                                break;
                            }
                        }

                    }break;

                    //遍历银行账户集合，进行两个值比较一样则登陆成功
//                    for(int i = 0;i <bankAccountList.size();i++){
//                        bankAccount bankAccount = bankAccountList.get(i);
//                        if(bankId.equals(bankAccount.id)){
//                            System.out.println("该账户不存在，请注册");
//                            break;
//                        }else{
//                            System.out.println("登陆成功！");
//                        }
//
//                    }


                case 2:
                default:
                    System.out.println("操作有误！");
                    break;

            }
        }
    }

    //判断银行账户是否存在

    public static bankAccount getBankAccountId(String id,ArrayList<bankAccount>accounts){
        bankAccount bankAccount = null;
        for(int i = 0;i < accounts.size();i++){
            bankAccount account = accounts.get(i);
            if(id.equals(account.id)) {
                bankAccount = account;
                break;
            }
        }
        return bankAccount;
    }

    public static void login(Scanner sc){
        System.out.println("请输入卡号：");
        String bankID = sc.next();
    }
}
