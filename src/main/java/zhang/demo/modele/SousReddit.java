package zhang.demo.modele;

import java.util.ArrayList;
import java.util.HashMap;

public class SousReddit {
    private String idSousR;
    private String nomSousR;
    private HashMap<String,Poste> postes;


    public SousReddit(String idSousR, String nomSousR) {
        this.idSousR = idSousR;
        this.nomSousR = nomSousR;
    }

    public HashMap<String,Poste> getPostes() {
        return postes;
    }

    public void setPostes(HashMap<String,Poste> postes) {
        this.postes = postes;
    }

    public SousReddit() {
    }

    public String getIdSousR() {
        return idSousR;
    }

    public void setIdSousR(String idSousR) {
        this.idSousR = idSousR;
    }

    public String getNomSousR() {
        return nomSousR;
    }

    public void setNomSousR(String nomSousR) {
        this.nomSousR = nomSousR;
    }
}
