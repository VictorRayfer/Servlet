package es.Victor.Model;

import java.sql.Date;

public class Company {
	
	private String Name;
	private Date CreationDate;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	
}
