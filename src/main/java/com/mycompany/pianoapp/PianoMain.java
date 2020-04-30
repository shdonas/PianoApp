/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pianoapp;

import java.util.Scanner;

/**
 *
 * @author Shakhawat Hossain <shossain_psu@yahoo.com>
 */
public class PianoMain {
    public static void main(String[] args) {
        NoteAnalyzer piano = new NoteAnalyzer();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value of the key to get info about the Note: ");
        int value = in.nextInt();

        System.out.println(piano.noteName(value));
        piano.naturalOrSharp(piano.noteName(value));        
        System.out.println("Frequency of " 
                + piano.noteName(value)
                + " is: " 
                + piano.getFrequency(value));

    }
}
