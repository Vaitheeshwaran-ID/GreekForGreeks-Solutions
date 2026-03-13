import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner (System.in);
     int n=sc.nextInt();
     String s=sc.next();
     
     char[] s1=s.toCharArray();

     for(int i=0;i<n;i++){
        if(s1[i]=='.'){
            s1[i]='B';
        }
     }

    System.out.println("YES");
        System.out.println(new String(s1));

    }
}
