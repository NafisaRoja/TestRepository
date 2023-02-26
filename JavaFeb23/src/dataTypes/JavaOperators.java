package dataTypes;

public class JavaOperators {

	public static void main(String[] args) {
		/**There are 5 types of Java Operators 
		 * 
		 * Arithmetic Operators
		 * Assignment Operators 
		 * Comparison/Relational Operator 
		 * Logical Operators 
		 * Bitwise operators 
		 */
         
		//learning Arithmetic Operators 
		//They are + - * / % ++ --
		
		int a = 10;
		int b = 5;
		int result;
		
		result = a + b; //addition
		System.out.println("addition result is " + result);//15
		result = a - b;  
		System.out.println("subtraction result is " + result);//5
		result = a * b; 
		System.out.println("multiplication result is " + result);//50
		result = a / b; 
		System.out.println("Division result is " + result);//2
		result = a % b; 
		System.out.println("Modulus result is " + result);//0
		//System.out.println("Incremental a is " + a++); //this will not work this way
		//System.out.println("Decremental a is " a--); //this will not work this way
	}

}
