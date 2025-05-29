package Exercitii.ExercitiiDeInterviu.Recursia;

public class CombinatiiDeLitereToatePosibile {
        static char[] litere = {'a', 'b', 'c', 'd'};

        public static void main(String[] args) {
            for (int lungime = 1; lungime <= 4; lungime++) {
                genereazaCombinatii("", lungime);
            }
        }

        static void genereazaCombinatii(String prefix, int lungimeRamasa) {
            if (lungimeRamasa == 0) {
                System.out.println(prefix);
                return;
            }

            for (char c : litere) {
                genereazaCombinatii(prefix + c, lungimeRamasa - 1);
            }
        }
    }

