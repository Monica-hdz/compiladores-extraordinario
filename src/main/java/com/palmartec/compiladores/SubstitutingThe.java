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
public class SubstitutingThe {

    public static void main(String[] args) {
        System.out.println(replaceThe("the dog and the envelope"));
        System.out.println(replaceThe("the boy ran at the wall"));
        System.out.println(replaceThe("the egg, the spoon and the espionage"));
    }

    public static String replaceThe(String str) {
        String strLower = str.toLowerCase();
        String wordRefactor;
        String[] strSplit = strLower.split(" ");
        
        for(int i = 0; i < strSplit.length; i++){
            if(strSplit[i].equals("the")){
                if(isVowel(strSplit[i+1])){
                    strSplit[i] = "an";
                }else{
                    strSplit[i] = "a";
                }
            }
        }
        
        wordRefactor = String.join(" ", strSplit);
          
        return wordRefactor;
    }
    
    public static boolean isVowel(String str){
        String firstWord = String.valueOf(str.charAt(0));
        return "aeiou".contains(firstWord);
    }
}
