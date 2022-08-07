import java.io.IOException;

public class testMain extends AdminCall
{
	public static void main(String[] args) throws IOException
	{
		// 관리자가 만든 영화정보가 만들어 졌다는 가정
		MovieData[] screen = new MovieData[3];

		screen[0] = new MovieData("범죄도시2", 19, 80);
		screen[1] = new MovieData("탑건2", 15, 70);
		screen[2] = new MovieData("미니언즈2", 0, 60);

		User u = new User();
		u.setScreen(screen);	// 영화정보 입력해주는거
		u.startProcess();		//유저 시작
	}
}