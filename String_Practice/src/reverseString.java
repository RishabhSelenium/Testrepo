
public class reverseString {
	
	
public String reverse(String s)
{
	String a = s;
	String reverseStr = "";
	int strLength = a.length();
    for (int i = (strLength - 1); i >=0; --i) {
			      reverseStr = reverseStr + a.charAt(i);
			    }
    return reverseStr;
	}

static String revesreWord(String s)
{
	return s;
	
	}

public static void main(String[] args) {
	reverseString rs = new reverseString();
	String a = rs.reverse("avi");
	System.out.println(a);
	
}

}

