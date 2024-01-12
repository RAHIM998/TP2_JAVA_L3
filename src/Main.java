import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        affichePersonne();
    }

    private static void affichePersonne() {
        // Création d'une ArrayList de Personne
        ArrayList<Personne> personnes = new ArrayList<>();

        Etudiant etudiant1 = new Etudiant("Diallo", "Rahim", 1998, "diallorahim470@gmail.com", Etudiant.Classe.L3);
        Etudiant etudiant2 = new Etudiant("Ba", "Alpha", 1999, "baalpha470@gmail.com", Etudiant.Classe.M1);
        Etudiant etudiant3 = new Etudiant("Balde", "Thierno", 1997, "baldethierno470@gmail.com", Etudiant.Classe.M2);

        Set<String> spProf1 = new HashSet<>(Set.of("Java", "PHP"));
        Set<String> spProf2 = new HashSet<>(Set.of("Java", "C#"));
        Set<String> spProf3 = new HashSet<>(Set.of("PHP", "C#"));

        Professeur professeur1 = new Professeur("Lo", "Dane", 1993, "dane.lo@email.com", spProf1);
        Professeur professeur2 = new Professeur("Gueye", "Laye", 1993, "laye.gueye@email.com", spProf2);
        Professeur professeur3 = new Professeur("Diallo", "Abdou", 1990, "abdou.diallo@email.com", spProf3);

        personnes.add(etudiant1);
        personnes.add(etudiant2);
        personnes.add(etudiant3);

        personnes.add(professeur1);
        personnes.add(professeur2);
        personnes.add(professeur3);

        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }
}
