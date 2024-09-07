import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Consume the newline left-over
        scanner.nextLine();

        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the album: ");
        String album = scanner.nextLine();

        System.out.print("Enter the song title: ");
        String songTitle = scanner.nextLine();

        System.out.print("Enter the artist: ");
        String artist = scanner.nextLine();

        System.out.println("\n----------------\n");
        System.out.println("SONG DETAILS");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Song Title: " + songTitle);
        System.out.println("Artist: " + artist);
        System.out.println("\n----------------\n");
    }
}