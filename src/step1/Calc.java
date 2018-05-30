package step1;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		while(true){
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			int num1 = 0, num2 = 0, num3 =0;
			String message = "", opcode = "";
			switch(scan.nextInt()){
				case 0: return;
				case 1:
				System.out.println("Enter Number1");
				num1 = scan.nextInt();
				System.out.println("Enter Opcode");
				opcode = scan.next();
				System.out.println("Enter Number2");
				num2 = scan.nextInt();
				switch(opcode){
					case "+": num3 = num1 + num2; break;
					case "-": num3 = num1 - num2; break;
					case "*": num3 = num1 * num2; break;
					case "/": num3 = num1 / num2; break;
					case "%": num3 = num1 % num2; break;
					default: message = "fail"; break;
				}
				if(!message.equals("fail")){
					message = num1 + opcode + num2 + " = " + num3;
				}
				System.out.println(message);
			}
		}
	}
}
/*System.out.println("Enter Number1");
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();
System.out.println("Enter Opcode");
String opcode = scan.next();
System.out.println("Enter Number2");
int num2 = scan.nextInt();
int num3 = 0;
String message = "";
switch(opcode){
	case "+": num3 = num1 + num2; break;
	case "-": num3 = num1 - num2; break;
	case "*": num3 = num1 * num2; break;
	case "/": num3 = num1 / num2; break;
	case "%": num3 = num1 % num2; break;
	default: message = "fail"; break;
}
if(!message.equals("fail")){
	message = num1 + opcode + num2 + " = " + num3;
}
System.out.println(message); */
