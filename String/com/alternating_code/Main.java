package com.alternating_code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        String s;
        s = sc.nextLine();
        char a[] = new char[50];
        for(i=0;i<s.length();i++){
            a[i] = s.charAt(i);
        }
        for(i=0;(a[i]!='\0');i++){
            if(a[i]!=a[i+2] || a[i+2]=='\0' || a[i]== a[i+1])
            break;
        }
        if((a[i+2]=='\0'))
        System.out.print("Yes");
        else
        System.out.print("No");
        sc.close();
    }

}
