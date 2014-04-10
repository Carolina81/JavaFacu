
public class Venta {
	private int nroFactura;
	private double porcentajeDescuento;
	private double total, totalSinDto;
	
	public double getTotal() {
		return total;
	}

	public double getTotalSinDto() {
		return totalSinDto;
	}

	public void setTotal(double total) {
		this.total = total - (total*porcentajeDescuento/100.0);
	}

	public void setTotalSinDto(double totalSinDto) {
		this.totalSinDto = totalSinDto;
		setTotal(totalSinDto);
	}

	public int getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
}
