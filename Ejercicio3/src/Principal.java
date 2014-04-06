

public class Principal {
	private static Articulo[] articulo = new Articulo[5];
	private static Cliente cliente = new Cliente();
	private static Venta venta = new Venta();
	private static String[] descripcion;
	private static int[] stock;
	private static double[] precio;
	private static DetalleVenta detalle = new DetalleVenta();

	public static void main(String[] args) {
		crearArticulo();
		crearCliente();
	}
	
	private static void crearArticulo() {		
		dataBase();
		
		for (int i = 0; i < 5; i++) {
			articulo[i].setId(i);
			articulo[i].setDescripcion(descripcion[i]);
			articulo[i].setPrecio(precio[i]);
			articulo[i].setStock(stock[i]);
		}
	}

	public static void crearCliente(){
		cliente.setId(1);
		cliente.setRazonSocial("Tony Montana");
		
		for (int i = 0; i < 2; i++) {
			crearFactura(i);
		}
	}
	
	public static void setearTotales(int a, int b){
		double total = 0.0;
		
		for (int i = a; i < b; i++) {
			articulo[i].setStock(stock[i] - 1);
			detalle.setCantidad(1);
			total += articulo[i].getPrecio() * detalle.getCantidad();
		}
		detalle.setSubTotal(total);
		venta.setTotalSinDto(total);
	}
	
	public static void imprimirFactura(int a, int b){
		int nro = venta.getNroFactura() + 1;
		System.out.println("Factura n°: " + nro + " - ID Factura #" + venta.getNroFactura());
		System.out.println("Cliente: " + cliente.getRazonSocial());
		System.out.println("Artículo      Cantidad     Precio Unitario     Total");
		
		for (int i = a; i < b; i++) {
			String totalxArticulo; 
			double aux = articulo[i].getPrecio() * detalle.getCantidad();
			totalxArticulo = String.format("%2.f", aux);
			System.out.println(articulo[i].getDescripcion() + "        " + detalle.getCantidad() + "             $" + articulo[i].getPrecio() + "            $" + totalxArticulo);
		}
		
		System.out.println("Subtotal:                                    $" + detalle.getSubTotal());
		System.out.println("Total (con descuento):                       $" + venta.getTotal());
	}
	
	@SuppressWarnings("unused")
	public static void crearFactura(int id){
		venta.setNroFactura(id);
		venta.setPorcentajeDescuento(10.0);
		
		if(id == 0){
			setearTotales(0, 3);
			imprimirFactura(0, 3);
		}
		else{
			setearTotales(3, 5);
			imprimirFactura(3, 5);
		}
	}
	
	public static void dataBase(){
		descripcion = new String[]{"Artículo 1", "Artículo 2", "Artículo 3", "Artículo 4", "Artículo 5"};
		stock = new int[]{5, 3, 7, 6, 2};
		precio = new double[]{10.0, 15.5, 5.75, 80.0, 77.77};
	}
}