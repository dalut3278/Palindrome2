/**
* David Lutelmowski
* 2/21/19
* Palindrome2 Program
*/

package palindrome2;
import javax.swing.*;

public class Palindrome2 {

    public static void main(String[] args) {
        String phrase, backwardsPhrase;
        int pos;

        //get the word from the user
        phrase = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program counts how many words are palindromes.\n\n"
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
