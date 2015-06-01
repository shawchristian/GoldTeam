// The Model performs all the calculations needed
	// and that is it. It doesn't know the View
	// exists
	
    //contains the data
    public class CalculatorModel {
 	    //going to add two values and display them on the screen
	    // Holds the value of the sum of the numbers
	    // entered in the view
	    //performs calculations for the data
	    private int calculationValue;
	    //just going to get these numbers and add them
	    public void addTwoNumbers(int firstNumber, int secondNumber){
	        //sum is stored in this variable
	        calculationValue = firstNumber + secondNumber;
	         
	    }
	    //this provides A way to get the calculation value, or get access
	    public int getCalculationValue(){
	         
	        return calculationValue;
	         
	    }
	     
	}