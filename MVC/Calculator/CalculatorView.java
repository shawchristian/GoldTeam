// This is the View
02	// Its only job is to display what the user sees
03	// It performs no calculations, but instead passes
04	// information entered by the user to whomever needs
05	// it.
06	 
07	import java.awt.event.ActionListener;
08	 
09	import javax.swing.*;
10	 
11	public class CalculatorView extends JFrame{
12	 
13	    private JTextField firstNumber  = new JTextField(10);
14	    private JLabel additionLabel = new JLabel("+");
15	    private JTextField secondNumber = new JTextField(10);
16	    private JButton calculateButton = new JButton("Calculate");
17	    private JTextField calcSolution = new JTextField(10);
18	     
19	    CalculatorView(){
20	         
21	        // Sets up the view and adds the components
22	         
23	        JPanel calcPanel = new JPanel();
24	         
25	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
26	        this.setSize(600, 200);
27	         
28	        calcPanel.add(firstNumber);
29	        calcPanel.add(additionLabel);
30	        calcPanel.add(secondNumber);
31	        calcPanel.add(calculateButton);
32	        calcPanel.add(calcSolution);
33	         
34	        this.add(calcPanel);
35	         
36	        // End of setting up the components --------
37	         
38	    }
39	     
40	    public int getFirstNumber(){
41	         
42	        return Integer.parseInt(firstNumber.getText());
43	         
44	    }
45	     
46	    public int getSecondNumber(){
47	         
48	        return Integer.parseInt(secondNumber.getText());
49	         
50	    }
51	     
52	    public int getCalcSolution(){
53	         
54	        return Integer.parseInt(calcSolution.getText());
55	         
56	    }
57	     
58	    public void setCalcSolution(int solution){
59	         
60	        calcSolution.setText(Integer.toString(solution));
61	         
62	    }
63	     
64	    // If the calculateButton is clicked execute a method
65	    // in the Controller named actionPerformed
66	     
67	    void addCalculateListener(ActionListener listenForCalcButton){
68	         
69	        calculateButton.addActionListener(listenForCalcButton);
70	         
71	    }
72	     
73	    // Open a popup that contains the error message passed
74	     
75	    void displayErrorMessage(String errorMessage){
76	         
77	        JOptionPane.showMessageDialog(this, errorMessage);
78	         
79	    }
80	     
81	}
- See more at: http://www.newthinktank.com/2013/02/mvc-java-tutorial/#sthash.gMrgh5Pv.dpuf