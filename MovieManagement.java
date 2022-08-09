import java.util.Scanner;
import java.io.IOException;

public class MovieManagement extends AdminCall
{    
	// ��ȭ ������ �����ϴ� �޴����� ����ִ� ��� �޴���
	public void movieManage() throws IOException	
	{
		System.out.println("\n[�� ��ȭ ����]==============================\n");
		System.out.println("1. ��ȭ ���� ���");
		System.out.println("2. ��ȭ ��� Ȯ��");
		System.out.println("3. ��ϵ� ��ȭ ����");
		System.out.println();
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println  ("==============================================");

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
				System.out.println("\n��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	// ��ȭ ���
	public void  registerMovie() throws IOException
	{
		movies[0] = new MovieData();
		
		System.out.println();
		System.out.println("[��ȭ ���� ���]==============================\n");
		System.out.println("����� ���ϴ� ��ȭ ������ �Է����ּ���.\n");
		System.out.println("==============================================\n");
						  
		System.out.print("����			: ");
		tempTitle = br.readLine();
		movies[0].title = tempTitle;
		System.out.print("���� ���(0 / 15 / 19)  : ");
		movies[0].grade = Integer.parseInt(br.readLine());
		System.out.print("����Ÿ�� �Է�(��)	: ");
		movies[0].playTime = Integer.parseInt(br.readLine());
		//System.out.println();
		
		// �ߺ��Ǵ� ��ȭ ������ �ִ��� ���θ� üũ�ϴ� ����
		boolean tempCheck = false;
		
		if (vt.size() == 0)
		{
			vt.add(movies[0]);
			System.out.println("\n[��ȭ ���� ���]==============================\n");
			System.out.println( movies[0] +"\n\n��ϿϷ�");
		}
		else
		{
			for (int i = 0; i < vt.size(); i++)
			{	
				if (vt.size() == 0)
				{
					
					break;
				}

				if ( ( vt.get(i).getTitle() ).equals(tempTitle) )	// ����� �Է°��� vt(����)�� ����� title(����)�� ������
					tempCheck = true;								// tempCheck�� Ʈ��� �ٲٰ�
				
				//if ( ( vt.get(i).getTitle() ).equals(tempTitle) )
				//{
				//	System.out.println("�̹� ��ϵ� ��ȭ�Դϴ�. �ٽ� �Է��ϼ���.");
				//	System.out.println();
				//	System.out.println(" 0. ���� �޴��� ���ư���");
				//	System.out.println(" 1. ��ȭ ���� �ٽ� �Է��ϱ�");
				//	System.out.println("99. ������ �޴��� ���ư���");
				//	System.out.println("=======================================");

				//	do
				//	{
				//		System.out.print("\n�޴� ���� : ");
				//		sel = Integer.parseInt(br.readLine());
				//	}
				//	while (sel != 0 && sel != 1 && sel != 99);
				//	
				//	System.out.println();

				//	switch(sel) 
				//	{
				//		case 0 : 
				//			movieManage(); 
				//			break;
				//		case 1 : 
				//			registerMovie(); 
				//			break;
				//		case 99 : 
				//			AmenuDisp();
				//			break;
				//		default : 
				//			System.out.println("��ϵ� �޴��� �ƴմϴ�.");
				//	}
				//	break;
				//}
				//else
				//{
				//	vt.add(movies[0]);
				//	System.out.println("[��ȭ ���� ���]=======================\n");
				//	System.out.println( movies[0] +"\n\n��ϿϷ�");
				//	break;
				//}
			}

			if (tempCheck)		// Ʈ���̸� �ߺ��ƴٴ� ���� ����
			{					
				System.out.println();
				System.out.println("�̹� ��ϵ� ��ȭ�Դϴ�. �ٽ� �Է��ϼ���.");
				System.out.println();
				System.out.println(" 0. ���� �޴��� ���ư���");
				System.out.println(" 1. ��ȭ ���� �ٽ� �Է��ϱ�");
				System.out.println("99. ������ �޴��� ���ư���");
				System.out.println("================================================");

				do
				{
					System.out.print("\n�޴� ���� : ");
					sel = Integer.parseInt(br.readLine());
				}
				while (sel != 0 && sel != 1 && sel != 99);
				
				System.out.println();

				switch(sel) 
				{
					case 0 : 
						movieManage();		// ��ȭ���� ��� �޴� �޼ҵ�
						break;
					case 1 : 
						registerMovie();	// ��ȭ ��� �޼ҵ�
						break;
					case 99 : 
						AmenuDisp();		// ������ �޴��� ���ư� �޼ҵ�
						break;
					default : 
						System.out.println("\n��ϵ� �޴��� �ƴմϴ�.");
				}
			}
			else
			{
				vt.add(movies[0]);
				System.out.println("\n[��ȭ ���� ���]==============================\n");
				System.out.println( movies[0] +"\n\n��ϿϷ�");
			}
		}

		//System.out.println();
		//System.out.println("[��ȭ ���� ���]=======================\n");
		//System.out.println("����� ���ϴ� ��ȭ ������ �Է����ּ���.\n");
		//System.out.println("=======================================\n");

		//System.out.print("����			: ");
		//tempTitle = sc.next();
		//System.out.print("���� ���(0 / 15 / 19)  : ");
		//tempGrade = sc.nextInt();
		//System.out.print("����Ÿ�� �Է�(��)	: ");
		//tempPlayTime = sc.nextInt();
		//System.out.println();
		
		//for (int i = 0; i < movies.length; i++)
		//{
		//	if (movieCheck(tempTitle))
		//	{
		//		System.out.println("��ȭ ���� �ߺ��Դϴ�. �ٽ� �Է��ϼ���.");
		//		break;
		//	}
		//	else
		//	{
		//		movies[i] = new MovieData(tempTitle, tempGrade, tempPlayTime);
		//		vt.add(movies[i]);
		//		System.out.println("[��ȭ ���� ���]=======================\n");
		//		System.out.println(movies[i].toString()+"\n\n��ϿϷ�");
		//		break;
		//	}
		//}


		System.out.println();
		System.out.println(" 0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("==============================================");
					
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 1 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage();		// ��ȭ���� ��� �޴� �޼ҵ�
				break;
			case 99 : 
				AmenuDisp();		// ������ �޴��� ���ư� �޼ҵ�
				break;
			default : 
				System.out.println("\n��ϵ� �޴��� �ƴմϴ�.");
		}
	}

	// ��ȭ ��� ���
	public void selectMovie() throws IOException
	{		
		System.out.println();
		System.out.println("[��ȭ ��� Ȯ��] =============================\n");

		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);	// ��ȭ ���� ����ϴ� �޼ҵ�
			}
		}

		System.out.println();
		System.out.println(" 0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("==============================================");
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);

		//System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage();	// ��ȭ���� ��� �޴� �޼ҵ�
				break;
			case 99 : 
				AmenuDisp();	// ������ �޴��� ���ư� �޼ҵ�
				break;
			default : 
				System.out.println("\n��ϵ� �޴��� �ƴմϴ�.");
		}
	}


	// ��ȭ ��Ͽ��� ��ȭ ���� ����
	public void deleteMovie() throws IOException
	{					    
		System.out.println("\n[��ϵ� ��ȭ ����] ===========================\n");

		// ���Ϳ� ����� ��ȭ ���� �ҷ�����
		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);		// ��ȭ ���� ����ϴ� �޼ҵ�
			}
		}

		System.out.println();

		System.out.println("������ ��ȭ ������ �Է����ּ���.\n");
		System.out.println("==============================================\n");
		System.out.print("���� �Է� : ");
		tempTitle = br.readLine();
		
		tempIndex = -1;
		
		// vt ���� tempTitle�� ���� ��ȭ ������ ��� �ִ��� ã�� �����ϴ� ����
		for (int n = 0; n < vt.size(); n++)
		{
			// tempTitle�� ���� ��ȭ ������ ����Ǿ� �ִ� �ε��� ã�� ����
			if (( vt.get(n).getTitle() ).equals(tempTitle) == true)		// ����� �Է°�(tempTitle)�� vt(����)�� ����� title(����)�� ������ Ʈ��
			{
				boolean flag = ( vt.get(n).getTitle() ).equals(tempTitle);	// Ʈ���϶�, flag�� ���
				
				if (flag)													// n���� tempIndex�� ��´�
					tempIndex = n;
			}
		}
		
		// �ε��� ���� �� ã������ (= �ε������� �״�θ�)
		if (tempIndex == -1)
		{
				System.out.println();
				System.out.println("�ش� ��ȭ�� �������� �ʽ��ϴ�.");
				System.out.println("��ȭ ������ �ٽ� �Է��ϼ���.");
				System.out.println();
				System.out.println(" 0. ���� �޴��� ���ư���");
				System.out.println(" 1. ��ȭ ���� �ٽ� �Է��ϱ�");
				System.out.println("99. ������ �޴��� ���ư���");
				System.out.println("==============================================");
				
				do
				{
					System.out.print("\n�޴� ���� : ");
					sel = Integer.parseInt(br.readLine());
				}
				while (sel != 0 && sel != 1 && sel != 99);
				
				//System.out.println();

				switch(sel) 
				{
					case 0 : 
						movieManage();	// ��ȭ���� ��� �޴� �޼ҵ�
						break;
					case 1 : 
						deleteMovie();	// ��ϵ� ��ȭ ���� �޼ҵ�
						break;
					case 99 : 
						AmenuDisp();	// ������ �޴��� ���ư� �޼ҵ�
						break;
					default : 
						System.out.println("\n��ϵ� �޴��� �ƴմϴ�.");
				}
		}
		// ã������( �ε������� -1���� �ٸ� ��(n)���� �ٲ���ٸ�)
		else
		{
			vt.removeElementAt(tempIndex);	// �ε������� ���Ϳ��� ����
			
							  
			System.out.println();
			System.out.println("[��ϵ� ��ȭ ����] ===========================\n");
			System.out.printf("[%s] ��ȭ ���� �Ϸ�\n", tempTitle);
			System.out.println();
		}

		// screen[] ���� tempTitle�� ���� ��ȭ ������ ��� �ִ� ã�� �����ϴ� ����
		// (��ϵ� ��ȭ�� �����ϸ� �� ���� ��ȭ ��Ͽ����� ������)
		try
		{
			for (int n=0; n < screen.length; n++)
			{
				if ( tempTitle.equals( screen[n].title ) )	// �󿵰��� �ö� ����(����,���,�󿵽ð�)�� ����ִ� screen�� title����
				{											// ����ڰ� �Է��� ���� ���ٸ�
					screen[n] = null;						// �����ϱ�
					System.out.println(" 0. ���� �޴��� ���ư���");
					System.out.println("99. ������ �޴��� ���ư���");
					System.out.println("==============================================");

					break;
				}
			}
		}
		catch (NullPointerException e)
		{
			System.out.println(" 0. ���� �޴��� ���ư���");
			System.out.println("99. ������ �޴��� ���ư���");
			System.out.println("==============================================");
		}

		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		//System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage();	// ��ȭ���� ��� �޴� �޼ҵ�
				break;
			case 99 : 
				AmenuDisp();	// ��ȭ���� ��� �޴� �޼ҵ�
				break;
			default : 
				System.out.println("\n��ϵ� �޴��� �ƴմϴ�.");
		}
	}


	// ��ȭ ���� ���
	public void printMovieInfo(MovieData m)			// ��ȭ ������ ��� MovieData�� �Ű������� �޾�
	{
		System.out.println(m.toString() + "\n");	//toString���� ��� ����ϱ�
	}

	//// ��ȭ ���� �ߺ� üũ
	//private boolean movieCheck(String tempTitle)	// ����ڰ� �Է��� tempTitle(��ȭ����)�� �Ű������� �޾�
	//{
	//	boolean check = true;						
	//	MovieData md = findMovie(tempTitle);		// findMovie�� ���� ����ڰ� �Է��� tempTitle�� ã�� �� ���� md�� ��´�
	//	if (md == null)								// md�� ������
	//	{		
	//		check = false;							// check�� false��
	//	}
	//	return check;
	//}

	// ��ȭ �������� ��ȭ ���� ã��
	public MovieData findMovie(String tempTitle)			// ����ڰ� �Է��� tempTitle(��ȭ����)�� �Ű������� �޾�
	{
		for (int i = 0; i < vt.size(); i++)					// vt(����)�� �����ŭ 
		{
			if (( vt.get(i).getTitle() ).equals(tempTitle))	// ����� �Է°��� vt(����)�� ����� title(����)�� ������
			{
				return movies[i];							// movies ��� ��ȭ ������ ��� �迭 ��ȯ
			}
		}
		return null;
	}

	// ���� ���� �ޱ�
	// ����ڿ��� �޽����� ���� �޾� ����ϰ� ���ڿ� �� �޾� ��ȯ
	String getSelectData(String message) throws IOException 
	{
		System.out.print(message);
		return br.readLine();
	}
}
