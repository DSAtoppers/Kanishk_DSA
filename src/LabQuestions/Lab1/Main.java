package LabQuestions.Lab1;

import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
        int p,r,n;
        Scanner t1=new Scanner(System.in);
        p=t1.nextInt();
        Scanner t2=new Scanner(System.in);
        r=t2.nextInt();
        Scanner t3=new Scanner(System.in);
        n=t3.nextInt();
        if(Math.pow(1+r,n)!=1){
            System.out.println(p*r*Math.pow(1+r,n)/(Math.pow(1+r,n)-1));
        }
        else{
            System.out.println("Roots are Imaginary!");
        }
    }
}

