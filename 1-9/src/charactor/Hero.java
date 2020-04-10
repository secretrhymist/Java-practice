package charactor;

public class Hero {
    public String name;
    protected float hp;

    public static void battlewin(){
        System.out.println("battle win!");
    }

    static class EnemyCrystal{
        int hp = 5000;
        public void checkIfVictory(){
            if(hp==0){
                Hero.battlewin();
                System.out.println("win this game!");
            }
        }
    }

    public static void main(String[] args) {
        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();
    }

}
