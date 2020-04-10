package digit;
//递归法穷举三位密码
public class qiong_ju_fa2 {
    public static boolean found = false;
    public static void main(String[] args) {

        //初始随机生成的密码
        String password = randomString(3);
        System.out.println("密码是:" + password);

        //定义一个猜测密码列表
        char[] guessPassword = new char[password.length()];
        generatePassword(guessPassword,password);
    }

    //定义生成密码
    public static void generatePassword(char[] guessPassword,String password){
        generatePassword(guessPassword,0,password);
    }

    public static void generatePassword(char[] guessPassword,int index,String password){
        if(found)
            return;
        for (short i = '0'; i <= 'z'; i++) {
            char c = (char)i;
            if(!Character.isLetterOrDigit(c))
                continue;
            guessPassword[index] = c;
            if(index!=guessPassword.length-1){
                generatePassword(guessPassword,index+1,password);
            }
            else{
                String guess = new String(guessPassword);
//              System.out.println("穷举出来的密码是：" + guess);
                if(guess.equals(password)){
                    System.out.println("找到了，密码是" + guess);
                    found =true;
                    return;
                }
            }
        }
    }

    //生成随机密码的方法
    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}
