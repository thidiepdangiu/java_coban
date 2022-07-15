import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		double a,b,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a= ");
		a = sc.nextDouble();
		System.out.println("Nhập b= ");
		b = sc.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình đã cho có vô số nghiệm.");
			}else {
				System.out.println("Phương trình đã cho vô nghiệm.");
			}
		}else {
			x=-b/a;
			System.out.println("Nghiệm của phuong trình là: "+x);
		}
	}
}
