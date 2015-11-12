package br.univel.entity;

public class Usuario {
	
	private int id;
	private Cliente clientId;
	private String senha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getClientId() {
		return clientId;
	}
	public void setClientId(Cliente clientId) {
		this.clientId = clientId;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", Clientid=" + clientId + ", senha="
				+ senha + "]";
	}
	
	
	
}
