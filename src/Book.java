import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Paragraph> paragraphList;
    private List<Image> imageList;
    private List<Table> tableList;

    public Book(String title) {
        this.title = title;
        paragraphList = new ArrayList<>();
        imageList = new ArrayList<>();
        tableList = new ArrayList<>();
    }

    public void createNewParagraph(String name) {
        Paragraph paragraph = new Paragraph(name);
        paragraphList.add(paragraph);
    }

    public void createNewImage(String name) {
        Image image = new Image(name);
        imageList.add(image);
    }

    public void createNewTable(String name) {
        Table table = new Table(name);
        tableList.add(table);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraphList=" + paragraphList +
                ", imageList=" + imageList +
                ", tableList=" + tableList +
                '}';
    }
}
