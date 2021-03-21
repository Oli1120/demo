package zhang.demo.controler;

import org.springframework.web.bind.annotation.*;
import zhang.demo.modele.Utilisateur;
import zhang.demo.dao.Donnees;

import java.util.HashMap;

import static zhang.demo.dao.Donnees.listeUser;

@RestController
public class UtilisateurControler {
    private Donnees d = new Donnees();

    @RequestMapping(value = "/Utilisateur/",method = RequestMethod.POST)
    public void ajouterUtilisateur(@RequestBody(required = true) Utilisateur u){
        d.modifierUser(u);
    }

    @RequestMapping(value = "/Utilisateur/{idUser}",method = RequestMethod.GET)
    public Utilisateur chercherUtilisateur(@PathVariable("idUser") String id){
        return d.chercherUser(id);
    }

    @RequestMapping(value = "/Utilisateur/",method = RequestMethod.GET)
    public HashMap<String,Utilisateur> afficherUtilisateur(){
        return listeUser;
    }

    @RequestMapping(value = "/Utilisateur/",method = RequestMethod.PUT)
    public void miseajourUtilisateur(@RequestBody(required = true) Utilisateur u){
        d.modifierUser(u);
    }

    @RequestMapping(value = "/Utilisateur/",method = RequestMethod.DELETE)
    public void supprimerUtilisateur(@RequestBody(required = true) Utilisateur u){
        d.supprimerUser(u);
    }


}
