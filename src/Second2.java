import java.util.Scanner;

public class Second2 {
	public static void main(String[] args) {
		System.out.println("请输入一个数字:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;
		if (n <= 0) {
			System.out.println("错误输入，请重新输入");
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = 1;
			}
		}
		if (result == 1) {
			System.out.println("不是质数");
			System.out.println();
		} else {
			System.out.println("是质数");
			System.out.println();
		}
		// 输出1000内所有质数
		System.out.println("1000以内的质数:");
		System.out.println();
		int count = 0;
		for (int j = 2; j < 1000; j++) {
			if (j % 2 == 0 && j != 2)
				continue;
			boolean b = true;
			for (int k = 2; k <= Math.sqrt(j); k++) {
				if (j % k == 0) {
					b = false;
					break;
				}
			}
			if (!b) {
				continue;
			}
			System.out.print("\t" + j);
			count++;
			if (count % 10 == 0) {
				System.out.println("\n");
			}
		}
	}
}