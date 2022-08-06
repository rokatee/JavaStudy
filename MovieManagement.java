import java.util.Scanner;
import java.io.IOException;

public class MovieManagement extends AdminCall
{    
	public void movieManage() throws IOException
	{
		System.out.println("\n[�󿵰� ����]==================\n");
		System.out.println("1. ��ȭ ���� ���");
		System.out.println("2. ��ȭ ��� Ȯ��");
		System.out.println("3. ��ϵ� ��ȭ ����");
		System.out.println();
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("=================================");

		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 3 && sel != 99);	// �޴� ���� ����
		
		System.out.println();

		switch(sel) 
		{
			case 1 :
				registerMovie();	// ��ȭ ��� �޼ҵ�
				break;
			case 2 :
				selectMovie();		// ��ϵ� ��ȭ ��� Ȯ�� �޼ҵ�
				break;
			case 3 : 
				deleteMovie();		// ��ϵ� ��ȭ ���� �޼ҵ�
				break;
			case 99 : 
				AmenuDisp();		// ������ �޴��� ���ư� �޼ҵ�
				break;
			default : 
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	// ��ȭ ���
	public void  registerMovie() throws IOException
	{
		//==========================================================���� ���
		//movies[0] = new MovieData();
		
		//System.out.println();
		//System.out.println("[��ȭ ���� ���]=======================\n");
		//System.out.println("����� ���ϴ� ��ȭ ������ �Է����ּ���.\n");
		//System.out.println("=======================================\n");

		//System.out.print("����			: ");
		//tempTitle = sc.next();
		//movies[0].title = tempTitle;
		//System.out.print("���� ���(0 / 15 / 19)  : ");
		//movies[0].grade = sc.nextInt();
		//System.out.print("����Ÿ�� �Է�(��)	: ");
		//movies[0].playTime = sc.nextInt();
		//System.out.println();
		
		//for (int i = 0; i <= vt.size(); i++)
		//{	
		//	if (vt.size() == 0)
		//	{
		//		vt.add(movies[0]);
		//		System.out.println("[��ȭ ���� ���]=======================\n");
		//		System.out.println( movies[0] +"\n\n��ϿϷ�");
		//		break;
		//	}
		//	else if ( ( vt.get(i).getTitle() ).equals(tempTitle) )
		//	{
		//		System.out.println("�̹� ��ϵ� ��ȭ�Դϴ�. �ٽ� �Է��ϼ���.");
		//		registerMovie();
		//		break;
		//	}
		//	else
		//	{
		//		vt.add(movies[0]);
		//		System.out.println("[��ȭ ���� ���]=======================\n");
		//		System.out.println( movies[0] +"\n\n��ϿϷ�");
		//		break;
		//	}
		//}
		//==========================================================���� ���


		System.out.println();
		System.out.println("[��ȭ ���� ���]=======================\n");
		System.out.println("����� ���ϴ� ��ȭ ������ �Է����ּ���.\n");
		System.out.println("=======================================\n");

		System.out.print("����			: ");
		tempTitle = sc.next();
		System.out.print("���� ���(0 / 15 / 19)  : ");
		tempGrade = sc.nextInt();
		System.out.print("����Ÿ�� �Է�(��)	: ");
		tempPlayTime = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < movies.length; i++)
		{
			if (movieCheck(tempTitle))
			{
				System.out.println("��ȭ ���� �ߺ��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
			else
			{
				movies[i] = new MovieData(tempTitle, tempGrade, tempPlayTime);
				vt.add(movies[i]);
				System.out.println("[��ȭ ���� ���]=======================\n");
				System.out.println(movies[i].toString()+"\n\n��ϿϷ�");
				break;
			}
		}

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


	// ��ȭ ��Ͽ��� ��ȭ ���� ����
	public void deleteMovie() throws IOException
	{
		System.out.println("\n[��ϵ� ��ȭ ����] ======================\n");

		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);
			}
		}

		System.out.println();

		System.out.println("������ ��ȭ ������ �Է����ּ���.\n");
		System.out.println("========================================\n");
		System.out.print("���� �Է� : ");
		tempTitle = sc.next();

		// vt ���� tempTitle�� ���� ��ȭ ������ ��� �ִ��� ã�� �����ϴ� ����
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
				System.out.println();
		}
		else
		{
			vt.removeElementAt(tempIndex);
			
			
			System.out.println();
			System.out.println("[��ϵ� ��ȭ ����] ======================\n");
			
			//for(MovieData m : vt) 
			//{	
			//	if(m != null) 
			//	{
			//		printMovieInfo(m);
			//	}
			//}
			
			System.out.println("��ȭ ���� �Ϸ�\n");
		}

		// screen[] ���� tempTitle�� ���� ��ȭ ������ ��� �ִ� ã�� �����ϴ� ����
		try
		{
			for (int n=0; n<screen.length; n++)
			{
				if ( tempTitle.equals( screen[n].title ) )
				{
					screen[n] = null;
					//System.out.println(" 0. ���� �޴��� ���ư���");
					//System.out.println("99. ������ �޴��� ���ư���");
					//System.out.println("========================================\n");
					break;
				}
			}
		}
		catch (NullPointerException e)
		{
			System.out.println(" 0. ���� �޴��� ���ư���");
			System.out.println("99. ������ �޴��� ���ư���");
			System.out.println("========================================\n");
		}


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


	// ��ȭ ���� ���
	public void printMovieInfo(MovieData m) 
	{
		System.out.println(m.toString() + "\n");
	}

	// ��ȭ ���� �ߺ� üũ
	private boolean movieCheck(String tempTitle)
	{
		boolean check = true;
		MovieData md = findMovie(tempTitle);
		if (md == null)
		{
			check = false;
		}
		return check;
	}

	// ��ȭ �������� ��ȭ ���� ã��
	public MovieData findMovie(String tempTitle) 
	{

		for (int i = 0; i < vt.size(); i++) 
		{
			if (( vt.get(i).getTitle() ).equals(tempTitle))
			{
				return movies[i];
			}
		}

		return null;
	}

	// ���� ���� �ޱ�
	String getSelectData(String message) 
	{
		System.out.print(message);
		return sc.next();
	}
}
