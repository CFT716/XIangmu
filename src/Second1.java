import java.util.Scanner;

public class Second1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������0-100֮��ĳɼ�(����-1�˳�):");
		while (true) {
			int grade = scan.nextInt();
			if (grade == -1)
				break;
			if (grade < 0 || grade > 100) {
				System.out.println("�������,���������룡");
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
					System.out.println("������");
					System.out.println();
					break;
				case 6:
					System.out.println("����");
					System.out.println();
					break;
				case 7:
					System.out.println("�еȣ�");
					System.out.println();
					break;
				case 8:
					System.out.println("���ã�");
					System.out.println();
					break;
				case 9:
				case 10:
					System.out.println("���㣡");
					System.out.println();
					break;
				default:
					System.out.println();
				}
			}

		}

	}
}
