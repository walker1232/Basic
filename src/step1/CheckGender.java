package step1;
import java.util.Scanner;
/*
 	  *	���α׷��� �ϳ� �����ؾ� �մϴ�.
      * ������ �ֹι�ȣ�� �Է��ϸ� �ش� �л��� ��������,
        ��������, �ܱ�������
      * �ڵ� ���� ����� �ִ� ���α׷��� ����� �޶��ϴ�.
      * ������ ������ ���� ȭ�鿡 ����϶�� �մϴ�.
      * ȫ�浿 : 800101 -1234567 : ��
      * �Է°��� �̸��� �ֹι�ȣ�̰� ���� �ڵ����� ��µǴ� ���Դϴ�.
      * ������� 1, 3���� ���۵Ǹ� ����, 2, 4�� ���۵Ǹ�
        ����, 5,6 �̸� �ܱ���
      * ������ �Ǽ��� 0,7,8,9 �� ���� �ֹι�ȣ�� �Է��ϸ�
      * "�ٽ� �Է��ϼ���" ��� �˷��ֽñ� �ٶ��ϴ�.

      ���� String gender = "";
      �ֹε�Ϲ�ȣ 800101-1234567 ���� 1 �� �����ϴ� ����
      String ssn = "800101-1234567";
      char ch = ssn.charAt(7); �ϸ� 1 �� ����Ǿ� ch �� ����.
      �׷��� ���ΰ��� '1' �̷��� �ȴ�
      if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){...}
      */
public class CheckGender {
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
				System.out.println("Enter your ssn");
				String ssn = scan.next();
				System.out.println("Enter your name");
				String name =scan.next();
				String result = "";
				String gender = "";
				char ch = ssn.charAt(7);
				switch(ch){
					case '1': case '3':
					gender = "man";
					result = name + " : " + ssn + " : " + gender; break;
					case '2': case '4':
					gender = "woman";
					result = name + " : " + ssn + " : " + gender; break;
					case '5': case '6':
					result = name + " : " + ssn + " : foreignal"; break;
					default: 
					result = ssn + "retry"; break;
				}
				System.out.println(result);
				default: break;
			}
		}
	}
}
/*System.out.println("Enter your ssn");
Scanner scan = new Scanner(System.in);
String ssn = scan.next();
System.out.println("Enter your name");
String name = scan.next();
String message = "";
String gender = "";
char ch = ssn.charAt(7);
switch(ch){
	case '1': case '3':
	gender = "man";
	message = name + " : " + ssn + " : " + gender; break;
	case '2': case '4':
	gender = "woman";
	message = name + " : " + ssn + " : " + gender; break;
	case '5': case '6':
	message = name + " : " + ssn + " : foreignal"; break;
	default:
	message = ssn + "retry"; break;
}
System.out.println(message);*/