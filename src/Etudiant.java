public class Etudiant extends Personne implements Etudiante {
    private String numEtudiant = numEtudiants();
    private Classe classe;
    public enum Classe { L3, M1, M2 }
    //Iplement de l'interface Etudiante

    @Override
    public void sinscrire() {}

    @Override
    public void suivreCours() {}

    @Override
    public void passerExamen() {}

    //Getter and Setter
    public String getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(String numEtudiant) {

        this.numEtudiant = numEtudiant;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    //Constructeur
    public Etudiant(String nom, String prenom, int anneNaissance, String mail, Classe classe) {
        super(nom, prenom, anneNaissance, mail);
        this.numEtudiant = numEtudiants();
        this.classe = classe;
    }

    //Méthode d'implémentation du numéro Etudiant et de la classe
    //Numéro Etudiant
    public String numEtudiants() {
        int calculeAge = 2024 - super.anneNaissance;
        return super.nom + calculeAge + "000";
    }

    @Override
    public String toString() {
        return super.toString() + ", numEtudiant: " + numEtudiant + ", Classe: " + classe;
    }


}
