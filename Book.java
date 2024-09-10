public class Book
{



    public String title;
    public double price;
    public Author author;




    public Book(String title, Double price, Author author)
    {
        this.title = title;
        this.price = price;
        this.author = author;

    }






    public String getTitle()
    {
        return(title);

    }


    public double getPrice()
    {

        return(price);

    }


    public Author author()
    {

        return(author);



    }
    


    public String toString()
    {

        return("Book: " + title + "Price :" + price + "\nAuthor: " + author);

    }














}