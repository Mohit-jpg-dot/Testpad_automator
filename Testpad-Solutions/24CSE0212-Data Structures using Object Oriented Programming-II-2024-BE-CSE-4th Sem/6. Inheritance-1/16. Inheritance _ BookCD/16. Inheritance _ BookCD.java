class Book extends Publication
{
    int pages;
    String author;
    Book(String title, int price, int pages, String author)
    {
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.author = author;
    }
    void putdata()
    {
        System.out.println("Book Title \"" + title + "\", written by \"" + author + "\" has " + pages + " pages and of " + price + " rupees.");
    }
}
class CD extends Publication
{
    int length;
    CD(String title, int price, int length)
    {
        this.title = title;
        this.price = price;
        this.length = length;
    }
    void putdata()
    {
        System.out.println("CD Title \"" + title + "\", is of " + length + " minutes length and of " + price + " rupees.");
    }
}