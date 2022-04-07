package LOOP;

import java.util.Scanner;

public class looping {
    public static  void main(String [] args){
        int n,f=1,i;
        Scanner ab=new Scanner(System.in);
        n= ab.nextInt();
        if(n==0 || n==1){
            System.out.println("the rehult is " +1);
        }else {
            for (i=1;i<=n;i++){
                f=f*i;
            }
            System.out.println("the facct of the number is "+f);
        }
    }
}
