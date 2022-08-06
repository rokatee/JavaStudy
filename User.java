import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Iterator;
import java.util.Arrays;

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

//========================================================================(A)


public class User
{
	public static Vector<MovieData> mData = new Vector<MovieData>();

	private static Integer sel;						//-- ����� ���� ��
	//public static int timeNum;					//-- timePick() ���� ����� ����, ����ڰ� ������ �ð��� ��
	public static String adminPassword="java002";	//-- �ʱ�ȭ��(A,12)�� ������ ��й�ȣ
	private static Vector<String> reservedNum;		//-- ���Ź�ȣ(����) ���� �� ����� ����
	private static int adult;
	private static int teenager;
	private static int kid;
	private static int total;
	private static String bookNumber; // ������� �޴����� ����ڰ� �Է��� �� ������ ����

	// �󿵰����� ���� ��ȭ�� ������ ��� �迭
	static MovieData[] screen = new MovieData[3];

	// �󿵰� ȸ���� �¼� ����
	boolean[][] seat11 = new boolean[5][5];
	// ~
	boolean[][] seat33 = new boolean[5][5];
	
	public static String reservNumber()  //-- ���Ź�ȣ ���� �޼ҵ�
	{
		reservedNum = new Vector<String>();
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

		return str;

		// ������ ������ 10�ڸ� �������� ��� �׽�Ʈ
		
		//for (String nums : reservedNum)
		//{
		//	System.out.print(nums);
		//}
		//System.out.println();
		
	}

// ======================================================================================= ��� ���� ����(���� ��Ʈ ����)

	// �� ó�� �����ڰ� ��� �Է��� �� �ִ� ȭ��(A,12)
	public static void firstMenu()
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

			System.out.println();

			if (adminPassword.equals(pw))
			{
				System.out.println("������ �ʱ�ȭ�� �޼ҵ� ȣ��");
			}
			else if (pw.equals("A") || pw.equals("a"))
			{
				// ��ϵ� ��ȭ ���� ��� �߰��ʿ�(B,1)
				userDisp1();
			}
			else
			{
				firstMenu(); // Ʋ�� ��ȣ �Է� �� ���Է� ȭ�� ȣ�� ����(B,12)
			}	
	}

	// ������ ���� ��ȯ �� ��� ��ȭ ���� ��, ��� ����(B,1)
	public static void userDisp2()
	{
		// mData ���Ͱ� null ���� �� ����� ȭ��
		System.out.println("[��ȭ Ƽ�� �߱Ǳ�] ==================");
		System.out.println();
		System.out.println("�� ���� ��ȭ�� �����ϴ�.");
		System.out.println("��ø� ��ٷ��ֽø� �ݹ� ���� �غ��ϰڽ��ϴ�.");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=====================================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

	// ������ ���� ��ȯ �� ��� ��ȭ ���� ��, ��� ����
	public static void userDisp1()
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
			case 1: reserv(); break;// �����ϱ� ȭ�� ���
			case 2: reservedcheck(); break; // ���ų��� Ȯ�� ȭ�� ���
			case 3: reservCancel(); break; // ������� ȭ�� ���
			case 0: firstMenu(); break; // �����޴�(�ʱ�ȭ��) ���
		}
	}

//========================================================================(C)

	// 1. [�����ϱ�] ���� �� �޴�(C,3)
	public static void reserv()
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
			case 1: moviePick(); break;// moviePick ȭ�� ���
			case 2: timePick();  break; // timePick Ȯ�� ȭ�� ���
			case 0: userDisp1(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

	// 1. [��ȭ] ���� �� �޴� (D,2)
	public static void moviePick()
	{
		
	  /*
      for (MovieData obj : mData)  // String title, int grade, int playTime
      {
         System.out.printf("��ȭ ����: %s, ���: %d, ����Ÿ��: %d \n", obj.getTitle(), obj.getGrade(), obj.getPlayTime());
      }
	  */
		
		//for (int i=0; i<screen.length; i++)
		//{
		//	System.out.printf("��ȭ ���� : %s", screen[i].title);
		//}

		for (MovieData obj : mData)  // String title, int grade, int playTime
		{
			 System.out.printf("��ȭ ����: %s\n", obj.getTitle());
		}

		System.out.println("[�����ϱ�] ====================");
		System.out.println();

		System.out.println("(�̸� ���� ��������)");
		System.out.println();

		System.out.println("�����ڰ� ����� ��ȭ ��� ���");

		System.out.println();
		
		System.out.println("==============================");
		System.out.println("0. ���� �޴��� ���ư���");

		
		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		if (sel>0)
		{
			moviePick2();
		}

		switch(sel)
		{
			case 0: userDisp1(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

	// [��ȭ����] (E,2) �� ȸ�� ����
	public static void moviePick2()
	{
		System.out.println("[�����ϱ�] ==========");
		System.out.println();
		/*
		���˵���2 (19) screen[sel-1].title();
		�󿵰� : 1��

		1ȸ�� : 9 ~ 11
		2ȸ�� : 11 ~ 13
		3ȭ�� : 13 ~ 15
		*/
		
		screen[0].title = 

		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.print("ȸ�� ���� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

//=====================================================================�� ��ȭ����(moviePick)

	// 2. [�ð���] ���� (D,5)
	public static void timePick()
	{
		System.out.println("[�����ϱ�] ============");
		System.out.println();
		System.out.println("1. ����(9~12)");
		System.out.println("2. ����(13~18)");
		System.out.println("3. ����(19~23)");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		//timeNum = sel;
		
		// ����, ����, ����(1~3) �����ϴ� �κ� ���� �ϴ� ��...
		if (sel == 1)
		{
			timePick2();
		}
		if (sel == 2)
		{
			timePick2();
		}
		if (sel == 3)
		{
			timePick2();
		}

		switch(sel)
		{
			case 0: userDisp1(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

	// [�ð�����] (E, 5) �� ȸ�� ����
	public static void timePick2()
	{
		System.out.println("[�����ϱ�] ============");
		
		// ������ �ð��뿡 �ִ� ��ȭ ������ �ҷ��ͼ� ���
		/*
		1. 9:00~11:00 ���˵���2 (19)
		2. 9:00~12:00 ž��2 (15)
		3. 9:00~13:00 �̴Ͼ���2 (��ü)
		*/

		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		//timeNum = sel;
		
		// ���ϴ� ��ȭ ��ȣ ����
		// ������ �� �ð��� ȸ���� �� ������ ȭ���̱� ������
		// ��ȭ����Ʈ�� �� ������ �� �� ��� �ϴ� ����

		switch(sel)
		{
			case 0: userDisp1(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

//=====================================================================�� �ð�����(timePick)

	// [ȸ�� �Ǵ� ��ȭ ����] (F,3)
	public static void movieRound()
	{
   
	   //int[] i = new int[3];	// �󿵰� ����(1~3��)

	   System.out.println("[�����ϱ�]===============");
	   System.out.println();
	   // ���˵���2(19)
	   //09:00 ~ 11:00
	   System.out.println();
	   System.out.println("�����ο��� �Է����ּ���.");
	   System.out.println("�ܿ� �¼� : ");
	   System.out.println();   
	   System.out.println("=========================");
	   System.out.println("-1. ���� �޴��� ���ư���");	// ������ 0���� ���� ���� �ϴ� 5�� ����
	   System.out.println();

	   Scanner sc = new Scanner(System.in);

	   System.out.print("���� : ");
	   adult = sc.nextInt();
	   System.out.print("û�ҳ� (~18) : ");
	   teenager = sc.nextInt();
	   System.out.print("��� (~14) : ");
	   kid = sc.nextInt();

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

			movieRound();
	   }
	
	   sel = sc.nextInt();

	   System.out.println();

	   switch(sel)
	   {
	    	case -1: userDisp1(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
	   }

   }

   // [�� �Ұ� ���ɴ� ���� ��] (G,2) > ������ �޴����� ��� ������� ���ǹ� �Ἥ movieRound() �ȿ� �ֱ�
	public static void adultMovie()
	{
		System.out.println("[�����ϱ�] ==========================");
		System.out.println();
		System.out.println("(��ȭ����)�� ()�� �̸� �����Ұ� ��ȭ�Դϴ�.");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		System.out.println();
		timePick();
	
	}


	// [�ο� �Է�] (G,3)
	public static void seatPick()
	{
		int row;
		int col;
		Scanner sc = new Scanner(System.in);
			
		System.out.println("[�����ϱ�] ==========");
		System.out.println();
		System.out.println("���ϴ� �¼��� �������ּ���.");
		System.out.println("���ο��� 3���Դϴ�");
		System.out.println();
		System.out.println("  1  2  3  4  5 ");
		System.out.println("E �� �� �� �� ��");
		System.out.println("D �� �� �� �� ��");
		System.out.println("C �� �� �� �� ��");
		System.out.println("B �� �� �� �� ��");
		System.out.println("A �� �� �� �� ��");
		System.out.println("------------------");
		System.out.println();
		System.out.println("===================");
		System.out.println("0. ���� �޴��� ���ư���");
		

		int[][] arr = new int[5][5]; // �󿵰� �¼� �迭 5*5
		int n=1; // �ݺ����� ���� �� ���� ����

		/* �����ϴٰ� ����.. �ϴ� �ٸ� �κ� ������ �ٽ� �����غ����;;
		for (int i=0; i<arr.length; i++)
		{
			n++;
			for (int j=0; j<i.length; j++)
			{

			}
		} >> total ���� �� ��ŭ �¼� �� ���� �ݺ��ϰ� ����ȭ��
		*/ 
		
	}

	// [�¼� �ߺ�] (H,3)  >> �¼� ���� ȭ�� ��� �Ϸ�Ǹ� ���� �޼��� �� ���ǹ����� �־ �� ����
	public static void redun()
	{
		System.out.println("[�����ϱ�] ==========================");
		System.out.println();
		System.out.println("�̹� ���õ� �¼��Դϴ�");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		
		seatPick();	// �¼� �����ϴ� ȭ������ ��ȯ(G,3)
	}

	// [�¼� ���� ����] (H,4)  >> ���Ź�ȣ �κ��� �ϼ�, �׿� �ٸ� ������ �����;� ��;;
	public static void seatPick2() 
	{
		reservNumber();		// ���� ����
		String str="";		// ���ڿ� ���� ����
		str = reservedNum.lastElement();	// ������ ���Ź�ȣ�� str ������ ������ ����(�ؿ� ��������� ��� ����ó�� �ϱ� ����)

		System.out.println("[�����ϱ�] ==========");
		
		System.out.print("���Ź�ȣ : " + str); // ���Ź�ȣ �ҷ��ͼ� �����ؾ� ��
		System.out.println();
		System.out.println("��ȭ : ");
		System.out.println("�ð� : ");
		System.out.println("�󿵰� :  ��");
		System.out.println("�¼� : ");
		
		System.out.println("�����Ͻðڽ��ϱ�? (Y/N) :");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

			if (sel2.equals("y") || sel2.equals("Y"))
			{		
				seatPick3(); // ���Ű� �Ϸ�Ǿ��ٴ� ���� ����ϴ� ȭ��
			}
			
			// ������ �޴��� ���ư��� (I,5)
			else if (sel2.equals("n") || sel2.equals("N"))
			{	
				reservedNum.remove(str);
				userDisp1();
				//reservCancel(); // �׽�Ʈ(��ȭ ���Ź�ȣ ��ȸ�ؼ� ����ϴ� ȭ��) > ��� �ϰڴٰ� ���� �� ����� �� �����Ǵ°� Ȯ�οϷ�
				
			}

			else if (sel2.equals("0"))	// ������ �ʱ� ȭ������ ���ư��ٰ� �� ���
			{
				reservedNum.remove(str); // ������ ������ ����
				userDisp1();
			}

			else
			{
				reservedNum.remove(str);
				System.out.println("�������� �ʴ� ����Դϴ�.");
				System.out.println("�����ڸ� ȣ�����ּ���.");
				System.out.println();
			}
		}

	
	// �¼� ���� ��ɿ��� Y ���� �� ȭ��(I,4)
	public static void seatPick3()
	{
		String tempNumber = reservNumber();

		System.out.println("[�����ϱ�] ==============");
		
		System.out.println(); 
		System.out.printf("���Ź�ȣ %s", tempNumber);
		System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println("0. ������ �޴��� ���ư���");
		System.out.println("=========================");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

// ============================================================ �� �����ϱ�

	// [���ų��� Ȯ��]�ϴ� �޼��� (C,7)
	public static void reservedcheck()
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
			
			if (bookNumber.equals("0"))
			{
				userDisp1(); // ����ȭ�� ���(��������� ó�� ȭ��)
			}

			if (reservedNum.contains(bookNumber)==true)	// str ���ڰ�(���Ź�ȣ)�� reservedNum(����) ���� ���� ��� 
			{
				reservedcheck2();// ���� ȭ��(���ų��� Ȯ�� ȭ�� D��) ��ȯ
			}

			if (reservedNum == null)
			{
				reservedcheck3();
			}

			else
			{
				reservedcheck3();// ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ
			}
	}

	// [���Ź�ȣ �Է�] (D,7)
	public static void reservedcheck2()
	{
		System.out.println("[���ų��� Ȯ��] ==============");
		
		System.out.println(); 
		System.out.print(  "���Ź�ȣ : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : ");
		System.out.println("�ð� : ");
		System.out.println("�󿵰� : ");
		System.out.println("�ο� : ");
		System.out.println("�¼� : ");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("==============================");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

		switch(sel)
		{
			case 0: userDisp1(); // ����ȭ�� ���(��������� ó�� ȭ��)
		}
		
	}

	// ���� ���Ź�ȣ �Է� �� (D,8)
	public static void reservedcheck3()
	{
		System.out.println("[���ų��� Ȯ��] ==============");
		
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();

		System.out.println("=============================");
		System.out.println();

		reservedcheck(); 
	}


	

// ======================================================== �� ���ų��� Ȯ��	
	

	// ���� ��� ù ȭ��(���� ��ȣ �Է��ϴ� ��������) (C,10)
	public static void reservCancel()
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
				userDisp1(); // ����ȭ�� ���(��������� ó�� ȭ��)
			}

			if (reservedNum.contains(bookNumber)==true)	// str ���ڰ�(���Ź�ȣ)�� reservedNum(����) ���� ���� ��� 
			{
				reservCancel2();// ���� ȭ��(���Ź�ȣ �Է�ȭ�� D��) ��ȯ
			}

			if (reservedNum == null)
			{
				reservCancel3();
			}

			else
			{
				reservCancel3();// ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ
			}

	}


	// [���Ź�ȣ �Է�] (D,9)
	public static void reservCancel2()
	{
		System.out.println("[�������] ==============");
		
		System.out.println(); 
		System.out.print("���Ź�ȣ : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : ");
		System.out.println("�ð� : ");
		System.out.println("�󿵰� : ");
		System.out.println("�ο� : ");
		System.out.println("�¼� : ");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=========================");

		System.out.println("���� ����Ͻðڽ��ϱ�? (Y/N) :");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

			if (sel2.equals("y") || sel2.equals("Y"))
			{		
				reservCancelY(); // ���Ű� ��ҵǾ��ٴ� ���� ����ϴ� ȭ��
			}

			else if (sel2.equals("n") || sel2.equals("N"))
			{		
				reservCancel(); // �����޴�(���Ź�ȣ �Է��ϴ� ȭ��)�� ���ư��� ȭ��
			}

			else if (sel2.equals("0"))
			{
				userDisp1();
			}

			else
			{
				System.out.println("�������� �ʴ� ����Դϴ�.");
				System.out.println("�����ڸ� ȣ�����ּ���.");
				System.out.println();
			}
	}

	// ���� ���Ź�ȣ �Է� �� (D,8), (D,11)
	public static void reservCancel3()
	{
		System.out.println("[�������] ==============");
		
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();

		System.out.println("=========================");
		System.out.println();

		reservCancel(); 
	}

	// [���� ���] (E,9)
	public static void reservCancelY()
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
			case 0: userDisp1(); // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}

// ============================================================ �� �������
	
	public static void main(String[] args) 
	{
		reservNumber();

		//mData.add(new MovieData("�̴Ͼ���2", 0,60));
		mData.add(new MovieData("�̴Ͼ���2"));
		// screen[0].title = "�̴Ͼ���2";
		// screen[0].grade = "0";
		// screen[0].palyTime = "60";

		// �׽�Ʈ(Ȯ��)
		firstMenu();
		//userDisp1();
		//reservNumber();
		//timePick();
		//seatPick2();
		//reservCancel();
		//menuSelect();
		
		
		//int n = sc.nextInt();

		//User us = new User();
		//User.toString();
	}
}
