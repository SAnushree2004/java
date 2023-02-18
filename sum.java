import java.io.*;
import java.lang.*;
import java.util.Scanner;

class num{
	public void good(){
		int sum=0;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number:");
		for(int i=0;i<5;i++){
			int n=c.nextInt();
			sum+=n;
		}
		System.out.println("SUM="+sum);
	}
}
public class sum{
	public static void main(String[] args){
		num a=new num();
		a.good();
	}
}
