package Main;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ınp=new Scanner(System.in);
		
		System.out.println("1. Sayıyı Giriniz: ");
		int a=ınp.nextInt();
		System.out.println("2. Sayıyı Giriniiz: ");
		int b=ınp.nextInt();
		System.out.println("3. Sayıyı Giriniz: ");
		int c=ınp.nextInt();
		if (a>b && a>c) {
			if (b>c) {
				System.out.println("a>b>c");
				
			}else {
				System.out.println("a>c>b");
				
			}
		}else if (b>a && b>c) {
			if (a>c) {
				System.out.println("b>a>c");
			}else {
				System.out.println("b>c>a");
			}
		}else if(c>a && c>b) {
			if (a>b) {
				System.out.println("c>a>b");
			}else {
				System.out.println("c>b>a");
			}
		}

	}

}
