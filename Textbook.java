class Textbook extends Book
{int nbpage;
    int nbchapitre;
    String subject;
    public Textbook(String title,String author,int YearOfPublication,int nbpage,int nbchapitre, String subject)
    {super(title,author,YearOfPublication);
        this.nbpage=nbpage;
        this.nbchapitre=nbchapitre;
        this.subject=subject;
    }

    public int getNbPages()
    {return nbpage;
    }

    public int getNbChapitre()
    {return nbchapitre;
    }

    public String getSubject()
    { return subject;
    }

    public void displayInformation()
    {System.out.println("this is a Textbook");
        System.out.println("the title is "+getTitle()+" the author is"+getAuthor()+" the year of publication is"+getYearOfPublication()+" the number of pages is"+getNbPages()+" the number of chapters is"+getNbChapitre()+" the subject is"+getSubject())
        ;}
}
