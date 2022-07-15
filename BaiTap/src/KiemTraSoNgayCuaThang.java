import java.util.Scanner;

public class KiemTraSoNgayCuaThang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n;
		System.out.println("Nhập vào tháng : ");
		t = sc.nextInt();
		System.out.println("Nhập vào năm : ");
		n = sc.nextInt();
		switch (t) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			System.out.println("Thang "+t+" năm "+n+" có 31 ngày");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println("Thang "+t+" năm "+n+" có 30 ngày");
			break;
		}
		case 2:{
			if(n%4 == 0 && n%100 != 0) || (n%400 == 0) {
				System.out.println("Tháng 2 năm "+n+" có 29 ngày");
			}else {
				System.out.println("Tháng 2 năm "+n+" có 28 ngày");
			}
			break;
		}
		default:
			System.out.println("Nhập sai dữ liệu");
		}
	}
}
