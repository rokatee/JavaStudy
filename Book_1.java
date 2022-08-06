public class Book_1 
{
	// 도서관리 번호
	private int num;
	// 도서 제목
	private String title;
	// 도서 저자
	private String author;


	public Book() 
	{
	}

	public Book(int num, String title, String author) 
	{
	    super();
	    this.num = num;
	    this.title = title;
	    this.author = author;
	}

	public int getNum() 
	{
	    return num;
	}

	public void setNum(int num) 
	{
	    this.num = num;
	}

	public String getTitle() 
	{
	    return title;
	}

	public void setTitle(String title) 
	{
	    this.title = title;
	}

	public String getAuthor() 
	{
	    return author;
	}

	public void setAuthor(String author) 
	{
	    this.author = author;
	}

	public String toString() {
	    return "Book{ [num : "+this.num+"] [title : " +this.title +"] [author : " + this.author + "]}";
	}
}
