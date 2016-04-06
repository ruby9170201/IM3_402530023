/*
 * [A]83
 * [TA's Advise]
 * 1. 實作的演算法錯誤(題目要求為Gauss, 此演算法為Anonymous Gregorian, 等級從B開始計算.
 * 2. 常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3. 之後可以嘗試在javadoc中寫一些註解.
 * */
public class EasterTester {
	public static void main(String[] args) {
		System.out.println(Easter.calculateEaster(2001));
		System.out.println(Easter.calculateEaster(2012));
	}
}
