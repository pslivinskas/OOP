public class Book {
    public String title;
    public int pages;
    public int releaseYear;

    public Book(){

    }
    public Book(String title, int pages, int releaseYear){

        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

@Override
    public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", pages=" + pages + '\'' +
            ", releaseYear=" + releaseYear +
            '}';
}

}
