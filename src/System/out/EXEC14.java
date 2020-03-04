package System.out;

import java.util.Arrays;

public class EXEC14 {

	public static void main(String[] args) 
	{
int a[]= {5,4,3,2,1};
int b[]= {1,2,3,4,5};
int c[]=new int[5];
for(int i=0;i<a.length;i++)
{
	c[i]=a[i]+b[i];
}
System.out.print(Arrays.toString(c));
	}

}
