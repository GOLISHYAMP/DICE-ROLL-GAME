/*
just click run button :) hope you like 
*/

import java.util.Random;
import java.util.Scanner;
public class JavaProjectp
{
public static void six()
{
   System.out.print("---------\n| *   * |\n| *   * |\n| *   * |\n---------");
}

public static void five(){
   System.out.print("---------\n| *   * |\n|   *   |\n| *   * |\n---------");
}

public static void four(){
   System.out.print("---------\n| *   * |\n|       |\n| *   * |\n---------");
}

public static void three(){
   System.out.print("---------\n|     * |\n|   *   |\n| *     |\n---------");
}

public static void two(){
   System.out.print("---------\n|     * |\n|       |\n| *     |\n---------");
}

public static void one(){
   System.out.print("---------\n|       |\n|   *   |\n|       |\n---------");
}


public static int random()
{
   Random r = new Random();
   int a = r.nextInt(6)+1;
   return a;
}
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("WELCOME TO DICE GAME");
        System.out.println("which mode you want to play\n1:single\n2:YOU v/s COMPUTER\n");
        int b=s.nextInt();
        if(b==1)
        {
           System.out.println("how many dice you need\n1.one\n2.two\n");
           int n=s.nextInt();
          if(n==1)
          { 
            int p=1;
             while(p==1)
  {
        int you = random();
System.out.println("you");
        switch(you)
        {
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
   System.out.println("\nDO YOU WANT TO CONTINUE:if yes click 1 else 0");
  int q=s.nextInt();
  if(q==0)
{p=0;}
}
        }
    else
       {
                    int p=1;
             while(p==1)
  {
         int you = random();
        int you2 = random();
        
     System.out.println("you");
        switch(you)
        {
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
        System.out.println("\n");
        switch(you2)
        {
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }  
    System.out.println("\nDO YOU WANT TO CONTINUE:if yes click 1 else 0");
  int q=s.nextInt();
  if(q==0)
{p=0;}
}
        }
        }
       else
{
int p=1;
             while(p==1)
  {
int you = random();
        int computer = random();
        
     System.out.println("you");
        switch(you)
        {
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
        System.out.println("\n");
        System.out.println("computer");
        switch(computer)
        {
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
        if(you>computer){
            System.out.println("\nLucky! you won.");
        }
        if(computer>you){
            System.out.println("\nYou lost :( \ntap run button till you win :)");
        }
        if(you==computer){
           System.out.println("\nDraw! click run button again");
        }
     System.out.println("\nDO YOU WANT TO CONTINUE:if yes click 1 else 0");
  int q=s.nextInt();
  if(q==0)
{p=0;}
}

    }
}
}