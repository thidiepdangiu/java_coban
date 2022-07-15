import java.util.Scanner;

public class LopMath {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		double r, s, c;
		System.out.println("Nhập vào bán kính: ");
		r = sc.nextDouble();
		
		c=2*Math.PI*r;
		s=Math.PI*Math.pow(r, 2);
		System.out.println("Chu vi của hình tròn là: "+c);
		System.out.println("Diện tích của hình tròn là: "+s);

	}

}
