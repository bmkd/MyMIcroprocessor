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
public class Movaadr {
    public int xyz(int valueAtAdress){
    System.out.println("T0: MAR<--PC");
System.out.println("T1: MDR<--M[MAR], PC<--PC+1");
System.out.println("T2: HEXCODE<--MDR[8-11]");
System.out.println("d11T3: MAR<--MDR[0-7]");
System.out.println("d11d10'd9'd8'T4: MDR<--M[MAR]");
System.out.println("T5: A<--MDR");
System.out.println("");
int A=valueAtAdress;
    return A;}
}
