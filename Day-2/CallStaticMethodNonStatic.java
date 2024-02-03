class CallStaticMethodNonStatic{
	public static void main(String args[]){
		CallStaticMethodNonStatic methods = new CallStaticMethodNonStatic();
		
		methods.findEvenOdd(10);
	}
	
	public void findEvenOdd(int num){
		if(num%2 == 0){
			System.out.println(num+" is even");
		}else{
			System.out.println(num+" is odd");
		}
	}
}