import java.util.Scanner;
class Car{
	int speed;
	String color;
	Car(){
		this.speed=speed;
		this.color=color;
	}
	 public void upSpeed(int value){
		speed=speed+value;
	}
	 public void downSpeed(int value) {
		 speed=speed-value;
	 }
}
class dingdan{
	String name;
	int num;
	int value;
	dingdan() {
		this.name = name;
		this.num = num;
		this.value=value;
	}
	public  int sum(int sum,int value) {
		sum = value+sum;
		return sum;
	}
}
public class T10_0710 {
	public static int sum=0;
	public static void print_menu() {
		System.out.println("�˵���������˿�����ײˡ���ţ�⡢������");
		System.out.println("1.���");
		System.out.println("2.����");
		System.out.println("3.�˳�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		Car myCar3 = new Car();
		myCar1.color="��ɫ";
		myCar1.speed=0;
		myCar2.color="��ɫ";
		myCar2.speed=0;
		myCar3.color="��ɫ";
		myCar3.speed=0;
		myCar1.upSpeed(30);
		System.out.println("Car1����ɫ��"+myCar1.color+"����ǰ�ٶ�Ϊ"+myCar1.speed+"km");
		myCar2.upSpeed(60);
		System.out.println("Car2����ɫ��"+myCar2.color+"����ǰ�ٶ�Ϊ"+myCar2.speed+"km");
		myCar3.upSpeed(0);
		System.out.println("Car3����ɫ��"+myCar3.color+"����ǰ�ٶ�Ϊ"+myCar3.speed+"km");
		System.out.println("*********************************************************");
		int i = 0;
		int choice=0;
		String  menu[]= {"������˿","���ײ�","��ţ��","������"};//��������������
		int value[]= {10,15,20,25};//�˼ۣ���������
		Scanner sc  = new Scanner(System.in);
		int count=0;
		dingdan a[]= new dingdan[9];
		while (choice !=3) {
			print_menu();
			switch(choice=sc.nextInt()) {
			case 1:
				boolean have = true;
				System.out.println("����:");
				String name = sc.next();
				for(i = 0;i<menu.length;i++) {
					if (name.equals(menu[i])) 
						break;
					else
						have=false;
				}
				if(i==menu.length&&have==false) {
					System.out.println("û�����ֲ�");
					break;
				}
			    a[count]=new dingdan();
				a[count].name=name;
				System.out.println("������");
				a[count].num=sc.nextInt();
				a[count].value=a[count].num*value[i];
				sum=a[count].sum(sum, a[count].value);
				count++;
				break;
			case 2:
				int id=0;
				for(id=0;id<count;id++) {
					System.out.println("������"+a[id].name+" ������"+a[id].num);
				}
				System.out.println("�ܼۣ�"+sum);
				break;
			case 3:
				break;
			default:
				System.out.println("\n �����������������\n");
			}
		}
	}
}
