class Untitled {
	public static boolean isOneAway(String str1, String str2){
		int diffLen =  Math.abs(str1.length()-str2.length());
		
		// if the length difference is 2 or more, it's false
		if (diffLen >1){
			return false;
		}
		
		char[] str1_arr = str1.toCharArray();
		char[] str2_arr = str2.toCharArray();
		
		
		int diffCount=0 ;

			// if same length
		if (diffLen ==0){
			
			for (int i=0; i < str1.length() ; i++){
				if (str1_arr[i] != str2_arr[i]){
					diffCount++;
					
				}
				
			}
			if (diffCount <= 1){
				return true;
			}
			else{
				return false;
			}

		}
		String longer = longer(str1, str2);
		String shorter = shorter(str1, str2);
		
		char[] longer_arr = longer.toCharArray();
		char[] shorter_arr = shorter.toCharArray();
		
		// if only one unit length difference

		if (diffLen ==1){
			
			return canInsert(longer, shorter);
			
		}
		return true;
		
	}

	
	public static boolean canInsert(String longer, String shorter){
		int i=0, j=0;
		int charDiff = 0;
		while(i<longer.length() && j<shorter.length()){
			if(longer.charAt(i) != shorter.charAt(j)){
				charDiff ++;
				i++;
			}
			else{
				i++;
				j++;
			}
		}
		if(charDiff>1){
			return false;
		}
		return true;
		
	}
	
	public static String longer(String str1, String str2){
		String longer;
		if(str1.length()>str2.length()){
			longer = str1;
		}
		else longer = str2;
		
		return longer;
	}
	public static String shorter(String str1, String str2){
		String shorter;
		if(str1.length()<str2.length()){
			shorter = str1;
		}
		else shorter = str2;
		
		return shorter;
	}
	
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "cple";
		
		String str3 = "cake";
		String str4 = "pake";
		
		System.out.println(isOneAway(str1, str2));
		System.out.println(isOneAway(str3, str4));
				
		
		
	}
}