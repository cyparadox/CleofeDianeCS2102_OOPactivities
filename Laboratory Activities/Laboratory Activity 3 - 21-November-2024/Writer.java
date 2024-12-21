class Writer extends Artist {
    private String writingStyle;

    public Writer(String name, int age, String writingStyle) {
        super(name, age, "Literature");
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}
