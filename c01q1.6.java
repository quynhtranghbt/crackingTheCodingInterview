class Untitled {
	
	public static String stringCompress(String str){
		int i, count=1;
		String output="";
		
		for ( i=0; i< str.length()-1; i++){
			char cur = str.charAt(i);
			char next = str.charAt(i+1);

			
			if (i==str.length()-2) {
				if(cur==next){
					count++;
					output += String.valueOf(cur) + count;}
				else{
					output += String.valueOf(cur) + count ;
					output +=  String.valueOf(next) + 1;
					count = 1;
				}
			}
			else if (cur == next){
				
				count++;
				
			}
			
			else{
				output += String.valueOf(cur) + count;
				count = 1;
			}
			
		}
		
		
		return output.length() <= str.length() ? output : str ;
		
	}
	
	public static void main(String[] args) {
		
		String a = "aaaeeeeennna";
		String a1 = "ab";
		String a2 = "aa";
		System.out.println(stringCompress(a));
		System.out.println(stringCompress(a1));
		System.out.println(stringCompress(a2));
		
	}
}