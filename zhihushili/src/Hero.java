public class Hero {
    String name;
    float armor;
    float hp;
    int moveSpeed;


    public static void main(String[] args) {
        Hero temoo = new Hero();
        temoo.name = "提莫";
        temoo.armor = 36;
        temoo.hp = 685;
        temoo.moveSpeed = 475;
    }

    void legendary(){
        System.out.println("Godlike!");
    }
    float getHp(){
        return hp;
    }
    void recovery(float blood){
        hp = hp + blood;
    }
}
