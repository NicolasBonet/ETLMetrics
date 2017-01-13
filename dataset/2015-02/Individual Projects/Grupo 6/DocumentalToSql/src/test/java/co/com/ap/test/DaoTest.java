package co.com.ap.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import co.com.ap.dao.IGenericDao;
import co.com.ap.dao.exception.DaoException;
import co.com.ap.dao.impl.GenericDaoImpl;
import co.com.ap.model.GenericJSon;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DaoTest {

	@SuppressWarnings({ "resource" })
	public static void main(String args[]) throws IOException {
		System.out.println("Iniciando proceso de migración de datos");
		String cadenaTotal = "";
		String cadena = "";
		FileReader f = new FileReader("B:/JsonToSql/MTCJson2Sql/models/input.json");
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			cadenaTotal = cadenaTotal + cadena;
		}

		ObjectMapper mapper = new ObjectMapper();
		List<GenericJSon> jsonObjects = mapper.readValue(cadenaTotal, new TypeReference<List<GenericJSon>>() {
		});
		String[] tokens = null;
		String inserts = "";
		for (GenericJSon jsonObject : jsonObjects) {
			inserts = inserts + jsonObject.getSQLInsert();
		}
		tokens = inserts.split(";", -1);
		IGenericDao genericDao = null;
		try {
			genericDao = new GenericDaoImpl();
			genericDao.insertarRegistros(tokens);
			System.out.println("Migración completada exitosamente");
		} catch (DaoException e) {
			System.err.println("Ha ocurrido un error ejecutando el script: "+e.getMessage());
		}
	}

}
