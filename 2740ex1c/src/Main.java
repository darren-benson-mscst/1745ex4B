import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// --------------------- p124 #8: Sales Tax ---------------------
		// Get dollar sales amount
		String inputString = JOptionPane.showInputDialog("Sales tax calculator: enter dollar amount. ");
		double dollarAmount = Double.parseDouble(inputString);
		
		final double stateRate = 0.055;
		final double countyRate = 0.02;
		double stateTax = 0.0;
		stateTax = dollarAmount * stateRate;
	
		// Display the tax results.
		JOptionPane.showMessageDialog(null,
			"Tax calculator:\nAmount:      $" + dollarAmount +
			"\nState Tax:  $" + stateTax);
		
		
		// ------------------ p124 #9: Miles per gallon ------------------
		
		// ------------------ p125 #10: Average Test Score ---------------
		
		
		System.exit(0);
	}

}
