import java.util.Scanner;

public class CacPhepToanSoSanh {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Nhập a = ");
	a = sc.nextInt();
	System.out.println("Nhập b = ");
	b = sc.nextInt();
	
	System.out.println(a+" == "+b+" : "+(a==b));
	System.out.println(a+" != "+b+" : "+(a!=b));
	System.out.println(a+" < "+b+" : "+(a<b));
	System.out.println(a+" <= "+b+" : "+(a<=b));
	System.out.println(a+" > "+b+" : "+(a>b));
	System.out.println(a+" >= "+b+" : "+(a>=b));
	System.out.println("Cả hai số là số chẵn :"+(a%2==0 && b%2==0));
	System.out.println("Có ít nhất một số chẵn :"+(a%2==0 || b%2==0));

}
}
