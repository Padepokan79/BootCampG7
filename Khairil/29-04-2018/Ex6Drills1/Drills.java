public class Drills {
	public static void main(String[] args) {
		int numSet;
		double numFloat, numResult;

		numSet = 120;
		numFloat = 60;
		System.out.println("Number Set as Int: " + numSet + " and Number Set as Float: " + numFloat);

		numResult = numSet + numFloat;
		System.out.println("numSet plus numFloat is " + numResult);
		
		numResult = numSet - numFloat;
		System.out.println("numSet minus numFloat is " + numResult);

		numResult = numSet * numFloat + numSet;
		System.out.println("numSet times numFloat is " + numResult);

		numResult = numSet / numFloat + numFloat;
		System.out.println("numSet divided by numFloat is " + numResult);

		numResult = numSet % numFloat;
		System.out.println("numSet modulus numFloat is " + numResult);

		numResult = numSet * numSet;
		System.out.println("numSet square numSet is " + numResult);
	} 
}