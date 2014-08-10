package objektid;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;



/*
 * 			Sisse:  setKuvatavAeg(String aeg); 
 * 					setDate(Date date);
 * 					setCharname(String charname);
 * 					setLocationname(String locationname);
 * 					setAdenaprofitperH((double AdenaprofitperH));					
        			setAncientAdenaprofitperH((double AncientAdenaprofitperH));	
 * 					
 */



@SuppressWarnings("serial")
public class rida implements Serializable {
    private String charname;
    private String locationname;
    private int adenaprofit;
    private int ancientadenaprofit;
	private String date; 
	private double AdenaprofitperH;
	private double AncientAdenaprofitperH;
	
	/*
	SimpleDateFormat kellaaeg = new SimpleDateFormat("hh:mm:ss");             ///date to string
	private String KuvatavAeg = kellaaeg.format(new Date()); 
	
	*/
	private String KuvatavAeg;
    /*
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  Stringist date tagasi
	String dateInString = "31-08-1982 10:20:56";
	Date date = sdf.parse(dateInString);
	System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982

	*/
    public String getCharname() {
        return charname;
    }

    public void setCharname(String charname) {
        this.charname = charname;
    }
    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public int getAdenaprofit() {
        return adenaprofit;
    }

    public void setAdenaprofit(int adenaprofit) {
        this.adenaprofit = adenaprofit;
    }
    
    public int getAncientadenaprofit() {
        return ancientadenaprofit;
    }

    public void setAncientadenaprofit(int ancientadenaprofit) {
        this.ancientadenaprofit = ancientadenaprofit;
    }
    


	public String getDate() {
		return date;
	}

	public void setDate(Date date) {
		SimpleDateFormat kuup2ev = new SimpleDateFormat("dd/M/yyyy");             ///date to string
		 
		this.date = kuup2ev.format(date); 
	}
	
	public double getAdenaprofitperH() {
		return AdenaprofitperH;
	}

	public void setAdenaprofitperH(double AncientAdenaprofitperH) {
		this.AncientAdenaprofitperH = AncientAdenaprofitperH;
	}
	
	public double getAncientAdenaprofitperH() {
		return AncientAdenaprofitperH;
	}

	public void setAncientAdenaprofitperH(double AncientAdenaprofitperH) {
		this.AncientAdenaprofitperH = AncientAdenaprofitperH;
	}
	
	public String getKuvatavAeg() {
		return KuvatavAeg;
	}

	public void setKuvatavAeg(String KuvatavAeg) {
		
		this.KuvatavAeg = KuvatavAeg;
		
	}
	
}