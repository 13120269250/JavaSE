package JavaSE1;

public class abcString{
	/*
	 * 判断字符串的地址
	 */
	public static void main(String args[]){
		String s1 = "ab" + "c";
		String s2 = "abc";
		                
		System.out.println((s1 == s2) + " : " + s1.equals(s2));
	}
}
