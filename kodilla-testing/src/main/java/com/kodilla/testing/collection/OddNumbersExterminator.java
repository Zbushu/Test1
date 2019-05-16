package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {

    ArrayList<Integer> exterminate;


    public OddNumbersExterminator (){
        exterminate = new ArrayList<Integer>();
    }

    public void exterminated(ArrayList<Integer> numbers){
        int temporaryValue = 0;
        for (int n=0; n < numbers.size(); n++){
            temporaryValue = numbers.get(n);
            //checking if an element is even or odd
            if (temporaryValue % 2 == 0){
                exterminate.add(temporaryValue);

            }
        }
    }

    public ArrayList<Integer> getExterminate() {
        return exterminate;
    }

}
