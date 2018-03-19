package session;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import model.Usuario;

@Named("usuariologado")
@SessionScoped
public class UsuarioLogado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	
	public void login(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void logout() {
		this.usuario = null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}