
package com.wordcookies;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Cookies {
    private Path path;
    private final StringBuilder result= new StringBuilder();
    private String[] userInputContainer;
    private Map<String, String> listOfWords= new HashMap<>();
    public void setInputLength(int length) {
        userInputContainer= new String[length];
    }
    public void setUserInput(String userInput) {
        for (int counter = 0; counter < userInput.length(); counter++) {
            userInputContainer[counter]= String.valueOf(userInput.charAt(counter));
        }
    }

    public String getUserInput() {
       StringBuilder output = new StringBuilder();
        for (int counter = 0; counter < userInputContainer.length; counter++) {

            output.append(userInputContainer[counter]);
        }
        return output.toString();
    }

    public int getInputLength() {
        return userInputContainer.length;
    }


    public void setPath(Path path){
        this.path=path;
    }
    public boolean isValidPath(){
        boolean output=false;
        if(Files.exists(path)){
            output=true;
        }
        return output;
    }


    public void readFiles() throws IOException {
        if (isValidPath()) {
            Scanner input = new Scanner(Paths.get(String.valueOf(path)));
           while (input.hasNext()){
               listOfWords.put(input.next(),input.next());
           }
        }

    }

    public void identifyWords() {
        StringBuilder identity= new StringBuilder();
        for (int counter = 0; counter < userInputContainer.length; counter++) {

        }

        }

    public String getLikelyWords() {

      return result.toString();
    }


}
