import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		System.out.println("璇疯緭鍏ュ勾浠�:");
		System.out.println("璇疯緭鍏ュ勾浠�:");
		System.out.println("闰年输出");
        int year;//鎺ユ敹杈撳叆鐨勫勾浠�
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if(year<0||year>3000){
            System.out.println("骞翠唤鏈夎锛�");
        }
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"鏄棸骞�");
        }else{
            System.out.println(year+"涓嶆槸闂板勾");
            System.out.println(year+"");
        }
    }
}
