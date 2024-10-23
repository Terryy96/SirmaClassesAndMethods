import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Article {

    private String title;
    private String content;
    private String author;

    public  Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public String toString() {
        return String.format("%s - %s: %s", title, content, author);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] articleParts  = scanner.nextLine().split(", ");
        String title = articleParts [0];
        String content = articleParts [1];
        String author = articleParts [2];

        Article article = new Article(articleParts[0], articleParts[1], articleParts[2]);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] commandParts = scanner.nextLine().split(": ");
            String part1 = commandParts[0];
            String argument = commandParts[1];

            switch (part1) {
                case "Edit":
                    article.edit(argument);  // Edit the content
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(argument);  // Change the author
                    break;
                case "Rename":
                    article.rename(argument);  // Change the title
                    break;
            }
        }
        System.out.println(article.toString());

    }
}
