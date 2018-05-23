import java.util.*;
class Recursion{

	StringBuilder res, bin;
	
	Recursion(){
		res=new StringBuilder();
	}

	public void printNumbers(int n){
		if(n==1);
			else
				printNumbers(n-1);
		System.out.println(n);
	}

	public void printMultiples(int n, int k){
		if(k==1) System.out.println(n);
		else {
		printMultiples(n,k-1);
		System.out.println(n*k);
		}
	}

	public void stringReverse(String s, int i){
		if(i==s.length()-1) {
			res.append(s.charAt(i));
			}
		else {
			stringReverse(s, i+1);
			res.append(s.charAt(i));
		}
	}

	public boolean isPalindrome(String s, int i){
			if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
			if(i<s.length()-1) return isPalindrome(s, i+1);			
		return true;
	}

	public int nthFibonacci(int n){
		if(n == 0 || n==1) return 1;
		return nthFibonacci(n-1)+nthFibonacci(n-2);
	}

	public int factorial(int n){
		if(n==1) return n;
		else return n*factorial(n-1);
	}

	public int sum(int[] arr, int i){
		if(i==arr.length-1)
			return arr[i];
		return arr[i]+sum(arr, i+1);
	}

	public void decimalToBinary(int rem){
	if(rem <=1) 
		 bin.append(String.valueOf(rem%2)); 
		else {
				decimalToBinary(rem/2);
				bin.append(String.valueOf(rem%2));
			}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Recursion obj = new Recursion();
		System.out.println("1. printNumbers\n2. printMultiples\n3. stringReverse\n4. isPalindrome\n5 nthFibonacci\n6. factorial\n7. sum\n8. decimalToBinary");
		int cs = Integer.parseInt(sc.nextLine());
		try{
			switch(cs){
				case 1: System.out.println("Enter Number from 1 to: ");
		    			obj.printNumbers(sc.nextInt());
						break;
				case 2:System.out.println("Enter Number to print its multiples: ");
				int x = Integer.parseInt(sc.nextLine());
				System.out.println("******");
		    			obj.printMultiples(x,x);
						break;
				case 3: System.out.println("Enter String to reverse: ");
						obj.stringReverse(sc.nextLine(),0);
						System.out.println("Reversed String: "+obj.res);
						break;
				case 4: System.out.println("Enter a string to check for palindrome: ");
						System.out.println(obj.isPalindrome(sc.nextLine(),0));
						break;
				case 5: System.out.println("Which nth fibonacci you'd like to know? : ");
						System.out.println(obj.nthFibonacci(sc.nextInt()));
						break;
				case 6: System.out.println("Enter a number to find its factorial : ");
						System.out.println(obj.factorial(sc.nextInt()));
						break;
				case 7: System.out.println("Find the sum of all elements in an array: \nEnter the number of elements in your array: ");
						int[] arr = new int[sc.nextInt()];
						System.out.println("Enter elements: ");
						for(int i=0; i<arr.length; i++)
							arr[i] = sc.nextInt();
						System.out.println("Sum of elements: "+obj.sum(arr,0));
						break;
				case 8: System.out.println("Enter a number to convert it into binary: ");
						obj.decimalToBinary(Integer.parseInt(sc.nextLine()));
						System.out.println(obj.bin);
						break;
				default : System.out.println("Coming soon");
			}
		}
		catch(StackOverflowError se){
			System.err.println("Bad Recursion: Verify exit conditions");
			se.printStackTrace();
		}
	}
}
