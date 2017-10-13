package practise_src;

import java.io.Serializable;

public class Sport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private int nights;

	public Sport(String type,int nights) {
		super();
		this.type = type;
		this.nights=nights;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "plays " + type+" "+nights+" nights of the week." ;
	}

	public int getNights() {
		return nights;
	}

	public void setNights(int nights) {
		this.nights = nights;
	}

}
