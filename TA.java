import java.util.Scanner;
public class TA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the characterCount");
        String text = sc.nextLine();
        int characterCount = text.replaceAll("\\s+"," ").length();
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        String[] sentences = text.split("[.!?]+");
        int sentenceCount = 0;
        for(String sentence : sentences) {
            if (!sentence.trim() .isEmpty()) {
                sentenceCount++;
            }
                System.out.println("----TEXT ANALYSIS----");
                System.out.println("Character (no spaces): "+ characterCount);
                System.out.println("word: "+ words);
                System.out.println("sentences: "+ sentenceCount);            
            }
        }
    }
