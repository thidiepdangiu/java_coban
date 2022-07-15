import java.util.Scanner;

public class CacPhepToan {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a :");
		a = sc.nextInt();
		System.out.println("Nhap vao b :");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println("Tong hai so la : "+a+" + "+b+" = "+tong);
		
		int hieu = a - b;
		System.out.println("Hieu hai so la : "+a+" - "+b+" = "+hieu);
		
		int tich = a * b;
		System.out.println("Tich hai so la : "+a+" x "+b+" = "+tich);
		
		float thuong = (float)a / b;
		System.out.println("Thuong hai so la : "+a+" : "+b+" = "+thuong);
	}

}
