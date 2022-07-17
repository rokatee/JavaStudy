//그리고 배열의 개념도 적용
//접근 제어 지시자의 개념도 확인

//최종적으로 Wekkday클래스 설계를 통해
//main() 메소드가 정상적으로 실행될 수 있게 한다.

//실행 예)
//년 월 일 입력 공백구분


//힌트
//1년 1월 1일 = "월요일"
//1년은 365일이 아니다
//윤년의 판별조건 4의 배수이나 100의 배수는 아니거나  400의 배수이면 윤년
//윤년 = 366일 평년 = 365일


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
		System.out.print("년 월 일 입력:");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();

	}

	//일단 먼저 생각

	//윤년의 조건 4 && 100 != || 400
	//평년 else

	//그럼 전년도 까지의 평년 윤년의 결과를 통해 총일수에 더하기
	//

	//배열에 월화수목금토일
	//7로 나눈 나머지가 1이면 월 즉 0이면 일

	//필요한 메소드
	//윤년 평년 구분 메소드
	//윤년 평년 결과 구분해서 해당년도의 전년도까지의 일수를 구하는 메소드
	//7로 나누는 값을 반환하는 메소드
	//반환값을 입력받아서 배열에서 요일을 꺼내 출력하는 메소드


	void deciYear()
	{
		

		if(year%4==0 && year%100!=0 || year%400==0)
		{
			type = "윤년";
		}
		else
		{
			type = "평년";
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
			case "윤년" : numMonth[1] = 29;break;
			case "평년" : numMonth[1] = 28;break;
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
		String[] nameDay={"일","월","화","수","목","금","토"};

		System.out.println("입력하신 날짜는 "+nameDay[num]+"요일 입니다");

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