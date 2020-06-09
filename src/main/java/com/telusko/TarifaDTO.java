package com.telusko;

import java.util.List;

public class TarifaDTO {

	TarifaDTO(){
		this.setUsuario("none");
		this.setNumeroLinea("none");
		this.setCdrs(null);
	}
	
	TarifaDTO(String usuario, String numeroLinea, List<String>cdrs){
		this.setUsuario(usuario);
		this.setNumeroLinea(numeroLinea);
		this.setCdrs(cdrs);
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(String numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public List<String> getCdrs() {
		return cdrs;
	}

	public void setCdrs(List<String> cdrs) {
		this.cdrs = cdrs;
	}

	private String usuario;
	private String numeroLinea;
	private List<String> cdrs;
}
