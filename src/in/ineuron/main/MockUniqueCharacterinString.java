package in.ineuron.main;

public class MockUniqueCharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		int index = firstUniqChar(s);
		System.out.println(index);
		
	}
	public static int firstUniqChar(String s) {
	    int[] count = new int[26]; 

	  
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        count[c - 'a']++;
	    }

	  
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (count[c - 'a'] == 1) {
	            return i;
	        }
	    }

	    return -1; 
	}

}
