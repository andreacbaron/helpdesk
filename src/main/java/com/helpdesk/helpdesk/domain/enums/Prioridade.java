package com.helpdesk.helpdesk.domain.enums;

public enum Prioridade {
	ADMIN(0, "RELE-ADMIN"), CLIENTE(1, "ROLE-CLIENTE"), TECNICO(2, "ROLE-TECNICO");
	
	private Integer codego;
	private String decricao;
	
	
	private Prioridade(Integer codego, String decricao) {
		this.codego = codego;
		this.decricao = decricao;
	}
	public Integer getCodego() {
		return codego;
	}
	public String getDecricao() {
		return decricao;
	}
	public static Prioridade toEnum(Integer cod) throws Exception {
		if(cod == null) {
		return null;
	}
		
		
		for(Prioridade x : Prioridade.values()) {
			if(cod.equals(x.getCodego())) {
				return x;
			}
			
		}
		
		throw new Exception("perfil inválida");
	}

}

