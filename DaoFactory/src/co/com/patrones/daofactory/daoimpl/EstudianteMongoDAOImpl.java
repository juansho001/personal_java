package co.com.patrones.daofactory.daoimpl;

import java.util.List;

import co.com.patrones.daofactory.dao.EstudianteDAO;
import co.com.patrones.daofactory.pojo.Estudiante;

public class EstudianteMongoDAOImpl implements EstudianteDAO {

	@Override
	public int insert(Estudiante estudiante) throws Exception {
		System.out.println("Insertando estudiante en Mongo DB");
		return 0;
	}

	@Override
	public int delete(Estudiante estudiante) throws Exception {
		System.out.println("Eliminando estudiante en Mongo DB");
		return 0;
	}

	@Override
	public int update(Estudiante estudiante) throws Exception {
		System.out.println("Actualizando estudiante en Mongo DB");
		return 0;
	}

	@Override
	public Estudiante getById(String key) throws Exception {
		System.out.println("Consultando estudiante por id en Mongo DB");
		return null;
	}

	@Override
	public List<Estudiante> getAll() throws Exception {
		System.out.println("Consultando listado estudiante en Mongo DB");
		return null;
	}


}
