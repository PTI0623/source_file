package ex0630;

public class hw09 {
	public static void main(String[] args) {
		int x;
		int y;
		for(x=0;x<10;x++) {
			for(y=0;y<10;y++) {
				if((10*x+y)+(10*y+x)==99) {
					System.out.println("x,y:"+"("+x+","+y+")");
					System.out.println();
				}
			}
		}
	}
}
