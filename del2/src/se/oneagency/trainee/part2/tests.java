package se.oneagency.trainee.part2;
import se.oneagency.trainee.part2.VeryBasicStack;

//Package created to to run tests trough this class.
public class tests {
	public static void main(String[] args) {
		Stack v = new MyStack();
		
		String hey = "heyooo";
		String bye = "bye";
		String gb = "Good";
		//v.pop();
		for (int i = 0; i <20; i++) {
			v.push(hey);
			v.push(bye);	
		}
		System.out.println(v.pop());
		System.out.println(v.contains(gb));
		System.out.println(v.contains(hey));
	}
}
