import java.io.IOException;

public class Main extends MainCall
{
	public static void main(String[] args) throws IOException
	{
		//new MovieManagement();
		//new MovieManagement();
		//ScreenManagement sm = new ScreenManagement();
		//AdminCall ac = new AdminCall();

		//vt.add(new MovieData("범죄도시2", 19, 80));
		//vt.add(new MovieData("탑건2", 15, 70));
		//vt.add(new MovieData("미니언즈2", 0, 60));

		// 관리자가 만든 영화정보가 만들어 졌다는 가정
		//MovieData[] screen = new MovieData[3];

		//screen[0] = new MovieData("범죄도시2", 19, 80);
		//screen[1] = new MovieData("탑건2", 15, 70);
		//screen[2] = new MovieData("미니언즈2", 0, 60);

		//UserCall uc = new UserCall();
		//uc.setScreen(screen);	// 영화정보 입력해주는거
			
		MainCall mc = new MainCall();

		mc.firstMenu();
		//startProcess();		// 유저 시작
		//AmenuDisp();		// 관리자 시작
	}
}
 
