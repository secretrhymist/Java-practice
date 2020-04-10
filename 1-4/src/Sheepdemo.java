import java.util.ArrayList;

public class Sheepdemo {
    ArrayList<Sheep> maleSheeps = new ArrayList<Sheep>();
    ArrayList<Sheep> femaleSheeps = new ArrayList<Sheep>();

    Sheep maleSheep =



    //羊下一年发生的变化
    public static void nextYear(Sheep sheep){
        //下一年羊的年龄
        int age = sheep.getAge() + 1;
        if("male".equals(sheep.getSex())){
            if(age >= 3 && age <= 12){
                sheep.setIsCopulation(true);
            }else{
                sheep.setIsCopulation(false);
            }
        }
        //母羊
        else{
            if(age >= 5 && age <= 15){
                sheep.setIsCopulation(true);
            }
            else{
                sheep.setIsCopulation(false);
            }
        }
    }

    public static void multiply(ArrayList<Sheep> maleSheeps,ArrayList<Sheep> femaleSheeps){
        //对公羊集合进行遍历，看看当前遍历到的供养是否能够交配，如果能交配，再对母羊进行遍历，找出适合的进行交配
        for(int i = 0;i < maleSheeps.size();i++){
            //当前遍历到的公羊
            Sheep maleSheep = maleSheeps.get(i);
            //判断能否生育
            if(maleSheep.getIsCopulation()){           //能生育，给他找对象
                for(int j = 1;j <femaleSheeps.size();j++){
                    Sheep femaleSheep = femaleSheeps.get(j);   //遍历得到的母羊
                    if(femaleSheep.getIsCopulation()){   //母羊也能生育
                        if(maleSheep.getAge() >= 3 && maleSheep.getAge() <=8){
                            //一只公羊
                            Sheep sheep1 = new Sheep();
                            sheep1.setSex("male");
                            maleSheeps.add(sheep1);
                            //两只母羊
                            Sheep sheep2 = new Sheep();
                            Sheep sheep3 = new Sheep();
                            sheep2.setSex("female");
                            sheep3.setSex("female");
                            femaleSheeps.add(sheep2);
                            femaleSheeps.add(sheep3);
                        }
                        //当年交配结束不能再交配
                        femaleSheep.setIsCopulation(false);
                        //结束内循环，防止一个公羊匹配多个公羊
                        break;
                    }
                }
            }
            maleSheep.setIsCopulation(false);
        }
    }

    public static void breed(Sheep maleSheep,ArrayList<Sheep> maleSheeps.ArrayList<Sheep> femaleSheeps){
        while(true){
            for(int i = 0;i < maleSheeps.size();i++) {
                //当前遍历到的公羊
                Sheep maleSheep = maleSheeps.get(i);
                //判断能否生育
                if (maleSheep.getIsCopulation()) {           //能生育，给他找对象
                    for (int j = 1; j < femaleSheeps.size(); j++) {
                        Sheep femaleSheep = femaleSheeps.get(j);   //遍历得到的母羊
                        if (femaleSheep.getIsCopulation()) {   //母羊也能生育
                        }
                    }
                }
            }
        }

    }
}
