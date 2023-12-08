public class Etudiant  extends  Personne {

    private String  classe;

    public Etudiant (int id, String nom, String prenom , String classe){
            super(id,nom,prenom);
            this.classe = classe;

    }

    public Etudiant(){

    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
       /* return "Etudiant{" +
                "id= "+super.getId()+
                "Nom "+super.getNom()+
                "Prenom "+super.getPrenom()+
                "classe='" + classe + '\'' +
                '}';*/
        /*return "Etudiant{" +
                super.toString()+
                "classe='" + classe + '\'' +
                '}';*/
        return "Etudiant{" +
                "id= "+this.id+
                "Nom "+this.nom+
                "Prenom "+this.prenom+
                "classe='" + this.classe + '\'' +
                '}';
    }
}
