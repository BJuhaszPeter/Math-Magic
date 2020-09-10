// ------------------- Math Magic ------------------

/*In this project, you will become a mathemagician and write a small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you choose.*/

public class Magic {
	public static void main(String[] args) {
    // myNumber is the original number
    int myNumber = 6;

    int stepOne = myNumber * myNumber;

    int stepTwo = stepOne + myNumber;

    int stepThree = stepTwo / myNumber;

		int stepFour = stepThree + 17;

    int stepFive = stepFour - myNumber;

    int stepSix = stepFive / 6;

    System.out.println(stepSix);

	}
}

/*Then, save and run your code!

What number is printed to the console?

...

Now, go back to your code and change myNumber to any other integer. Run your program again.

Is the output the same?

It’s math magic! */