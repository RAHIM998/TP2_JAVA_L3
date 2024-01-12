import java.util.Set;

public class Professeur extends Personne implements prof{
    private Set<String>[] specialite;
    public Professeur(String nom, String prenom, int anneNaissance, String mail, Set<String> specialite) {
        super(nom, prenom, anneNaissance, mail);
        this.specialite = new Set[]{specialite};
    }

    @Override
    public String toString() {
        return super.toString() + ", Spécialité: " + specialite;
    }

    @Override
    public void enseigner() {}

    @Override
    public void corrigerExamen() {}
}
