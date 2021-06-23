
class QuestionA {
	public static boolean isUniqueChars(String str) {
		// first you should ask if it's ASCII or unicode
		// if ASCII, ask if it's normal or extended 
		
		if (str.length() > 128){
			return false;
		}
		
		// make a new array of boolean of size 28 to store all values of the characters
		boolean[] char_set = new boolean[128];
		
		for (int i=0; i< str.length(); i++){
			int val = str.charAt(i); // this return integer value of the character 
			
			if (char_set[val]){
				return false; // if it's already seen
			}
			char_set[val] = true; // never seen before 
		}
		
		
		return true;

	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}