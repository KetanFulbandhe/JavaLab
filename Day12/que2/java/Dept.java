package mypack;

import javax.persistence.*;

@Entity
public class Dept {
	private int id;
	private String name;
	private String loc;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	
}
