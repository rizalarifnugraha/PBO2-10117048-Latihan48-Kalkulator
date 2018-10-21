/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan48.kalkulator;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi menghitung menggunakan operasi 
 *                     kalkulator.
 */
public class PBO210117048Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kkr =  new Kalkulator();
        kkr.setValue1(7);
        kkr.setValue2(5);
        System.out.println("VALUE 1 = "+kkr.getValue1());
        System.out.println("VALUE 2 = "+kkr.getValue2());
        kkr.setNameProject();
        kkr.setNoteProject(null);
        System.out.println("Result Add is = "+kkr.add(kkr.getValue1(), 
                kkr.getValue2()));
        System.out.println("Result Minus is = "+kkr.minus(kkr.getValue1(), 
                kkr.getValue2()));
        System.out.println("Result Multiplication is = "+kkr.multiplication
                (kkr.getValue1(), kkr.getValue2()));
        System.out.println("Result Division is = "+kkr.division(kkr.getValue1(),
                kkr.getValue2()));
    }
    
}
