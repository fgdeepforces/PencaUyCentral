package beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.interfaces.GrupoBusinessLocal;
import beans.interfaces.GrupoBusinessRemote;
import beans.interfaces.GrupoPersistenceRemote;
import entidades.Grupo;

/**
 * Session Bean implementation class GrupoBusiness
 */
@Stateless
@LocalBean
public class GrupoBusiness implements GrupoBusinessRemote, GrupoBusinessLocal {

	@EJB GrupoPersistenceRemote bean;
	
    /**
     * Default constructor. 
     */
    public GrupoBusiness() {
        // TODO Auto-generated constructor stub
    }

    @Override
	public boolean agregarGrupo(String nombre,int fase) {
    	return bean.crearGrupo(nombre, fase);
    }
    
    @Override
	public Grupo obtenerGrupo(int id) {
    	return bean.obtenerGrupo(id);
    }
    
    @Override
	public int obtenerGrupoPorNombreYFase(String nombre,int id) {
    	return bean.obtenerGrupoPorNombreYFase(nombre, id);
    }
    
    @Override
	public boolean eliminarGrupo(int id) {
    	return bean.eliminarGrupo(id);
    }
    
    @Override
	public List<Grupo> obtenerGruposPorFase(int id){
    	return bean.obtenerGruposPorFase(id);
    }
    
}