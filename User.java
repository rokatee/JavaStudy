import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Iterator;
import java.util.Arrays;
import java.io.IOException;

class UserMenu
{
	public static final int RESERV   = 1;	// �����ϱ�
	public static final int R_CHECK  = 2;	// ���ų��� Ȯ��
	public static final int R_CANCEL = 3;	// ���� ���
	public static final int B_USER   = 0;	// ������ �޴��� ���ư���
}

class ReservMenu
{
	public static final int R_MPICK = 1;	// ��ȭ �������� ����
	public static final int R_TPICK  = 2;	// �ð� �������� ����
	public static final int B_MENU  = 0;	// �������� ���ư���
}



	// �󿵰� ����

//========================================================================(A)


public class User
{
	private  Integer sel;						//-- ����� ���� ��(������)

	private String p_id;  // Ư�� ������ �����ϱ� ���� process id ���ظ� ���� ���� �������� ��Ʈ ��ȣ �ݿ�

	// �����ϱ� ����ؼ� ���Ź�ȣ �ο��޴� ȭ�鿡�� �ʿ��� ������(�ӽ������)
	public  int num;						//-- �ӽ����� ���� // timePick() ���� ����� ����, ����ڰ� ������ �ð��� ��
	public  String tempTitle;				//-- ����ڰ� �Է��� ��ȭ ����(�˻� ��)
	public  int tempScreen;			//-- ����ڰ� ������ ��ȭ�� �󿵰� ��
	public  int tempRound;			//-- ����ڰ� ������ ��ȭ�� ȸ�� ��
	public  int runTime;
	public  String tempSeat;			//-- ����ڰ� ������ �ڸ� // ���� row, col(StringŸ��) �� ������ ������ �ΰ��� ���ϱ� ������ �̿��ؼ� �ϳ���  
	public  String tempTime;				//-- ����ڰ� ������ �ð� ��
	public  int[] openTime = {9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};	// �����ð� 
	public  int startTime = 9;	// ���� ���� �ð� 9��
	public  int lastTime = 23;	// ���� ������ �ð� 23��


	public  String adminPassword="java002$";	//-- �ʱ�ȭ��(A,12)�� ������ ��й�ȣ
	private  Vector<String> reservedNum = new Vector<String>();		//-- ���Ź�ȣ(����) ���� �� ����� ����
	private  int adult;
	private  int teenager;
	private  int kid;
	private  int total;
	private  String bookNumber; // ������� �޴����� ����ڰ� �Է��� �� ������ ����

	//Vector<MovieData> vt = new Vector<MovieData>(); // Vector �ڷᱸ�� �ν��Ͻ� ���� (�����ڰ� ��ȭ ��� �� �κ�)
	private  Vector<UserData> ud = new Vector<UserData>();	// ����� �����ϱ� �Ϸ� �ϴ� ȭ�鿡�� �Է��� ���� �����ϴ� ����

	private boolean[][][] seatInfos = new boolean[15][5][5];

	// �󿵰����� ���� ��ȭ�� ������ ��� �迭
	static MovieData[] screen = new MovieData[3];

	public void setScreen(MovieData[] m) {
		screen = m;
	}
	

	public void reservNumber()  //-- ���Ź�ȣ ���� �޼ҵ�
	{
		//reservedNum = new Vector<String>();
		//Vector<String> reservedNum = new Vector<String>(); 
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

			for (int cnt=0; cnt< 10; cnt++)   // 0~9
			{
            n = rd.nextInt(10);      // 0 ~ 9
            num[cnt] = n;         
			}

			String str = "";
			str = Arrays.toString(num).replaceAll("[^0-9]","");	// num[10] ������ �迭 �� ���ڿ��� ��ȯ�Ͽ� str ������ ����		
			
			if (reservedNum == null)		// ������ ù��° ���� �ִ��� ������ 
			{
				reservedNum.add(str);		// ������ �ϴ� ����
			}
			else if (reservedNum.contains(str) == false)	// ������ �� ���� ���� ����Ǿ� �ִ��� Ȯ�� �� ����
			{
				reservedNum.add(str);	// str �� ���Ϳ� �߰�				
			}

		// ������ ������ 10�ڸ� �������� ��� �׽�Ʈ
		/*
		for (String nums : reservedNum)
		{
			System.out.print(nums);
		}
		System.out.println();
		*/
		// ���� ���� ��� ��
		// (rd.nextInt(90000)+10000)+""+(rd.nextInt(90000)+10000); // 99999 + 99999 (8�ڸ�) + 10000
		
	}

// ======================================================================================= ��� ���� ����(���� ��Ʈ ����)

	public void startProcess()  throws IOException
	{
		p_id = "A";
		while(true) {
			switch(p_id) {
				case "A" :	firstMenu(); break;
				case "B" :	userDisp1(); break;
				case "C2":	reserv(); break;
				case "C7":	reservedcheck(); break;
				case "C9":	reservCancel(); break;
				case "D2":	moviePick(); break;
				//case "D4":	timePick(); break;
				case "D7":	reservedcheck2(); break;
				case "D9":	reservCancel2(); break;
				case "E2":	moviePick2(); break;
				//case "E4":	timePick2(); break;
				case "F" :	movieRound(); break;
				case "G" :	seatPick(); break;
				case "H" :	seatPick2(); break;
				case "end":	break;
				default : System.out.println("���������ʴ� ����Դϴ�."); 						   
						  break;
			}

			if("end".equals(p_id)) break;	//���μ��� ����
		}
	}

	// �� ó�� �����ڰ� ��� �Է��� �� �ִ� ȭ��(A,12)
	public void firstMenu() throws IOException
	{
			System.out.println("[��ȭ Ƽ�� �߱Ǳ�] ==================");
			System.out.println();
			System.out.println("�����Ϸ��� A �� �����ּ���.");
			System.out.println();
			System.out.println("������ ��й�ȣ�� �Է����ּ���");
			System.out.println();
			System.out.println("=====================================");
			
			Scanner sc = new Scanner(System.in);
			String pw = sc.next();


			if (adminPassword.equals(pw))
			{
				// ������ �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
				//firstMenuRun();

				AdminCall ac = new AdminCall();
				ac.AmenuDisp();
			}
			else if (pw.equals("A") || pw.equals("a"))
			{
				// ��ϵ� ��ȭ ���� ��� �߰��ʿ�(B,1)
				if (screen[0] == null && screen[1] == null && screen[2] == null)	// �󿵰��� ��ϵ� ��ȭ�� ���� ���(���� ���������)
				{
					userDisp2();
				}
				else 
					p_id = "B";
			}
			else
			{
				p_id = "A"; // Ʋ�� ��ȣ �Է� �� ���Է� ȭ�� ȣ�� ����(B,12)
			}	
	}

	//public static void firstMenuRun() throws IOException
	//{
	//	AdminCall ac = new AdminCall();

	//	switch ()
	//	{
	//		case 			: ac.AmenuDisp(); break;
	//		default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
	//	}

	//	System.out.println();
	//}

	// ������ ���� ��ȯ �� ��� ��ȭ ���� ��, ��� ����(B,1)
	public void userDisp2()
	{
		System.out.println("[��ȭ Ƽ�� �߱Ǳ�] ==================");
		System.out.println();
		System.out.println("�� ���� ��ȭ�� �����ϴ�.");
		System.out.println("��ø� ��ٷ��ֽø� �ݹ� ���� �غ��ϰڽ��ϴ�.");
		System.out.println();
		System.out.println("=====================================");		
	}

	// ������ ���� ��ȯ �� ��� ��ȭ ���� ��, ��� ����
	public void userDisp1()
	{
		System.out.println("[������ ���]======");
		System.out.println();
		System.out.println("1. �����ϱ�");
		System.out.println("2. ���ų��� Ȯ��");
		System.out.println("3. ���� ���");
		System.out.println("===================");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print(">> �޴� ���� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: p_id = "C2"; break;// �����ϱ� ȭ�� ���
			case 2: p_id = "C7"; break; // ���ų��� Ȯ�� ȭ�� ���
			case 3: p_id = "C9"; break; // ������� ȭ�� ���
			case 0: p_id = "A"; break; // �����޴�(�ʱ�ȭ��) ���
		}
	}

//========================================================================(C)

	// 1. [�����ϱ�] ���� �� �޴�(C,3)
	public void reserv()
	{
		System.out.println("[�����ϱ�] ============");
		System.out.println();
		System.out.println("�з� ����");
		System.out.println("1. ��ȭ");
		System.out.println("2. �ð���");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: p_id = "D2"; break;// moviePick ȭ�� ���
			case 2: p_id = "D4";  break; // timePick Ȯ�� ȭ�� ���
			case 0: p_id = "B"; break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

	// 1. [��ȭ] ���� �� �޴� (D,2)
	public void moviePick()
	{

		System.out.println();

		System.out.println("[�����ϱ�] ====================");
		System.out.println();

		System.out.println("�����ڰ� ����� ��ȭ ��� ���");
		
		//�󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i] != null)	// �󿵰��� ��ȭ�� ��ϵǾ� ���� ��쿡��
			{
				//int n = MovieData.indexOf(screen[i].title); > �󿵰��� ��ϵ� ��ȭ�� ������ moviedata �� ���� �� ��ġ���� n�� ����
				System.out.printf(" �󿵰�: %d��\n, ��ȭ ���� : %s,(%d)\n", (i+1), screen[i].title, screen[i].grade);
				System.out.println();
			}		
		}

		System.out.println();
		
		System.out.println("==============================");
		System.out.println("0. ���� �޴��� ���ư���");

		
		Scanner sc = new Scanner(System.in);
		tempTitle = sc.next();		// ��ȭ���� �˻� �� ���ڿ� ���ϱ� ���� String tempTitle ������ ����

		System.out.println();

		if (tempTitle == "0")
		{
			p_id = "B"; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
		System.out.println();

		// ����ڰ� �Է��� ���� �󿵰� �� ���� ������ ���
		if (tempTitle.equals(screen[0].title) || tempTitle.equals(screen[1].title) || tempTitle.equals(screen[2].title))
		{
			// tempTitle ������ ��(����ڰ� �Է��� ��ȭ����)�� ���� �󿵰��� ��ϵ� ��ȭ
			p_id = "E2";
		}
		else
		{
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�");
			System.out.println("�ٽ� �Է����ּ���");
			System.out.println();

			p_id = "D2";	// ���� ȭ�� ȣ��(���Է�)
		}
	
	}

	// [��ȭ����] (E,2) �� ȸ�� ����
	public void moviePick2()
	{
		System.out.println("[�����ϱ�] ==========");
		System.out.println();

		// ����ڰ� ������ ��ȭ�� ���� �󿵰��� ��ϵ� ����
		// ���� �󿵰����� tempTitle �� ����� ��ȭ������ ��ϵ� �󿵰� ���� ��������
		
		//�󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i].title.equals(tempTitle))	// ����ڰ� ������ ��ȭ������ ��ϵ� �󿵰� �� ���
			{
				//int n = MovieData.indexOf(screen[i].title); > �󿵰��� ��ϵ� ��ȭ�� ������ moviedata �� ���� �� ��ġ���� n�� ����
				System.out.print(screen[i].title + " ");
				System.out.printf("(%d)\n", screen[i].grade);
				System.out.printf("�󿵰� : %d��", (i+1));
				System.out.println();
				
				runTime = screen[i].playTime;	// ����ڰ� ������ ��ȭ�� ����Ÿ�� �� ����
				tempScreen = (i+1); // ����ڰ� ������ ��ȭ�� ��ϵ� �󿵰� ���� ����(�� ������)
			}		
		}

		if (tempScreen == 1)	// 1�� 7ȸ�� ���(2�ð� ���� �)
		{
			for (int i=0; i<8; i++)
			{
				lastTime = (startTime * 60 + runTime)/60;
				System.out.printf("%dȸ�� : ", (i+1));
				System.out.printf("%d ~ %d \n", startTime, lastTime);
				startTime += 2;
			}

		}

		else if (tempScreen == 2)	// 2�� 5ȸ�� ���(3�ð� ���� �)
		{
			for (int i=0; i<6; i++)
			{
				lastTime = (startTime * 60 + runTime)/60;
				System.out.printf("%dȸ�� : ", (i+1));
				System.out.printf("%d ~ %d \n", startTime, lastTime);
				startTime += 3;
			}
		}

		else if (tempScreen == 3)	// 3�� 3ȸ�� ���(4�ð� ���� �)
		{
			for (int i=0; i<4; i++)
			{
				lastTime = (startTime * 60 + runTime)/60;
				System.out.printf("%dȸ�� : ", (i+1));
				System.out.printf("%d ~ %d \n", startTime, lastTime);
				startTime += 4;
			}
		}

		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.print("ȸ�� ���� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		tempRound = sel;

		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; break; // ����ȭ�� ���(��������� ó�� ȭ��)
			case 1:  
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: 
			case 7: p_id = "F"; break;
			default: p_id = "E2"; break;
		}

	}

//=====================================================================�� ��ȭ����(moviePick)

	// 2. [�ð���] ���� (D,5)
	//public void timePick()
	//{
	//	System.out.println("[�����ϱ�] ============");
	//	System.out.println();
	//	System.out.println("1. ����(9~12)");
	//	System.out.println("2. ����(13~18)");
	//	System.out.println("3. ����(19~23)");
	//	System.out.println();
	//	System.out.println("=======================");
	//	System.out.println("0. ���� �޴��� ���ư���");

	//	Scanner sc = new Scanner(System.in);
	//	sel = sc.nextInt();

	//	System.out.println();
	//	
	//	//timeNum = sel;
	//	
	//	// ����, ����, ����(1~3) �����ϴ� �κ� ���� �ϴ� ��...
	//	if (sel == 1)
	//	{
	//		4/2
	//		for (int i=0; i<3; i++)	
	//		{
	//			for(
	//			System.out.printf("��ȭ ���� : %s", screen[i].title);
	//		}
	//		p_id = "E3";
	//	}
	//	if (sel == 2)
	//	{
	//		for (int i=0; i<5; i++)	
	//		{
	//			
	//			System.out.printf("��ȭ ���� : %s", screen[i].title);
	//		}
	//		p_id = "E3";
	//	}
	//	if (sel == 3)
	//	{
	//		for (int i=0; i<4; i++)	
	//		{
	//			
	//			System.out.printf("��ȭ ���� : %s", screen[i].title);
	//		}
	//		p_id = "E3";
	//	}

	//	switch(sel)
	//	{
	//		case 0: p_id = "B"; break; // ����ȭ�� ���(��������� ó�� ȭ��)
	//	}
	//}

	// �����ڰ� �󿵰��� ����� ��ȭ ������ ������ => ���� � �󿵰��� ��ȭ�� ��ϵǾ� �ִ��� �� �� ����
	// ����� ��ȭ�� �� ���� ��ϵǾ� �ִ���, ��ȭ����, ��ȭ ����Ÿ���� ������
	// ��ȭ�� ��ϵ� �󿵰� ���� 9�� ���� +2,+3, +4 �ؼ� �� ȸ���� ���� �ð��� ����

	// �󿵰��� ���� ����ִ� ���� ���� > ��ϵ� �󿵰��� ���� ���� �ʿ�
	/*
	for (int i=0; i<screen.length; i++)	
		{
			if (screen[i] != null)	// �󿵰��� ��ȭ ���� ���� ����ִٸ�
			{
				// � �󿵰�����, � ��ȭ����(����, ���) ������ > �ϴ� �������
				System.out.println(i);
				System.out.println


			}
			System.out.printf("��ȭ ���� : %s", screen[i].title);
		}
	*/

	// [�ð�����] (E, 4) �� ȸ�� ����
	//public void timePick2()
	//{
	//	System.out.println("[�����ϱ�] ============");
	//	
	//	// ������ �ð��뿡 �ִ� ��ȭ ������ �ҷ��ͼ� ���
	//	/*
	//	1. 9:00~11:00 ���˵���2 (19)
	//	2. 9:00~12:00 ž��2 (15)
	//	3. 9:00~13:00 �̴Ͼ���2 (��ü)
	//	*/

	//	// �������� �ۼ��� �� �󿵰��� ��ϵ� ��ȭ ���� ����� �迭
	//	for (int i=0; i<screen.length; i++)
	//	{
	//		System.out.printf("��ȭ ���� : %s", screen[i].title);
	//	}

	//	System.out.println("=======================");
	//	System.out.println("0. ���� �޴��� ���ư���");

	//	Scanner sc = new Scanner(System.in);
	//	sel = sc.nextInt();

	//	System.out.println();
	//	
	//	num = sel;
	//	
	//	// ���ϴ� ��ȭ ��ȣ ����
	//	// ������ �� �ð��� ȸ���� �� ������ ȭ���̱� ������
	//	// ��ȭ����Ʈ�� �� ������ �� �� ��� �ϴ� ����

	//	switch(sel)
	//	{
	//		case 0: p_id = "D4"; break; // ����ȭ�� ���
	//	}

	//	p_id = "F";
	//}

//=====================================================================�� �ð�����(timePick)

	// [ȸ�� �Ǵ� ��ȭ ����] (F,3)
	public void movieRound()
	{
		MovieData selMovie = screen[tempScreen-1];
		int si = (tempScreen-1)*7+(tempRound-1);
		int st = 9;	// start time
		int et = 0;	// end time
		int em = 0; // end minute
		switch (si)
		{
		case 0: 
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: st += (2*si); et = (st*60 + selMovie.playTime) / 60; em = (st*60 + selMovie.playTime) % 60;
		
		}
		int leftSeat = 25;
		boolean[][] seatInfo = seatInfos[si];

		for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])	leftSeat--;				                                
            }            
        }

       tempTime = Integer.toString(st)+":00 ~ "+Integer.toString(et)+":"+Integer.toString(em);
	   //int[] i = new int[3];	// �󿵰� ����(1~3��)

	   System.out.println("[�����ϱ�]===============");
	   System.out.println();
	   System.out.println(selMovie.title+"("+selMovie.grade+")");
	   System.out.println(tempTime);
	   System.out.println();
	   System.out.println("�����ο��� �Է����ּ���.");
	   System.out.println("�ܿ� �¼� : "+leftSeat);
	   System.out.println();   
	   System.out.println("=========================");
	   System.out.println("-1. ���� �޴��� ���ư���");	// ������ 0���� ���� ���� �ϴ� 5�� ����
	   System.out.println();

	   Scanner sc = new Scanner(System.in);


	   System.out.println();

	// �Ʒ��� �������� ���������̱⿡ �޼��忡 �����Խ� ���� ������ ��� �����ֱ� ������ �ʱ�ȭ �ʿ�
	   adult = 0;
	   teenager = 0;
	   kid = 0;

	   System.out.print("���� : ");
	   adult = sc.nextInt();
	   if (adult == -1)
		{
			p_id = "B";  // ����ȭ�� ���
			return;
		}
	   System.out.print("û�ҳ� (~18) : ");
	   teenager = sc.nextInt();
	   if (teenager == -1)
		{
			p_id = "B";  // ����ȭ�� ���
			return;
		}
	   System.out.print("��� (~14) : ");
	   kid = sc.nextInt();
	   if (kid == -1)
		{
			p_id = "B";  // ����ȭ�� ���
			return;
		}

	   p_id = "G";

	   switch (selMovie.grade)
	   {
	   case 19: if(teenager != 0 && kid != 0) adultMovie(selMovie.title, selMovie.grade); break;
	   case 15: if(kid !=0) adultMovie(selMovie.title, selMovie.grade); break;
	   default: break;
	   }

	   total = adult + teenager + kid;
	   
	   // [�󿵰����� ���� �ο� �Է� ��] (G,6)
	   if (total > 25)
	   {
		    System.out.println("[�����ϱ�] ==========================");
			System.out.println();
			System.out.println("�ش� �󿵰��� �¼����� �����մϴ�.");
			System.out.println("�ٽ� �������ּ���.");
			System.out.println();
			System.out.println("=====================================");
			System.out.println();

			p_id = "F";
	   }

	   if(p_id.equals("F")) return;
	
   }

   // [�� �Ұ� ���ɴ� ���� ��] (G,2) > ������ �޴����� ��� ������� ���ǹ� �Ἥ movieRound() �ȿ� �ֱ�
	public void adultMovie(String title, int age)
	{
		System.out.println("[�����ϱ�] ==========================");
		System.out.println();
		System.out.println(title+"��(��)" + age + " �� �̸� �����Ұ� ��ȭ�Դϴ�.");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		System.out.println();
		p_id = "F";
	
	}


	
	// �¼� �����ִ� �޼ҵ� ����
	public void showSeat(boolean[][] seatInfo)
	{
		System.out.println("�ء�� ǥ�õ� �¼��� ����� �¼��Դϴ�.");      
        for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					System.out.print("[��]");
                else                                     
					System.out.print("[" + (char)(65 + i) + (j+1)+ "]");                                 
            }
            System.out.println();
        }
	}
	
	// [�ο� �Է�] (G,3)
	// �¼� ���� �޼ҵ� ���� (�޼ҵ� ����: seatPick)
	public void seatPick()
	{
		int si = (tempScreen-1)*7+(tempRound-1);

		Scanner sc = new Scanner(System.in);
		boolean isFirst = true;
		tempSeat = "";
		for (int i=0; i<total; i++)
		{
			if(isFirst) {
				showSeat(seatInfos[si]);
				isFirst = false;
			}
			System.out.println("���ϴ� �¼��� �������ּ���.");
			System.out.println("�� �ο��� " +total+"���Դϴ�.");
			String s = sc.next();
			int row = (int)s.charAt(0) - 65;
			int col = (int)s.charAt(1) - 48;
			 
			if (seatInfos[si][row][col-1])
			{
				redun();
				i--;
			}
			else
			{
				seatInfos[si][row][col-1] = true;
				tempSeat += s;
			}
			

			showSeat(seatInfos[si]);
		}

		p_id = "H";

	}	//end method

// }	//end class


	// [�¼� �ߺ�] (H,3)  >> �¼� ���� ȭ�� ��� �Ϸ�Ǹ� ���� �޼��� �� ���ǹ����� �־ �� ����
	public void redun()
	{
		System.out.println("[�����ϱ�] ==========================");
		System.out.println();
		System.out.println("�̹� ���õ� �¼��Դϴ�");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
	}

	// [�¼� ���� ����] (H,4)  >> ���Ź�ȣ �κ��� �ϼ�, �׿� �ٸ� ������ �����;� ��;;
	public void seatPick2() 
	{
		reservNumber();		// ���� ����
		String str="";		// ���ڿ� ���� ����
		str = reservedNum.lastElement();	// ������ ���Ź�ȣ�� str ������ ������ ����(�ؿ� ��������� ��� ����ó�� �ϱ� ����)

		// �׽�Ʈ ���� ����
		/*
		String  = "�̴Ͼ���2";
		int t = 60;
		int s = 1;
		int i = 2;
		String st = "A2";
		*/

		System.out.println("[�����ϱ�] ==========");
		
		System.out.print("���Ź�ȣ : " + str); // ���Ź�ȣ �ҷ��ͼ� �����ؾ� ��
		System.out.println();
		System.out.println("��ȭ : " + tempTitle);
		System.out.println("�ð� : " + tempTime);
		System.out.println("�󿵰� : " + tempScreen + "��");
		System.out.println("�ο� : " + total);
		System.out.println("�¼� : " + tempSeat);
		
		System.out.println("�����Ͻðڽ��ϱ�? (Y/N) :");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

			if (sel2.equals("y") || sel2.equals("Y"))
			{	
				ud.add(new UserData(str,tempTitle,tempTime,tempScreen,total,tempSeat));
				
				// �׽�Ʈ
				//ud.add(new UserData("�̴Ͼ���2",60,1,2,"A2")); 
				//UserData(String title, int time, int screen, int inwon, String seatNumber)

				seatPick3(); // ���Ű� �Ϸ�Ǿ��ٴ� ���� ����ϴ� ȭ��
			}
			
			// ������ �޴��� ���ư��� (I,5)
			else if (sel2.equals("n") || sel2.equals("N"))
			{	
				reservedNum.remove(str);
				p_id = "B";
				//reservCancel(); // �׽�Ʈ(��ȭ ���Ź�ȣ ��ȸ�ؼ� ����ϴ� ȭ��) > ��� �ϰڴٰ� ���� �� ����� �� �����Ǵ°� Ȯ�οϷ�
				
			}
			else
			{
				reservedNum.remove(str);
				System.out.println("�������� �ʴ� ����Դϴ�.");
				p_id = "H";
			}
		}

	
	// �¼� ���� ��ɿ��� Y ���� �� ȭ��(I,4)
	public void seatPick3()
	{
		System.out.println("[�����ϱ�] ==============");
		
		// ����ڰ� �Է��� ���ų��� ���� UserData ���Ϳ� ������ �Ǿ����� Ȯ��												

		System.out.println();

		System.out.println(); 
		System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println("0. ������ �޴��� ���ư���");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B";// ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

// ============================================================ �� �����ϱ�

	// [���ų��� Ȯ��]�ϴ� �޼��� (C,7)
	public void reservedcheck()
	{
		System.out.println("[���ų��� Ȯ��] ==========");
		System.out.println();
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		System.out.println();	
		System.out.println("==========================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���Ź�ȣ : ");

		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();

		System.out.println();

			if (reservedNum == null)
			{
				reservedcheck3();
				return;
			}
			
			if (bookNumber.equals("0"))
			{
				p_id = "B"; // ����ȭ�� ���(��������� ó�� ȭ��)
			}

			if (reservedNum.contains(bookNumber)==true)	// str ���ڰ�(���Ź�ȣ)�� reservedNum(����) ���� ���� ��� 
			{
				p_id = "D7";// ���� ȭ��(���ų��� Ȯ�� ȭ�� D��) ��ȯ
			}
			else
			{
				reservedcheck3();// ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ
			}
			

			
	}

	// [���Ź�ȣ �Է�] (D,7)
	public void reservedcheck2()
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		UserData res_ud = ud.get(udIndex);
		System.out.println("[���ų��� Ȯ��] ==============");
		
		System.out.println(); 
		System.out.print(  "���Ź�ȣ : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : "+res_ud.getTitle());
		System.out.println("�ð� : "+res_ud.getTime());
		System.out.println("�󿵰� : "+res_ud.getScreen());
		System.out.println("�ο� : "+res_ud.getInwon());
		System.out.println("�¼� : "+res_ud.getSeatNumber());
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("==============================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
		
	}

	// ���� ���Ź�ȣ �Է� �� (D,8)
	public void reservedcheck3()
	{
		System.out.println("[���ų��� Ȯ��] ==============");
		
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();

		System.out.println("=============================");
		System.out.println();

		p_id = "C7"; 
	}


	

// ======================================================== �� ���ų��� Ȯ��	
	

	// ���� ��� ù ȭ��(���� ��ȣ �Է��ϴ� ��������) (C,10)
	public void reservCancel()
	{
		System.out.println("[�������] ==============");
		System.out.println();
		System.out.println("���� ��ȣ �Է�(10�ڸ�) : "); 
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();

		System.out.println();
			
			if (bookNumber.equals("0"))
			{
				p_id = "B"; // ����ȭ�� ���(��������� ó�� ȭ��)
			}

			if (reservedNum.contains(bookNumber)==true)	// str ���ڰ�(���Ź�ȣ)�� reservedNum(����) ���� ���� ��� 
			{
				p_id = "D9";// ���� ȭ��(���Ź�ȣ �Է�ȭ�� D��) ��ȯ
				System.out.println(p_id);
			}

			else
			{
				reservCancel3();// ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ
			}

			if (reservedNum == null)
			{
				reservCancel3();
			}

			
	}


	// [���Ź�ȣ �Է�] (D,9)
	public void reservCancel2()
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		UserData res_ud = ud.get(udIndex);

		System.out.println("[�������] ==============");
		
		System.out.println(); 
		System.out.print("���Ź�ȣ : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : "+res_ud.getTitle());
		System.out.println("�ð� : "+res_ud.getTime());
		System.out.println("�󿵰� : "+res_ud.getScreen());
		System.out.println("�ο� : "+res_ud.getInwon());
		System.out.println("�¼� : "+res_ud.getSeatNumber());
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=========================");

		System.out.println("���� ����Ͻðڽ��ϱ�? (Y/N) :");
				
		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

			if (sel2.equals("y") || sel2.equals("Y"))
			{	
				int i = reservedNum.indexOf(bookNumber);	// ���Ź�ȣ�� ���Ϳ� �� ��°�� ��ġ�ϴ��� ã�Ƽ� i �� ����
				reservedNum.remove(i);
				reservCancelY(); // ���Ű� ��ҵǾ��ٴ� ���� ����ϴ� ȭ��
			}

			else if (sel2.equals("n") || sel2.equals("N"))
			{		
				p_id = "C9"; // �����޴�(���Ź�ȣ �Է��ϴ� ȭ��)�� ���ư��� ȭ��
			}

			else if (sel2.equals("0"))
			{
				p_id = "B";
			}

			else
			{
				System.out.println("�������� �ʴ� ����Դϴ�.");
				p_id = "D9";
			}
	}

	// ���� ���Ź�ȣ �Է� �� (D,8), (D,11)
	public void reservCancel3()
	{
		System.out.println("[�������] ==============");
		
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();

		System.out.println("=========================");
		System.out.println();

		p_id = "C9"; 
	}

	// [���� ���] (E,9)
	public void reservCancelY()
	{
		System.out.println("[�������] ==============");
		
		System.out.println(); 
		System.out.println("���Ÿ� ����߽��ϴ�.");

		System.out.println("0. ������ �޴��� ���ư���");
		System.out.println("=====================================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}


	// ���� �󿵰��� ��ϵ� ��ȭ ���� ����ϴ� �޼ҵ�
	public void movieList()
	{
		//�󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("��ȭ ���� : %s, �󿵰�: %d��\n", screen[i].title, (i+1));
		}


	}

// ============================================================ �� �������
	
	/*public void main(String[] args) 
	{
		//reservNumber();
		//moviePick();

		// �׽�Ʈ(Ȯ��)
		firstMenu();
		//userDisp1();
		//reservNumber();
		//timePick();
		//moviePick();
		//seatPick2();
		//reservCancel();
		//menuSelect();
		
		
		//int n = sc.nextInt();

		//User us = new User();
		//User.toString();
	}*/
}
