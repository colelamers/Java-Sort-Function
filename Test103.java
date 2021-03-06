import java.util.Scanner;
public class Test103 {
	
	// Java Sort function in ascending order -- Cole Lamers

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Provide the size of the array.");

		// General variable to determine array size		
		int arraySize = Integer.valueOf(userInput.nextLine());
		// Creating array, putting user input variable in for it's size
		int[] array = new int[arraySize];

		System.out.println("Provide the numbers for the array");
		// Conducting a for loop to add the value for each "i" instance.
		// Since i increments, we're plugging in the user entered value
		// into the array, up until it hits the cap (1 less than total size).
		for (int i = 0; i < arraySize; i++) {
			array[i] = Integer.valueOf(userInput.nextLine());
		}

		// Calls method
		printNeatly(array);
		
		//Prints out organized array
		System.out.print("The elements are: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void printNeatly(int[] array) {
		
		// 3 separate variables, one for the swap, the other two to hold the counters
		int swap = 0;
		int n = 0;
		int i = 0;

		/*
		 * We must conduct a nested while loop here. First the two variables
		 * must be less than the array length. It cannot be equal to the array since
		 * these are used to check against the array size.
		 */
		while (n < array.length && i < array.length) {
			
			// Initial check at start, n is satisfied, so n increments up to 1
			if (n < array.length) {
				n++;
				/*
				 * Now we're keeping i static until it's been compared against all
				 * values of n. This starts the function to compare i_1:n_1,
				 * i_1:n_2, i_1:n_3, etc; up until it hits the ceiling of the array length.
				 */
				if (n == array.length) {
					/* 
					 * Once the variable n has hit the ceiling, it gets reset.
					 * Now i begins incrementing. So i_2:n_1, i_2:n_2, i_2:n_3, etc.
					 */
					n = 0;
					i++;
					/*
					 * Once i hits the ceiling, we no longer wish to check anymore since
					 * we have verified all possible comparisons and it breaks the loop.
					 */
					if (i == array.length) {
						break;
					}
				}
			}
			
			/*
			 * Boolean truth tables. The first and last conditions are the only time
			 * that both conditions become satisfied. The two that just continue the
			 * function because they are just a check. We want to ensure that when that
			 * is true, we do not want to do anything, as the order of the array is how
			 * we intentionally want it according to the program. 
			 */
			
			/* This first boolean check can be combined with the last one using an or 
			 * statement. I did not do that for the sake of demonstrating clearly what
			 * is occurring.
			 */
			
			if (i < n && array[i] > array[n]) {
				swap = array[i];
				array[i] = array[n];
				array[n] = swap;
			}else if (i < n && array[i] < array[n]) {
				continue;
			}else if (i > n && array[i] > array[n]) {
				continue;
			}else if (i > n && array[i] < array[n]) {
				swap = array[i];
				array[i] = array[n];
				array[n] = swap;
			}			
		}
	}
}



