package Negocio.FactoriaNegocio;

import Negocio.Cliente.ClienteSa;
import Negocio.Cliente.ClienteSaImp;
import Negocio.Producto.ProductoSa;
import Negocio.Producto.ProductoSaImp;
import Negocio.Venta.VentaSa;
import Negocio.Venta.VentaSaImp;


public class FactoriaNegocioImp extends FactoriaNegocio {

	public ProductoSa crearProductoSa() {
	
		return new ProductoSaImp();
		
	}
	
	public ClienteSa crearClienteSa() {
		
		return new ClienteSaImp();
	}

	
	public VentaSa crearVentaSa() {

		return new VentaSaImp();
	}
	
	
}