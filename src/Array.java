
public class Array {

		public static void main(String[] args) {
			int[][] A= new int[9][9];
			for (int i = 1; i <= A.length; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}
	}
		
