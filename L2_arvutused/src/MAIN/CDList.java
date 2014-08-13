package MAIN;

public class CDList {
	private String artistName;//only one string for the artist name -- including spaces.  
    private String albumTitle;//only one string the title name -- including spaces.  
    private String yearOfRelease;  
    private String recordLabel;  

public CDList(String a,String b, String c, String d){
	super();
	this.artistName=a;
	this.albumTitle=b;
	this.yearOfRelease=c;
	this.recordLabel=d;
}
    public void setartistName(String artist){
    	
    	System.out.println("Olen sees");
        this.artistName = (artist);  
    }  

    public void setalbumTitle(String album){  
    	this.albumTitle = album;  
    }  
  
    public void setyearOfRelease(String yor){  
    	this.yearOfRelease = yor;  
    }  
  
    public void setlabel(String label){  
    	this.recordLabel = label;  
    }  

    public String getartistName(){  
        return this.artistName;  
    }  

    public String getalbumTitle(){  
        return this.albumTitle;  
    }  
  
    public String getyearOfRelease(){  
        return this.yearOfRelease;  
    }  
  
    public String getlabel(){  
        return this.recordLabel;  

    }  


public void printout () {  
System.out.println ("Artist Name: " + this.artistName);  
System.out.println ("Album Title: " + this.albumTitle);  
System.out.println ("Year of Release: " + this.yearOfRelease);  
System.out.println ("Record Label: " + this.recordLabel);  
System.out.println ();  
}  
}
