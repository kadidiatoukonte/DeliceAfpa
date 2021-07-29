package fr.cda.delicesafpa.dto;

public class IdPanierDTO {
	
	String id;

	public IdPanierDTO() {
		super();
	}

	public IdPanierDTO(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "IdPanierDTO [id=" + id + "]";
	}
	

}
