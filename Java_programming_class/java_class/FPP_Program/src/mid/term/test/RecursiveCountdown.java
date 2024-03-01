package mid.term.test;

public class RecursiveCountdown {

	public static void main(String[] args){
		countDown(6);
		}
	
		public static void countDown(int num){
		if (num <=0){
		System.out.println();
		}
		else{
		System.out.print(num);
		countDown(num - 1);
		//System.out.println(num);
		}
		}

}
