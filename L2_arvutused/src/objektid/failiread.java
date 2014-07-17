/**
 * Pelle fail
 */
package objektid;

/**
 *
 */
public class failiread {
	String CharName;
	String LocationName;
	double EarnedAdena;
	double EarnedAncientAdena;
	String time;
	double SpentTimeInSeconds;
	int    reanumber;

	/**
	 * Pelle konstruktor
	 */
	public failiread(int reanumber, String charname, String locname, double adena, double AncientAdena, String time, double SpentTimeInSeconds) 
	{
	
		super();
		this.reanumber=reanumber;
		this.CharName=charname;
		this.LocationName=locname;
		this.EarnedAdena=adena;
		this.EarnedAncientAdena=AncientAdena;
		this.time=time;
		this.SpentTimeInSeconds=SpentTimeInSeconds;
	}

}
