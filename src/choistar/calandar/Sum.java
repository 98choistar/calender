package choistar.calandar;
import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a,b;
		int num1,num2;
		System.out.println("두수를 입력");
		a= sc.next();
		b = sc.next();
		
		num1=Integer.parseInt(a);
		num2=Integer.parseInt(b);
		System.out.printf("%d와 %d의 합은 %d 입니다",num1,num2,num1+num2);
		
	}
}
