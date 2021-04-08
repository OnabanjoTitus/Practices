package com.wordcookies;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CookiesMain{
    public static void main(String[] args) throws Exception {
        Cookies cookies= new Cookies();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word ");
        cookies.setUserInput(input.next());
        cookies.setPath(Paths.get("C:\\Users\\DELL\\Desktop\\middlend\\WordCookies\\words_alpha.txt"));
        cookies.readFiles();
//        System.out.println(cookies.getLikelyWords());

    }
}
