package choistar.calandar;

import java.util.Scanner;

public class Calendar {

	private static final int[] Max_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth(int month) {
		return Max_DAYS[month-1];
	}
	public void printSampleCalendar() {
		System.out.println("월  화  수 목 금 토 읽");
		System.out.println("-------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		Calendar cal =new Calendar();
		System.out.println("달 입력");
		int month=sc.nextInt();
		System.out.println( cal.maxDaysOfMonth(month));
		
		cal.printSampleCalendar();
		sc.close();
	}
}
