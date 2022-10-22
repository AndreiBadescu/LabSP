import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private TableOfContents tableOfContents;
    private Author author;
    private List<Chapter> chapterList = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String name) {
        Chapter chapter = new Chapter(name);
        chapterList.add(chapter);
        return chapterList.size() - 1;
    }

    public Chapter getChapter(int index) {
        return chapterList.get(index);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", tableOfContents=" + tableOfContents +
                ", author=" + author +
                ", chapterList=" + chapterList +
                '}';
    }
}
