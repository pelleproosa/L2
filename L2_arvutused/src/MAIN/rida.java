package MAIN;



/*
 * 			Sisse:   
 * 					setDate(Date date);
 * 					setCharname(String charname);
 * 					setLocationname(String locationname);
 * 					setAdenaprofitperH((double AdenaprofitperH));					
        			setAncientAdenaprofitperH((double AncientAdenaprofitperH));	
 * 					setKuvatavAeg(String aeg);
 */




public class rida {
	
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
	
	public rida(String charname, String locationname,int adenaprofit, int ancientadenaprofit, String date, double adenaprofitperh, double ancientadenaprofitperh, String kuvatavaeg){
		super();
		this.charname=charname;
		this.locationname=locationname;
		this.adenaprofit=adenaprofit;
		this.ancientadenaprofit=ancientadenaprofit;
		this.date=date;
		this.AdenaprofitperH=adenaprofitperh;
		this.AncientAdenaprofitperH=ancientadenaprofitperh;
		
		
		
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
    


	public String getDate() {
		return date;
	}

	public void setDate(String kuup) {
		//SimpleDateFormat kuup2ev = new SimpleDateFormat("dd/M/yyyy");             ///date to string
		 
		date = (kuup); 
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
		System.out.println("Date         : "+date);
		System.out.println("a perH       : "+AdenaprofitperH);
		System.out.println("AA perH      : "+AncientAdenaprofitperH);
		System.out.println("Time         : "+KuvatavAeg);

	}
	
}