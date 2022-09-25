import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner inputTaker = new Scanner(System.in);
		int n = inputTaker.nextInt();
		solveTheTower(n, "A", "B", "C");
	}

	private static void solveTheTower(int n, String src, String aux, String dest){
		if(n == 0){
			return;
		}
		solveTheTower(n-1, src, dest, aux);
		System.out.println(n + ":" + src + "->" + dest);
		solveTheTower(n-1, aux, src, dest);
	}
}