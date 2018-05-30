package step1;
import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		while(true){
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			int small = 0, big = 0, sum = 0;
			String result = "";
			switch(scan.nextInt()){
				case 0: 
				System.out.println("stop");
				return;
				case 1: 
				System.out.println("Enter first number");
				int num1 = scan.nextInt();
				System.out.println("Enter second number");
				int num2 = scan.nextInt();
				if(num1 > num2){
					small = num2;
					big = num1;
				}else{
					small = num1;
					big = num2;
				}
				for(int i = small; i <= big; i++){
					if(i == big){
						result += i + " = ";
					}else{
						result += i + " + ";
					}
					sum += i;
				}
				System.out.println(result + sum);
				break;
				default: 
				System.out.println("Error");
				break;
			}
		}
	}

}
