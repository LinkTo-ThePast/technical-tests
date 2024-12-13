package countWords;
import java.util.*;

public class countWords {

	public static void main(String[] args) {
		
		// input parameters
		String words = "Hola mundo feliz, hola mundo cruelmente feliz.";
		
		// step 1. remover caracteres no alfabéticos
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length(); i++) {
			char c = words.charAt(i);
			if(Character.isAlphabetic(c)) {
				sb.append(c);
			} else if(c == ' ') {
				sb.append(c);
			}
			}
		
		String[] tokens = sb.toString().toLowerCase().split(" ");
		//System.out.print(Arrays.toString(tokens));
	
		HashMap<String, Integer> counterWords = new HashMap<String, Integer>();
		for(int i = 0; i < tokens.length; i++) {
			String currentToken = tokens[i];
			
			if(!counterWords.containsKey(currentToken)) {
				counterWords.put(currentToken,  1);
			} else {
				counterWords.put(currentToken, counterWords.get(currentToken) + 1);
			}
		}
		System.out.println(counterWords);
		//HashMap<String, Integer> counterWords = new HashMap<String, Integer>();
		
		//StringTokenizer()
		//if(counterWords.containsKey(counterWords))
		//}
		
	}
	}
	

