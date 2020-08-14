package arrays;

public class add1_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[][]= {{1,2,3},{4,5,6}};
int a[][]= {{1,2,3},{4,5,6}};
int b[][]= {{2,3,4},{1,4,8}};	
int c[][]=new int[2][3];//making new arr c of 2 row and 3 column

//printing array a
for(int k=0;k<2;k++)
{
for(int l=0;l<3;l++)
{
System.out.print(a[k][l]+"  ");
}System.out.println(   );
}System.out.println(" ");

// printing array of b
for(int v=0;v<2;v++)
{ for(int x=0;x<3;x++)
{
System.out.print(b[v][x]+"  ");
}System.out.println(   );
}


System.out.println("\n");
// adding matrix
//int a[][]= {{1,2,3},{4,5,6}};
//int b[][]= {{2,3,4},{1,4,8}};	
System.out.println("after adding");
for(int i=0;i<2;i++)//for rows
{     for(int j=0;j<3;j++)//for column
{
	     c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+"     ");
}
System.out.println( );
}
	}

}
