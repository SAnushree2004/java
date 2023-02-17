import java.io.*;
import java.lang.*;
import java.util.Scanner;

class num{
	public void good(){
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=c.nextInt();
		if(n>0){
			System.out.println("It is positive");
		}else{
			System.out.println("It is negative");
		}
	}
}
public class number{
	public static void main(String[] args){
		num a=new num();
		a.good();
	}
}
