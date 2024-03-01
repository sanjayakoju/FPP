package lesson2.arraydemo;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] teams={
				{"Joe", "Bob", "Frank", "Steve"},
				{"Jon", "Tom","David"},
				{"Tim", "Bev"},
				};
			
			int len = 0;
			int y = teams.length; // provide number of rows
			System.out.println("Number of Rows : " + y);
		for(int i=0;i<y;i++)
				len = len + teams[i].length;
			System.out.println("Length of team Array : " + len);

	}

}
