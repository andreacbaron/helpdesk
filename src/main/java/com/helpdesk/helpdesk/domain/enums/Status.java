package com.helpdesk.helpdesk.domain.enums;

public enum Status {
	ADMIN(0, "RELE-ADMIN"), CLIENTE(1, "ROLE-CLIENTE"), TECNICO(2, "ROLE-TECNICO");
	
	private Integer codego;
	private String decricao;
	
	
	private Status(Integer codego, String decricao) {
		this.codego = codego;
		this.decricao = decricao;
	}
	public Integer getCodego() {
		return codego;
	}
	public String getDecricao() {
		return decricao;
	}
	public static Status toEnum(Integer cod) throws Exception {
		if(cod == null) {
		return null;
	}
		
		
		for(Status x : Status.values()) {
			if(cod.equals(x.getCodego())) {
				return x;
			}
			
		}
		
		throw new Exception("perfil inválida");
	}

}

