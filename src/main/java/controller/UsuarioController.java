package controller;

import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import dao.UsuarioDAO;
import model.Usuario;
import util.SHAUtil;

@Controller
public class UsuarioController {
	
	@Inject UsuarioDAO dao;
	@Inject Result result;

	@Get("/usuario/adicionar")
	public void adicionar(){}
	
	@Post("/usuario/adicionar")
	public void adicionar(Usuario u) throws NoSuchAlgorithmException{
		u.setSenha(SHAUtil.sha(u.getSenha()));
		dao.adicionar(u);
	}
}
