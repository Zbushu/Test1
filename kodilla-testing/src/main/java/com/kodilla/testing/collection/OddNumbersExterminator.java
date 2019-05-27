package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList evens = new ArrayList();
        for (int n=0; n < numbers.size(); n++){
            if (numbers.get(n) % 2 == 0){
                evens.add(numbers.get(n));
            }
        }
        return evens;
    }


}
