package basic;

public class Dimond {

	public static void main(String[] args) {

		for(int i=0;i<=10;i++) {
			for (int j=10;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k =0; k<=i;k++) {
				System.out.print("  *");
			}
			
			
			System.out.println(" ");
			
//			for (int m =10;m>=i;m--) {
//				System.out.print("  *");
//			}
		}
		
		
	}

}
