package kodnest.JavaPatternPrograms.level2;

public class Five {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
