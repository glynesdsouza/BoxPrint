
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Statement to Print : ");
	    String str = sc.nextLine();
		System.out.println("Box Character : ");
		String c = sc.nextLine();
		Main.print(str,c);
	}
	
	public static void print(String str, String c){
	   List<String> strs =  Arrays.asList(str.split(" "));
	   int maxLen = 0;
	   for(String s : strs) {
	       if(s.length()> maxLen){
	           maxLen = s.length();
	       }
	   }
	   StringBuilder star = new StringBuilder("");
	   for(int i=0;i<maxLen+4;i++){
	       star.append(c);
	   }
	   System.out.println(star);
	   
	   for(int i=0;i<strs.size();i++){
	       
	       System.out.print(c+" ");
	       System.out.print(strs.get(i));
	       for(int j=0;j<(maxLen-strs.get(i).length());j++)
	            System.out.print(" ");
	       System.out.println(" "+c);
	       
	   }
	   System.out.println(star);
	}
}

//Output:
//****************
//* welcome	     *
//* to		     *
//* freespace!!! *
//****************