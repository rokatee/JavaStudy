//�׸��� �迭�� ���䵵 ����
//���� ���� �������� ���䵵 Ȯ��

//���������� WekkdayŬ���� ���踦 ����
//main() �޼ҵ尡 ���������� ����� �� �ְ� �Ѵ�.

//���� ��)
//�� �� �� �Է� ���鱸��


//��Ʈ
//1�� 1�� 1�� = "������"
//1���� 365���� �ƴϴ�
//������ �Ǻ����� 4�� ����̳� 100�� ����� �ƴϰų�  400�� ����̸� ����
//���� = 366�� ��� = 365��


import java.util.Scanner;

class WeekDay_2
{
	private int year;
	private int month;
	private int day;
	private String type;

	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� �Է�:");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();

	}

	//�ϴ� ���� ����

	//������ ���� 4 && 100 != || 400
	//��� else

	//�׷� ���⵵ ������ ��� ������ ����� ���� ���ϼ��� ���ϱ�
	//

	//�迭�� ��ȭ���������
	//7�� ���� �������� 1�̸� �� �� 0�̸� ��

	//�ʿ��� �޼ҵ�
	//���� ��� ���� �޼ҵ�
	//���� ��� ��� �����ؼ� �ش�⵵�� ���⵵������ �ϼ��� ���ϴ� �޼ҵ�
	//7�� ������ ���� ��ȯ�ϴ� �޼ҵ�
	//��ȯ���� �Է¹޾Ƽ� �迭���� ������ ���� ����ϴ� �޼ҵ�


	void deciYear()
	{
		

		if(year%4==0 && year%100!=0 || year%400==0)
		{
			type = "����";
		}
		else
		{
			type = "���";
		}
	}



	int mathDay()
	{
		int numDay=0;

		for(int i=1;i<year;i++)
		{
			if(i%4==0 && i%100!=0 || i%400==0)
			{
				numDay+=366;
			}
			else
			{
				numDay+=365;
			}
		}


		int numMonth[] = {31,0,31,30,31,30,31,31,30,31,30,31};
		
		switch(type)
		{
			case "����" : numMonth[1] = 29;break;
			case "���" : numMonth[1] = 28;break;
		}

		
		for(int i=0;i<month-1;i++)
		{
			numDay += numMonth[i];		
		}


		numDay += day;

		return numDay%7;

	}

	void printDay(int num)
	{
		String[] nameDay={"��","��","ȭ","��","��","��","��"};

		System.out.println("�Է��Ͻ� ��¥�� "+nameDay[num]+"���� �Դϴ�");

	}
}


public class Test099_2
{
   public static void main(String[] args)
   {
		WeekDay_2 ob = new WeekDay_2();
		ob.input();
		ob.deciYear();
		int day = ob.mathDay();
		ob.printDay(day);
   }
}