class Singer extends Artist {
    private String genre;

    public Singer(String name, int age, String genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
