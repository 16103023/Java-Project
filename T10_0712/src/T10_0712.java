import java.util.Scanner;

class diancai{
	String caidan;
	int value;
	int shuliang;
	void upvalue(int money) {
		value +=money;
	}
	void upshuliang(int zengjia) {
		shuliang +=zengjia;
	}
}
public class T10_0712 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		System.out.println("=====" + "02");
		diancai student =new diancai();
		student.value=0;
		student.shuliang=0;
		System.out.println("�ܹ�5���ˣ�������������");
		Scanner scan =new Scanner(System.in);
		int shuliang =scan.nextInt();
		switch(shuliang) {
		case 1:
			student.upvalue(10);
			break;
		case 2:
			student.upvalue(20);
			break;
		case 3:
			student.upvalue(30);
			break;
		case 4:
			student.upvalue(40);
			break;
		case 5:
			student.upvalue(50);
			break;
			
		}
		

		System.out.println("student�����������"+shuliang+" ,��Ǯ�ܹ��ǣ�"+student.value);
	}

}
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
////class prin{
////	void print(String str,BufferedReader re) throws IOException {
////		while((str = re.readLine())!=null) {
////			System.out.println(str);
////		}
////	}
////}
//class dingdan{
//	String name;
//	int num;
//	int value;
//	dingdan() {
//		this.name = name;
//		this.num = num;
//		this.value=value;
//	}
//	public  int sum(int sum,int value) {
//		sum = value+sum;
//		return sum;
//	}
//}
//class prin{
//	void printf(int count,dingdan a[]) {
//		int id=0;
//		for(id=0;id<count;id++) {
//			System.out.println("������"+a[id].name+" ������"+a[id].num);
//		}
//	}
//}
//public class T10_0712{
//	public static int sum=0;
//	public static void print_menu() {
//		System.out.println("�˵���������˿�����ײˡ���ţ�⡢������");
//		System.out.println("1.���");
//		System.out.println("2.����");
//		System.out.println("3.�˳�");
//	}
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//
///*		FileReader fr = new FileReader("d:/order.txt");
//		BufferedReader re = new BufferedReader(fr);
//		String str = null;
//		prin aaa = new prin();
//		aaa.print(str, re);
////		while((str = re.readLine())!=null) {
////			System.out.println(str);
////		}
//		fr.close();
//		re.close();*/
//		int i = 0;
//		int choice=0;
//		String  menu[]= {"������˿","���ײ�","��ţ��","������"};//��������������
//		int value[]= {10,15,20,25};//�˼ۣ���������
//		Scanner sc  = new Scanner(System.in);
//		int count=0;
//		dingdan a[]= new dingdan[9];
//		while (choice !=3) {
//			print_menu();
//			switch(choice=sc.nextInt()) {
//			case 1:
//				boolean have = true;
//				System.out.println("����:");
//				String name = sc.next();
//				for(i = 0;i<menu.length;i++) {
//					if (name.equals(menu[i])) 
//						break;
//					else
//						have=false;
//				}
//				if(i==menu.length&&have==false) {
//					System.out.println("û�����ֲ�");
//					break;
//				}
//			    a[count]=new dingdan();
//				a[count].name=name;
//				System.out.println("������");
//				a[count].num=sc.nextInt();
//				a[count].value=a[count].num*value[i];
//				sum=a[count].sum(sum, a[count].value);
//				count++;
//				break;
//			case 2:
////				int id=0;
////				for(id=0;id<count;id++) {
////					System.out.println("������"+a[id].name+" ������"+a[id].num);
////				}
////				System.out.println("�ܼۣ�"+sum);
//				prin qqe = new prin();
//				qqe.printf(count, a);
//				System.out.println("�ܼۣ�"+sum);
//				break;
//			case 3:
//				break;
//			default:
//				System.out.println("\n �����������������\n");
//			}
//
//		}
//
//	}
//}