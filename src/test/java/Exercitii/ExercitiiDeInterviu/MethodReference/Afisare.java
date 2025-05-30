package Exercitii.ExercitiiDeInterviu.MethodReference;

public class Afisare {
    public static void main(String[] args) {
        Affichage afisare=Afisare::affiche;
        afisare.aff();
    }
    public static void affiche() {
        System.out.println("Affichage de l'afisare");
    }
}
interface Affichage{
    void aff();
}
