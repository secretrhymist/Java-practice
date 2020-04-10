public class Hero {

    private String name;//姓名
    private float hp;//血量
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void kill(Mortal m) {
        m.die();
    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.setName("盖伦");

        ADhero yasuo = new ADhero();
        yasuo.setName("亚索~hasaki");

        APhero teemo = new APhero();
        teemo.setName("提莫");

        ADAPhero ez = new ADAPhero();
        ez.setName("小黄毛");

        System.out.print(garen.getName()+"击杀了"+yasuo.getName()+",并说:");
        garen.kill(yasuo);

        System.out.print(garen.getName()+"击杀了"+teemo.getName()+",并说:");
        garen.kill(teemo);

        System.out.print(garen.getName()+"击杀了"+ez.getName()+",并说:");
        garen.kill(ez);

    }
}
