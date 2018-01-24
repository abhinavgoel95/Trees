public class Trees
{
	int left[] = new int[5];
	int right[] = new int[5];
	String key[] = new String[5];
	int root = 0;
	public void make(String s)
	{
		for(int i = 0; i <s.length(); i++)
		{
			key[i] = s.charAt(i)+ "";
		}
	//	int k = 0;
		for(int j =0; j<5;j++)
		{
			if((2*j + 1) < 5)
				left[j] = 2*j +1;
			else
				left[j] = -1;
		}
		for(int j =0; j<5;j++)
		{
			if((2*j + 2) < 5)
				right[j] = 2*j +2;
			else
				right[j] = -1;
		}
	}
	public void inor()
	{
		int temp = root;
		in(temp);
	}
	private void in(int temp)
	{
		if(temp != -1)
		{
			in(left[temp]);
			System.out.print(key[temp]+ " ");
			in(right[temp]);
		}
	}
	public void disp()
	{
		for(int i =0; i<5;i++)
		{
			System.out.println(left[i] +" " + key[i] + " "+ right[i]);
		}
	}
	public void postor()
	{
		int temp = root;
		posR(temp);
	}
	private void posR(int temp)
	{
		if(temp != -1)
		{
			posR(left[temp]);
			posR(right[temp]);
			System.out.print(key[temp]+ " ");
		}
	}
}