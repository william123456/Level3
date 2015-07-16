import javax.swing.JOptionPane;

public class Fibonacci_Sequence {
	int prev = 0;
	int current = 1;
	int next;

	public static void main(String[] args) {
Fibonacci_Sequence fs = new Fibonacci_Sequence();

fs.doFibonacciSequence();
	}

	public void doFibonacciSequence() {
		for (int i = 0; i < 100; i++) {
			System.out.println(current);
	next = prev + current;
	prev = current;
	current = next;
		}

	}
}
// public int getNum(){
//
// }
//
// }
