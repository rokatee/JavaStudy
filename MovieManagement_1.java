import java.util.Scanner;
import java.io.IOException;

public class MovieManagement_1 extends AdminCall
{    
	// ���� Ŭ������ �̵�
	Scanner sc = new Scanner(System.in);
	// ��ȭ���
	MovieData[] movies = new MovieData[100];
	// ���α׷� ���� flag
	boolean isRun = true;
	// ���� �޴� ���� ��ȣ
	int selectNo = 0;
	// ��ȭ���� ��ȣ
	int count=1;

	public void movieManage() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		while(isRun) 
		{
			System.out.println("===============================================================================");
			System.out.println(" 1. ��ȭ��� | 2. ��ȭ��� | 3. ��ȭ���� | 4. ���� | 99. ������ �޴��� ���ư���");
			System.out.println("===============================================================================");
			selectNo = getSelectNum("��ȣ�� �����ϼ��� : ");

			switch(selectNo) 
			{
				case 1 :
					registerMovie();
					break;
				case 2 :
					selectMovie();
					break;
				case 3 : 
					deleteMovie();
					break;
				case 4 : 
					terminate();
					break;    
				case 99 : 
					//bAM.AmenuDisp();
					AmenuDisp();
					break;
				default : 
					System.out.println("��ϵ� �޴��� �ƴմϴ�.");
			}
		}
	}

	// ���α׷� ����
	public void terminate() 
	{
		System.out.println("���α׷� ����");
		isRun = false;
	}

	// ��ȭ ���
	public void  registerMovie() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println();
		System.out.println("1. ��ȭ���");
		String title = getData("����� ��ȭ�� ���� �Է�	: ");
		int grade =	getNum("����� ��ȭ�� ���� ��� �Է�(0 / 15 / 19) : ");
		int playTime = getNum("����� ��ȭ�� ����Ÿ�� �Է� : ");
		System.out.println();

		for(int i=0; i < movies.length; i++) 
		{
			if(movies[i] == null) 
			{
				count = i+1;
				movies[i] = new MovieData(title,grade,playTime);
				System.out.println();
				System.out.println("��ϿϷ�");
				break;
			}
		}

		System.out.println();

		selectNo = getSelectNum(" 0. ���� �޴��� ���ư��� | 99. ������ �޴��� ���ư���");
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				//bAM.AmenuDisp();
				AmenuDisp();
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	// ��ȭ ��� ���
	public void selectMovie() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println();
		System.out.println("2. ��ȭ���");
		System.out.println();
		for(MovieData m : movies) 
		{
			if(m != null) 
			{
				printMovieInfo(m);
			}
		}

		System.out.println();

		selectNo = getSelectNum(" 0. ���� �޴��� ���ư��� | 99. ������ �޴��� ���ư���");
		
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				//bAM.AmenuDisp();
				AmenuDisp();
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	/*
	// ��ȭ ���� ����
	public void updateMovie() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println();
		System.out.println("5. ��ȭ����");
		System.out.println();
		String movieTitle = getSelectData("������ ��ȭ�� ������ �Է��ϼ��� : ");

		MovieData m = findMovie(movieTitle);

		if(m == null)
		{
			System.out.println("�Է��Ͻ� ������ ��ȭ�� �������� �ʽ��ϴ�");
			return;
		}

		boolean isUpdate = true;

		while(isUpdate) 
		{

			System.out.println("=====================================================================================================================");
			System.out.println(" 1. ������� | 2. ��޼��� | 3. ����Ÿ�Ӽ��� | 4. �����Ϸ� | 0. ���� �޴��� ���ư��� | 99. ������ �޴��� ���ư���");
			System.out.println("=====================================================================================================================");

			selectNo = getSelectNum("��ȣ �Է� >> ");

			switch (selectNo) 
			{

				case 1:
					String title = getData("���� ���� : ");
					m.setTitle(title);
					System.out.println("���� �����Ϸ�");    
					break;
				case 2:
					int grade = getNum("���� ��� ���� : ");
					m.setGrade(grade);
					System.out.println("���� ��� �����Ϸ�");
					break;
				case 3:
					int playTime = getNum("����Ÿ�� ���� : ");
					m.setPlayTime(playTime);
					System.out.println("����Ÿ�� �����Ϸ�");
					break;
				case 4:
					System.out.println("�����޴� ����");
					isUpdate = false;
					break;
				case 0 : 
					movieManage(); 
					break;
				case 99 : 
					//bAM.AmenuDisp();
					AmenuDisp();
					break;
			} // switch end

		} // while end

		System.out.println();

		selectNo = getSelectNum(" 0. ���� �޴��� ���ư��� | 99. ������ �޴��� ���ư���");
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				//bAM.AmenuDisp();
				AmenuDisp();
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}

	} // MovieUpdate end
	*/

	// ��ȭ ��Ͽ��� ��ȭ ���� ����
	public void deleteMovie() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println();
		System.out.println("3. ��ȭ����");
		String movieTitle = getSelectData("������ ��ȭ�� ���� �Է� : ");

		MovieData m = findMovie(movieTitle);

		if (m == null)
		{
			System.out.println("�Է��Ͻ� ������ ��ȭ�� �������� �ʽ��ϴ�");
			//return;
		}
		
		for (int i = 0; i < movies.length; i++) 
		{

			if(movies[i] != null && movies[i].getTitle().equals(movieTitle)) 
			{
				movies[i] = null;
				System.out.println("���� �Ϸ�");
				//return;
			}
			//else
			//{
			//	System.out.println("�Է��Ͻ� ������ ��ȭ�� �������� �ʽ��ϴ�");
			//	return;
			//}

		}

		System.out.println();

		selectNo = getSelectNum(" 0. ���� �޴��� ���ư��� | 99. ������ �޴��� ���ư���");
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				//bAM.AmenuDisp();
				AmenuDisp();
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	// ��ȭ ���� ���
	public void printMovieInfo(MovieData m) 
	{
		System.out.println(m.toString());
	}

	// ��ȭ �������� ��ȭ ���� ã��
	public MovieData findMovie(String title) 
	{
		for (int i = 0; i < movies.length; i++) 
		{
			if(movies[i] != null && movies[i].getTitle().equals(title)) 
			{
				return movies[i];
			}
		}

		return null;
	}

	// ����ڿ��� �޽����� ���� �޾� ����ϰ� ���ڿ� �� �޾� ��ȯ
	String getData(String message) 
	{
		System.out.println(message);
		return sc.next();
	}


	// ����ڿ��� �޽����� ���� �޾� ����ϰ� ���� �� �޾� ��ȯ
	int getNum(String message) 
	{
		System.out.println(message);
		return sc.nextInt();
	}

	// ��ȣ ���� �ޱ�
	int getSelectNum(String message) 
	{
		System.out.println(message);
		return sc.nextInt();
	}

	// ���� ���� �ޱ�
	String getSelectData(String message) 
	{
		System.out.println(message);
		return sc.next();
	}

	public static void main(String[] args) throws IOException
	{
		new MovieManagement();
		AmenuDisp();
	}
}
