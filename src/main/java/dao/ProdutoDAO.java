package dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.hibernate.Session;

import br.com.caelum.vraptor.Result;
import model.Produto;

@RequestScoped
public class ProdutoDAO {

	@Inject private Session session;
	@Inject Result result;
	
	public void adicionar(Produto produto) {
		this.session.save(produto);
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> listaTodos() {
		return session.createCriteria(Produto.class)
				.list();
	}
}