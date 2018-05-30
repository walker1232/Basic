package step1;
import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		while(true){
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			switch(scan.nextInt()){
				case 0: return;
				case 1:
				System.out.println("How Much?");
				int num1 = scan.nextInt();
				System.out.println(num1 + "Won.");
				System.out.println("How Many");
				int num2 = scan.nextInt();
				System.out.println(num2 + "EA");
				int sum = num1 * num2;
				System.out.println("Sum Price " + sum + "Won.");
				System.out.println("Expensive DC please");
				System.out.println("DC?");
				int dc = scan.nextInt();
				String message = "No";
				if(dc < 10){
					message = sum - (sum / dc) + "Won.";
				}
				System.out.println(message);
				}
			}
	}
}
/*System.out.println("How Much?");
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();
System.out.println(num1 + "Won.");
System.out.println("How Many");
int num2 = scan.nextInt();
System.out.println(num2 + "EA");
int sum = num1 * num2;
System.out.println("Sum Price " + sum + "Won.");
System.out.println("Expensive DC please");
System.out.println("DC?");
int dc = scan.nextInt();
String message = "No";
if(dc < 10){
	message = sum - (sum / dc) + "Won.";
}
System.out.println(message);*/
