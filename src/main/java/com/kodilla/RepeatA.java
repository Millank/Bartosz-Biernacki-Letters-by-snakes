package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Created by Bartosz Biernacki.
 */
public class RepeatA {

    public static void main (String[] args) throws java.lang.Exception	{
        String sumA = "a";
        String a = "a";

        ArrayDeque<String> repeatA = new ArrayDeque<String>();
        Random theGenerator = new Random();
        int objectA = 0;

        while(repeatA.size() < 50 ) {
            objectA = theGenerator.nextInt(51);
            if(objectA != 0) {
                for(int i=0; i <= objectA; i++)
                    sumA += a;
            }
            repeatA.add(sumA);
        }

        SeparateA signA = new SeparateA();
        signA.separateEven(repeatA);

    }
}

class SeparateA
{
    String sign = null;

    ArrayList<String> even = new ArrayList<String>();
    ArrayList<String> uneven = new ArrayList<String>();

    public void separateEven(ArrayDeque<String> theRepeat) {
        while(theRepeat.size() > 0) {
            sign = theRepeat.poll();
            if(sign.length() % 2 == 0) {
                even.add(sign);
                System.out.println("even sign: " + sign);
            } else {
                uneven.add(sign);
                System.out.println("uneven sign: " + sign);
            }
        }
    }
}

