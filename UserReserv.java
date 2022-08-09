import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;
import java.io.IOException;

	
//========================================================================(A)

public class UserReserv extends UserCall
{

	// ���Ź�ȣ ���� �޼ҵ�(���Ź�ȣ: 0-9 ������ �̷���� ���� 10�ڸ��� ����)
	public void reservNumber()
	{
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

		for (int cnt=0; cnt<10; cnt++)	// 0 ~ 9 ���� �ݺ�
		{
			n = rd.nextInt(10);			// 0 ~ 9 �� ������ ���� �߻�
			num[cnt] = n;				// num �迭�� ������ �߻��� ���� ���� ����
		}

		String str = "";				// �ӽ���������� ���ڿ�Ÿ���� str ���� ����(nullpoint ���� ������ ���� = "" �߰�)
		str = Arrays.toString(num).replaceAll("[^0-9]","");		//-- num[10] ������ �迭 ���� ���ڿ��� ��ȯ�Ͽ� str ������ ����, 
																//   toString���� ��½� '[', ',' ���� ���ͼ� �� �κ� �����ϱ� ���� ("[^0-9]","") �߰��ۼ�

		// ������ ù ��° �� ���� ���� �Ǵ��ϱ�
		if (reservedNum == null)	// reservedNum ���ͱ����� ���� ���� ���
		{
			reservedNum.add(str);	//-- ���� ��, �ϴ� ����
		}
		else if (reservedNum.contains(str) == false)	//-- ���� ��, �� ���� ���� ����Ǿ� �ִ��� Ȯ�� �� ����
		{
			reservedNum.add(str);	//-- str �� ���Ϳ� �߰�			
		}


		// ���� �߻� ��� ��
		// String str = (rd.nextInt(90000)+10000) + "" + (rd.nextInt(90000)+10000);   //-- 99999 + 99999 (8�ڸ�) + 10000

	} //end reservNumber method


	// 1. [��ȭ] ���� �� ���� �޴� (D,2)
	public void moviePick() throws IOException
	{					 
		System.out.println();
		System.out.println("[�����ϱ�] ======================================");
		System.out.println();
		//System.out.println("�����ڰ� ����� ��ȭ ��� ���");
		
		// �󿵰��� ��ϵ� ��ȭ ���� ����� �迭(���� ��ϵǾ� �ִ� ��ȭ ���� ���)
		for (int i=0; i<screen.length; i++)		// i=0 1��, i=1 2��, i=2 3��
		{
			if (screen[i] != null)	// �󿵰��� ��ȭ�� ��ϵǾ� ���� ��쿡��
			{
				System.out.printf(" �󿵰�: %d��\n ��ȭ ���� : %s(%d)\n", (i+1), screen[i].title, screen[i].grade);	// �󿵰��� ��ϵ� ��ȭ �����, ��ȭ����� �����ͼ� ���
				System.out.println();
			}		
		}
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println ("=================================================");
		System.out.println();
		System.out.print("�����Ͻ� ��ȭ������ �Է����ּ��� : ");

		tempTitle = sc.next();	//-- ����ڰ� �Է��� ��ȭ���� ���� �󿵰��� ����Ǿ� �ִ� ���� ���ڿ� ���·� ���ϱ� ���� 
								//	 String ������ tempTitle �̶�� ������ ����
		//System.out.println();

		//if (tempTitle == "0")
		//{
		//	UmenuDisp(); //-- ����ȭ�� ���(��������� ó�� ȭ��)
		//}
		//System.out.println();

		//// ����ڰ� �Է��� ���� �󿵰� �� ���� ������ ���
		//if (tempTitle.equals(screen[0].title) || tempTitle.equals(screen[1].title) || tempTitle.equals(screen[2].title))
		//{
		//	roundPick();
		//}
		//else
		//{
		//	System.out.println("�Է� ���� �߸��Ǿ����ϴ�");
		//	System.out.println("�ٽ� �Է����ּ���");
		//	System.out.println();
		//	moviePick();	//-- ���� ȭ�� ȣ�� (���Է�)
		//}
		
		// �󿵰��� ��ϵ� ��ȭ ���� ����� �迭(����ڰ� �Է��� ���� ���ϱ� ���� ����)
		for (int i=0; i<screen.length; i++)						// i=0 1��, i=1 2��, i=2 3��
		{	
			//�Ʒ��� if�� ����� �۵��ϴ��� Ȯ���ϱ� ���� ����
			//System.out.println(screen.toString());
			
			if (screen[i] != null)								// ��ȭ������ ��ϵ� �󿵰��� ���
			{
				if (tempTitle.equals(screen[i].title))			// ����ڰ� �Է��� ���� ������ ������ ��ȭ�� ��ϵ� �󿵰��� ã����
					roundPick();								// ȸ���� ������ �� �ִ� ȭ������ ��ȯ
				else											// ����ڰ� �Է��� ���� ������ ������ ��ȭ�� ��ϵ� �󿵰��� ������
				{
					System.out.println();
					System.out.println("�Է� ���� �߸��Ǿ����ϴ�");
					System.out.println("�ٽ� �Է����ּ���");
					//System.out.println();
					moviePick();								// ��ȭ�����ϴ� ȭ������ ��ȯ�ض�(���Է�)
				}
			}
			else
				continue;
		}

	} //end moviePick method


	// [��ȭ����] �� ȸ�� ���� (E,2)
	public void roundPick() throws IOException
	{					  
		System.out.println();
		System.out.println("[�����ϱ�] ======================================");
		System.out.println();
		
		// ����ڰ� ������ ��ȭ������ ��ϵ� �󿵰� �� ����ϱ�
		for (int i=0; i<screen.length; i++)
		{ 
			if (screen[i] != null)							// ��ȭ������ ��ϵ� �󿵰��� ã�� ���
			{
				if (screen[i].title.equals(tempTitle))		// ����ڰ� �Է��� ���� ������ ��ȭ���� ���� ����� �󿵰��� ã�� 
				{
					System.out.print(screen[i].title + " ");		// �� �󿵰� �� ����� ��ȭ������ ��������
					System.out.printf("(%d)\n", screen[i].grade);	// �󿵰� �� ����� ��ȭ��� ��������
					System.out.println();
					System.out.printf("�󿵰� : %d��", (i+1));		// �ش� �󿵰� ��� (�� ������)
					System.out.println();
					
					runTime = screen[i].playTime;	//-- ������ ã�� �󿵰� �� ����� ��ȭ�� ����Ÿ�� �� ����
					tempScreen = (i+1);				//-- ����ڰ� ������ ��ȭ�� ��ϵ� �󿵰� ���� ���� (�� ������)
					break;
				}		
			}
		}

		int startTime = 9;		//-- ����� �ð� 9�� �� startTime ������ ����

		if (tempScreen == 1)	//-- 1�� 7ȸ�� ��� (2�ð� ���� �)
		{
			for (int i=0; i<7; i++)  // 0~6 �ݺ� (7ȸ)
			{
				int endTime = (startTime*60 + runTime) / 60;		// ��ȭ ������ �ð� ����Ͽ� ����(�� hour)
				int endMinute = (startTime*60 + runTime) % 60;		// ��ȭ ������ �ð� ����Ͽ� ����(�� minute)
				System.out.printf("%dȸ�� : ", (i+1));	
				
				// �ش� ȸ���� ���۽ð�, ���ð�(��, ��) ������ ���� �ϳ��� ���ڿ��� ����� ���� �۾�
				// �ϴ� ������ ���� ���ڿ� Ÿ������ ���� �� �ֵ��� ���� ����
				String st = "";		//-- start time
				String et=  "";		//-- end time
				String em = "";		//-- end minute

				if(startTime == 9)							// ȸ�� ���۽ð���(hour) 9���� ��� 
					st = "0"+Integer.toString(startTime);	// ��¹��� 09 �� ���ü� �ֵ��� �տ� "0" �߰��ؼ� �� ����
				else 
					st= Integer.toString(startTime);		// ������ ��쿡�� �ð��� ���ڸ� ���·� ������ ������ ���� �� �״�� ���ڿ� ���·� ����
				 
				if(endTime >= 0 && endTime <= 9)			// 0 < ȸ�� ������ �ð�(hour) <= 9 �� ��� 
					et = "0"+Integer.toString(endTime);		// ��¹� ���°� �� �ڸ��� ���� �� �ֵ��� �տ� "0" �߰��ؼ� �� ����
				else 
					et= Integer.toString(endTime);			// ������ ��쿡�� �ð��� ���ڸ� ���·� ������ ������ ���� �� �״�� ���ڿ� ���·� ����

				if(endMinute >= 0 && endMinute <= 9)		// ȸ�� ������ �ð��� ��(minute)�� 0~9 ���ڸ� ������ ���ð��	
					em = "0"+Integer.toString(endMinute);   // ��¹� ���°� �� �ڸ��� ���� �� �ֵ��� �տ� "0" �߰��ؼ� �� ����
				else 
					em = Integer.toString(endMinute);		// �� ���� ��� ���� �� �״�� ���ڿ� ���·� ����

				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);  // ������ ������ ���۽ð�, ���ð�(hour, minute) �� ���
				startTime += 2;										// 1���� ��� 2�ð� ���� ��̱� ������ 2�� ������
			}
		}

		else if (tempScreen == 2)	//-- 2�� 5ȸ�� ��� (3�ð� ���� �)
		{
			for (int i=0; i<5; i++)	// 0~4 �ݺ� (5ȸ)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%dȸ�� : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);			
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 3;		// 2�� ��ð� 3�ð� ����
			}
		}

		else if (tempScreen == 3)	//-- 3�� 3ȸ�� ��� (4�ð� ���� �)
		{
			for (int i=0; i<3; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%dȸ�� : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 4;		// 3�� ��ð� 4�ð� ����
			}
		}
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=================================================");
		System.out.println();
		System.out.print("ȸ�� ���� : ");

		sel = sc.nextInt();
		tempRound = sel;		// ����ڰ� ������(�Է���) ȸ�� ���� tempRound ������ ����

		// 1���� ��
		if (tempScreen == 1)
		{
			// sel�� 1~7ȸ�� �ƴ� ��			// sel�� ���ǹ��� �ش����� ������ sel�� �׳� tempRound�� �״�ζ� switch������ �ٷ� �̵�!
			if (!(sel>0 && sel<8))				// ����ڰ� 1,2,3,4,5,6,7 �� �ϳ��� ���� ȸ���� �Է��ϸ� �Ʒ� ����ġ������ inwonPick() �� ȭ����ȯ
			{
				sel = 8;	// sel(����ڰ� �Է��� ȸ�� ��) �� 8�� �����ϰ���!
			}
		}

		// 2���� ��
		else if (tempScreen == 2)
		{
			// sel�� 1~5ȸ�� �ƴ� ��
			if (!(sel>0 && sel<6))
			{
				sel = 8;
			}
		}

		// 3���� ��
		else if (tempScreen == 3)
		{
			// sel�� 1~3ȸ�� �ƴ� ��
			if (!(sel>0 && sel<4))
			{
				sel = 8;
			}
		}

		switch(sel)	// sel�� 8�� �Ź���!
		{
			case 0: UmenuDisp(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: 
					inwonPick(); break;
			default: roundPick(); break; // 0~7 �̿��� �� �Է� �� roundPick() ȭ������ ��ȯ(���Է�)
		}
	} //end roundPick method


	// [ȸ�� �Ǵ� ��ȭ ����] (F,3)
	public void inwonPick() throws IOException
	{
		MovieData selMovie = screen[tempScreen-1];	// �󿵰��� ����� ��ȭ������ �������� ���� ����
		int si = (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1);	//-- ȸ���� �¼����� (0~6: 1�� ȸ��, 7~11: 2�� ȸ��, 12~14: 3�� ȸ��)
																		// (0,1,2,3,4,5,6) �� 7ȸ 1�� // (7,8,9,10,11) �� 5ȸ 2�� // (12,13,14) �� 3ȸ 3��
		//        --------------------------------- (�պκ�)
		//											    ------------- (�޺κ�)
		// �տ��� ����ڰ� ������ ��ȭ�� �ش��ϴ� �󿵰� ����(tempScreen)�� ����
		// 1���� ���(tempScreen = 1) ����ڰ� 0~6 �Է��� ��� ����(�� 7ȸ), (tempScreen-1) �� �պκ��� 0 ������ ����� �ڿ� (tempRound-1) �κп��� 0~6 ���� ���� �� �ֵ��� ó��
		
		// 2���� ��� ����ڰ� 7~11 �Է��� ��� ����(�� 5ȸ), (tempScreen-1) �� �պκ��� 1 ������ ����� 
		// 2���� ȸ���� 7���� ���� �� �ֵ��� (7+(2-tempScreen)) ���� 7�� �����־���
		//								1 *  (7+(2-     2    )) = 7,  �պκ� 7 ������ ���õǱ� ������
		// �׷��� �ϸ�							+ (tempRound-1) �κп��� 7~11 ���� ���� �� ����

		// 3���� ��� ����ڰ� 12~14 �Է��� ��� ����(�� 3ȸ), (tempScreen-1) �� �պκ��� 2 ������ �����
		// 3���� ȸ���� 12���� ���� �� �־����, (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1)
		//												2       *  7+(  2 -  3)  
		//										 ----------------------------------- �պκ� 12 ������ �����Ǳ⿡ (tempRound-1) �κ��� 12~14 ���� ���� �� ����
													
		// tempScreen = 1,2,3 ���� ��� ����

		
		int startTime = 9;	//-- start time ����� �ð� 9��
		
		if (si >= 0 && si < 7)		// 0,1,2,3,4,5,6,7 => 1��
		{
			startTime += (2*si);	// ��ð� 2�ð� ����
		}
		else if(si >= 7 && si < 12)	// 7,8,9,10,11 => 2��
		{
			startTime += (3*(si-7)); // ��ð� 3�ð� ����
		}
		else if(si >= 12 && si < 15) // 12,13,14 => 3��
		{
			startTime += (4*(si-12)); // ��ð� 4�ð� ����
		}

		int endTime = (startTime*60 + selMovie.playTime) / 60;	//-- end time
		int endMinute = (startTime*60 + selMovie.playTime) % 60; //-- end minute

		int leftSeat = 25;	//-- ���� �� �¼� ��
		boolean[][] seatInfo = seatInfos[si];

		for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					leftSeat--;		//-- ������ �¼� ����		                                
            }            
        }

		String st = "";
		String et=  "";
		String em = "";
		if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
		if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
		if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);

		tempTime = st + ":00 ~ " + et + ":" + em;
						  
		System.out.println();
		System.out.println("[�����ϱ�]=======================================");
	    System.out.println();
	    System.out.println(selMovie.title + "(" + selMovie.grade + ")");
	    System.out.println(tempTime);
	    System.out.println();
	    System.out.println("�����ο��� �Է����ּ���.");
	    System.out.println("�ܿ� �¼� : " + leftSeat);
	    System.out.println();   
	    System.out.println("-1. ���� �޴��� ���ư���");	// ������ 0���� ���� ���� �ϴ� 5�� ����
	    System.out.println("=================================================");
	    //System.out.println();


		// �Ʒ��� �������� ���������̱⿡ �޼ҵ� �����Խ� ���� ������ ��� ���� ��. ���� �ʱ�ȭ �ʿ�!
	    adult = 0;
	    teenager = 0;
	    kid = 0;

	    System.out.print("���� : ");
	    adult = sc.nextInt();
	    if (adult == -1)
		{
			roundPick();  //-- ����ȭ�� ���
			return;
		}
	    System.out.print("û�ҳ� (~18) : ");
	    teenager = sc.nextInt();
	    if (teenager == -1)
		{
			roundPick();  //-- ����ȭ�� ���
			return;
		}
	    System.out.print("��� (~14) : ");
	    kid = sc.nextInt();
	    if (kid == -1)
		{
			roundPick();  //-- ����ȭ�� ���
			return;
		}
		

	    switch (selMovie.grade)
	    {
			case 19: if (teenager != 0 && kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			case 15: if (kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			default: break;
	    }

	    total = adult + teenager + kid;
		System.out.println(total);
	   
	    // [�󿵰����� ���� �ο� �Է� ��] (G,6)
	    if (total > 25)
	    {					
			System.out.println();
			System.out.println("[�����ϱ�] ======================================");
			System.out.println();
			System.out.println("�ش� �󿵰��� �¼����� �����մϴ�.");
			System.out.println("�ٽ� �������ּ���.");
			System.out.println();
			System.out.println("=================================================");
			//System.out.println();

			inwonPick();
	    }

	    seatPick();
		//if(p_id.equals(UserMenu.MOVIEROUND)) return;

   } //end inwonPick method


	// [�� �Ұ� ���ɴ� ���� ��] (G,2) > ������ �޴����� ��� ������� ���ǹ� �Ἥ inwonPick() �ȿ� �ֱ�
	public void adultMovie(String title, int age) throws IOException
	{					
		System.out.println();
		System.out.println("[�����ϱ�] ======================================");
		System.out.println();
		System.out.println(title + "��(��)" + age + " �� �̸� �����Ұ� ��ȭ�Դϴ�.");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("=================================================");
		//System.out.println();
		//System.out.println();

		inwonPick();
	} //end adultMovie method


	// �¼� �����ִ� �޼ҵ� ���� (G,3)
	public void showSeat(boolean[][] seatInfo) throws IOException
	{
		System.out.println();
		System.out.println("�ء�� ǥ�õ� �¼��� ����� �¼��Դϴ�.\n");    
		System.out.println("====== ��ũ�� ======");
		System.out.println();
        for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					System.out.print("[��]");
                else                                     
					System.out.print("[" + (char)(65 + i) + (j+1) + "]");                                 
            }
            System.out.println();
        }
		//System.out.println();
	}

	// [�ο� �Է�] (G,3)
	// �¼� ���� �޼ҵ� ���� (�޼ҵ� ����: seatPick)
	public void seatPick() throws IOException
	{
		//�� �󿵰� ȸ���� �¼������� ó���ϱ� ���� 0~6�� 1���� �� ȸ��, 7~11�� 2���� �� ȸ��, 12~14�� 3���� �� ȸ��
		int si = (tempScreen-1) * (7 + (2-tempScreen)) + (tempRound-1);

		// ������ �¼��� �������� �迭�� ��� ���� ����
		int[] rows = new int[total];
		int[] cols = new int[total];

		boolean isFirst = true;
		tempSeat = "";

		for (int i=0; i<total; i++)
		{
			if (isFirst)
			{
				showSeat(seatInfos[si]);
				isFirst = false;
			}
			System.out.println();
			System.out.println("���ϴ� �¼��� �������ּ���. [���ĺ� �빮�ڷ� �Է����ּ���.]");
			System.out.println("�� �ο��� " + total + "���Դϴ�.");
			System.out.print("�¼� �Է�: ");
			
			String s = sc.next();

			//do
			//{
			//	System.out.print("�¼� �Է�: ");
			//	s = sc.next();
			//}
			//while (s.charAt(0)<65 && s.charAt(0)>90 || s.charAt(1)<49 && s.charAt(1)>53);
			
			int row = s.charAt(0) - 65;	//-- ��
			int col = s.charAt(1) - 49;	//-- ��
			 
			if (seatInfos[si][row][col])
			{
				redun();
				i--;
			}
			else
			{
				seatInfos[si][row][col] = true;
				if (i == total-1)
				{
					tempSeat += s;
				}
				else
				{
					tempSeat += (s + ", ");
				}
				rows[i] = row;
				cols[i] = col;
			}
			showSeat(seatInfos[si]);
		}

		payCheck(si, rows, cols);

	} //end seatPick method


	// [�¼� �ߺ�] (H,3)
	public void redun()
	{					
		System.out.println();
		System.out.println("[�����ϱ�] ======================================");
		System.out.println();
		System.out.println("�̹� ���õ� �¼��Դϴ�");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println ("=================================================");
		//System.out.println();
	}

	// [�¼� ���� ����] (H,4)
	public void payCheck(int si, int[] rows, int[] cols) throws IOException
	{
		
		reservNumber();		//-- ���� ����
		String str="";		//-- ���ڿ� ���� ����
		str = reservedNum.lastElement();	//-- ������ ���Ź�ȣ�� str ������ ������ ����(�ؿ� ��������� ��� ����ó�� �ϱ� ����)
						
		System.out.println();
		System.out.println("[�����ϱ�] ======================================");
		System.out.println();
		System.out.print  ("���Ź�ȣ : " + str);	//-- ���Ź�ȣ �ҷ��ͼ� �����ؾ� ��
		System.out.println();
		System.out.println("��ȭ     : " + tempTitle);
		System.out.println("�ð�     : " + tempTime);
		System.out.println("�󿵰�   : " + tempScreen + "��");
		System.out.println("�ο�     : " + total + "��");
		System.out.println("�¼�     : " + tempSeat);
		System.out.println();
		System.out.println("=================================================");
		
		System.out.print("�����Ͻðڽ��ϱ�? (Y/N) :");

		String sel2 = sc.next();

		//System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			// ���� ȭ�鿡�� ��µǴ� ������(���Ź�ȣ, ��ȭ����, �ð�, �󿵰�, �ο�, �¼�)�� ReserwvedData ���� ������ ����
			ud.add(new ReservedData(str, tempTitle, tempTime, tempScreen, total, tempSeat)); 
			endReserv(str); //-- ���Ű� �Ϸ�Ǿ��ٴ� ���� ����ϴ� ȭ����ȯ
		}
		
		// ������ �޴��� ���ư��� (I,5)
		else if (sel2.equals("n") || sel2.equals("N"))
		{	
			reservedNum.remove(str);		// ���Ÿ� ����Ͽ����Ƿ� ���Ź�ȣ�� ����Ǿ��ִ� reservedNum ���ͱ������� ���� ������	
			
			for(int i=0; i<total; i++)		// �Է��ߴ� �ο� �� ��ŭ
			{
				int row = rows[i];			// ����Ǿ��� �� ��
				int col = cols[i];			// ����Ǿ��� �� ��
				seatInfos[si][row][col] = false;	// ture ���� �� false �� �����Ͽ� ������ �¼������� ������
			}
			UmenuDisp();
		}
		else		
		{
			reservedNum.remove(str);		// �����ߴ� ���Ź�ȣ ����
			System.out.println("\n�������� �ʴ� ����Դϴ�.");
			payCheck(si, rows, cols);		// payCheck ȭ�� ȣ��(���Է�)	
		}

	} //end payCheck method

	
	// �¼� ���� ��ɿ��� Y ���� �� ȭ��(I,4)
	public void endReserv(String resNum) throws IOException		
	{
		System.out.println("\n[�����ϱ�] ======================================");												
		System.out.println();
		System.out.printf("���Ź�ȣ : %s", resNum);	// ���� ȭ�鿡�� �ο��ߴ� ���Ź�ȣ �� ����
		System.out.println();
		System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println("=================================================");
		System.out.print("0. ������ �޴��� ���ư��� : ");

		sel = sc.nextInt();
		//System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp();	//-- ����ȭ�� ���(��������� ó�� ȭ��)
		}
	} //end endReserv method


	// ���� �󿵰��� ��ϵ� ��ȭ ���� ����ϴ� �޼ҵ�
	public void movieList()
	{
		//�󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("��ȭ ���� : %s, �󿵰�: %d��\n", screen[i].title, (i+1));
		}
	}

// ============================================================ �� �����ϱ�	
} //end User class