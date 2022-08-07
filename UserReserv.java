import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;
import java.io.IOException;

	
//========================================================================(A)

public class UserReserv extends UserCall
{

	// ���Ź�ȣ ���� �޼ҵ�
	public void reservNumber()
	{
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

		for (int cnt=0; cnt<10; cnt++)	// 0 ~ 9
		{
			n = rd.nextInt(10);			// 0 ~ 9 �� ������ ����
			num[cnt] = n;         
		}

		String str = "";
		str = Arrays.toString(num).replaceAll("[^0-9]","");		//-- num[10] ������ �迭 ���� ���ڿ��� ��ȯ�Ͽ� str ������ ����

		// ������ ù ��° �� ���� ���� �Ǵ��ϱ�
		if (reservedNum.firstElement() == null)
		{
			reservedNum.add(str);	//-- ���� ��, �ϴ� ����
		}
		else if (reservedNum.contains(str) == false)	//-- ���� ��, �� ���� ���� ����Ǿ� �ִ��� Ȯ�� �� ����
		{
			reservedNum.add(str);	//-- str �� ���Ϳ� �߰�			
		}

	} //end reservNumber method


	// 1. [��ȭ] ���� �� ���� �޴� (D,2)
	public void moviePick() throws IOException
	{
		System.out.println();
		System.out.println("[�����ϱ�] ======================");
		System.out.println();
		//System.out.println("�����ڰ� ����� ��ȭ ��� ���");
		
		// �󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i] != null)	// �󿵰��� ��ȭ�� ��ϵǾ� ���� ��쿡��
			{
				System.out.printf(" �󿵰�: %d��\n ��ȭ ���� : %s(%d)\n", (i+1), screen[i].title, screen[i].grade);
				System.out.println();
			}		
		}
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=================================");
		System.out.println();
		System.out.print("�����Ͻ� ��ȭ������ �Է����ּ��� : ");

		tempTitle = sc.next();	//-- ��ȭ���� �˻� �� ���ڿ� ���ϱ� ���� String ������ tempTitle �̶�� ������ ����
		System.out.println();

		if (tempTitle == "0")
		{
			UmenuDisp(); //-- ����ȭ�� ���(��������� ó�� ȭ��)
		}
		System.out.println();

		// ����ڰ� �Է��� ���� �󿵰� �� ���� ������ ���
		for (int i = 0; i < screen.length; i++)
		{
			if (screen[i].title != null)
			{
				if (tempTitle.equals(screen[0].title) || tempTitle.equals(screen[1].title) || tempTitle.equals(screen[2].title))
				{
					roundPick();
				}
				else
				{
					System.out.println("�Է� ���� �߸��Ǿ����ϴ�");
					System.out.println("�ٽ� �Է����ּ���");
					System.out.println();
					moviePick();	//-- ���� ȭ�� ȣ�� (���Է�)
				}
			}
		}
	
	} //end moviePick method


	// [��ȭ����] �� ȸ�� ���� (E,2)
	public void roundPick() throws IOException
	{
		System.out.println("[�����ϱ�] ============");
		System.out.println();
		
		// ����ڰ� ������ ��ȭ������ ��ϵ� �󿵰� �� ����ϱ�
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i].title.equals(tempTitle))	
			{
				System.out.print(screen[i].title + " ");
				System.out.printf("(%d)\n", screen[i].grade);
				System.out.println();
				System.out.printf("�󿵰� : %d��", (i+1));
				System.out.println();
				
				runTime = screen[i].playTime;	//-- ����ڰ� ������ ��ȭ�� ����Ÿ�� �� ����
				tempScreen = (i+1);				//-- ����ڰ� ������ ��ȭ�� ��ϵ� �󿵰� ���� ���� (�� ������)
				break;
			}		
		}

		int startTime = 9;	

		if (tempScreen == 1)	//-- 1�� 7ȸ�� ��� (2�ð� ���� �)
		{
			for (int i=0; i<7; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	
				int endMinute = (startTime*60 + runTime) % 60;  
				System.out.printf("%dȸ�� : ", (i+1));
				String st = "";		//-- start time
				String et=  "";		//-- end time
				String em = "";		//-- end minute
				if(startTime == 9) 
					st = "0"+Integer.toString(startTime); 
				else 
					st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) 
					et = "0"+Integer.toString(endTime); 
				else 
					et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) 
					em = "0"+Integer.toString(endMinute); 
				else 
					em = Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 2;
			}
		}

		else if (tempScreen == 2)	//-- 2�� 5ȸ�� ��� (3�ð� ���� �)
		{
			for (int i=0; i<5; i++)
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
				startTime += 3;
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
				startTime += 4;
			}
		}
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=======================");
		System.out.println();
		System.out.print("ȸ�� ���� : ");

		sel = sc.nextInt();
		tempRound = sel;
		System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); break; // ����ȭ�� ���(��������� ó�� ȭ��)
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: 
					inwonPick(); break;
			default: roundPick(); break;
		}
	} //end roundPick method


	// [ȸ�� �Ǵ� ��ȭ ����] (F,3)
	public void inwonPick() throws IOException
	{
		MovieData selMovie = screen[tempScreen-1];
		int si = (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1);	//-- ȸ���� �¼����� (0~6: 1�� ȸ��, 7~11: 2�� ȸ��, 12~15: 3�� ȸ��)
		int startTime = 9;	//-- start time
		
		if (si >= 0 && si < 7)
		{
			startTime += (2*si);
		}
		else if(si >= 7 && si < 12)
		{
			startTime += (3*(si-7));
		}
		else if(si >= 12 && si < 15) 
		{
			startTime += (4*(si-12));
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

		System.out.println("[�����ϱ�]==============");
	    System.out.println();
	    System.out.println(selMovie.title + "(" + selMovie.grade + ")");
	    System.out.println(tempTime);
	    System.out.println();
	    System.out.println("�����ο��� �Է����ּ���.");
	    System.out.println("�ܿ� �¼� : " + leftSeat);
	    System.out.println();   
	    System.out.println("-1. ���� �޴��� ���ư���");	// ������ 0���� ���� ���� �ϴ� 5�� ����
	    System.out.println("========================");
	    System.out.println();


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
			System.out.println("[�����ϱ�] =======================");
			System.out.println();
			System.out.println("�ش� �󿵰��� �¼����� �����մϴ�.");
			System.out.println("�ٽ� �������ּ���.");
			System.out.println();
			System.out.println("==================================");
			System.out.println();

			inwonPick();
	    }

	    seatPick();
		//if(p_id.equals(UserMenu.MOVIEROUND)) return;

   } //end inwonPick method


	// [�� �Ұ� ���ɴ� ���� ��] (G,2) > ������ �޴����� ��� ������� ���ǹ� �Ἥ inwonPick() �ȿ� �ֱ�
	public void adultMovie(String title, int age) throws IOException
	{
		System.out.println("[�����ϱ�] ===========================================");
		System.out.println();
		System.out.println(title + "��(��)" + age + " �� �̸� �����Ұ� ��ȭ�Դϴ�.");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("======================================================");
		System.out.println();
		System.out.println();

		inwonPick();
	} //end adultMovie method


	// �¼� �����ִ� �޼ҵ� ���� (G,3)
	public void showSeat(boolean[][] seatInfo) throws IOException
	{
		System.out.println();
		System.out.println("�ء�� ǥ�õ� �¼��� ����� �¼��Դϴ�.");      
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
		System.out.println();
	}
	
	// [�ο� �Է�] (G,3)
	// �¼� ���� �޼ҵ� ���� (�޼ҵ� ����: seatPick)
	public void seatPick() throws IOException
	{
		//�� �󿵰� ȸ���� �¼������� ó���ϱ� ���� 0~6�� 1���� �� ȸ��, 7~11�� 2���� �� ȸ��, 12~14�� 3���� �� ȸ��
		int si = (tempScreen-1) * (7 + (2-tempScreen)) + (tempRound-1);

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
			System.out.println("���ϴ� �¼��� �������ּ���. [���ĺ� �빮�ڷ� �Է����ּ���.]");
			System.out.println("�� �ο��� " + total + "���Դϴ�.");
			System.out.print("�¼� �Է�: ");
			String s = sc.next();
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
		System.out.println("[�����ϱ�] ===========");
		System.out.println();
		System.out.println("�̹� ���õ� �¼��Դϴ�");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("======================");
		System.out.println();
	}

	// [�¼� ���� ����] (H,4)
	public void payCheck(int si, int rows, int cols) throws IOException
	{
		reservNumber();		//-- ���� ����
		String str="";		//-- ���ڿ� ���� ����
		str = reservedNum.lastElement();	//-- ������ ���Ź�ȣ�� str ������ ������ ����(�ؿ� ��������� ��� ����ó�� �ϱ� ����)

		System.out.println("[�����ϱ�] =================");
		System.out.println();
		System.out.print  ("���Ź�ȣ : " + str);	//-- ���Ź�ȣ �ҷ��ͼ� �����ؾ� ��
		System.out.println();
		System.out.println("��ȭ     : " + tempTitle);
		System.out.println("�ð�     : " + tempTime);
		System.out.println("�󿵰�   : " + tempScreen + "��");
		System.out.println("�ο�     : " + total + "��");
		System.out.println("�¼�     : " + tempSeat);
		System.out.println();
		System.out.println("============================");
		
		System.out.print("�����Ͻðڽ��ϱ�? (Y/N) :");

		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			ud.add(new ReservedData(str, tempTitle, tempTime, tempScreen, total, tempSeat));
			endReserv(); //-- ���Ű� �Ϸ�Ǿ��ٴ� ���� ����ϴ� ȭ��
		}
		
		// ������ �޴��� ���ư��� (I,5)
		else if (sel2.equals("n") || sel2.equals("N"))
		{	
			reservedNum.remove(str);
			
			UmenuDisp();	
			
			for(int i=0; i<total; i++) 
			{
				int row = rows[i];
				int col = cols[i];
				seatInfos[si][row][col] = false;
			}
		}
		else
		{
			reservedNum.remove(str);
			System.out.println("�������� �ʴ� ����Դϴ�.");
			payCheck(si, rows, cols);
		}

	} //end payCheck method

	
	// �¼� ���� ��ɿ��� Y ���� �� ȭ��(I,4)
	public void endReserv() throws IOException
	{
		System.out.println("[�����ϱ�] ===============");												
		System.out.println();
		System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println("==========================");
		System.out.print("0. ������ �޴��� ���ư��� : ");

		sel = sc.nextInt();
		System.out.println();

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