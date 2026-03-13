import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){

        int gc=sc.nextInt();
        int pc=sc.nextInt();

        int p=sc.nextInt();
int c1=0;
int c2=0;

for(int i=0;i<p;i++){
    int a=sc.nextInt();
    int b=sc.nextInt();

    if(a==1){
        c1++;
    }
    if(b==1){
        c2++;
    }
}

int cost1 = c1 * gc + c2 * pc;
            int cst2 = c1 * pc+ c2 * gc;

            System.out.println(Math.min(cost1, cst2));

}
    }
}
