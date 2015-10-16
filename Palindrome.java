import java.util.*;


public class Palindrome {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()){
			String phrase = in.nextLine();
			phrase = phrase.toUpperCase();
			
			int sizeOfPhrase = phrase.length();
			
			myQueue queue = new myQueue(sizeOfPhrase);
			Stack<Character> stack = new Stack<Character>();
			
			phrase = removeSymbols(phrase);
			
			for(int i=0;i<sizeOfPhrase;i++){
				char charToPush = phrase.charAt(i);
				if(charToPush != ' '){
					stack.push(charToPush);
					queue.enqueue(charToPush);
				}
			}
			
			boolean isPalindrome = false;
			
			for(int i=0;!stack.isEmpty() && !queue.isEmpty();i++){
				if(stack.pop() != queue.dequeue()){
					isPalindrome = false;
					break;
				}else{
					isPalindrome = true;
				}
			}
			
			if(isPalindrome){
				System.out.println("Word is a PALINDROME.");
			} else {
				System.out.println("Word is NOT a PALINDROME.");
			}
		}
	}
	
	public static String removeSymbols(String line){
		char[] array = line.toCharArray();
		for(int i=0;i<array.length;i++){
			if(Character.isAlphabetic(array[i]) == false){
				array[i] = ' ';
			}
		}
		return new String(array);
	}
}
