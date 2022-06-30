package ex0630;

public class ex05 {
	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			System.out.println("---------------------");
			for(int j=0;j<3;j++) {
				System.out.print("[i="+i+",j="+j+"] ");
			}
			System.out.println();
			for(int k=0;k<3;k++) {
				System.out.println("i= "+i+" k = "+k);
			}
			System.out.println();
		}
	}
}
