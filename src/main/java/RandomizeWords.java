import java.util.*;

public class RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] words = input.split(" ");
        Random rnd = new Random();

        for (int i = 0; i <= words.length-1 ; i++) {
            int randomIndex = rnd.nextInt(words.length);

            // Swap the current word with the word at the random index
            String temp = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = temp;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
