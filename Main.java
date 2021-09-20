/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    //1.reverse the string
// 		String str="Divyanshu";
// 		char[] c=str.toCharArray();
// 		for(int i=c.length-1;i>=0;i--){
// 		    System.out.print(c[i]);
// 		}
        //2.swap
        // int a=10;
        // int b=20;
        // b=b+a;//30
        // a=b-a;//20
        // b=b-a;//10
        // System.out.println("a"+a);
        // System.out.println("b"+b);
        //3.vowels and consonants
        // String str="DUivyanshu";
        // str=str.toLowerCase();
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        //4.prime No
        int num=16;
        if(num==0||num==1){
            System.out.println("no");
        }else if(num==2){
            System.out.println("no");
        }
		for(int i=3;i<num/2;num++){
		    if(num%i==0){
		        System.out.println("no");
		        break;
		    }
		}
		System.out.println("yes");
	}
}
