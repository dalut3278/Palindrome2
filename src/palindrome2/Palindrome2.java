/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome2;
import javax.swing.*;
/**
 *
 * @author dalut3278
 */

public class Palindrome2 {

    public static void main(String[] args) {
        String phrase, backwardsPhrase;
        int pos;

        //get the word from the user
        phrase = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a phrase is a palindrome.\n\n"
                + "Enter a phrase:");

        //Reverse the phrase
        backwardsPhrase = "";
        for (pos = phrase.length() - 1; pos >= 0; pos--) {
            backwardsPhrase += phrase.charAt(pos);
        }

        //Compare the words
        if (phrase.equalsIgnoreCase(backwardsPhrase)) {
            JOptionPane.showMessageDialog(null, phrase + " in reverse is " + backwardsPhrase
                    + ".\nIt IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, phrase + " in reverse is " + backwardsPhrase
                    + ".\nIt IS NOT a palindrome.");
        }
    }
}
