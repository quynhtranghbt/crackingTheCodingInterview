import java.util.Arrays;
class QuestionB {	
	
	//sort the two string first
	public static String sort(String str){
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		
		return new String(content);
	}
	
	// then check 
	public static boolean permutation(String s1, String s2) {
		// check if size of the two string is the same
		if (s1.length() != s2.length()){
			return false;
		}
		
		return sort(s1).equals(sort(s2));
		
		
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"} , {"hi", "id"} };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}