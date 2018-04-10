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
public class stop {
    public void xyz(int A,int B)
    {
        System.out.println("T0: MAR<--PC");
System.out.println("T1: MDR<--M[MAR], PC<--PC+1");
System.out.println("T2: HEXCODE<--MDR[8-11]");
System.out.println("d11d10d9'd8'T4: END OF PROGRAM");
System.out.println("");
System.out.println("RESULT:");
String Ahex=Integer.toHexString(A);
String Bhex=Integer.toHexString(B);
System.out.println("A=0x"+Ahex);
System.out.println("B=0x"+Bhex);
    }
}
