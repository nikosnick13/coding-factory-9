package gr.aueb.cf.cf9.cha16.builder_pattern;

public class Book {

    private final long id;
    private final String title;
    private final String author;
    private final String isbn;

    private Book(Builder builder){

        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static class Builder{

        private final long id;
        private String title = "";
        private String author = "";
        private final String isbn;

        // Fluent Setter - returns the Builder object - chaining
        public Builder(long id, String isbn){
            this.id = id;
            this.isbn = isbn;
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder author(String author){
            this.author = author;
            return  this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
