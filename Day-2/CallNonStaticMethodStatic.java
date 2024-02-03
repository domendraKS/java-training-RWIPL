class CallNonStaticMethodStatic{
	public static void main(String args[]){
		findAverage(10,20,30);
	}
	
	public static void findAverage(int a, int b, int c){
		CallNonStaticMethodStatic methods = new CallNonStaticMethodStatic();
		float average = methods.findSum(a,b,c)/3;
		
		System.out.println("Average is = "+average);
	}
	
	public int findSum(int a, int b, int c){
		int sum = a+b+c;
		return sum;
	}
}