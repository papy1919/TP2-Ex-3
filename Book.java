import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
abstract class Book{
    protected String title;
    protected String author;
    protected int YearOfPublication;
    public Book(String title,String author,int YearOfPublication)
    {this.title=title;
        this.author=author;
        this.YearOfPublication=YearOfPublication;
    }

    String getAuthor()
    {return this.author;
    }

    String getTitle()
    {return this.title;
    }

    int getYearOfPublication()
    {return this.YearOfPublication;
    }
    public abstract void displayInformation()
            ;
}
