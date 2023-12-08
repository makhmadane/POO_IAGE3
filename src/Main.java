public class Main {
    public static void main(String[] args) {

       Personne personne = new Personne();
       personne.setId(10);
       personne.setNom("DIOP");
       personne.setPrenom("Abdou");
       System.out.println(personne.toString());


       Personne personne1 = new Personne(11,"FALL","Awa");
       System.out.println(personne1.toString());

       Etudiant etudiant = new Etudiant();
       etudiant.setId(12);
       etudiant.setNom("DIOUF");
       etudiant.setPrenom("JULE");
       etudiant.setClasse("IAGE3");
       System.out.println(etudiant.toString());


    }
}