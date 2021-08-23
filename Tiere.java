package Models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author İstanbul
 */
import java.sql.Date;

public class Tiere {
    private String rasse;
    private int id;
    private Date geburtsDatum;
    private boolean weiblich;
   
    public Tiere (String rasse, int id, Date geburtsDatum, boolean weiblich) {
	
    this.rasse = rasse;
    this.id = id;
    this.geburtsDatum = geburtsDatum;
    this.weiblich = weiblich;
   }

    public Tiere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getRasse () {
			return this.rasse;}
    public void setRasse (String neurasse) {
			this.rasse = neurasse;}

    public int getId () {
			return this.id;}
    public void setId (int neuid) {
			this.id = neuid;}

    public Date getGeburtsDatum () {
			return this.geburtsDatum;}
    public void setGeburtsDatum (Date neuegeburtsDatum) {
			this.geburtsDatum = neuegeburtsDatum;}

    public boolean getWeiblich () {
			return this.weiblich;}
    public void setWeiblich (boolean mannlich) {
			this.weiblich = mannlich;}


   @Override
   public String toString () {
	return "Animal [rasse=" + this.rasse + ", id=" + this.id + ", geburtsDatum=" + this.geburtsDatum + ", weiblich="
		+ this.weiblich + "]";
   }

}
