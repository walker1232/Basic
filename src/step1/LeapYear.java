package step1;
import java.util.Scanner;
/*
 ������ 4�� �������� 0 �̶�� ������ �� �ִ�.
�׷��� �ش� ������ 100���� ������ �������� ����̴�.
2000���� 4�� �������� 0 �̶� ������ �� �ִµ�..
�ٽ� �� ���� 100���� ���� �������� ����̴�.
����̶� �ص� �ٽ� 400���� ���� �������� ������ �����̴�.
����) 2000�� �� 2016 ���� �Է��ϸ� �������� ����
*/
public class LeapYear {
	public static void main(String[] args) {
		while(true){
			int year = 0, month = 0, day = 28;
			String message = "";
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			switch(scan.nextInt()){
				case 0: return;
				case 1:
				System.out.println("Enter Year");
				year = scan.nextInt();
				System.out.println("Enter Month");
				month = scan.nextInt();
				if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
					day = 29;
				}
				switch(month){
					case 2:
					message = year + "year" + month + "month" + day + "day"; break;
					case 4: case 6: case 9: case 11: 
					day = 30;
					message = year + "year" + month + "month" + day + "day"; break;
					default:
					day = 31;
					message = year + "year" + month + "month" + day + "day"; break;
			}
			System.out.println(message);
		}
	}
	}
}
/*System.out.println("Enter Year");
Scanner scan = new Scanner(System.in);
int year = scan.nextInt();
System.out.println("Enter Month");
int month = scan.nextInt();
int day = 28;
String message = "";
if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
	day = 29;
}
switch(month){
	case 2: 
	message = year + "year" + month + "month" + day + "day"; break;
	case 4: case 6: case 9: case 11: 
	day = 30;
	message = year + "year" + month + "month" + day + "day"; break;
	default: 
	day = 31;
	message = year + "year" + month + "month" + day + "day"; break;
}
System.out.println(message); */
