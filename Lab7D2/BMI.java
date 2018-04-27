package Lab7D2;
import javax.swing.JOptionPane;
public class BMI {

	public static void main(String[] args) {
		String input,name,gender,temp_s=" ";
		double temp=0.0,std_weight=0.0,weight,height;
		boolean tmp,tmp_m,tmp_f;
		name = JOptionPane.showInputDialog(null, "Input your name.", "NAME", JOptionPane.QUESTION_MESSAGE);
		gender = JOptionPane.showInputDialog(null, "Input your gender. [{Male,M,m}/{Female,F,f}]", "GENDER", JOptionPane.QUESTION_MESSAGE);
		tmp_m = !gender.equals("Male") && !gender.equals("male") && !gender.equals("M") && !gender.equals("m");
		tmp_f = !gender.equals("Female") && !gender.equals("female") && !gender.equals("F") && !gender.equals("f");
		tmp = tmp_m && tmp_f;
		while(tmp) {
			gender = JOptionPane.showInputDialog(null, "Incorrect gender!!" +
					"\nInput your gender again. [{Male,M,m}/{Female,F,f}]", "ERROR", JOptionPane.ERROR_MESSAGE);
			tmp = !gender.equals("Male") && !gender.equals("male") && !gender.equals("M") && !gender.equals("m") && !gender.equals("Female") && !gender.equals("female") && !gender.equals("F") && !gender.equals("f");
		}
		input = JOptionPane.showInputDialog(null, "Input your height. [cm.]", "HEIGHT", JOptionPane.QUESTION_MESSAGE);
		height = Double.parseDouble(input);
		while(height<0.0) {
			input = JOptionPane.showInputDialog(null, "Incorrect height!!" +
					"\nInput your height again. [cm.]", "ERROR", JOptionPane.ERROR_MESSAGE);
			height = Double.parseDouble(input);
		}
		input = JOptionPane.showInputDialog(null, "Input your weight. [kg.]", "WEIGHT", JOptionPane.QUESTION_MESSAGE);
		weight = Double.parseDouble(input);
		while(weight<0.0) {
			input = JOptionPane.showInputDialog(null, "Incorrect weight!!" +
					"\nInput your weight again. [kg.]", "ERROR", JOptionPane.ERROR_MESSAGE);
			weight = Double.parseDouble(input);
		}
		if(gender.equals("Male") || gender.equals("male") || gender.equals("M") || gender.equals("m")) {
			std_weight = height-100.0;
			temp = std_weight - weight;
			if(temp>0.0)
				temp_s = "Thin";
			else if(temp<0.0)
				temp_s = "Fat";
			else
				temp_s = "Slender";
			if(gender.equals("male") || gender.equals("M") || gender.equals("m"))
				gender = "Male";
		}
		else if(gender.equals("Female") || gender.equals("female") || gender.equals("F") || gender.equals("f")) {
			std_weight = height-110.0;
			temp = std_weight - weight;
			if(temp>0.0)
				temp_s = "Thin";
			else if(temp<0.0)
				temp_s = "Fat";
			else
				temp_s = "Slender";
			if(gender.equals("female") || gender.equals("F") || gender.equals("f"))
				gender = "Female";
		}
		
		JOptionPane.showMessageDialog(null, "Hello!! " + name +
				"\nYou are " + gender +
				"\nYour height is " + height + " cm." +
				"\nYour weight is " + weight + " kg." +
				"\nYour std-weight is " + std_weight +
				"\nNow you are " + temp_s, "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
