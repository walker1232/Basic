package step1;
import java.util.Scanner;
/*
 연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
예시) 2000년 과 2016 년을 입력하면 윤년으로 나옴
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
