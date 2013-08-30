package pro.anuj.imma.domain;

import java.io.Serializable;

/**
 * @author Anuj 
 * 
 * Domain Class For Tag. Represents <b>Tag</b> table in data-store
 * 
 */
public class Tag implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5042834158344188509L;

	Integer id;
	String partner;
	String property;
	String device;
	String city;
	
	/**
	 * 
	 * Setters And Getters
	 */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Custom HasCode And Equals For Implementation.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		if (this.id == other.id)
			return true;
		else
			return false;
	}

}
