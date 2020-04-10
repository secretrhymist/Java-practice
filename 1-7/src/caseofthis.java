public class caseofthis {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public caseofthis(){

    }

    public caseofthis(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(caseofthis h){
        h = new caseofthis("提莫",383);
    }

    public static void main(String[] args) {
        caseofthis teemo =  new caseofthis("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);

        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？

    }


}
