package project2;

import java.util.Arrays;

public class P5 {
    /*
    Check if Two Strings are Anagrams: Given two strings,
    determine if they are anagrams, meaning they contain
    the same characters in a different order. For example,
    "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        String str1="sadder";
        String str2="dreads";

        if(anagram(str1,str2)){
            System.out.println(str1+" and "+str2+" are anagrams. ");
        }else{
            System.out.println(str1+" and "+str2+" are not anagrams");
        }

    }
    public static boolean anagram(String str1,String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
    }

