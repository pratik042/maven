package arrays;

public class add2_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// so here we are going to add two arrays

int arr1[][]= {{1,2,3},{3,4,5}};
int r[]= {1,2,3};
for(int k:r)
{
//	System.out.println(k);
}
//lets print this
for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
	{System.out.print(arr1[i][j]+" ");
	}
System.out.println();
}
System.out.println("====================");

for(int k=0;k<2;k++)
{
for(int l=0;l<3;l++)
{
System.out.println(arr1[k][l]+"  ");
}System.out.println(   );
}


	}

}
