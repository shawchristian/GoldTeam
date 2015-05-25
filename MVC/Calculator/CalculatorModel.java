// The Model performs all the calculations needed
02	// and that is it. It doesn't know the View
03	// exists
04	 
05	public class CalculatorModel {
06	 
07	    // Holds the value of the sum of the numbers
08	    // entered in the view
09	     
10	    private int calculationValue;
11	     
12	    public void addTwoNumbers(int firstNumber, int secondNumber){
13	         
14	        calculationValue = firstNumber + secondNumber;
15	         
16	    }
17	     
18	    public int getCalculationValue(){
19	         
20	        return calculationValue;
21	         
22	    }
23	     
24	}
- See more at: http://www.newthinktank.com/2013/02/mvc-java-tutorial/#sthash.nqiaPAje.dpuf