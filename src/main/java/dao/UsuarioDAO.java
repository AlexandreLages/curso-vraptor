package dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.Result;
import model.Usuario;

@RequestScoped
public class UsuarioDAO {
	
	@Inject private Session session;
	@Inject Result result;
	
	public void adicionar(Usuario u) {
		this.session.save(u);
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> listaTodos() {
		return session.createCriteria(Usuario.class)
				.list();
	}

	public boolean verifica(Usuario u) {
		Usuario usuario =  (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("login", u.getLogin()))
				.add(Restrictions.eq("senha", u.getSenha()))
				.uniqueResult();
		return usuario != null;
	}
}