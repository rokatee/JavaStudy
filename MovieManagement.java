import java.util.Scanner;
import java.io.IOException;

public class MovieManagement extends AdminCall
{    
	// ���� Ŭ������ �̵�
	//Scanner sc = new Scanner(System.in);
	//// ��ȭ���
	//MovieData[] movies = new MovieData[100];
	//// ���α׷� ���� flag
	//boolean isRun = true;
	//// ���� �޴� ���� ��ȣ
	//int selectNo = 0;
	//// ��ȭ���� ��ȣ
	//int count=1;

	public void movieManage() throws IOException
	{
		System.out.println("\n[�󿵰� ����]==================\n");
		System.out.println("1. ��ȭ ���� ���");
		System.out.println("2. ��ϵ� ��ȭ ����");
		System.out.println("3. ��ȭ ��� Ȯ��");
		System.out.println();
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("=================================");

		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 3 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 1 :
				registerMovie();
				break;
			case 2 :
				deleteMovie();
				break;
			case 3 : 
				selectMovie();
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	// ��ȭ ���
	public void  registerMovie() throws IOException
	{
		System.out.println();
		System.out.println("[��ȭ ���� ���]=======================\n");
		System.out.println("����� ���ϴ� ��ȭ ������ �Է����ּ���.\n");
		System.out.println("=======================================\n");

		System.out.print("����			: ");
		String title = sc.next();
		System.out.print("���� ���(0 / 15 / 19)  : ");
		int grade = sc.nextInt();
		System.out.print("����Ÿ�� �Է�(��)	: ");
		int playTime = sc.nextInt();
		System.out.println();
		
		
		for (int i = 0; i < movies.length; i++)
		{
			if(movies[i] == null) 
			{
				movies[i] = new MovieData(title, grade, playTime);
				vt.add(movies[i]);

				System.out.println("[��ȭ ���� ���]=======================\n");
				System.out.println(movies[i].toString()+"\n\n��ϿϷ�");
				break;
			}
		}

//======================================================================��
		//String title = getData("����� ��ȭ�� ���� �Է�	: ");
		//int grade =	getNum("����� ��ȭ�� ���� ��� �Է�(0 / 15 / 19) : ");
		//int playTime = getNum("����� ��ȭ�� ����Ÿ�� �Է� : ");
		//System.out.println();
		
		//for(int i=0; i < movies.length; i++) 
		//{
		//	if(movies[i] == null) 
		//	{
		//		count = i+1;
		//		movies[i] = new MovieData(title,grade,playTime);
		//		System.out.println();
		//		System.out.println("��ϿϷ�");
		//		break;
		//	}
		//}

		//for(MovieData m : movies) 
		//{
		//	if(m != null) 
		//	{
		//		printMovieInfo(m);
		//	}
		//}
//======================================================================��

		System.out.println();
		System.out.println(" 0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("=======================================");

		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	// ��ȭ ��� ���
	public void selectMovie() throws IOException
	{
		System.out.println("[��ȭ ��� Ȯ��] ======================\n");
//======================================================================��
		//for (int i = 0; i < movies.length; i++)
		//{
		//	try
		//	{
		//		System.out.println(movies[i].title);
		//		System.out.println(movies[i].grade);
		//		System.out.println(movies[i].playTime);
		//		
		//	}
		//	catch (NullPointerException e)
		//	{
		//		System.out.println("��ϵ� ��ȭ�� �����ϴ�");
		//		System.out.println();
		//	}
		//}
//======================================================================��

		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);
			}
		}

		System.out.println();
		System.out.println(" 0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("=======================================\n");
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
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
		System.out.println("\n[��ϵ� ��ȭ ����] ======================\n");
		System.out.println("������ ��ȭ ������ �Է����ּ���.\n");
		System.out.println("========================================\n");

//======================================================================��
		System.out.print("���� �Է� : ");
		tempTitle = sc.next();
		//MovieData m = findMovie(movieTitle);

		
		//for (int i = 0; i < movies.length; i++) 
		//{
		//	if(movies[i] != null && movies[i].getTitle().equals(movieTitle)) 
		//	{
		//		movies[i] = null;
		//		System.out.println("���� �Ϸ�");
		//		//return;
		//	}
		//	//else
		//	//{
		//	//	System.out.println("�Է��Ͻ� ������ ��ȭ�� �������� �ʽ��ϴ�");
		//	//	return;
		//	//}

		//}

		for (int n=0; n<vt.size(); n++)
		{
			if (( vt.get(n).getTitle() ).equals(tempTitle) == true)
			{
				boolean flag = ( vt.get(n).getTitle() ).equals(tempTitle);
				
				if (flag)
					tempIndex = n;
			}
		}

		if (tempIndex == -1)
		{
				System.out.println("�Է��Ͻ� ������ ��ȭ�� �������� �ʽ��ϴ�");
				//return;
		}
		else
		{
			vt.removeElementAt(tempIndex);
			System.out.println("[��ϵ� ��ȭ ����] ======================\n");
			System.out.println("��ȭ ���� �Ϸ�\n");
		}

//======================================================================��
		System.out.println(" 0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("========================================\n");

		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}
	}
//======================================================================��
	// ��ȭ ���� ���
	public void printMovieInfo(MovieData m) 
	{
		System.out.println(m.toString() + "\n");
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

	//// ����ڿ��� �޽����� ���� �޾� ����ϰ� ���ڿ� �� �޾� ��ȯ
	//String getData(String message) 
	//{
	//	System.out.println(message);
	//	return sc.next();
	//}


	//// ����ڿ��� �޽����� ���� �޾� ����ϰ� ���� �� �޾� ��ȯ
	//int getNum(String message) 
	//{
	//	System.out.println(message);
	//	return sc.nextInt();
	//}

	//// ��ȣ ���� �ޱ�
	//int getSelectNum(String message) 
	//{
	//	System.out.println(message);
	//	return sc.nextInt();
	//}

	// ���� ���� �ޱ�
	String getSelectData(String message) 
	{
		System.out.print(message);
		return sc.next();
	}
//======================================================================��

	//public static void main(String[] args)
	//{
	//	new MovieManagement();
	//}
}
