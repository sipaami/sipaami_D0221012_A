package Com.day4_java_stdin_and_stdoutII_.java;

import java.util.Scanner;


public class main {

  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int i = scan.nextInt();
  double d = scan.nextDouble();
  scan.nextLine();
  String s = scan.nextLine();
  
  
  System.out.println("String:" + s);
  System.out.println("Double:" + d);
  System.out.println("Int:" + i);
  
   
  }
}
