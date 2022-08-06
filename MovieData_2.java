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


	//����ȭ��
    public void showMain() throws InterruptedException 
	{
		while (true) 
		{
			System.out.println("Welcome to the Theater");
			System.out.println("[1] ��ȭ ���\t [2] ��ü ��ȸ\t [3] å ����\t [0] ����");
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
				System.out.println("���α׷� ����");
				sc.close();
				System.exit(0);
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
	 
		} // end while
	}

	public void insertMovie() throws InterruptedException, IOException
	{
        while (true) 
		{
            MovieData_2 m = new MovieData_2();
            // ��ȭ ��ȣ�� �ߺ��Ǹ� �� ��
            while (true) 
			{
                int cnt=0;
                System.out.println("��ȭ ��ȣ �Է�");
                String temp = sc.nextLine();
                
				for (int i = 0; i < movieList.size(); i++) 
				{
                    if (temp.equals(movieList.get(i).getmNo())) 
					{
                        cnt++;
                        System.out.println("��ȭ ��ȣ �ߺ��Դϴ�. �ٽ� �Է��ϼ���.");
                        break;
                    } // end if
                } // end for
                
				if(cnt==0) 
				{
                    m.setmNo(temp);
                    break;
                }
            } // end while

            System.out.println("��ȭ ���� �Է�");
            m.setTitle(sc.nextLine());
            System.out.println("������� �Է�");
            m.setGrade(sc.nextInt());
            System.out.println("����Ÿ�� �Է�");
            m.setPlayTime(sc.nextInt());
			// ���⼭ ���ڸ� �Է��� �Ʒ� y/n �κп��� ��ŵ�� ��
			//System.in.read();
			//System.in.read();


            m.setbAvailable(true);
            //Thread.sleep(1000);
 
            // ���� �Ŀ� ����Ʈ�� ��ü ����
            System.out.println("��ȭ��ȣ : " + m.getmNo());
            System.out.println("��ȭ���� : " + m.getTitle());
            System.out.println("���� ���  : " + m.getGrade());
            System.out.println("����Ÿ��  : " + m.getPlayTime());
            System.out.println("���Ű��� : " + m.isbAvailable());
 
            System.out.println("�Է��Ͻ� ������ ��� �½��ϱ�? ��(Y) �ƴϿ�(N)");
            String confirm = sc.nextLine();
			System.in.skip(2);
            
			if (confirm.equalsIgnoreCase("y")) 
			{
                movieList.add(m);
                System.out.println("======�Է� �Ϸ�=====");
                break;
            } 
			else if (confirm.equalsIgnoreCase("n")) 
			{
                System.out.println("��ȭ ������ ���� �Է��ϼ���.");
            } 
			else 
			{
                System.out.println("�߸� �����̽��ϴ�. �ʱ� �޴��� �̵��մϴ�");
                break; // �ʱ�޴��� �̵�
            } // if-else end
        } // end while
 
        //Thread.sleep(1000);
    } // end main


	// ��ü ��ȸ
    public void selectAll() throws InterruptedException 
	{
        while (true) 
		{
            System.out.println("���� ��ȭ ��:  " + movieList.size());
            for (int i = 0; i < movieList.size(); i++) 
			{
                System.out.println("===============================");
                System.out.println("��ȭ ��ȣ : " + movieList.get(i).getmNo());
                System.out.println("��ȭ ���� : " + movieList.get(i).getTitle());
                System.out.println("���� ���  : " + movieList.get(i).getGrade());
                System.out.println("���� Ÿ��  : " + movieList.get(i).getPlayTime());
                System.out.println("�뿩���� : " + movieList.get(i).isbAvailable());
                System.out.println("===============================\n");
 
            } // end for
            
			System.out.println("�ʱ� �޴� �̵� : [b] \t ���α׷� ���� : [0]");
            String temp = sc.nextLine();
            
			if (temp.equalsIgnoreCase("b")) 
			{
                break;
            } 
			else if (temp.equals("0")) 
			{
                System.out.println("���α׷��� �����մϴ�.");
                //Thread.sleep(1000);
                System.exit(0);
            } 
			else 
			{
                System.out.println("�߸� �����̽��ϴ�. �ʱ�ȭ������ �̵��մϴ�.");
                //Thread.sleep(1000);
                break; // �������� ���ư�
            } // if-else end
        } // while end
    }// end selectAll


	// å ����
    public void deleteMovie() 
	{
        while (true) 
		{
            System.out.println("���� �� ��ȭ�� ��ȣ�� �Է����ּ���");
            String temp = sc.nextLine();
            int cnt = 0;
           
			for (int i = 0; i < movieList.size(); i++) 
			{
                if (temp.equals(movieList.get(i).getmNo())) 
				{
                    movieList.remove(i);
                    cnt++;
                    System.out.println("��ȭ ���� �Ϸ�");
                    break;
                }
            } // end for
            
			if (cnt == 0) 
			{
                System.out.println("�ش� ��ȭ�� �������� �ʽ��ϴ�. ��ȭ ��ȣ�� �ٽ� �Է��ϼ���.");
            } 
			else 
			{
                break;// ��������
            }
        } // end while
 
    } // end delete m
}
