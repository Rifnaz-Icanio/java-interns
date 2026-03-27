import java.util.*;
import java.io.*;
public class TextAnalyzer{
	public static void main(String[] args){
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the text:");
		String text=myObj.nextLine();
		String[] words=text.split("\\W+");
		int wordCount=words.length;
		int CharCountWithSpace=text.length();
		int CharCountWithoutSpace=text.replace(" ","").length();
		int SentenceCount=text.split("[.!?]+").length;
		List<String> palindromes=new ArrayList<>();
		for(String word:words){
			if(word.length()>1 && isPalindrome(word)){
				palindromes.add(word);
			}
		}
		System.out.println("\n----TEXT ANALYZER---");
		System.out.println("Word Count:"+wordCount);
		System.out.println("Character Count(with spaces):"+CharCountWithSpace); 
		System.out.println("Character Count(without spaces):"+CharCountWithoutSpace);
		System.out.println("Sentence Count:"+SentenceCount);
		System.out.println("Palindrome Words:"+palindromes);
		myObj.close();
	}
	private static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}