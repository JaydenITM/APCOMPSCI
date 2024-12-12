/*
 *	Author:  jayden Lee
 *  Date: 11/15/24
*/

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        // Your code goes below here
        Warrior[] war = new Warrior[100];
        for (int i = 0; i < war.length; i++) {
            war[i] = new Warrior();
        }

        Wizard[] wiz = new Wizard[100];
        for (int i = 0; i < wiz.length; i++) {
            wiz[i] = new Wizard();
        }

        int warriorcount = 0;
        int wizardcount = 0;

        while (warriorcount < 100 && wizardcount < 100) {
            wiz[wizardcount].attack(war[warriorcount]);
            if (war[warriorcount].isDead()) {
                warriorcount++;
            }

            if (warriorcount == 100 || wizardcount == 100) {
                break;
            }

            war[warriorcount].attack(wiz[wizardcount]);
            if (wiz[wizardcount].isDead()) {
                wizardcount++;
            }

            if (warriorcount == 100 || wizardcount == 100) {
                break;
            }
        }

        if (wizardcount > warriorcount) {
            System.out.println("The Wizards have won with " + (100 - warriorcount) + " remaining");
        }
        if (wizardcount < warriorcount) {
            System.out.println("The Warriors have won with " + (100 - wizardcount) + " remaining");
        }
    }
}
