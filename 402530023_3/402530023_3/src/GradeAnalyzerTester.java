/*
 * [A]94
 * [TA's Advise]
 * 1. �A�ܲߺD�ϥ�while, ��while�p�G�S���B�z�n����, �ܮe�����͵L�a�j��.
 * 2. ���@���޿�W���p���~�[�W�A��겣�ͤF�ܦh�����n���ܼƥh�x�s�@�˪��F��.
 * 3. �h�l��Function call�|���A���{���į୰�C, ��ı�o�A���{���i�H�g�o��n!
 * 4. �γ\�A�i�H�{���NDistribution�������ܼƴ����}�C���覡�h�g, �|���|����nmaintain�O?
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {

		GradeAnalyzer.GradeAnalyse GA = new GradeAnalyzer.GradeAnalyse();
		String firstinput = JOptionPane.showInputDialog("�п�J���Z");
		
		//�γ\�A�i�H���{�����u�M��, Tester�M�����Ȩð������b, �Q�Q�ݭY�ڳo��@�}�l�N��q, �{���|..? -2
		GA.addGrade(Double.parseDouble(firstinput));
		
		//�ʤ����Ҩϥγo���\��J�Ӽ�, -2
		GA.analyzeGrades();
		System.out.println(GA);
	}
}
