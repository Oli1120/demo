package zhang.demo.modele;

import java.util.ArrayList;
import java.util.HashMap;

public class Poste {
    private String idPoste;
    private String titrePoste;
    private String mediaPoste;
    private String corpMessage;
    private String userPosteId;
    private String sousRedditId;
    private HashMap<String,Commentaire> commentaires;



    public Poste() {
    }

    public Poste(String idPoste, String titrePoste, String userPosteId, String sousRedditId) {
        this.idPoste = idPoste;
        this.titrePoste = titrePoste;
        this.userPosteId = userPosteId;
        this.sousRedditId = sousRedditId;
    }

    public HashMap<String, Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(HashMap<String, Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Poste(String idPoste) {
        this.idPoste = idPoste;
    }

    public String getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(String idPoste) {
        this.idPoste = idPoste;
    }

    public String getTitrePoste() {
        return titrePoste;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    public String getMediaPoste() {
        return mediaPoste;
    }

    public void setMediaPoste(String mediaPoste) {
        this.mediaPoste = mediaPoste;
    }

    public String getCorpMessage() {
        return corpMessage;
    }

    public void setCorpMessage(String corpMessage) {
        this.corpMessage = corpMessage;
    }

    public String getUserPosteId() {
        return userPosteId;
    }

    public void setUserPosteId(String userPosteId) {
        this.userPosteId = userPosteId;
    }

    public String getSousRedditId() {
        return sousRedditId;
    }

    public void setSousRedditId(String sousRedditId) {
        this.sousRedditId = sousRedditId;
    }
}
