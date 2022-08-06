import java.util.Scanner;

public class BookManagement 
{    
	Scanner sc = new Scanner(System.in);
	// 도서목록
	Book[] books = new Book[100];
	// 프로그램 실행 flag
	boolean isRun = true;
	// 메인 메뉴 선택 번호
	int selectNo = 0;
	// 도서관리 번호
	int count=1;    

	public BookManagement()
	{
	    run();
	}

	public void run() 
	{
	    while(isRun) 
	    {
			System.out.println("===============================================================");
			System.out.println(" 1.도서등록 | 2. 도서목록 | 3.도서수정 | 4.도서삭제 | 5. 종료");
			System.out.println("===============================================================");
			selectNo = getSelectNum("번호를 선택하세요>");

			switch(selectNo) 
			{
				case 1 :
				registerBook();
				break;
				case 2 :
				selectBook();
				break;
				case 3 :
				updateBook();
				break;
				case 4 : 
				deleteBook();
				break;
				case 5 : 
				terminate();
				break;    
				default : 
				System.out.println("등록된 메뉴가 아닙니다.");

			}
	    }
	}

	// 프로그램 종료
	public void terminate() 
	{
	    System.out.println("프로그램 종료");
	    isRun = false;
	}

	// 도서 등록
	public void  registerBook() 
	{
	    System.out.println("1. 도서등록");
	    String title = getData("등록할 도서의 제목을 입력해주세요 > ");
	    String author = getData("등록할 도서의 저자를 입력해주세요 > ");

	    for(int i=0; i< books.length; i++) 
	    {
			if(books[i] == null) 
			{
				count = i+1;
				books[i] = new Book(count,title,author);
				System.out.println("등록완료");
				break;
			}
	    }
	}

	// 도서 목록 출력
	public void selectBook() 
	{
	    System.out.println("2. 도서목록");
	    for(Book b : books) 
	    {
			if(b != null) 
			{
				printBookInfo(b);
			}
	    }
	}

	// 도서 정보 수정
	public void updateBook() 
	{
	    System.out.println("3. 도서수정");
	    int bookNum = getSelectNum("수정할 도서의 관리번호를 입력하세요 >");

	    Book b = findBook(bookNum);

	    if(b == null) 
	    {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다");
			return;
	    }

	    boolean isUpdate = true;

	    while(isUpdate)
		{

			System.out.println("==========================================");
			System.out.println(" 1. 제목수정 | 2. 저자수정 | 3. 수정완료");
			System.out.println("==========================================");

			selectNo = getSelectNum("번호 입력 >> ");

			switch (selectNo) 
			{

				case 1:
				String title = getData("제목을 수정해주세요 >> ");
				b.setTitle(title);
				System.out.println("제목 수정완료");    
				break;
				case 2:
				String author = getData("저자 이름을 수정해주세요 >> ");
				b.setAuthor(author);
				System.out.println("저자 이름 수정완료");
				break;
				case 3:
				System.out.println("수정메뉴 종료");
				isUpdate = false;
				break;
			} // switch end

	    } // while end


	} // BookUpdate end

	// 도서 목록에서 책 정보 삭제
	public void deleteBook() 
	{
	    System.out.println("4. 도서삭제");
	    int bookNum = getSelectNum("삭제할 도서의 관리번호를 입력하세요 >");

	    Book b = findBook(bookNum);

	    if(b == null) 
	    {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다");
			return;
	    }

	    for (int i = 0; i < books.length; i++) 
	    {
		if(books[i] != null && books[i].getNum() == bookNum) 
		{
		    books[i] = null;
		    System.out.println("삭제 완료");
		    return;
		}
	    }
	}

	// 책 정보 출력
	public void printBookInfo(Book b) 
	{
	    System.out.println(b.toString());
	}

	// 도서관리번호로 책 정보 찾기
	public Book findBook(int num) 
	{

	    for (int i = 0; i < books.length; i++) 
	    {
		if(books[i] != null && books[i].getNum() == num) 
		{
		    return books[i];
		}
	    }

	    return null;
	}

	// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	String getData(String message) 
	{
	    System.out.println(message);
	    return sc.next();
	}

	// 번호 선택 받기
	int getSelectNum(String message) 
	{
	    System.out.println(message);
	    return sc.nextInt();
	}

	public static void main(String[] args) 
	{
	    new BookManagement();
	}
}
