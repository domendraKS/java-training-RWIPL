class IfElse{
	public static void main(String args[]){
		int a=30, b=20;
		
		//if statement
		if(a<b){
			System.out.println(a+" is less than "+b);
		}
		
		//if else statement
		if(a>b){
			System.out.println(a+" is greater than "+b);
		}else{
			System.out.println(a+" is less than "+b);
		}
		
		//if-else-if ladder statement
		
		//nested if statement 
		int age = 20;
		int weight = 40;
		if(age >= 18){
			if(weight >= 50){
				System.out.println("Your are eligible to donate blood.");
			}else{
				System.out.println("Weight should be atleast 50kg");
			}
		}else{
			System.out.println("Your not eligible to donate blood");
		}
	}
}