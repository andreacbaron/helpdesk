package com.helpdesk.helpdesk.domain.enums;

public enum Perfil {
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");
	
	private Integer codego;
	private String decricao;
	
	
	private Perfil(Integer codego, String decricao) {
		this.codego = codego;
		this.decricao = decricao;
	}
	public Integer getCodego() {
		return codego;
	}
	public String getDecricao() {
		return decricao;
	}
	public static Perfil toEnum(Integer cod) throws Exception {
		if(cod == null) {
		return null;
	}
		
		
		for(Perfil x : Perfil.values()) {
			if(cod.equals(x.getCodego())) {
				return x;
			}
			
		}
		
		throw new Exception("Status inválida");
	}

}

