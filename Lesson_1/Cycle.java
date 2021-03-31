public class Cycle {
	public static void main(String[] args) {
	for (int i = 0; i <= 20; i++) {
		System.out.println(i);
	}
	int num = -6;
	while (num <= 6) {
		System.out.println(num);
		num += 2;
	}
	int x = 10;
	int sum = 0;
	do {
		sum += x;
		x++;
	} while (x <= 20);
	System.out.println(sum);
	}
}