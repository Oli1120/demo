package zhang.demo.modele;

public class Commentaire {
    private String idComm;
    private String corpMessageC;
    private String userCommId;
    private String posteCommId;

    public Commentaire() {
    }

    public Commentaire(String idComm, String corpMessageC, String userCommId, String posteCommId) {
        this.idComm = idComm;
        this.corpMessageC = corpMessageC;
        this.userCommId = userCommId;
        this.posteCommId = posteCommId;
    }

    public String getIdComm() {
        return idComm;
    }

    public void setIdComm(String idComm) {
        this.idComm = idComm;
    }

    public String getCorpMessageC() {
        return corpMessageC;
    }

    public void setCorpMessageC(String corpMessageC) {
        this.corpMessageC = corpMessageC;
    }

    public String getUserCommId() {
        return userCommId;
    }

    public void setUserComm(String userCommId) {
        this.userCommId = userCommId;
    }

    public String getPosteCommId() {
        return posteCommId;
    }

    public void setPosteComm(String posteCommId) {
        this.posteCommId = posteCommId;
    }
}
