package step1;
import java.util.Scanner;
/*
 ���� �Է��ؼ� �ش� ���� ������ ����
       �˷��ִ� ����.
       ���� ���, 3���̸� ������ 3��31���Դϴ�.
       9���̸� ������ 9��30���Դϴ�.��� �˷���.
       �� 2���� 2��28���� ���Ϸ� �ؼ� 2��28���Դϴ�.
    ��� ��.
    */
public class Calendar {
	public static void main(String[] args) {
		while(true){
			int month = 0, day = 0;
			String message = "";
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			switch(scan.nextInt()){
				case 0: return;
				case 1: 
				System.out.println("Enter Month");
				month = scan.nextInt();
				switch(month){
					case 2: 
					day = 28;
					message = month + "month" + day + "day"; 
					break;
					case 4: case 6: case 9: case 11:
					day = 30;
					message = month + "month" + day + "day"; 
					break;
					default:
					day = 31;
					message = month + "month" + day + "day"; break;
				}
				System.out.println(message);
				break;
				default: break;
			}
		}
	}
}
/*System.out.println("Enter Month");
Scanner scan = new Scanner(System.in);
int month = scan.nextInt();
int day = 0;
String message = "";
switch(month){
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	day = 31;
	message = month + "month" + day + "day"; break;
	case 2:
	day = 28;
	message = month + "month" + day + "day"; break;
	default:
	day = 31;
	message = month + "month" + day + "day"; break;
}
System.out.println(message);*/
