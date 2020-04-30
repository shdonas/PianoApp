/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pianoapp;

import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Shakhawat Hossain <shossain_psu@yahoo.com>
 */
public class NoteAnalyzer {

    int noteLength;
    int noteValue;

    int noteNumber;
    double frequency;
    String isSharp = "Sharp";

    private final String[] keyNatural = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    private final String[] SharpNote = {"C#", "D#", "F#", "G#", "A#"};
    

    // The default constructor should set a note to a A440 (an A note of frequency 440Hz) quarter note
    //
    public NoteAnalyzer() {
        

    }

//    Include methods to set a note to a specified length and value
//    it will create an array of new keyNatural 
    // n = note Value 
    public double getFrequency(int n) {
        frequency = 440 * Math.pow(2.0, n / 12.0);
        return frequency;
    }

//    Write methods to get information about a note, including methods to:
//    1. tell you the letter name of the note (A, B, C)
//         >> method returns note name
    public String noteName(int noteValue) {
        String key = "";
        for (int k = 0; k < keyNatural.length; k++) {
            if (k == noteValue) {
                key = keyNatural[k];
//                return key;
            }
        }
        return key;
    }

    public void naturalOrSharp(String note) {
        int index = ArrayUtils.indexOf(keyNatural, note);
        for (String k : keyNatural) {
            for (String s : SharpNote) {
                if ((k == null ? s == null : k.equals(s)) && (k == null ? note == null : k.equals(note))) {
                    System.out.println("Sharp");
                    this.isSharp = "Sharp";
//                    System.out.println(index);
                    break;
                }else if (k.equals(note)){
                    System.out.println("Natural");
                    break;
                }
            }
        }
    }

}
