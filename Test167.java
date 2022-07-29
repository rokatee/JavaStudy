/*
■■■ 컬렉션(Collection) ■■■
*/

/*
List → String[] : List.toArray();
String[] → List : Arrays.asList();
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Test167
{
	public static void main(String[] args)
	{
		List<String> mList = new ArrayList<String>();

		mList.add("1");
		mList.add("2");
		mList.add("3");

		// List → String[]
		//mList.toArray(new String[100]);
		String[] sArrays = mList.toArray(new String[mList.size()]);

		for (String s : sArrays)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		// → 1 2 3


		// String[] → List
		List<String> mNewList = Arrays.asList(sArrays);
		// → Arrays.asList() 의 반환 자료형은 List
		
		for (String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		// → 1 2 3
		
	}
}