public class Easter {
	private Easter() {
	}

	public static String calculateEaster(int _aYear) {
		// int aYear = _aYear; 雖然可以提供你良好的程式閱讀性, 不過這行的確是冗句喔.
		int aYear = _aYear;
		int a = aYear % 19;
		int b = aYear / 100;// Math.floor(), -2
		int c = aYear % 100;
		int d = b / 4;// Math.floor()
		int e = b % 4;
		int f = (b + 8) / 25;// Math.floor()
		int g = (b - f + 1) / 3;// Math.floor()
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;// Math.floor()
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;// Math.floor()
		int month = (h + l - 7 * m + 114) / 31;// Math.floor()
		int day = ((h + l - 7 * m + 114) % 31) + 1;
		return "In " + aYear + ",Easter Sunday is: month = " + month + " and day = " + day;
	}
}
