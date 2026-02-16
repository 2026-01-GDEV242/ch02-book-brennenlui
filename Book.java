/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Brennen Lui
 * @version 2/16/2026
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    // Add the methods here ...
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    
    public void printAuthor(){
        System.out.println(author);
    }
    public void printTitle(){
        System.out.println(title);
    }
    
    public int getPages(){
        return pages;
    }
    
    public void printDetails(){
        String refPrint;
        if (refNumber.length() > 0){
            refPrint = refNumber;
        }
        else{
            refPrint = "ZZZ";
        }
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages +
        ", Reference Number: " + refPrint + ", This book was borrowed " + borrowed + " times.");
    }
    
    public void setRefNumber(String ref){
        if (ref.length() >= 3){
            refNumber = ref;
        }
        else{
            System.out.println("Error: Reference number must be at least 3 characters.");
        }
        
    }
    public String getRefNumber(){
        return refNumber;
    }
    
    public void borrow(){
        borrowed += 1;
    }
    public int getBorrowed(){
        return borrowed;
    }
    
    
}
