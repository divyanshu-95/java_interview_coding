/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    //5.fibonacci
// 		int n1=0,n2=1,n3,num=10; 
// 		System.out.print(n1+" "+n2);
// 		for(int i=2;i<=num;++i){
// 		    n3=n1+n2;
// 		    System.out.print(" "+n3);
// 		    n1=n2;
// 		    n2=n3;
// 		}
        //6.in list only odd no
        // int arr[]={1,2,3,4,5};
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         System.out.println("even here");
        //         break;
        //     }
        // }
        //7.palindrome
        // String s="1213";
        // StringBuffer b=new StringBuffer(s);
        // b.reverse();
        // String str=b.toString();
        // if(s.equals(str)){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }
        //8.remove white spaces
        String str="    This is Me";
        // String str2=str.replaceAll(" ","");
        // System.out.println(str2);
        char[] arr=str.toCharArray();
        String str2="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                str2 = str2+arr[i];
            }
        }
        System.out.println(str2);
	}
}
