/*
 * [A]94
 * [TA's Advise]
 * 1. 你很習慣使用while, 但while如果沒有處理好的話, 很容易產生無窮迴圈.
 * 2. 有一些邏輯上的小失誤加上你其實產生了很多不必要的變數去儲存一樣的東西.
 * 3. 多餘的Function call會讓你的程式效能降低, 我覺得你的程式可以寫得更好!
 * 4. 或許你可以程式將Distribution的那些變數換成陣列的方式去寫, 會不會比較好maintain呢?
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {

		GradeAnalyzer.GradeAnalyse GA = new GradeAnalyzer.GradeAnalyse();
		String firstinput = JOptionPane.showInputDialog("請輸入成績");
		
		//或許你可以讓程式分工清楚, Tester專門接值並除錯防呆, 想想看若我這邊一開始就打q, 程式會..? -2
		GA.addGrade(Double.parseDouble(firstinput));
		
		//缺少驗證使用這成功輸入個數, -2
		GA.analyzeGrades();
		System.out.println(GA);
	}
}
