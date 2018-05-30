package step1;
import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		while(true){
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			String name = "", grade = "";
			int kok = 0, eng = 0, math = 0, average = 0;
			switch(scan.nextInt()){
				case 0: return;
				case 1: 
				System.out.println("What's your name?");
				name = scan.next();
				System.out.println("kok grade?");
				kok = scan.nextInt();
				if(kok < 0 || kok > 100){
					return;
				}
				System.out.println("Eng grade?");
				eng = scan.nextInt();
				if(eng < 0 || kok > 100){
					return;
				}
				System.out.println("math grade?");
				math = scan.nextInt();
				if(math < 0 || kok > 100){
					return;
				}
				average = (kok + eng + math) / 3;
				if(average >= 90){
					grade = "A";
				}else if(average >= 80){
					grade = "B";
				}else if(average >= 70){
					grade = "C";
				}else if(average >= 60){
					grade = "D";
				}else if(average >= 50){
					grade = "E";
				}else{
					grade = "F";
				}
				System.out.println(name + "[aver] " + average + "[gra] " + grade);
				break;
				default: break;
		}
	}
	}
}
/*System.out.println("What's your name?");
Scanner scan = new Scanner(System.in);
String name = scan.next();
System.out.println("kok grade?");
int kok = scan.nextInt();
if(kok < 0 || kok > 100){
	return;
}
System.out.println("Eng grade?");
int eng = scan.nextInt();
if(eng < 0 || kok > 100){
	return;
}
System.out.println("math grade?");
int math = scan.nextInt();
if(math < 0 || kok > 100){
	return;
}
int average = (kok + eng + math) / 3;
String grade = "";
if(average >= 90){
	grade = "A";
}else if(average >= 80){
	grade = "B";
}else if(average >= 70){
	grade = "C";
}else if(average >= 60){
	grade = "D";
}else if(average >= 50){
	grade = "E";
}else{
	grade = "F";
}
System.out.println(name + "[aver] " + average + "[gra] " + grade); */