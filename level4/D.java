package kodnest.JavaPatternPrograms.level4;

public class D {
public static void main(String[] args) {
	for(int i=1;i<=6;i++){
		for(int j=1;j<=6;j++) {
			if(j==1||i==1&&j==2||i==1&&j==3||i==2&&j==4||i==3&&j==4||i==4&&j==4||i==5&&j==4||i==6&&j==3||i==6&&j==2) {
				System.out.print("* ");
			}
			else { 
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
