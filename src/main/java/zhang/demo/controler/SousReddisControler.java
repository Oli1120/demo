package zhang.demo.controler;

import org.springframework.web.bind.annotation.*;
import zhang.demo.dao.Donnees;
import zhang.demo.modele.Commentaire;
import zhang.demo.modele.Poste;
import zhang.demo.modele.SousReddit;
import zhang.demo.modele.Utilisateur;

import java.util.HashMap;

import static zhang.demo.dao.Donnees.*;

@RestController
public class SousReddisControler {
    private Donnees d = new Donnees();

    @RequestMapping(value = "/sousreddit/{idSR}",method = RequestMethod.GET)
    public SousReddit chercherSousReddit(@PathVariable("idSR") String id){
       return d.chercherSR(id);
    }

    @RequestMapping(value = "/sousreddit/",method = RequestMethod.GET)
    public HashMap<String, SousReddit> afficherSousReddit(){
        return listeSR;
    }

    @RequestMapping(value = "/sousreddit/{idSR}",method = RequestMethod.POST)
    public void ajoueterSousReddit(@RequestBody(required = true) SousReddit sr){
        d.modifierSR(sr);
    }

    @RequestMapping(value = "/sousreddit/",method = RequestMethod.PUT)
    public void miseajourSousReddit(@RequestBody(required = true) SousReddit sr){
        d.modifierSR(sr);
    }

    @RequestMapping(value = "/sousreddit/",method = RequestMethod.DELETE)
    public void supprimerSousReddit(@RequestBody(required = true) SousReddit sr){
        d.supprimerSR(sr);
    }

    //Poste
    @RequestMapping(value = "/sousreddit/{idSR}/poste/{idPoste}",method = RequestMethod.GET)
    public Poste chercherPoste(@PathVariable("idPoste") String idPoste,@PathVariable("idSR") String idSR){
        return d.chercherPoste(idPoste,idSR);
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/",method = RequestMethod.GET)
    public HashMap<String, Poste> afficherPoste(@PathVariable("idSR") String idSR){
        return listeSR.get(idSR).getPostes();
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/",method = RequestMethod.POST)
    public void ajouterPoste(@RequestBody(required = true) Poste p,@PathVariable("idSR") String idSR){
        d.modifierPoste(p,idSR);
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/",method = RequestMethod.PUT)
    public void misseajourPoste(@RequestBody(required = true) Poste p,@PathVariable("idSR") String idSR){
        d.modifierPoste(p,idSR);
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/",method = RequestMethod.DELETE)
    public void supprimerPoste(@RequestBody(required = true) Poste p,@PathVariable("idSR") String idSR){
        d.supprimerPoste(p,idSR);
    }

    //Commentaire
    @RequestMapping(value = "/sousreddit/{idSR}/poste/commentaire/",method = RequestMethod.GET)
    public HashMap<String,Commentaire> afficherPoste(@PathVariable("idSR") String idSR,@PathVariable("idPoste") String idPoste){
        return listeSR.get(idSR).getPostes().get(idPoste).getCommentaires();
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/commentaire/{idComm}",method = RequestMethod.GET)
    public Commentaire chercherComm(@PathVariable("idSR") String idSR,@PathVariable("idPoste") String idPoste,@PathVariable("idComm") String idComm){
        return d.chercherComm(idComm,idPoste,idSR);
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/{idPoste}/commentaire/",method = RequestMethod.POST)
    public void ajouterComm(@RequestBody(required = true) Commentaire comm,@PathVariable("idSR") String idSR,@PathVariable("idPoste") String idPoste){
        d.modifierComm(comm,idPoste,idSR);
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/{idPoste}/commentaire/",method = RequestMethod.PUT)
    public void miseajourComm(@RequestBody(required = true) Commentaire comm,@PathVariable("idSR") String idSR,@PathVariable("idPoste") String idPoste){
        d.modifierComm(comm,idPoste,idSR);
    }

    @RequestMapping(value = "/sousreddit/{idSR}/poste/{idPoste}/commentaire/",method = RequestMethod.DELETE)
    public void supprimerComm(@RequestBody(required = true) Commentaire comm,@PathVariable("idSR") String idSR,@PathVariable("idPoste") String idPoste){
        d.supprimerComm(comm,idPoste,idSR);
    }



}
