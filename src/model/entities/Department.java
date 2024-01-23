package model.entities;
import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String name;	
	
	//Constructos
	public Department() {
	}

	public Department(Integer id, String name) {
		Id = id;
		this.name = name;
	}
	
	//Getters e Setters
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Haschcode and Equals
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}
	
	@Override
	public String toString() {
		return "Department name: " + name
				+ "\nDepartment ID: " + Id;
	}

}
