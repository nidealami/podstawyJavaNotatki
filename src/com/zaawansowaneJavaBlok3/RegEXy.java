package com.zaawansowaneJavaBlok3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//The matcher() method is used to search for the pattern in a string.
// It returns a Matcher object which contains information about the search that was performed.
//
//The find() method returns true if the pattern was found in the string and false if it was not found.
//Flags in the compile() method change how the search is performed. Here are a few of them:
//
//    Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
//    Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will
//    be treated as ordinary characters when performing a search.
//    Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of
//    letters outside of the English alphabet

//Regular Expression Patterns:
//[abc] 	Find one character from the options between the brackets
//[^abc] 	Find one character NOT between the brackets
//[0-9] 	Find one character from the range 0 to 9

//Metacharacters:
//| 	Find a match for any one of the patterns separated by | as in: cat|dog|fish
//. 	Find just one instance of any character
//^ 	Finds a match as the beginning of a string as in: ^Hello
//$ 	Finds a match at the end of the string as in: World$
//\d 	Find a digit
//\s 	Find a whitespace character
//\b 	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
//uxxxx 	Find the Unicode character specified by the hexadecimal number xxxx

//Quantifiers:
//n+ 	Matches any string that contains at least one n
//n* 	Matches any string that contains zero or more occurrences of n
//n? 	Matches any string that contains zero or one occurrences of n
//n{x} 	Matches any string that contains a sequence of X n's
//n{x,y} 	Matches any string that contains a sequence of X to Y n's
//n{x,} 	Matches any string that contains a sequence of at least X n's

//Note: If your expression needs to search for one of the special characters you can use a backslash ( \ )
// to escape them. In Java, backslashes in strings need to be escaped themselves, so two backslashes are needed to
// escape special characters. For example, to search for one or more question marks you can use the following expression: "\\?"

public class RegEXy {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found: "+pattern);
        } else {
            System.out.println("Match not found ");
        }
    }
}
