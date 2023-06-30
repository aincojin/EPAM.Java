package Classes.ClassesAndObjects.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthors;
    private String bookPublisher;
    private int bookPublishYear;
    private int bookPages;
    private int bookPrice;
    private String bookCoverType;

    Book(int bookId, String bookName, String bookAuthors, String bookPublisher,
         int bookPublishYear, int bookPages,int bookPrice, String bookCoverType){
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthors = bookAuthors;
        this.bookPublisher = bookPublisher;
        this.bookPublishYear = bookPublishYear;
        this.bookPages = bookPages;
        this.bookPrice =bookPrice;
        this.bookCoverType = bookCoverType;
    }
    @Override
        public String toString(){
        return bookId + "\n" + bookName + "\n" + bookAuthors+ "\n" + bookPublisher+ "\n" +bookPublishYear + "\n" +
                bookPages+ "\n" + bookPrice+ "\n" + bookCoverType + "\n";
    }

    public static void main(String[] args) {
        BookArray book = new BookArray(new ArrayList<>());

        book.addBook(1, "Война и мир", "Лев Толстой",
                "Азбука", 2020, 1300, 50, "твердая");
        book.addBook(2, "Тэсс из рода д`Эбервиллей", "Томас Харди",
                "Collins Classics", 2010, 592, 35, "мягкая");
        book.addBook(3, "Анна Каренина", "Лев Толстой",
                "Азбука", 2023, 864, 40, "твердая");

      /*  Scanner in = new Scanner(System.in);
        System.out.println("Введите автора: ");
        String author = in.next();
        System.out.println("Книги автора " + author + ": ");*/

        System.out.println("Книги авторства Льва Толстого: ");
        ArrayList<Book> list1 = book.getBookByAuthor("Лев Толстой");
        if(list1.size() == 0){
            System.out.println("Книги этого автора не найдены.");
        }else{
            for(Book book1 : list1){
                System.out.println(book1);
            }
        }

        System.out.println("Книги изданные издательством Collins Classics: ");
        ArrayList<Book> list2 = book.getBookByPublisher("Collins Classics");
        if(list2.size() == 0){
            System.out.println("Книги этого издательства не найдены.");
        }else{
            for(Book book1 : list2){
                System.out.println(book1);
            }
        }
        System.out.println("Книги, изданные более года назад: ");
        ArrayList<Book> list3 = book.getBookPublishedMoreThanAYearAgo(2023);
        if(list3.size() == 0){
            System.out.println("Не найдены книги, изданные более года назад.");
        }else{
            for(Book book1 : list3){
                System.out.println(book1);
            }
        }
    }

    public int getBookId(){
        return bookId;
    }
    public void setBookId(int bookId){
        this.bookId = bookId;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getBookAuthors(){
        return bookAuthors;
    }
    public void setBookAuthors(String bookAuthors){
        this.bookAuthors = bookAuthors;
    }
    public String getBookPublisher(){
        return bookPublisher;
    }
    public void setBookPublisher(String bookPublisher){
        this.bookPublisher = bookPublisher;
    }
    public int getBookPublishYear(){
        return bookPublishYear;
    }
    public void setBookPublishYear(int bookPublishYear){
        this.bookPublishYear = bookPublishYear;
    }
    public int getBookPages(){
        return bookPages;
    }
    public void setBookPages(int bookPages){
        this.bookPages = bookPages;
    }
    public int getBookPrice(){
        return bookPrice;
    }
    public void setBookPrice(int bookPrice){
        this.bookPrice = bookPrice;
    }

    public String getBookCoverType(){
        return bookCoverType;
    }
    public void setBookCoverType(String bookCoverType){
        this.bookCoverType = bookCoverType;
    }
}
