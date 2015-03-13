package edu.upc.eetac.dcanada.ea.Sprint0.api;
import javax.naming.Context;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DataSourceSPA {

	    private DataSource dataSource;
		private static DataSourceSPA instance; //Referencia al singleton
	 
		private DataSourceSPA() {
			super();
			Context envContext = null;
			try {
				envContext = new InitialContext();
				Context initContext = (Context) envContext.lookup("java:/comp/env");
				dataSource = (DataSource) initContext.lookup("jdbc/librodb"); //?
			} catch (NamingException e1) {
				e1.printStackTrace();
			}
		}
	 
		public final static DataSourceSPA getInstance() { //obtener instancia al singleton
			if (instance == null)
				instance = new DataSourceSPA();
			return instance;
		}
	 
		public DataSource getDataSource() {
			return dataSource;
		}
	}