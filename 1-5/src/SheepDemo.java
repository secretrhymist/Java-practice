/**
有一对刚出生的羊，公羊的寿命为15年（生下来是1岁，到16岁那年就死亡了，母羊的寿命为20年。
		公羊从3岁开始可以交配，到12岁结束就不能够交配了，公羊在3岁到8岁之间交配的，母羊一胎可以生1只
		公羊2只母羊，9到12岁之间交配的，母羊一胎可以生一只公羊，一只母羊，母羊从5岁开始可以生育的，
		到15岁结束就不能够生育了，同时公羊母羊一年只能够各自交配一次，母羊一年只能够生一胎，问多少年后，
		羊群的数量可以达到一万只？
**/

import java.util.ArrayList;

public class SheepDemo {
	
	public static void main(String[] args) throws InterruptedException {
		//存储列表
		ArrayList<Sheep> maleSheeps = new ArrayList<Sheep>();
		ArrayList<Sheep> femaleSheeps = new ArrayList<Sheep>();
		
		Sheep maleSheep = new Sheep();
		maleSheep.setSex("male");
		
		Sheep femaleSheep = new Sheep();
		femaleSheep.setSex("female");
		
		maleSheeps.add(maleSheep);
		femaleSheeps.add(femaleSheep);
		
		
		multiply(maleSheeps, femaleSheeps);
		
	}

	
	
	
	/**
	 * 所有羊的下一年发生的变化
	 * @param maleSheeps
	 * @param femaleSheeps
	 */
	public static void nextYear(ArrayList<Sheep> maleSheeps,ArrayList<Sheep> femaleSheeps) {
		for(int i = 0;i < maleSheeps.size();i++) {
			//当前遍历到的公羊
			Sheep sheep = maleSheeps.get(i);
			int age = sheep.getAge() + 1;			//下一年羊的年龄
			sheep.setAge(age);
			if(age > 15) {
				//该羊已死亡，直接从集合中移除
				maleSheeps.remove(i);
				continue;		//当前这只羊不用管它的变化
			}
			if(age >= 3 && age <= 12) {
				sheep.setIsCopulation(true);
			}else {
				sheep.setIsCopulation(false);
			}	
		}
		
		for(int i = 0;i < femaleSheeps.size();i++) {
			//当前遍历到的母羊
			Sheep sheep = femaleSheeps.get(i);
			int age = sheep.getAge() + 1;			//下一年羊的年龄
			sheep.setAge(age);
			if(age > 20) {
				//该羊已死亡，直接从集合中移除
				femaleSheeps.remove(i);
				continue;		//当前这只羊不用管它的变化
			}
			if(age >= 5 && age <= 15) {
				sheep.setIsCopulation(true);
			}else {
				sheep.setIsCopulation(false);
			}	
		}	
	}
		
	
	/**
	 * 整个繁殖过程
	 * @param maleSheeps
	 * @param femaleSheeps
	 * @throws InterruptedException 
	 */
	public static void multiply(ArrayList<Sheep> maleSheeps,ArrayList<Sheep> femaleSheeps) throws InterruptedException {
		int year = 1;
		while(true) {
			//对公羊集合进行遍历，看看当前遍历到的公羊是否能够交配，如果能够交配，再对母羊集合
			//进行遍历，找出合适的母羊与之进行交配，生出小羊
			
			//对所有的公羊母羊进行匹配
			for(int i = 0;i < maleSheeps.size();i++) {
				//当前遍历到的公羊
				Sheep maleSheep = maleSheeps.get(i);
				//判断公羊是否能够生育
				if(maleSheep.getIsCopulation()) {			//能生育，给它找个对象
					for(int j = 0;j < femaleSheeps.size();j++) {
						Sheep femaleSheep = femaleSheeps.get(j);		//当前遍历到的母羊
						if(femaleSheep.getIsCopulation()) {		//母羊也能生育
							breed(maleSheep, maleSheeps, femaleSheeps);
							//当年交配玩完之后不能够再交配
							femaleSheep.setIsCopulation(false);
							//结束内循环，防止一直公羊匹配多只母羊
							break;
						}
					}
				}
				maleSheep.setIsCopulation(false);
			}
			//全部匹配完之后，进入下一年
			System.out.println("第" + year + "年，公羊数量：" + maleSheeps.size() + "，母羊数量：" + femaleSheeps.size() + "，总数：" + (maleSheeps.size() + femaleSheeps.size()));
			year++;
			nextYear(maleSheeps, femaleSheeps);
			Thread.sleep(2000);
		}
	}
	
	/**
	 * 公羊和对应的母羊交配生小羊
	 * @param maleSheep
	 * @param maleSheeps
	 * @param femaleSheeps
	 */
	public static void breed(Sheep maleSheep,ArrayList<Sheep> maleSheeps,ArrayList<Sheep> femaleSheeps) {
		if(maleSheep.getAge() >= 3 && maleSheep.getAge() <= 8) {
			//一只公羊
			Sheep sheep1 = new Sheep();
			sheep1.setSex("male");
			//maleSheeps.add(sheep1);
			//把刚出生的公羊放到集合的最前面，交配时遍历公羊会优先匹配年轻的
			maleSheeps.add(0, sheep1);
			
			//两只母羊
			Sheep sheep2 = new Sheep();
			sheep2.setSex("female");
			femaleSheeps.add(sheep2);
			
			
			Sheep sheep3 = new Sheep();
			sheep3.setSex("female");
			femaleSheeps.add(sheep3);	
		}else {
			//一只公羊
			Sheep sheep1 = new Sheep();
			sheep1.setSex("male");
			maleSheeps.add(sheep1);
			//一只母羊
			Sheep sheep2 = new Sheep();
			sheep2.setSex("female");
			femaleSheeps.add(sheep2);
		}
	}
}
