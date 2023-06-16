package interfaces;

public class Book implements Product, DigitalAsset{
  private String name;
  private String author;
  private int pages;
  private String isbn;

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  public String getIsbn() {
    return isbn;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
