package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers){
        for (int n=0; n < numbers.size(); n++){
            if (n % 2 != 0){
                numbers.remove(n);
            }
        }
    }

}
