public class RelationalOperators{
	public static void main(String[] args){
		/*int x = 10;
		int y = 20;
		int z = 20;

		System.out.println(x==y); 
		System.out.println(y!=z);
		System.out.println(x<y);
		System.out.println(y<z);
		System.out.println(y>=z);
		System.out.println(x<=y);*/
		// false  false  true  false  true  true

		int counter = 0;
		
		/*if(counter >= 0 && ++counter >= 0){
			System.out.println("True");
		}
		System.out.println("Counter = "+ counter);*/
		// true counter=1


		if(counter >= 0 || ++counter >= 0){
			System.out.println("True");
		}
		System.out.println("Counter = "+ counter);
		// true counter=0
	}
}