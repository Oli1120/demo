package zhang.demo.dao;

import zhang.demo.modele.Commentaire;
import zhang.demo.modele.Poste;
import zhang.demo.modele.SousReddit;
import zhang.demo.modele.Utilisateur;

import java.util.HashMap;

public class Donnees {
    public static HashMap<String, Utilisateur> listeUser = new HashMap<>();
    static{
        Utilisateur u = new Utilisateur();
        u.setIdUser("111");
        u.setNomUser("zhang");
        listeUser.put(u.getIdUser(),u);

    }

    public static HashMap<String, SousReddit> listeSR = new HashMap<>();
    static{
        SousReddit sr = new SousReddit();
        sr.setIdSousR("1");
        sr.setNomSousR("NomSR1");

        listeSR.put(sr.getIdSousR(),sr);
    }


    static{
        Poste p = new Poste();
        p.setIdPoste("11111");
        p.setTitrePoste("TitrePoste1");
        p.setUserPosteId("111");
        p.setSousRedditId("1");
        listeSR.get("1").getPostes().put(p.getIdPoste(),p);
    }


    static{
        Commentaire comm = new Commentaire();
        comm.setIdComm("c1");
        comm.setPosteComm("11111");
        comm.setUserComm("111");
        listeSR.get("1").getPostes().get("111").getCommentaires().put(comm.getIdComm(), comm);
    }

    public Donnees() {
    }

    public Utilisateur chercherUser(String id){
        return listeUser.get(id);
    }

    public void modifierUser(Utilisateur u){
        listeUser.put(u.getIdUser(),u);
    }

    public void supprimerUser(Utilisateur u){
        listeUser.remove(u.getIdUser());
    }

    public SousReddit chercherSR(String id){
        return listeSR.get(id);
    }

    public void modifierSR(SousReddit sr){
        listeSR.put(sr.getIdSousR(),sr);
    }

    public void supprimerSR(SousReddit sr){
        listeSR.remove(sr.getIdSousR());
    }

    public Poste chercherPoste(String idPoste,String idSR){
        return listeSR.get(idSR).getPostes().get(idPoste);
    }

    public void modifierPoste(Poste p,String idSR){
        listeSR.get(idSR).getPostes().put(p.getIdPoste(),p);
    }

    public void supprimerPoste(Poste p,String idSR){
        listeSR.get(idSR).getPostes().remove(p.getIdPoste());
    }

    public Commentaire chercherComm(String idComm,String idPoste,String idSR){
        return listeSR.get(idSR).getPostes().get(idPoste).getCommentaires().get(idComm);
    }

    public void modifierComm(Commentaire c,String idPoste,String idSR){
        listeSR.get(idSR).getPostes().get(idPoste).getCommentaires().put(c.getIdComm(),c);
    }

    public void supprimerComm(Commentaire c,String idPoste,String idSR){
        listeSR.get(idSR).getPostes().get(idPoste).getCommentaires().remove(c.getIdComm());
    }




}
