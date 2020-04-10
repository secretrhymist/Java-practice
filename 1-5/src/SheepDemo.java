/**
��һ�Ըճ������򣬹��������Ϊ15�꣨��������1�꣬��16������������ˣ�ĸ�������Ϊ20�ꡣ
		�����3�꿪ʼ���Խ��䣬��12������Ͳ��ܹ������ˣ�������3�굽8��֮�佻��ģ�ĸ��һ̥������1ֻ
		����2ֻĸ��9��12��֮�佻��ģ�ĸ��һ̥������һֻ����һֻĸ��ĸ���5�꿪ʼ���������ģ�
		��15������Ͳ��ܹ������ˣ�ͬʱ����ĸ��һ��ֻ�ܹ����Խ���һ�Σ�ĸ��һ��ֻ�ܹ���һ̥���ʶ������
		��Ⱥ���������Դﵽһ��ֻ��
**/

import java.util.ArrayList;

public class SheepDemo {
	
	public static void main(String[] args) throws InterruptedException {
		//�洢�б�
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
	 * ���������һ�귢���ı仯
	 * @param maleSheeps
	 * @param femaleSheeps
	 */
	public static void nextYear(ArrayList<Sheep> maleSheeps,ArrayList<Sheep> femaleSheeps) {
		for(int i = 0;i < maleSheeps.size();i++) {
			//��ǰ�������Ĺ���
			Sheep sheep = maleSheeps.get(i);
			int age = sheep.getAge() + 1;			//��һ���������
			sheep.setAge(age);
			if(age > 15) {
				//������������ֱ�ӴӼ������Ƴ�
				maleSheeps.remove(i);
				continue;		//��ǰ��ֻ���ù����ı仯
			}
			if(age >= 3 && age <= 12) {
				sheep.setIsCopulation(true);
			}else {
				sheep.setIsCopulation(false);
			}	
		}
		
		for(int i = 0;i < femaleSheeps.size();i++) {
			//��ǰ��������ĸ��
			Sheep sheep = femaleSheeps.get(i);
			int age = sheep.getAge() + 1;			//��һ���������
			sheep.setAge(age);
			if(age > 20) {
				//������������ֱ�ӴӼ������Ƴ�
				femaleSheeps.remove(i);
				continue;		//��ǰ��ֻ���ù����ı仯
			}
			if(age >= 5 && age <= 15) {
				sheep.setIsCopulation(true);
			}else {
				sheep.setIsCopulation(false);
			}	
		}	
	}
		
	
	/**
	 * ������ֳ����
	 * @param maleSheeps
	 * @param femaleSheeps
	 * @throws InterruptedException 
	 */
	public static void multiply(ArrayList<Sheep> maleSheeps,ArrayList<Sheep> femaleSheeps) throws InterruptedException {
		int year = 1;
		while(true) {
			//�Թ��򼯺Ͻ��б�����������ǰ�������Ĺ����Ƿ��ܹ����䣬����ܹ����䣬�ٶ�ĸ�򼯺�
			//���б������ҳ����ʵ�ĸ����֮���н��䣬����С��
			
			//�����еĹ���ĸ�����ƥ��
			for(int i = 0;i < maleSheeps.size();i++) {
				//��ǰ�������Ĺ���
				Sheep maleSheep = maleSheeps.get(i);
				//�жϹ����Ƿ��ܹ�����
				if(maleSheep.getIsCopulation()) {			//�������������Ҹ�����
					for(int j = 0;j < femaleSheeps.size();j++) {
						Sheep femaleSheep = femaleSheeps.get(j);		//��ǰ��������ĸ��
						if(femaleSheep.getIsCopulation()) {		//ĸ��Ҳ������
							breed(maleSheep, maleSheeps, femaleSheeps);
							//���꽻������֮���ܹ��ٽ���
							femaleSheep.setIsCopulation(false);
							//������ѭ������ֹһֱ����ƥ���ֻĸ��
							break;
						}
					}
				}
				maleSheep.setIsCopulation(false);
			}
			//ȫ��ƥ����֮�󣬽�����һ��
			System.out.println("��" + year + "�꣬����������" + maleSheeps.size() + "��ĸ��������" + femaleSheeps.size() + "��������" + (maleSheeps.size() + femaleSheeps.size()));
			year++;
			nextYear(maleSheeps, femaleSheeps);
			Thread.sleep(2000);
		}
	}
	
	/**
	 * ����Ͷ�Ӧ��ĸ������С��
	 * @param maleSheep
	 * @param maleSheeps
	 * @param femaleSheeps
	 */
	public static void breed(Sheep maleSheep,ArrayList<Sheep> maleSheeps,ArrayList<Sheep> femaleSheeps) {
		if(maleSheep.getAge() >= 3 && maleSheep.getAge() <= 8) {
			//һֻ����
			Sheep sheep1 = new Sheep();
			sheep1.setSex("male");
			//maleSheeps.add(sheep1);
			//�Ѹճ����Ĺ���ŵ����ϵ���ǰ�棬����ʱ�������������ƥ�������
			maleSheeps.add(0, sheep1);
			
			//��ֻĸ��
			Sheep sheep2 = new Sheep();
			sheep2.setSex("female");
			femaleSheeps.add(sheep2);
			
			
			Sheep sheep3 = new Sheep();
			sheep3.setSex("female");
			femaleSheeps.add(sheep3);	
		}else {
			//һֻ����
			Sheep sheep1 = new Sheep();
			sheep1.setSex("male");
			maleSheeps.add(sheep1);
			//һֻĸ��
			Sheep sheep2 = new Sheep();
			sheep2.setSex("female");
			femaleSheeps.add(sheep2);
		}
	}
}
