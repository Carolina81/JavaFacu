public class Articulo {
	private int[] id = new int[5]; 
	private int[] stock = new int[5];
	private String[] descripcion = new String[5];
	private double[] precio = new double[5];
	
	public int getId(int i) {
		return id[i];
	}
	public void setId(int id, int i) {
		this.id[i] = id;
	}
	public int getStock(int i) {
		return stock[i];
	}
	public void setStock(int stock, int i) {
		this.stock[i] = stock;
	}
	public String getDescripcion(int i) {
		return descripcion[i];
	}
	public void setDescripcion(String descripcion, int i) {
		this.descripcion[i] = descripcion;
	}
	public double getPrecio(int i) {
		return precio[i];
	}
	public void setPrecio(double precio, int i) {
		this.precio[i] = precio;
	}
}
