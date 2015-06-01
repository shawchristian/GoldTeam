//need to create all of these objects
public class MVCCalculator {
	     
	    public static void main(String[] args) {
	         
	        CalculatorView theView = new CalculatorView();
	         
	        CalculatorModel theModel = new CalculatorModel();
          //the two above dont know that eachother exists 
	         
	        CalculatorController theController = new CalculatorController(theView,theModel);
	         
	        theView.setVisible(true);
	         
	    }
	}
