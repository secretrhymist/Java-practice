public abstract class Person {
    private String name;
    private String gender;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void speak(){

    }
}
