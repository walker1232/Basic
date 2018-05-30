package step1;
import java.util.Scanner;
public class PRSGame {
	public static void main(String[] args) {
		while(true){
			System.out.println("0.stop 1.start");
			Scanner scan = new Scanner(System.in);
			switch(scan.nextInt()){
				case 0: return;
				case 1:
				System.out.println("Arockpaperscissors");
				String ap = scan.next();
				System.out.println("Brockpaperscissors");
				String bp = scan.next();
				String result = "draw";
				if(
					(ap.equals("R") && bp.equals("R"))
			 		||
			 		(ap.equals("P") && bp.equals("P"))
			 		||
			 		(ap.equals("S") && bp.equals("S"))
			 		){
				}else if(ap.equals("R") && bp.equals("S")){
					result = "win";
				}else if(ap.equals("R") && bp.equals("P")){
					result = "lose";
				}else if(ap.equals("S") && bp.equals("R")){
					result = "lose";
				}else if(ap.equals("S") && bp.equals("P")){
					result = "win";
				}else if(ap.equals("P") && bp.equals("R")){
					result = "win";
				}else{
					result = "lose";
				}
			System.out.println("rockpaperscissors result : " + result);
		}
		}
	}
	}
/*System.out.println("Arockpaperscissors");
Scanner scan = new Scanner(System.in);
String ap = scan.next();
System.out.println("Brockpaperscissors");
String bp = scan.next();
String result = "draw";
if(
	(ap.equals("R") && bp.equals("R"))
	 ||
	 (ap.equals("P") && bp.equals("P"))
	 ||
	 (ap.equals("S") && bp.equals("S"))
	 ){
}else if(ap.equals("R") && bp.equals("S")){
	result = "win";
}else if(ap.equals("R") && bp.equals("P")){
	result = "lose";
}else if(ap.equals("S") && bp.equals("R")){
	result = "lose";
}else if(ap.equals("S") && bp.equals("P")){
	result = "win";
}else if(ap.equals("P") && bp.equals("R")){
	result = "win";
}else{
	result = "lose";
}
System.out.println("rockpaperscissors result : " + result); */