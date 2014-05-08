import java.util.Calendar;
import java.util.Date;


public class DVD extends Movie implements Rentable {

	private final int dayOfReant = 14;
	public Date  endRent;
	public boolean hasRent;
	
	
	public DVD(String name,int id) {
		super(name,id);
		this.endRent = null;
		this.hasRent = false;
	}
	
	


	@Override
	public Date rent(Calendar cal) {
		cal.add(Calendar.DATE, dayOfReant);	
		hasRent= true;
		endRent = cal.getTime();
		return endRent;
	}

	public void returnMoive(){
		hasRent=false;
		endRent = null;
	}

	public Date getEndRent() {
		return endRent;
	}


	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}


	public boolean isHasRent() {
		return hasRent;
	}


	public void setHasRent(boolean hasRent) {
		this.hasRent = hasRent;
	}


	public int getDayOfReant() {
		return dayOfReant;
	}

	



}
