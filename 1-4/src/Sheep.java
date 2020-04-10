public class Sheep {
    private String sex;
    private int age = 1;
    private boolean copulation;   //是否能交配，刚生下来年龄不足，默认不能交配
    private boolean isDead;    //是否死亡

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsCopulation() {
        return copulation;
    }

    public void setIsCopulation(boolean copulation) {
        this.copulation = copulation;
    }

}
