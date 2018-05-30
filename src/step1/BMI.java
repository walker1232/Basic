package step1;
import java.util.Scanner;
/*
 대한비만학회는 기존에는 BMI가 18.5 미만이면 저체중, 
 18.5∼23은 정상, 23~25이면 과체중, 25∼30은 경도비만, 30∼35는 중등도비만, 
 35 이상이면 고도비만으로 구분했었으나, 2018년 비만진료지침에서 단계별 용어가 새롭게 변경되어 18.5 미만이면 저체중, 
 18.5∼23은 정상, 23~25이면 '비만 전단계'[5], 25∼30은 '1단계 비만', 30∼35는 '2단계 비만' , 35 이상이면 '3단계 비만'으로 구분한다.
  */
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
