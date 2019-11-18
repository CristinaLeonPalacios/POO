package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoEmpleados {
	protected org.hibernate.SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				 .configure()
				 .build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	protected void crear(Empleados empleados) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(empleados);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Empleados read(int id) {
		Session s =  sessionFactory.openSession();
		Empleados empleados = s.get(Empleados.class, id);
		s.close();
		return empleados;
	}
	
	protected void update(Empleados empleados) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(empleados);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Empleados empleados = new Empleados();
		empleados.setId(id);
		s.delete(empleados);
		s.getTransaction().commit();
		s.close();
	}
}
