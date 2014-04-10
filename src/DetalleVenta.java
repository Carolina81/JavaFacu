
public class DetalleVenta {
	private int[] cantidad = new int[5];
	private double subTotal;

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public int getCantidad(int i) {
		return cantidad[i];
	}

	public void setCantidad(int cantidad, int i) {
		this.cantidad[i] = cantidad;
	}
}
