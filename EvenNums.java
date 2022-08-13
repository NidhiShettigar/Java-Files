import java.util.*;
import java.text.DecimalFormat;

class EvenNums{
	public static void main(String[] args){
		/*
		for (int i=0; i<=20; i=i+2){
			System.out.println("EvenNums:"+i);
		}
		
		for (int j=0; j<=50; j++){
			if(j%2!=0){
				System.out.println("OddNums:"+j);
			}
		}

		int k = 20;
		while(k>=1){
			System.out.println(k);
		k--;	
		}
		// 20 to 1

		//round up to 2 decimal digits
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();

		DecimalFormat dc = new DecimalFormat("#.##");

		System.out.println("Float number:"+f);
		System.out.println("Float round up to 2 number:"+ dc.format(f));
		

		//removing extra numbers
		
		double d = sc.nextDouble();

		System.out.println("Double number:"+d);
		System.out.println("Double up to 2 decimal number:"+String.format("%.2d",d) );
		*/

		//display string letter by letter
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();

		for(int i=0; i<str1.length(); i++){
			System.out.println(str1.charAt(i));	
		}	
		//System.out.println(str1.length());
	}
}