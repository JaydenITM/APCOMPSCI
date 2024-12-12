/*
 * Author: Jayden Lee
 * Date:11/02/24
 */

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Starter {
    public static String randName() {
        int rand = (int)(Math.random() * 7);
        switch(rand) {
            case 0: return "Dopey";
            case 1: return "Bashful";
            case 2: return "Grumpy";
            case 3: return "Sleepy";
            case 4: return "Sneezy";
            case 5: return "Happy";
            case 6: return "Doc";
            default: return "Happy";
        }
    }

    public static void main(String args[]) {
        // Your code goes below here
        PooleDwarf d1 = new PooleDwarf(randName(), (int)(Math.random() * 7));
        PooleDwarf d2 = new PooleDwarf(randName(), (int)(Math.random() * 7));
        PooleDwarf d3 = new PooleDwarf(randName(), (int)(Math.random() * 7));
        PooleDwarf d4 = new PooleDwarf(randName(), (int)(Math.random() * 7));
        PooleDwarf d5 = new PooleDwarf(randName(), (int)(Math.random() * 7));
        PooleDwarf d6 = new PooleDwarf(randName(), (int)(Math.random() * 7));
        PooleDwarf d7 = new PooleDwarf(randName(), (int)(Math.random() * 7));

        int num = 0;

        if(d1.isSameName(d2.getName())) {
            num = num + 1;
        }
        if(d1.isSameName(d3.getName())) {
            num = num + 1;
        }
        if(d1.isSameName(d4.getName())) {
            num = num + 1;
        }
        if(d1.isSameName(d5.getName())) {
            num = num + 1;
        }
        if(d1.isSameName(d6.getName())) {
            num = num + 1;
        }
        if(d1.isSameName(d7.getName())) {
            num = num + 1;
        }

        System.out.println("Dwarf d1 was duplicated: " + num + " times and the name was: " + d1.getName());
    }
}
