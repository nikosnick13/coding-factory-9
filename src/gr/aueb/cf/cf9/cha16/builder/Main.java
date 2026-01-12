package gr.aueb.cf.cf9.cha16.builder;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.Builder(12l,"123123").build();
        Book book2 = new Book.Builder(13L, "123432")
                .author("Nikos")
                .build();
        Book book3 = new Book.Builder(14L, "57898")
                .title("Lord of the rings")
                .author("Tolkin")
                .build();

    }
}
