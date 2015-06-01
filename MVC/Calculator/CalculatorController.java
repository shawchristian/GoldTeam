import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	 
	// The Controller coordinates interactions
	// between the View and Model
	 
	public class CalculatorController {
	     
	    private CalculatorView theView;
	    private CalculatorModel theModel;
	     
      //create constructor for it.  
	    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	         
	        // Tell the View that when ever the calculate button
	        // is clicked to execute the actionPerformed method
	        // in the CalculateListener inner class call calculate listener below
	        //refer the object version of the view, not view that was passed in
	        this.theView.addCalculateListener(new CalculateListener());//creating constructor
	    }
	    //so we can listen what is going on with view with controller
	    class CalculateListener implements ActionListener{
	        //where all interactions are going to occer, 
	        public void actionPerformed(ActionEvent e) {
	            
	            int firstNumber, secondNumber = 0;
	             
	            // Surround interactions with the view with
	            // a try block in case numbers weren't
	            // properly entered
	            //stop any errors from being triggered.  
	            try{
	                //going to get whatever is in the view and stor it in the value
	                firstNumber = theView.getFirstNumber();
	                secondNumber = theView.getSecondNumber();
	                 
	                //model performs all the calculations,
	                theModel.addTwoNumbers(firstNumber, secondNumber);
	                //model stors this in calcalation value
	                //want to set calcuation solution, but first need to get in which is stored in the model
	                theView.setCalcSolution(theModel.getCalculationValue());
	             
	            }
	            //catch the error that will be triggered if they do not enter a number in the calcuation 
	            catch(NumberFormatException ex){
	                 
	                System.out.println(ex);
	                 
	                theView.displayErrorMessage("You Need to Enter 2 Integers");
	                 
	            }
	             
	        }
	         
	    }
	     
	}
- See more at: http://www.newthinktank.com/2013/02/mvc-java-tutorial/#sthash.gMrgh5Pv.dpuf