package cw;

public class Book {
    private int id;
    private String name;
    private  int number;
    private String author;
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void add() {

    }

    @Override
    public void getInformation() {

    }

    @Override
    public void deleteByNumber() {

    }

    @Override
    public void getCountByNumber() {

    }

    @Override
    public void getByAuthor() {

    }

    @Override
    public void getCountAllBooks() {

    }
}
