public class Personne {

    //Attributs

    protected int id;
    protected String nom;
    protected String prenom;


    //Constructeur

    public Personne (int id, String nom, String prenom){
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
    }

    public Personne(){

    }


    //Setters

    public void setId(int id){
        if(id>=0){
            this.id = id;
        }

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //Getters
    public int getId(){
        return this.id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }


}
