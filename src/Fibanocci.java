
public class Fibanocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int temp = 0;
		for (int i = 1; i <= 50; i++) {
			System.out.println(a);
			temp = a + b;
			a = b;
			b = temp;
		}
	}
}
