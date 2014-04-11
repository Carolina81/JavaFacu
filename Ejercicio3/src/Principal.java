

public class Principal {
	private static Articulo articulo = new Articulo();
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
			articulo.setId(i, i);
			articulo.setDescripcion(descripcion[i], i);
			articulo.setPrecio(precio[i], i);
			articulo.setStock(stock[i], i);
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
			articulo.setStock((stock[i] - 1), i);
			detalle.setCantidad(1);
			total += articulo.getPrecio(i) * detalle.getCantidad();
		}
		detalle.setSubTotal(total);
		venta.setTotalSinDto(total);
	}
	
	public static void imprimirFactura(int a, int b){
		int nro = venta.getNroFactura() + 1;
		System.out.println("Factura n�: " + nro + " - ID Factura #" + venta.getNroFactura() + "   Cliente: " + cliente.getRazonSocial());
		System.out.println(" ");
		System.out.println("Art�culo      Cantidad     Precio Unitario     Total");
		
		for (int i = a; i < b; i++) {
			String totalxArticulo; 
			double aux = articulo.getPrecio(i) * detalle.getCantidad();
			totalxArticulo = String.format("%.2f", aux);
			System.out.println(articulo.getDescripcion(i) + "........" + detalle.getCantidad() + ".............$" + articulo.getPrecio(i) + "..........$" + totalxArticulo);
		}

		System.out.println(" ");
		System.out.println("Subtotal:......................................$" + detalle.getSubTotal());
		System.out.println("Total (con descuento):.........................$" + venta.getTotal());
		System.out.println(" ");
		System.out.println("------------------------------------------------------");
		System.out.println(" ");
	}

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
		descripcion = new String[]{"Art�culo 1", "Art�culo 2", "Art�culo 3", "Art�culo 4", "Art�culo 5"};
		stock = new int[]{5, 3, 7, 6, 2};
		precio = new double[]{10.00, 15.50, 05.75, 80.00, 77.5};
	}
}