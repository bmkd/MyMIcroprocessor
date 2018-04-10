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
public class Store {
    public int xyz(int A){
        int array=A;
    System.out.println("T0: MAR<--PC");
System.out.println("T1: MDR<--M[MAR], PC<--PC+1");
System.out.println("T2: HEXCODE<--MDR[8-11]");
System.out.println("d11T3: MAR<--MDR[0-7]");
System.out.println("d11d10d9'd8T4: MDR<--A");
System.out.println("T5: M[MAR]<--MDR");
System.out.println("");
    return array;}
}
