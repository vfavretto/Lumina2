
package lumina.Controller;
import luminabe.Model.Admnistrador.*;

public class Controller {
    public int AdmID = 0;
    
    public Controller() {
        
    }
    
    public boolean login(String usuario, String senha) {
        Adm novoAdm = new Adm(AdmID,usuario, senha);
       if (novoAdm.login()) {
            AdmID++;
            return true;
        }
       else {
           return false;
       }
    }
}