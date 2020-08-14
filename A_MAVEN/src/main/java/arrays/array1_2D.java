package arrays;

public class array1_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//                     i=0~ 1st-row,   i=1~2nd-row,  i=2~3rd-row,  i=3~4th-row,  i=4~5th-row
//                     j=0~1st col       j=1~2nd col     j=2~3rd col    j=3~4th col 	
		int a[][]= {   {1,2,3},     {4,5,6},              {7,8,9},           {10,11,12},        {13,14,15}};//making multidimensional ararry,5 rows and 3 column
		for(int i=0;i<5;i++)//this for loop is for rows
		{
			for(int j=0;j<3;j++)//this for loop for rows
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println(  );
		}
		
		
		
	}

}
