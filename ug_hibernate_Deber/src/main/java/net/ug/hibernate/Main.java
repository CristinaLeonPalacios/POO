package net.ug.hibernate;

public class Main {

	public static void main(String[] args) {
		crearD();
		//read();
		//update();
		//delete();
	}
	
	public static void crear() {
		DaoEmpleados daoEmpleados = new DaoEmpleados();
		Empleados empleados = new Empleados(4, "27/08/2000", "Cristina", "León", "F", "17/11/2019");		
		daoEmpleados.setup();
		daoEmpleados.crear(empleados);
		empleados = new Empleados(5, "31/05/1999", "Jose", "León", "M", "16/11/2019");
		daoEmpleados.crear(empleados);		
	}
	
	public static void read() {
		DaoEmpleados daoEmpleados = new DaoEmpleados();
		daoEmpleados.setup();
		Empleados empleados = daoEmpleados.read(1);
		empleados.imprimir();
	}

	public static void update() {

		DaoEmpleados daoEmpleados = new DaoEmpleados();
		daoEmpleados.setup();
		Empleados empleados = daoEmpleados.read(1);
		empleados.setNombre("Elizabeth");
		daoEmpleados.update(empleados);
	}
	
	public static void delete() {
		DaoEmpleados daoEmpleados = new DaoEmpleados();
		daoEmpleados.setup();
		daoEmpleados.delete(1);
		daoEmpleados.delete(2);
		daoEmpleados.delete(3);
		daoEmpleados.delete(4);
		daoEmpleados.delete(5);
	}
	
	public static void crearD() {
		DaoDepartamentos daoDepartamentos = new DaoDepartamentos();
		Departamentos departamentos = new Departamentos(1, "Contabilidad");		
		daoDepartamentos.setup();
		daoDepartamentos.crear(departamentos);
		departamentos = new Departamentos(2, "Gerencia");
		daoDepartamentos.crear(departamentos);		
	}
	
	public static void readD() {
		DaoDepartamentos daoDepartamentos = new DaoDepartamentos();
		daoDepartamentos.setup();
		Departamentos departamentos = daoDepartamentos.read(1);
		departamentos.imprimir();
	}

	public static void updateD() {

		DaoDepartamentos daoDepartamentos = new DaoDepartamentos();
		daoDepartamentos.setup();
		Departamentos departamentos = daoDepartamentos.read(1);
		departamentos.setNombred("Finanazas");
		daoDepartamentos.update(departamentos);
	}
	
	public static void deleteD() {
		DaoDepartamentos daoDepartamentos = new DaoDepartamentos();
		daoDepartamentos.setup();
		daoDepartamentos.delete(1);
		daoDepartamentos.delete(2);
	}
}
