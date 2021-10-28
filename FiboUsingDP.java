/* FINDING NEXT FIBONACCI NUMBER USING DYNAMIC PROGRAMMING 

DYNAMIC Programming solution by
1> Recursive call
2> store (Memoize)
3> Bottom-up

*/
import java.util.*;
class FiboUsingDP
{
	public static void main(String[] args) 
	{	
		System.out.println("Enter the integer for finding Fibonaci number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arMemo = new int[n+1];
//		System.out.println(findFiboByMemo(n, arCon));	//finding fibo by storing the visited value
		findFiboByBottomUp(n);		// finding fibo by using bottom-up approach
//		System.out.println(Arrays.toString(arCon));
	}

/* Memoization Approach */
	public static int findFiboByMemo(int n, int[] ar) {
		int result = 0;
		if(ar[n] != 0) return ar[n];

		if(n == 0 || n == 1) {
			result = 1;
			ar[n] = result;
		} else {
			result = findFiboByMemo(n-1, ar)+findFiboByMemo(n-2, ar);
			ar[n] = result;
		}
		return result;
	}

/* Bottom-Up Appoach. */

	public static void findFiboByBottomUp(int n) {
		int[] arBottomUp = new int[n];
		arBottomUp[0] = 1;
		arBottomUp[1] = 1;
		for(int i = 2; i< n; i++) {
			arBottomUp[i] = arBottomUp[i-1] + arBottomUp[i-2];
		}
		System.out.println(Arrays.toString(arBottomUp));
	}

}
 