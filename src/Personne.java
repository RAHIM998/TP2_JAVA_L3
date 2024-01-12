public class Personne {
    protected String nom;
    protected String prenom;
    protected int anneNaissance;
    protected String mail;

    public Personne(String nom, String prenom, int anneNaissance, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneNaissance = anneNaissance;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", anneNaissance=" + anneNaissance +
                ", mail='" + mail + '\'' +
                '}';
    }
}
