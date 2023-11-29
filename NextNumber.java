/**
 * Problem description:
 * Choose a number between 0-99 and add its digits. 
 * Then find the next number whose sum of its digits returns double the previous one.
 */
public class NextNumber {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 100);
		int lastDigit = (firstNumber % 10);
		int firstDigit = (firstNumber / 10);
		int firstSum = firstDigit + lastDigit;
		int secondSum = firstSum * 2;
		
		System.out.println("First number: " + firstNumber);

		firstSolution(firstNumber, firstDigit, lastDigit, firstSum, secondSum);
    }

    static void firstSolution(int firstNumber, int firstDigit, int lastDigit, int firstSum, int secondSum) {
		int secondNumber = firstNumber + 1;

		while (sum(secondNumber) < secondSum) {
			secondNumber++;
		}

		System.out.println("Second number from first solution: " + secondNumber);
	}
	
	static int sum(int number) {
		int sum = 0;
		
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}    
}
