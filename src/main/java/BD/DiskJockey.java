package BD;

import java.time.LocalDate;

public class DiskJockey {
    private String nom;
    private String prenom;
    private String nomDeScene;
    private LocalDate dateDeNaissance;
    private String lieuDeResidence;
    private String styleMusical;

    // Constructor
    public DiskJockey(String nom, String prenom, String nomDeScene, LocalDate dateDeNaissance, String lieuDeResidence, String styleMusical) {
        this.nom = nom;
        this.prenom = prenom;
        this.nomDeScene = nomDeScene;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeResidence = lieuDeResidence;
        this.styleMusical = styleMusical;
    }

    // Getters and Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDeScene() {
        return nomDeScene;
    }

    public void setNomDeScene(String nomDeScene) {
        this.nomDeScene = nomDeScene;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getLieuDeResidence() {
        return lieuDeResidence;
    }

    public void setLieuDeResidence(String lieuDeResidence) {
        this.lieuDeResidence = lieuDeResidence;
    }

    public String getStyleMusical() {
        return styleMusical;
    }

    public void setStyleMusical(String styleMusical) {
        this.styleMusical = styleMusical;
    }

    // Méthode pour afficher les informations sur le DJ
    @Override
    public String toString() {
        return "DiskJockey{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDeScene='" + nomDeScene + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", lieuDeResidence='" + lieuDeResidence + '\'' +
                ", styleMusical='" + styleMusical + '\'' +
                '}';
    }
}

