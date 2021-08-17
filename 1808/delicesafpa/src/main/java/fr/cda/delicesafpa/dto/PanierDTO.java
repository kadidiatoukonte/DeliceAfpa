package fr.cda.delicesafpa.dto;

import java.util.List;

import lombok.Data;

@Data
public class PanierDTO {
	private String idpanier;
	private List<PanierDTO> listpanier;

	public PanierDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PanierDTO(String idpanier) {
		super();
		this.idpanier = idpanier;
	}

	public String getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(String idpanier) {
		this.idpanier = idpanier;
	}

	public List<PanierDTO> getListpanier() {
		return listpanier;
	}

	public void setListpanier(List<PanierDTO> listpanier) {
		this.listpanier = listpanier;
	}

	@Override
	public String toString() {
		return "PanierDTO [idpanier=" + idpanier + "]";
	}
	
	
}
