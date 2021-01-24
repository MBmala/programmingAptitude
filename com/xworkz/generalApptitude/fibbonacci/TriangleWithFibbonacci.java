package com.xworkz.generalApptitude.fibbonacci;

public class TriangleWithFibbonacci {
	public static void main(String[] args) {
	 int row=3;
	 int col=5;
	 int mid=col/2;
	 int sum=0;
	 int a=0; int b=1;
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			 if((i+j>=mid&&j-i<=mid)) {
				 System.out.print(" "+a);
				 sum=a+b; 
				 a=b;
				 b=sum;
			 }else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
	}

}
