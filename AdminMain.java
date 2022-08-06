import java.io.IOException;

public class AdminMain extends AdminCall
{
	public static void main(String[] args) throws IOException
	{
		//new MovieManagement();
		//new MovieManagement();
		//ScreenManagement sm = new ScreenManagement();
		//AdminCall ac = new AdminCall();

		vt.add(new MovieData("범죄도시2", 19, 80));
		vt.add(new MovieData("탑건2", 15, 70));
		vt.add(new MovieData("미니언즈2", 0, 60));

		AmenuDisp();
	}
}