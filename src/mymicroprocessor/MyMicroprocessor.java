/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymicroprocessor;

/**
 *
 * @author user
 */
import java.util.Scanner;  
public class MyMicroprocessor{  
    public static int A,B;
     public static int i=0,j=0;
    public static int arr[][]= new int[16][16];
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
while(true)
  { String s1=sc.next();
if(s1.equalsIgnoreCase("STOP"))
{
    stop x= new stop();
    x.xyz(A,B);
    System.out.println("RAM:");
   System.out.print("    ");
    for(int c=0;c<16;c++)
    {
        System.out.print("  "+Integer.toHexString(c)+"    ");
    }
    System.out.println("");
     System.out.println("");
        for(int r=0;r<16;r++)
    {   System.out.print(" "+Integer.toHexString(r));
    System.out.print("  ");
        for(int c=0;c<16;c++)
        {   
        if(arr[r][c]<=15)
            System.out.print(" "+Integer.toHexString(arr[r][c])+"0    ");
        else
            System.out.print(" "+Integer.toHexString(arr[r][c])+"    ");
        }
        System.out.println("");
    }
   
    break;
} 
String s2=sc.next();
if(s1.equalsIgnoreCase("store"))
{ if(s2.substring(0,1).equalsIgnoreCase("&")){
    int l=s2.length();
  
    if(l==2)
    {
        i=0;
        j=Integer.parseInt(s2.substring(1),16);
    }
    else if(l==3)
    {
        i=Integer.parseInt(s2.substring(1,2),16);
        j=Integer.parseInt(s2.substring(2),16);
    }
    //System.out.println(i+"hi"+j);
   Store x= new Store();
    arr[i][j]=x.xyz(A);
    continue;
}
}
String s3=sc.next();
if(s1.equalsIgnoreCase("MOV"))
{
if(s2.equalsIgnoreCase("A"))
{
if(s3.equalsIgnoreCase("B"))
{
Movab x= new Movab();
A=x.xyz(A,B);
}
if(s3.substring(0,1).equals("#"))
{   
    int data=Integer.parseInt(s3.substring(1),16);
    Movadata x=new Movadata();
    A=x.xyz(s3.substring(1),data);
}
if(s3.substring(0,1).equals("&"))
{
    int l=s3.length();
    int i=0,j=0;
    if(l==2)
    {
        i=0;
        j=Integer.parseInt(s3.substring(1),16);
    }
    else if(l==3)
    {
        i=Integer.parseInt(s3.substring(1,2),16);
        j=Integer.parseInt(s3.substring(2),16);
    }
    Movaadr x=new Movaadr();
    A=x.xyz(arr[i][j]);
}
}
if(s2.equalsIgnoreCase("B"))
{
if(s3.equalsIgnoreCase("A"))
{
Movba x= new Movba();
x.xyz(A,B);
}
if(s3.substring(0,1).equals("#"))
{
    int data=Integer.parseInt(s3.substring(1),16);
    Movbdata x=new Movbdata();
    B=x.xyz(s3.substring(1),data);
}
}
}
if(s1.equalsIgnoreCase("ADD"))
{
    if(s2.equalsIgnoreCase("A"))
    {
        if(s3.equalsIgnoreCase("B"))
        {
            Addab x=new Addab();
           A = x.xyz(A,B);
           //System.out.println(A);
        }
        if(s3.substring(0,1).equalsIgnoreCase("#"))
        {
            int data=Integer.parseInt(s3.substring(1),16);
            Addadata x=new Addadata();
            A=x.xyz(A,data,s3.substring(1));
            //System.out.println(A);
        }
    }
}
  }
 }  
}   
