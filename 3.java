/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//factorial
// 		int n=4,count=1;
// 		for(int i=n;i>=1;i--){
// 		    count=count*i;
// 		}
// 		System.out.println(count);
//anagram
        String str1="race";
        String str2="care";
        if(str1.length()!=str2.length()){
            System.out.println("not");
        }else{
            char[] c1=str1.toLowerCase().toCharArray();
            char[] c2=str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            // System.out.println(c1);
            // System.out.println(c2);
        }
 	}

}
