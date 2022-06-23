
public class qllSubSetofString {
public static void main(String[] args) {
	

	String s = "FUN";
	int len = s.length();
	int temp = 0;
	
	//All the possible subsets for a string will be n(n+1)/2.

	String arr[]= new String[len*(len+1)];
	
	int i;
	for(i=0;i<len;i++);
	{ 
		int j;
		for(j=i;j<len;j++)
		{
		arr[temp]=s.substring(i, j+1);
		temp++;
		}
		
	}
	System.out.println("All subsets are given bellow");
	for (int i1=0;i<arr.length;)
	{
		System.out.println(i1);
	}
	
}
}
