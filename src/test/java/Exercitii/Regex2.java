package Exercitii;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        //  *- Greedy   *? non Greedy
        //  +- Greedy   +? non Greedy
        //  {} Greedy   {}? non Greedy
        String s="XXsalutYYesteXXcel mai interesant 999 din toateXX si vreau sa ma uitYY A";
        String patt="XX.*?YY";
        Pattern pattern=Pattern.compile(patt);
        Matcher matcher=pattern.matcher(s);
        System.out.println(matcher.results().count());
        matcher.reset();
        while (matcher.find()){
            System.out.println("incepe la "+matcher.start());
            System.out.println(matcher.group());
        }
    }
}
