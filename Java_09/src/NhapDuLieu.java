import java.util.Scanner;

public class NhapDuLieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên:");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhập mã sv: ");
		long maSinhVien = sc.nextLong();
		
		System.out.println("Nhập vào điểm thi: ");
		float diemThi = sc.nextFloat();
		
		System.out.println("Họ và tên là: "+hoVaTen);
		System.out.println("Mã sinh viên là: "+maSinhVien);
		System.out.println("Điểm thi cua sinh viên là: "+diemThi);

	}
}
