import java.util.Scanner;

public class ChuyenSoThapPhanSangNhiPhan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n= ");
		n = sc.nextInt();

		String x = "";
		while (n >  0) {			
			x = (n%2) + x;
			n /= 2;
		}
		System.out.println("Dạng nhị phân là : "+x);
	}
}
