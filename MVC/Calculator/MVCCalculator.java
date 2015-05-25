public class MVCCalculator {
02	     
03	    public static void main(String[] args) {
04	         
05	        CalculatorView theView = new CalculatorView();
06	         
07	        CalculatorModel theModel = new CalculatorModel();
08	         
09	        CalculatorController theController = new CalculatorController(theView,theModel);
10	         
11	        theView.setVisible(true);
12	         
13	    }
14	}
- See more at: http://www.newthinktank.com/2013/02/mvc-java-tutorial/#sthash.gMrgh5Pv.dpuf