package Main;

import Negocio.Departamento.DepartamentoBO;
import Negocio.Departamento.DepartamentoSa;
import Negocio.Departamento.DepartamentoSaImp;
import Negocio.Empleado.EmpleadoSa;
import Negocio.Empleado.TemporalBO;
import Negocio.Excepciones.ExcepcionNegocio;
import Negocio.FactoriaNegocio.FactoriaNegocio;

public class Pruebas {

	public static void main(String[] args) {
		EmpleadoSa esa=FactoriaNegocio.getInstancia().crearEmpleadoSa();
		/*TemporalBO t = new TemporalBO();
		t.setDireccion("asf");
		t.setEmail("sdf");
		t.setImpuestos(12);
		t.setNombre("a");
		t.setNss(123);
		t.setSueldoBase(123456);*/
		
	 
		DepartamentoSa dsa = new DepartamentoSaImp();
		 
		DepartamentoBO dbo = new DepartamentoBO(0);
		DepartamentoBO db1 = new DepartamentoBO(0);
		db1.setNombre("pruebaCambio");
		dbo.setActivo(true);
		dbo.setNombre("prueba1");
	 
		try {
			  // esa.crearEmpleado(t);
			//dsa.crearDepartamento(dbo);
			//System.out.print(esa.listarEmpleado());
			//dsa.listarDepartamento();
			
			/*esa.buscarEmpleadoPorId(2);
			esa.buscarEmpleadoPorNombre("a");
			esa.buscarEmpleadoPorNombre("o");
			esa.listarEmpleado();
			esa.buscarEmpleadoPorNss(123);
			t.setId(2);
			t.setNombre("c");
			esa.modificarEmpleado(t);
			t.setNss(12);
			esa.modificarEmpleado(t);
			esa.borrarEmpleado(1);*/
			
			//dsa.crearDepartamento(dbo);
			//System.out.print(dsa.listarDepartamento());
			//dsa.borrarDepartamento(33);
			//dsa.activarDepartamento(36);
			//System.out.print(dsa.buscarDepartamento(24));
			dsa.modificarDepartamento(db1);
		} catch (ExcepcionNegocio e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
