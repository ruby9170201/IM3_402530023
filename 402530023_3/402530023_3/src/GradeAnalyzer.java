import java.util.ArrayList;
import javax.swing.*;

public class GradeAnalyzer {

	public static class GradeAnalyse {

		String input;
		int appropriateNum = 0;
		double totalNum = 0;
		ArrayList<Double> grade = new ArrayList<Double>();
		double aver = 0;
		double standard = 0;
		int AplusGrade = 0;
		int AGrade = 0;
		int AminGrade = 0;
		int BplusGrade = 0;
		int BGrade = 0;
		int BminGrade = 0;
		int CplusGrade = 0;
		int CGrade = 0;
		int CminGrade = 0;
		int DGrade = 0;
		int FGrade = 0;

		
		public static boolean isNumeric(String str) {
			try {
				double d = Double.parseDouble(str);
			} catch (NumberFormatException nfe) {
				return false;
			}
			return true;
		}

		public boolean isValidGrade(double aGrade) {
			if (aGrade <= 110 && aGrade >= 0) {
				return true;
			}

			else {
				return false;
			}
		}

		public void addGrade(double aGrade) {

			input = JOptionPane.showInputDialog("�п�J���Z");

			//�ոլ�input.equalsIgnoreCase()�o��method.
			while (!input.equals("q") && !input.equals("Q")) {

				boolean y = isNumeric(input);

				//�U���o���޿�ܩ�, input�n����q�S����Q, �Aı�o�|�L��? �ݰ_��q��Q�O���@�˪��F���. -2
				while (y == false && !input.equals("q") && !input.equals("Q")) {
					JOptionPane.showMessageDialog(null, "�п�J���T���Ʀr");
					input = JOptionPane.showInputDialog("�п�J���Z");
					y = isNumeric(input);
				}

				if (input.equals("q") || input.equals("Q")) {
					break;
				}

				boolean test = isValidGrade((Double.parseDouble(input)));

				if (test == true) {
					grade.add(Double.parseDouble(input));
					appropriateNum += 1;
					totalNum += Double.parseDouble(input);
					aver = totalNum / appropriateNum;
				}
				input = JOptionPane.showInputDialog("�п�J���Z");
			}
		}

		public void analyzeGrades() {

			int i = 0;
			double n = 0;
			
			//for�|���|����n��?
			while (i < grade.size()) {

				double x = grade.get(i);

				n += Math.pow(x - aver, 2);

				if (grade.get(i) >= 98) {
					AplusGrade += 1;
				}

				if (grade.get(i) < 98 && grade.get(i) >= 92) {
					AGrade += 1;
				}

				if (grade.get(i) < 92 && grade.get(i) >= 90) {
					AminGrade += 1;
				}

				if (grade.get(i) < 90 && grade.get(i) >= 88) {
					BplusGrade += 1;
				}

				if (grade.get(i) < 88 && grade.get(i) >= 82) {
					BGrade += 1;
				}

				if (grade.get(i) < 82 && grade.get(i) >= 80) {
					BminGrade += 1;
				}

				if (grade.get(i) < 80 && grade.get(i) >= 78) {
					CplusGrade += 1;
				}

				if (grade.get(i) < 78 && grade.get(i) >= 72) {
					CGrade += 1;
				}

				if (grade.get(i) < 72 && grade.get(i) >= 70) {
					AGrade += 1;
				}

				if (grade.get(i) < 70 && grade.get(i) >= 60) {
					DGrade += 1;
				}

				if (grade.get(i) < 60) {
					FGrade += 1;
				}

				i += 1;
			}

			standard = Math.sqrt(n / appropriateNum);

		}

		public String toString() {
			return "You entered " + appropriateNum
					+ " valid grades from 0 to 110. Invalid grades are ignored!\nThe average = " + aver
					+ " with a standard deviation = " + standard + "\nThe grade distribution is:\nA+ = " + AplusGrade
					+ "\nA  = " + AGrade + "\nA- = " + AminGrade + "\nB+ = " + BplusGrade + "\nB  = " + BGrade
					+ "\nB- = " + BminGrade + "\nC+ = " + CplusGrade + "\nC  = " + CGrade + "\nC- = " + CminGrade
					+ "\nD  = " + DGrade + "\nF  = " + FGrade;
		}

	}
}
