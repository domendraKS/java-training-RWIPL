class CallStaticMethodStatic{
	public static void main(String args[]){
		findGreatestNumber(30, 20);
	}
	
	public static void findGreatestNumber(int a, int b){
		if(a>b){
			System.out.println(a+" is greater than "+b);
		}else{
			System.out.println(a+" is less than "+b);
		}
	}
}