class Untitled {
	public static boolean isPalindromePermuation(String phrase){
		
		// first, make all the uppercase to lowercase, replace spaces
		char c =0;
		// before this, I use replace(' ', c) but it doesn't work because
		// it shows the string as hello\u0000one. 
		// replace the string of space " " by "" works this time.
		String phrase1= phrase.toLowerCase().replace(" ", "");				
		
		System.out.println(phrase1);
		int[] table = characterCountTable(phrase1);
		System.out.println(phrase1);
		for (int count : table){
			int oddCount =0;
			if (table[count]%2 == 1){
				oddCount++;
			}
			
			if (oddCount>1){
				return false;
			}
			return true;
		}

		return true;
		
	}
	// count how many times each character appears in the string 
	public static int[] characterCountTable(String str){
		System.out.println("inside table " + str);
		int[] characterCount = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1 ];
		
		for (char c : str.toCharArray()){
			int x =  Character.getNumericValue(c);
			characterCount[x]++;
			
		}
		
		return characterCount;
	}
	
	public static void main(String[] args) {
		String str = "Hello one";
		System.out.println(isPalindromePermuation(str));		
		
	}
}