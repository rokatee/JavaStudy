import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class MovieData_2
{
    Scanner sc = new Scanner(System.in);

    private String mNo;
    private String title;
    private int grade;
    private int playTime;
    private boolean bAvailable;
    private ArrayList<MovieData_2> movieList = new ArrayList<MovieData_2>();
 
    public MovieData_2() 
	{
    }
 
    public String getmNo() 
	{
        return mNo;
    }
 
    public void setmNo(String mNo) 
	{
        this.mNo = mNo;
    }
 
    public String getTitle() 
	{
        return title;
    }
 
    public void setTitle(String title) 
	{
        this.title = title;
    }

	public int getGrade()
	{
		return grade;
	}

	public void setGrade(int grade)
	{
		this.grade = grade;
	}

	public int getPlayTime()
	{
		return playTime;
	}

	public void setPlayTime(int playTime)
	{
		this.playTime = playTime;
	}
 
    public boolean isbAvailable() 
	{
        return bAvailable;
    }
 
    public void setbAvailable(boolean bAvailable) 
	{
        this.bAvailable = bAvailable;
    }


	//메인화면
    public void showMain() throws InterruptedException 
	{
		while (true) 
		{
			System.out.println("Welcome to the Theater");
			System.out.println("[1] 영화 등록\t [2] 전체 조회\t [3] 책 삭제\t [0] 종료");
			String userInput = sc.nextLine();
	 
			switch (userInput) 
			{
			case ("1"):
				insertMovie(); 
				break;
			case ("2"):
				selectAll(); 
				break;
			case ("3"):
				deleteMovie();
				break;
			case ("0"):
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
	 
		} // end while
	}

	public void insertMovie() throws InterruptedException, IOException
	{
        while (true) 
		{
            MovieData_2 m = new MovieData_2();
            // 영화 번호는 중복되면 안 됨
            while (true) 
			{
                int cnt=0;
                System.out.println("영화 번호 입력");
                String temp = sc.nextLine();
                
				for (int i = 0; i < movieList.size(); i++) 
				{
                    if (temp.equals(movieList.get(i).getmNo())) 
					{
                        cnt++;
                        System.out.println("영화 번호 중복입니다. 다시 입력하세요.");
                        break;
                    } // end if
                } // end for
                
				if(cnt==0) 
				{
                    m.setmNo(temp);
                    break;
                }
            } // end while

            System.out.println("영화 제목 입력");
            m.setTitle(sc.nextLine());
            System.out.println("관람등급 입력");
            m.setGrade(sc.nextInt());
            System.out.println("러닝타임 입력");
            m.setPlayTime(sc.nextInt());
			// 여기서 숫자를 입력해 아래 y/n 부분에서 스킵이 됨
			//System.in.read();
			//System.in.read();


            m.setbAvailable(true);
            //Thread.sleep(1000);
 
            // 컨펌 후에 리스트에 객체 저장
            System.out.println("영화번호 : " + m.getmNo());
            System.out.println("영화제목 : " + m.getTitle());
            System.out.println("관람 등급  : " + m.getGrade());
            System.out.println("러닝타임  : " + m.getPlayTime());
            System.out.println("예매가능 : " + m.isbAvailable());
 
            System.out.println("입력하신 사항이 모두 맞습니까? 예(Y) 아니오(N)");
            String confirm = sc.nextLine();
			System.in.skip(2);
            
			if (confirm.equalsIgnoreCase("y")) 
			{
                movieList.add(m);
                System.out.println("======입력 완료=====");
                break;
            } 
			else if (confirm.equalsIgnoreCase("n")) 
			{
                System.out.println("영화 정보를 새로 입력하세요.");
            } 
			else 
			{
                System.out.println("잘못 누르셨습니다. 초기 메뉴로 이동합니다");
                break; // 초기메뉴로 이동
            } // if-else end
        } // end while
 
        //Thread.sleep(1000);
    } // end main


	// 전체 조회
    public void selectAll() throws InterruptedException 
	{
        while (true) 
		{
            System.out.println("보유 영화 수:  " + movieList.size());
            for (int i = 0; i < movieList.size(); i++) 
			{
                System.out.println("===============================");
                System.out.println("영화 번호 : " + movieList.get(i).getmNo());
                System.out.println("영화 제목 : " + movieList.get(i).getTitle());
                System.out.println("관람 등급  : " + movieList.get(i).getGrade());
                System.out.println("러닝 타임  : " + movieList.get(i).getPlayTime());
                System.out.println("대여가능 : " + movieList.get(i).isbAvailable());
                System.out.println("===============================\n");
 
            } // end for
            
			System.out.println("초기 메뉴 이동 : [b] \t 프로그램 종료 : [0]");
            String temp = sc.nextLine();
            
			if (temp.equalsIgnoreCase("b")) 
			{
                break;
            } 
			else if (temp.equals("0")) 
			{
                System.out.println("프로그램을 종료합니다.");
                //Thread.sleep(1000);
                System.exit(0);
            } 
			else 
			{
                System.out.println("잘못 누르셨습니다. 초기화면으로 이동합니다.");
                //Thread.sleep(1000);
                break; // 메인으로 돌아감
            } // if-else end
        } // while end
    }// end selectAll


	// 책 삭제
    public void deleteMovie() 
	{
        while (true) 
		{
            System.out.println("삭제 할 영화의 번호를 입력해주세요");
            String temp = sc.nextLine();
            int cnt = 0;
           
			for (int i = 0; i < movieList.size(); i++) 
			{
                if (temp.equals(movieList.get(i).getmNo())) 
				{
                    movieList.remove(i);
                    cnt++;
                    System.out.println("영화 삭제 완료");
                    break;
                }
            } // end for
            
			if (cnt == 0) 
			{
                System.out.println("해당 영화가 존재하지 않습니다. 영화 번호를 다시 입력하세요.");
            } 
			else 
			{
                break;// 메인으로
            }
        } // end while
 
    } // end delete m
}
