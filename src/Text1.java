import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		System.out.println("���������:");
        int year;//������������
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if(year<0||year>3000){
            System.out.println("�������");
        }
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"������");
            System.out.println(year+"���������");
        }else{
            System.out.println(year+"��������");
        }
    }
}