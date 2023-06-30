package Classes.ClassesAndObjects.Book;

import java.util.ArrayList;

public class BookArray {
    private ArrayList<Book> books;

    BookArray(ArrayList<Book> books){
        this.books = books;
    }
    void addBook (int bookId, String bookName, String bookAuthors, String bookPublisher,
                  int bookPublishYear, int bookPages,int bookPrice, String bookCoverType){
        this.books.add(new Book(bookId,bookName, bookAuthors,  bookPublisher,
                  bookPublishYear,  bookPages, bookPrice,  bookCoverType));
    }
    ArrayList<Book> getBookByAuthor(String author){
        ArrayList<Book> list1 = new ArrayList<>();
        for(Book book : this.books){
            if(book.getBookAuthors().compareToIgnoreCase(author) == 0){
                list1.add(book);
            }
        }
        return list1;
    }
    ArrayList<Book> getBookByPublisher(String publisher){
        ArrayList<Book> list2 = new ArrayList<>();
        for(Book book : this.books){
            if(book.getBookPublisher().compareToIgnoreCase(publisher) == 0){
                list2.add(book);
            }
        }
        return list2;
    }
    ArrayList<Book> getBookPublishedMoreThanAYearAgo(int year){
        ArrayList<Book> list3 = new ArrayList<>();
        for(Book book : this.books){
            if(book.getBookPublishYear() < year - 1){
                list3.add(book);
            }
        }
        return list3;
    }

    public ArrayList<Book> getBooks(){
        return books;
    }
    public void setBooks(ArrayList<Book> books){
        this.books = books;
    }
}
