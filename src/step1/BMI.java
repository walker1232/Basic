package step1;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		while(true){
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			int flag = scan.nextInt();
			switch(flag){
				case 0:
				System.out.println("stop");
				return;
				case 1:
				System.out.println("Enter High");
				double high = scan.nextDouble();
				System.out.println("Enter Weight");
				double weight = scan.nextDouble();
				high = high / 100;
				double result = weight / (high * high);
				String message = "";
				if(result >= 35){
					message = "thrid fat";
				}else if(result >= 18.5 && result < 23){
					message = "normal";
				}else if(result >= 23 && result < 25){
					message = "before fat";
				}else if(result >= 25 && result < 30){
					message = "first fat";
				}else if(result >= 30 && result < 35){
					message = "second fat";
				}else{
					message = "low";
				}
				System.out.println(message);
				default: break;
			}
		}
		/*System.out.println("Enter High");
		Scanner scan = new Scanner(System.in);
		double high = scan.nextDouble();
		System.out.println("Enter Weight");
		double weight = scan.nextDouble();
		high = high / 100;
		double result = weight/(high*high);
		String message = "";
		if(result < 18.5){
			message = "low";
		}else if(result >= 18.5 && result < 23){
			message = "normal";
		}else if(result >= 23 && result < 25){
			message = "before fat";
		}else if(result >= 25 && result < 30){
			message = "first fat";
		}else if(result >= 30 && result < 35){
			message = "second fat";
		}else{
			message = "thrid fat";
		}
		System.out.println(message + " : " + result);*/

	}

}
