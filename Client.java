public class Client
{
	public static void main(String args[])
	{
		Trees tree = new Trees();
		String s = "abcde";
		tree.make(s);
		tree.inor();
		System.out.println();
		tree.postor();
	}
}