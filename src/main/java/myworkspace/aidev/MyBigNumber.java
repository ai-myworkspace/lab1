package myworkspace.aidev;

public class MyBigNumber {

	public String sum(String s1, String s2) {
		String finalResult = "";

		// Quét các kí tự của chuỗi s1 và s2 từ phải qua trái

		//// Xác định độ dài của s1, s2 và độ dài lớn nhất của
		//// 2 chuỗi
		int len1 = s1.length();
		int len2 = s2.length();
		int maxLen = (len1 > len2) ? len1 : len2;

		int index1; // chỉ số của kí tự đang xét của chuỗi 1
		int index2; // chỉ số của kí tự đang xét của chuỗi 2
		char c1; // kí tự tại vị trí index1 của chuỗi s1
		char c2; // kí tự tại vị trí index2 của chuỗi s2
		int d1; // kí số của c1
		int d2; // kí số của c2

		//// Lặp maxLen lần
		for (int i = 0; i < maxLen; i++) {
			index1 = len1 - i - 1;
			index2 = len2 - i - 1;

			c1 = s1.charAt(index1);
			c2 = s2.charAt(index2);

			d1 = c1 - '0';
			d2 = c2 - '0';
		}

		return finalResult;
	}
}
