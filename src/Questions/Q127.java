package Questions;

import java.util.List;

public class Q127 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if(!wordList.contains(endWord) || !wordList.contains(beginWord)) {
			return 0;
		}
		
        return 0;
    }
	
	public boolean isTransfer(String word, String listWord) {
		int length = word.length();
		int difword = 0;
		if(word.equals(listWord)) {
			return true;
		}
		while(word.charAt(difword) == listWord.charAt(difword) && difword < length) {
			difword++;
		}
		if(difword == length) {
			return true;
		} else {
			for(int i = difword +1; i<length; i++) {
				if(word.charAt(i)!=listWord.charAt(i)) {
					return false;
				}
			}
			return true;
		}

	}
}
