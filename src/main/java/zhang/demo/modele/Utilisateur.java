package zhang.demo.modele;

import java.util.ArrayList;
import java.util.HashMap;

public class Utilisateur {

    private String idUser;
    private String motPasseUser;
    private String nomUser;
    private String prenomUser;
    private String statutUser;
    private HashMap<String,Poste> postes;
    private HashMap<String,Commentaire> commentaires;


    public Utilisateur() {
    }

    public Utilisateur(String idUser, String motPasseUser) {
        this.idUser = idUser;
        this.motPasseUser = motPasseUser;
    }

    public HashMap<String, Poste> getPostes() {
        return postes;
    }

    public void setPostes(HashMap<String, Poste> postes) {
        this.postes = postes;
    }

    public HashMap<String, Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(HashMap<String, Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getMotPasseUser() {
        return motPasseUser;
    }

    public void setMotPasseUser(String motPasseUser) {
        this.motPasseUser = motPasseUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getStatutUser() {
        return statutUser;
    }

    public void setStatutUser(String statutUser) {
        this.statutUser = statutUser;
    }
}
