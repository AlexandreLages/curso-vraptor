package controller;

import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import dao.UsuarioDAO;
import model.Usuario;
import session.UsuarioLogado;
import util.SHAUtil;

@Controller
public class LoginController {

	@Inject private UsuarioDAO usuarios;
	@Inject private UsuarioLogado usuarioLogado;
	@Inject private Result result;
	
	@Get("/login")
	public void login() {}
	
	@Post("/login")
	public void login(Usuario usuario) throws NoSuchAlgorithmException {
		usuario.setSenha(SHAUtil.sha(usuario.getSenha()));
		if(usuarios.verifica(usuario)) {
			usuarioLogado.login(usuario);
			result.redirectTo(ProdutoController.class).lista();
		} else {
			result.include("mensagem", "Usuário inválido!");
		}
	}
}