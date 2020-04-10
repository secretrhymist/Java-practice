public class hero{
    String name;

    public void heal(){
        System.out.println("不知道奶了谁");
    }
    public void heal(hero h2){
        System.out.println("奶了" + h2.name);
    }
    public void heal(hero h1, hero h2,int hp){
        System.out.println(h1.name + "奶了" + h2.name + hp + "点血量");
    }

    public static void main(String[] args) {
        hero h1 = new hero();
        h1.name = "星妈";
        h1.heal();

        hero h2 = new hero();
        h2.name = "盖伦";
        h2.heal(h2);



        h1.heal(h1,h2,150);

    }
}



