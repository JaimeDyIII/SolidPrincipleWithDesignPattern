public class Journal implements Resource {
    private String title;
    private String author;
    private final String type = "Journal";

    public Journal(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}
