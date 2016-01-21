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
		double countyTax = 0.0;
		double totalTax = 0.0;
		double totalAmount = 0.0;
		stateTax = dollarAmount * stateRate;
		countyTax = dollarAmount * countyRate;
		totalTax = stateTax + countyTax;
		totalAmount = dollarAmount + totalTax;
		
	
		// Display the tax results.
		JOptionPane.showMessageDialog(null,
			"Tax calculator:\nAmount:      $" + dollarAmount +
			"\nState Tax:   $" + stateTax +
			"\nCounty Tax:  $" + countyTax +
			"\nTotal Tax:   $" + totalTax +
			"\nTotal Amount   $" + totalAmount);
		
		
				
		// ------------------ p124 #9: Miles per gallon ------------------
		//Get number of miles driven and gallons of gas used
		String inputMiles = JOptionPane.showInputDialog("Enter Miles Driven");
		String inputGallons = JOptionPane.showInputDialog("Enter Gallons Used");
		double milesDriven = Double.parseDouble(inputMiles);
		double gallonsUsed = Double.parseDouble(inputGallons);
		
		double milesPerGallon = 0.0;
		
		//Calculate miles per gallon
		milesPerGallon = milesDriven / gallonsUsed;
		
		//Display results
		JOptionPane.showMessageDialog(null,"You are getting " + milesPerGallon + " miles per gallon");
		
		
					
		// ------------------ p125 #10: Average Test Score ---------------
		//Get the three test scores
		String inputTest1 = JOptionPane.showInputDialog("Test Score 1:");
		String inputTest2 = JOptionPane.showInputDialog("Test Score 2:");
		String inputTest3 = JOptionPane.showInputDialog("Test Score 3:");
		double testScore1 = Double.parseDouble(inputTest1);
		double testScore2 = Double.parseDouble(inputTest2);
		double testScore3 = Double.parseDouble(inputTest3);
		
		//Calculate average score
		double averageScore = (testScore1 + testScore2 + testScore3) / 3;
		
		//Display results
		JOptionPane.showMessageDialog(null,
				"Test Score 1:  " + testScore1 +
				"\nTest Score 2:  " + testScore2 +
				"\nTest Score 3:  " + testScore3 +
				"\nYour Average:  " + averageScore);
		
		
		System.exit(0);
	}

}
