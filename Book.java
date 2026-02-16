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
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
    
    public void setRefNumber(String ref){
        refNumber = ref;
    }
    public String getRefNumber(){
        return refNumber;
    }
}
