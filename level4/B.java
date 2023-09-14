package kodnest.JavaPatternPrograms.level4;

public class B {
public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=5;j++) {
			if(j==1||i==1&&j==2||i==1&&j==3||i==2&&j==4||i==3&&j==5||i==4&&j==4||i==5&&j==3||i==5&&j==2||i==5&&j==1||i==6&&j==4||i==7&&j==5||i==8&&j==5||i==9&&j==5||i==10&&j==4||i==10&&j==3||i==10&&j==2||i==10&&j==1) {
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
