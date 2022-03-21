package com.java;
import java.util.*;
  import java.util.Scanner;

public class SolidRhombus {

  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

       int n= sc.nextInt();

  //outer loop
  for( int i=1; i<=n;i++){
  
  
  //inner loop1(for spaces)
  for(int j=1; j<=n-i; j++){
    System.out.print(" ");
  }
  //inner loop2 for *
  for(int j=1;j<=n;j++){
    System.out.print("*");
    
  }
  System.out.println();
}
  }

}
