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
public class EmphasizeWords {

    public static void main(String[] args) {
        System.out.println(emphasize("hello world!"));
        System.out.println(emphasize("GOOD MORNING!"));
        System.out.println(emphasize("I AM, BUT aLL yOuRs, TESH!"));
        System.out.println(emphasize("99 red balloons!"));
        System.out.println(emphasize(""));
    }

    public static String emphasize(String str) {
        String strLower = str.toLowerCase();
        String emphasizeWord;
        String[] strSplit = strLower.split(" ");
        for (int i = 0; i < strSplit.length; i++) {
            if (strSplit[i].length() <= 1) {
                strSplit[i] = strSplit[i].toUpperCase();
            } else {
                strSplit[i] = strSplit[i].substring(0, 1).toUpperCase() + strSplit[i].substring(1);
            }
        }

        emphasizeWord = String.join(" ", strSplit);

        return emphasizeWord;
    }

}
