package objektid;

import java.io.Serializable;
import java.util.List;



@SuppressWarnings("serial")
public class ReaList implements Serializable {
    String name;
    List<rida> ridadelist;           // Luuakse objektide(tudengid t��pi) list

    public void setName(String name) {	//objektile omistatakse String t��pi v��rtus ... hetkel nimi
        this.name = name;
    }

    public void setridadelist(List<rida> ridadelist) {   //kohalik list saab v�ljast saadetud listi sisu
        this.ridadelist = ridadelist;
    }

    public String getName() {			// siin saab v�ljast p�rija omale k�esoleva objekti string v��rtuse teada... hetkel nimi
        return name;
    }

    public List<rida> getridadelist() {      //siin saab v�ljast p�rija antud objekti sees oleva teise listi k�tte
        return ridadelist;
    }
}