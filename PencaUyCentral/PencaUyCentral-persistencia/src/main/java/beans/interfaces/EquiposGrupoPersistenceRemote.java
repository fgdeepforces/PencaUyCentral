package beans.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entidades.Equipo;
import entidades.EquiposGrupo;

@Remote
public interface EquiposGrupoPersistenceRemote {	
	public boolean agregarEquiposGrupo(int equipo,int grupo);
	public List<Equipo> obtenerEquiposPorGrupo(int grupo);
	public boolean eliminarEquiposGrupo(int equipo,int grupo);
	public List<EquiposGrupo> obtenerTodos();
	//public List<EquiposGrupo> obtenerEquiposGrupo(int idg);
}
