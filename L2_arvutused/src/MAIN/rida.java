package MAIN;

import java.io.Serializable;



/*
 * 			Sisse:   
 * 					setDate(Date date);
 * 					setCharname(String charname);
 * 					setLocationname(String locationname);
 * 					setAdenaprofitperH((double AdenaprofitperH));					
        			setAncientAdenaprofitperH((double AncientAdenaprofitperH));	
 * 					setKuvatavAeg(String aeg);
 */




public class rida implements Serializable{
	
    private String charname;
    private String locationname;
    private int adenaprofit;
    private int ancientadenaprofit;
	private int reanr; 
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
	
	public rida(String charname, String locationname,int adenaprofit, int ancientadenaprofit, String kuvatavaeg, double adenaprofitperh, double ancientadenaprofitperh, int Reanr){
		super();
		this.charname=charname;
		this.locationname=locationname;
		this.adenaprofit=adenaprofit;
		this.ancientadenaprofit=ancientadenaprofit;
		this.KuvatavAeg=kuvatavaeg;
		this.AdenaprofitperH=adenaprofitperh;
		this.AncientAdenaprofitperH=ancientadenaprofitperh;
		this.reanr=Reanr;
		
		
		
	}
	
	
	
    public String getCharname() {
        return charname;
    }

    public void setCharname(String cname) {
        charname = cname;
    }
    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locname) {
        locationname = locname;
    }

    public int getAdenaprofit() {
        return adenaprofit;
    }

    public void setAdenaprofit(int aprofit) {
        adenaprofit = aprofit;
    }
    
    public int getAncientadenaprofit() {
        return ancientadenaprofit;
    }

    public void setAncientadenaprofit(int AAprofit) {
        ancientadenaprofit = AAprofit;
    }
    


	public int getReanr() {
		return reanr;
	}

	public void setReanr(int reaNr) {
		//SimpleDateFormat kuup2ev = new SimpleDateFormat("dd/M/yyyy");             ///date to string
		 
		reanr = reaNr; 
	}
	
	public double getAdenaprofitperH() {
		return AdenaprofitperH;
	}

	public void setAdenaprofitperH(double AperH) {
		AdenaprofitperH = AperH;
	}
	
	public double getAncientAdenaprofitperH() {
		return AncientAdenaprofitperH;
	}

	public void setAncientAdenaprofitperH(double AAperH) {
		AncientAdenaprofitperH = AAperH;
	}
	
	public String getKuvatavAeg() {
		return KuvatavAeg;
	}

	public void setKuvatavAeg(String Aeg) {
		
		KuvatavAeg = Aeg;
		
	}
	
	void printout(){
		System.out.println();
		System.out.println("Char name    : "+charname);
		System.out.println("Location name: "+locationname);
		System.out.println("a profit     : "+adenaprofit);
		System.out.println("AA profit    : "+ancientadenaprofit);
		System.out.println("Time         : "+KuvatavAeg);
		System.out.println("a perH       : "+AdenaprofitperH);
		System.out.println("AA perH      : "+AncientAdenaprofitperH);
		System.out.println("Rea nr       : "+reanr);

	}
	
}