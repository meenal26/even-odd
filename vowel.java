package consonant;
import java.util.Scanner;
public class consonant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		char c=s.next( ).charAt(0);		 
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
		System.out.println("the character is "+c+"vowel");
		}
		else if((c>='a'&&c<='z')||(c>='A'&&c<'Z'))
		System.out.println("the character is"+c+"consonant");
		else
				System.out.println("Not an alphabet");		
			}
		}
		
