package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class DaoDepartamentos {
	
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
		
		protected void crear(Departamentos departamentos) {
			Session s =  sessionFactory.openSession();
			s.beginTransaction();
			s.save(departamentos);
			s.getTransaction().commit();
			s.close();
		}
		
		protected Departamentos read(int id) {
			Session s =  sessionFactory.openSession();
			Departamentos departamentos = s.get(Departamentos.class, id);
			s.close();
			return departamentos;
		}
		
		protected void update(Departamentos departamentos) {
			Session s =  sessionFactory.openSession();
			s.beginTransaction();
			s.update(departamentos);
			s.getTransaction().commit();
			s.close();
		}
		
		
		protected void delete(int id) {
			Session s =  sessionFactory.openSession();
			s.beginTransaction();
			Departamentos departamentos = new Departamentos();
			departamentos.setId(id);
			s.delete(departamentos);
			s.getTransaction().commit();
			s.close();
		}
}
