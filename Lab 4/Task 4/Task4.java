class Task4
{
	public static void main(String args[])
	{
	int [][]arr= {{1,2},{3,4}};
	int [][]ara= {{1,2},{3,4}};
	int [][]raa= new int[2][2];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			raa[i][j]=arr[i][j]+arr[i][j];
		}
	}
	for(int k=0;k<raa.length;k++)
	{
		for(int l=0;l<raa[k].length;l++)
		{
			System.out.println("raa["+k+"]["+l+"] = "+raa[k][l]);
		}
	}
	}
}