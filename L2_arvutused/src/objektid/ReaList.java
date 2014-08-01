package objektid;

import java.io.Serializable;
import java.util.List;



@SuppressWarnings("serial")
public class ReaList implements Serializable {
    String name;
    List<rida> ridadelist;           // Luuakse objektide(tudengid tüüpi) list

    public void setName(String name) {	//objektile omistatakse String tüüpi väärtus ... hetkel nimi
        this.name = name;
    }

    public void setridadelist(List<rida> ridadelist) {   //kohalik list saab väljast saadetud listi sisu
        this.ridadelist = ridadelist;
    }

    public String getName() {			// siin saab väljast pärija omale käesoleva objekti string väärtuse teada... hetkel nimi
        return name;
    }

    public List<rida> getridadelist() {      //siin saab väljast pärija antud objekti sees oleva teise listi kätte
        return ridadelist;
    }
}