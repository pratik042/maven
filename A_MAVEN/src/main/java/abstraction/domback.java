package abstraction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="domback")
public class domback 
{
	@Id
	@Column(name="id")
	private int id;
@Column(name="bikename")
private String bikename;

public domback(int id, String bikename) {
	super();
	this.id = id;
	this.bikename = bikename;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBikename() {
	return bikename;
}
public void setBikename(String bikename) {
	this.bikename = bikename;
}
	


}
