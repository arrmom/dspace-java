package pro.dspace.network;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author mom
 *
 */
public class GetTimeResponse implements Serializable {
	
	private static final long serialVersionUID = 687283134472215526L;
	
	private Date time;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
}
