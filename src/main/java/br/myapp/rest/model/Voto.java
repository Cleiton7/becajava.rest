package br.myapp.rest.model;

public class Voto {
	private Long Id;
	private Eleitor eleitor;
	private Eleitor nomeEleitor;
	private Candidato candidato;
	private Zona Zona;
	

	public Eleitor getNomeEleitor() {
		return nomeEleitor;
	}

	public void setNomeEleitor(Eleitor nomeEleitor) {
		this.nomeEleitor = nomeEleitor;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Zona getZona() {
		return Zona;
	}

	public void setZona(Zona zona) {
		Zona = zona;
	}
}
