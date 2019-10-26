class Solution {
  public int titleToNumber(String s) {
		if (null == s || s.length() < 1) {
			return 0;
		}
		char[] chars = s.toCharArray();
		int length = chars.length;
		int result = 0;
		for (int i = 0; i < length; i++) {
			result += Math.pow(26, length - i - 1) * (chars[i] - 64);
		}
		return result;
	}
}