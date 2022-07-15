import java.util.Scanner;

public class switch_case {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x;
	System.out.println("Nhap x từ 0 đến 8 ");
	x = sc.nextInt();
	
	switch (x) {
		case 2:
			System.out.println("Thứ hai");
			break;
		case 3:
			System.out.println("Thứ ba");
			break;
		case 4:
			System.out.println("Thứ tư");
			break;
		case 5:
			System.out.println("Thứ năm");
			break;
		case 6:
			System.out.println("Thứ sáu");
			break;
		case 7:
			System.out.println("Thứ bảy");
			break;
		case 8:
			System.out.println("Chủ nhật");
			break;
		default:
			System.out.println("Nhập dữ liệu sai");
	}
}
}
