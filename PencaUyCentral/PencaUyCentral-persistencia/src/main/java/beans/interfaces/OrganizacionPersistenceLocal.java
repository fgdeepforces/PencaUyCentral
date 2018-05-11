package beans.interfaces;

import java.util.List;

import javax.ejb.Local;

import entidades.Organizacion;
import entidades.Penca;

@Local
public interface OrganizacionPersistenceLocal {

	boolean agregarOrganizacion(String nombre);

	Organizacion obtenerOrganizacion(String nombre);

	List<Penca> obtenerPencasOrganizacion(String nombre);

	boolean agregarPencaEnOrganizacion(String nombre, Penca penca);

	boolean eliminarPencaEnOrganizacion(String nombre, Penca penca);

	boolean eliminarOrganizacion(String nombre);

}