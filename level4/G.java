package kodnest.JavaPatternPrograms.level4;

public class G {
public static void main(String[] args) {
	for(int i=1;i<=6;i++){
		for(int j=1;j<=6;j++) {
			if(i==2&&j==6||i==1&&j==5||i==1&&j==4||i==1&&j==3||i==2&&j==2||i==3&&j==2||i==4&&j==2||i==5&&j==2||i==6&&j==2||i==6&&j==3||i==6&&j==4||i==5&&j==4||i==4&&j==4||i==4&&j==4||i==4&&j==5||i==4&&j==6||i==4&&j==6||i==5&&j==6||i==6&&j==6) {
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
