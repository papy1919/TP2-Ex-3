class Novel extends Book
{ int nbpage;
    String story;
    public Novel(String title,String author,int YearOfPublication,int nbpage,String story)
    {super(title,author,YearOfPublication);
        this.nbpage=nbpage;
        this.story=story;
    }

    public int getNbPages()
    {return nbpage;
    }

    public String getStory()
    { return story;
    }

    public void displayInformation()
    {System.out.println("this is a Novel");
        System.out.println("the title is "+getTitle()+"the author is"+getAuthor()+"the year of publication is"+getYearOfPublication()+"the number of pages is"+getNbPages()+"the story is"+getStory())
        ;}
}
