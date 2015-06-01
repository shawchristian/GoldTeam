// This is the View
	// Its only job is to display what the user sees
	// It performs no calculations, but instead passes
	// information entered by the user to whomever needs
	// it.
	 
	import java.awt.event.ActionListener;
	
  //import this to allow us to make an interface
	import javax.swing.*;
	 
	//java stuff for making the interfce
	public class CalculatorView extends JFrame{
	    
	    //this will be block so that they can enter a number
	    private JTextField firstNumber  = new JTextField(10);
	    //addition sign
	    private JLabel additionLabel = new JLabel("+");
	    //another block so that they can enter the number
	    private JTextField secondNumber = new JTextField(10);
	    //button so that they can push to perform the calculation
	    private JButton calculateButton = new JButton("Calculate");
	    //this will be the box where the solution will show
	    private JTextField calcSolution = new JTextField(10);
	     
	    CalculatorView(){
	         
	        // Sets up the view and adds the components
	        //just making it so that the calculator closes when we click on the x button
	        JPanel calcPanel = new JPanel();
	         
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //setting the size of the calculator
	        this.setSize(600, 200);
	         
            //everything will be displayed in exact order that we have below
	        //add all components that we created above to the panel
	        calcPanel.add(firstNumber);
	        calcPanel.add(additionLabel);
	        calcPanel.add(secondNumber);
	        calcPanel.add(calculateButton);
	        calcPanel.add(calcSolution);
	        
	        //add calculator panel to the jframe
	        this.add(calcPanel);
	         
	        // End of setting up the components --------
	         
	    }
	    //provides a way to get acces to the numbers
	    public int getFirstNumber(){
	        //getText 
	        return Integer.parseInt(firstNumber.getText());
	         
	    }
	     
	    public int getSecondNumber(){
	         
	        return Integer.parseInt(secondNumber.getText());
	         
	    }
	     
	    //gets you whatever is inside of the text fields
	    public int getCalcSolution(){
	         
	        return Integer.parseInt(calcSolution.getText());
	         
	    }
	    
	    //model is going to do calculation for us but it doesnt know about existance of view so controller part miust set that
	    public void setCalcSolution(int solution){
	         
	        calcSolution.setText(Integer.toString(solution));
	         
	    }
	     
	    // If the calculateButton is clicked execute a method
	    // in the Controller named actionPerformed
	    //controller is alerted to fact if button is clicked.   
	    void addCalculateListener(ActionListener listenForCalcButton){
	         
	        calculateButton.addActionListener(listenForCalcButton);
	         
	    }
	     
	    // Open a popup that contains the error message passed
	    //if they click on calculation button without 
	    //view does onyl handle what is being viewed
	    //view is only a view, not much of anything else
	    void displayErrorMessage(String errorMessage){
	         
	        JOptionPane.showMessageDialog(this, errorMessage);
	         
	    }
	     
	}
