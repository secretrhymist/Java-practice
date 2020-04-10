package abstract_class;

public abstract class Item {
    int price;
    String name;
    public void buy(){
        System.out.println("购买物品");
    }
    public void effect(){
        System.out.println("物品使用后，有效果");
    }
    public abstract boolean disposable();
}
