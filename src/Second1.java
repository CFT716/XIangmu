import java.util.Scanner;

public class Second1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入0-100之间的成绩(输入-1退出):");
		while (true) {
			int grade = scan.nextInt();
			if (grade == -1)
				break;
			if (grade < 0 || grade > 100) {
				System.out.println("输入错误,请重新输入！");
				System.out.println();
			} else {
				grade = grade / 10;
				switch (grade) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.println("不及格！");
					System.out.println();
					break;
				case 6:
					System.out.println("及格！");
					System.out.println();
					break;
				case 7:
					System.out.println("中等！");
					System.out.println();
					break;
				case 8:
					System.out.println("良好！");
					System.out.println();
					break;
				case 9:
				case 10:
					System.out.println("优秀！");
					System.out.println();
					break;
				default:
					System.out.println();
				}
			}

		}

	}
}
