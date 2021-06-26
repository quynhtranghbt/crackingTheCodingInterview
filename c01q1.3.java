
class Urlify {
	public static void replaceSpaces(char[] chars, int len) {
		
		int spaceCount = 0, newLength, i;
		
		// count how many space character
		for (i=0; i<len; i++){
			if(chars[i]==' '){
				spaceCount++;
			}
		}
		// new length, spaceCount*2 because space is replaced by 3 characters
		newLength = len + spaceCount*2;
		if (newLength < chars.length){
			chars[newLength] = '\0'; 
		}
		//go through the char array from the end, if it sees a space, make it
		for (i=len-1;i>=0;i--){
			if(chars[i]== ' '){
				chars[newLength-1] = '0';
				chars[newLength-2] = '2';
				chars[newLength-3] = '%';
				newLength= newLength -3;
			}
			
			else{
				chars[newLength-1] = chars[i];
				newLength = newLength -1;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		char[] chars = "Mr John Smith       ".toCharArray();
		replaceSpaces(chars,13);
		System.out.println(chars);
		
		
		char[] chars1 = "Love you too      ".toCharArray();
		replaceSpaces(chars1,12);
		System.out.println(chars1);
	}
}
