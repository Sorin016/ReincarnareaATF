package Exercitii.ExercitiiDeInterviu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        String s="sorin are 28$ ani si acum vrea un venit mare de 2800$ si stie ca in 3$ luni o sa reuseasca sa gaseasca asa lucru";
        String patt="\\d*\\${1}";
        Pattern pattern=Pattern.compile(patt);
        Matcher matcher=pattern.matcher(s);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
