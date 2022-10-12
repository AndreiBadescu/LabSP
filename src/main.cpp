#include <iostream>
#include <cstring>

class Book {
    std::string name;
    std::string paragraph_name;
    std::string image_name;
    std::string table_name;
public:
    Book(std::string name): name(name) {
    }
    void createNewParagraph(std::string paragraph_name) {
        this->paragraph_name = paragraph_name;
    }
    void createNewImage(std::string image_name) {
        this->image_name = image_name;
    }
    void createNewTable(std::string table_name) {
        this->table_name = table_name;
    }
    void print() {
        std::cout << name << '\n';
        std::cout << paragraph_name << '\n';
        std::cout << image_name << '\n';
        std::cout << table_name << '\n';
    }
};

int main() {
    Book discoTitanic("Discto Titanic");
    discoTitanic.createNewParagraph("Paragraph 1");
    discoTitanic.createNewParagraph("Paragraph 2");
    discoTitanic.createNewParagraph("Paragraph 3");
    discoTitanic.createNewImage("Image 1");
    discoTitanic.createNewParagraph("Paragraph 4");
    discoTitanic.createNewTable("Table 1");
    discoTitanic.createNewParagraph("Paragraph 5");

    discoTitanic.print();
}