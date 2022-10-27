package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {

		// FIXME compute the geometric sum for the first n terms recursively
		double sum = 0.0;
		if(n==0) {
			return 0;
		}
		else {
			sum = Math.pow(0.5, n) + geometricSum(n-1);
		}
		return sum;
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {

		// FIXME compute the gcd of p and q using recursion
		if(q == 0) {
			return p;
		}
		else {
			// p in the next gcd is equal to q and the q in the next gcd is equal to p%q. This method calls on itself until
			// q == 0, in which the method will return p which will be the greatest common divisor. This value is returned
			// through all of the recursions and the final output will be the greatest common divisior.
			return gcd(q,p%q);
		}
	}



	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] helper(int[] array, int index) {	


		if(index == array.length/2) {
			return array;
		}
		else {
			int temp = array[array.length - index - 1];
			array[array.length - index - 1] = array[index];
			array[index] = temp;
			return helper(array, index + 1);
		}

	}

	public static int[] toReversed(int[] array) {
		int[] copyOfXs = Arrays.copyOf(array, array.length);

		if(array.length == 0 || array.length == 1) {
			return copyOfXs;
		}
		else {
			return helper(copyOfXs, 0);
		}
		// FIXME create a helper method that can recursively reverse the given array


	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {

		// FIXME
	}

}
