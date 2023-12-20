package com.helpdesk.helpdesk.domain.enums;

public enum Perfil {
	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");
	
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
		
		throw new Exception("Prioridade inválida");
	}

}

