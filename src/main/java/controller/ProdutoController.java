package controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import dao.ProdutoDAO;
import model.Produto;
import session.UsuarioLogado;

@Controller
public class ProdutoController {
	
	@Inject ProdutoDAO produtos;
	@Inject UsuarioLogado usuarioLogado;
	@Inject Result result;

	@Get("/produto/adicionar")
	public void adicionar() {
		
	}
	
	@Post("/produto/adicionar")
	public void adicionar(Produto produto) {
		produtos.adicionar(produto);
		
		result.redirectTo(ProdutoController.class).lista();
	}
	
	@Get("/produto/lista")
	public void lista() {
		List<Produto> listaProdutos = produtos.listaTodos();
		result.include("produtoList", listaProdutos);
	}
}