import java.awt.event.ActionEvent;
02	import java.awt.event.ActionListener;
03	 
04	// The Controller coordinates interactions
05	// between the View and Model
06	 
07	public class CalculatorController {
08	     
09	    private CalculatorView theView;
10	    private CalculatorModel theModel;
11	     
12	    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
13	        this.theView = theView;
14	        this.theModel = theModel;
15	         
16	        // Tell the View that when ever the calculate button
17	        // is clicked to execute the actionPerformed method
18	        // in the CalculateListener inner class
19	         
20	        this.theView.addCalculateListener(new CalculateListener());
21	    }
22	     
23	    class CalculateListener implements ActionListener{
24	 
25	        public void actionPerformed(ActionEvent e) {
26	             
27	            int firstNumber, secondNumber = 0;
28	             
29	            // Surround interactions with the view with
30	            // a try block in case numbers weren't
31	            // properly entered
32	             
33	            try{
34	             
35	                firstNumber = theView.getFirstNumber();
36	                secondNumber = theView.getSecondNumber();
37	                 
38	                theModel.addTwoNumbers(firstNumber, secondNumber);
39	                 
40	                theView.setCalcSolution(theModel.getCalculationValue());
41	             
42	            }
43	 
44	            catch(NumberFormatException ex){
45	                 
46	                System.out.println(ex);
47	                 
48	                theView.displayErrorMessage("You Need to Enter 2 Integers");
49	                 
50	            }
51	             
52	        }
53	         
54	    }
55	     
56	}
- See more at: http://www.newthinktank.com/2013/02/mvc-java-tutorial/#sthash.gMrgh5Pv.dpuf