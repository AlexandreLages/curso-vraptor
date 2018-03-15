package controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import dao.ProdutoDAO;
import model.Produto;

@Controller
public class ProdutoController {
	
	@Inject ProdutoDAO produtos;
	@Inject Result result;

	@Get("/produto/adicionar")
	public void adicionar() {
		
	}
	
	@Post("/produto/adicionar")
	public void adicionar(Produto produto) {
		produtos.adicionar(produto);
		result.include("mensagem", "Produto cadastrado com sucesso!");
	}
	
	@Get("/produto/lista")
	public void lista() {
		List<Produto> listaProdutos = produtos.listaTodos();
		result.use(Results.xml()).from(listaProdutos).serialize();
	}
}