package Lab7D1;
import javax.swing.JOptionPane;
public class BankATM {

	public static void main(String[] args) {
		String input;
		int select,temp=0,exits=0,money=0;
		do {
			input = JOptionPane.showInputDialog(null, "Automation Deposit/Withdraw\n\n" + 
					"1. Deposit\n" + 
					"2. Withdrawal\n" + 
					"3. Display the balances.\n" + 
					"4. Exit the program.\n\n" + 
					"Please select a topic. [input 1-4]\n\n", "Deposit/Withdraw", JOptionPane.QUESTION_MESSAGE);
			select = Integer.parseInt(input);
			switch (select) {
				case 1 :	input = JOptionPane.showInputDialog(null, "Please specify amount", "select Deposit", JOptionPane.QUESTION_MESSAGE);
							money += Integer.parseInt(input);
							Balance(money);
							exits = Exits();
							break;
							
				case 2 :	input = JOptionPane.showInputDialog(null, "Please specify amount", "select Withdraw", JOptionPane.QUESTION_MESSAGE);
							temp = Integer.parseInt(input);
							if(temp <= money && temp >= 0) {
								money -= temp;
								Balance(money);
							}
							else
								JOptionPane.showMessageDialog(null, "Can not withdraw money.", "WARNING", JOptionPane.WARNING_MESSAGE);
							exits = Exits();
							break;
					
				case 3 :	Balance(money);
							exits = Exits();
							break;
					
				case 4 :	exits = 0;
							break;
					
				default :	JOptionPane.showMessageDialog(null, "Input Incorrect!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
							exits = Exits();
			}
		}while(exits != 0);
		System.exit(0);
	}
	
	public static int Exits() {
		int exit;
		exit = JOptionPane.showConfirmDialog(null, "Exit program right now?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return exit;
	}
	
	public static void Balance(int money) {
		JOptionPane.showMessageDialog(null, "Balance : " + money, "Balance", JOptionPane.INFORMATION_MESSAGE);
	}

}
