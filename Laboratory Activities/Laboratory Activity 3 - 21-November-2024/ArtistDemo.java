public class ArtistDemo {
    public static void main(String[] args) {
    
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        System.out.println();


        Singer singer = new Singer("Nayeon Im", 29, "Pop");
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Vincent Van Gogh", 37, "Oil");
        painter.displayInfo();

        System.out.println();


        Writer writer = new Writer("J.K. Rowling", 58, "Fiction");
        writer.displayInfo();

        System.out.println();


        Dancer dancer = new Dancer("Misty Copeland", 41, "Ballet");
        dancer.displayInfo();
    }
}
