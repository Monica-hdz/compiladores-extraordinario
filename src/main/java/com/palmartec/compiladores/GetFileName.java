/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.palmartec.compiladores;

/**
 *
 * @author USER-PC
 */
public class GetFileName {
    
    public static void main(String [] args){
        System.out.println(getFilename("C:/Projects/pil_tests/ascii/edabit.txt"));
        System.out.println(getFilename("C:/Users/johnsmith/Music/Beethoven_5.mp3"));
        System.out.println(getFilename("ffprobe.exe"));
    }

    public static String getFilename(String path) {
        String[] pathSplit = path.split("/");
        return pathSplit[pathSplit.length -1];
    }
}
