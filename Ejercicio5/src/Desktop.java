public class Desktop extends PC {
	int box;
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nBox: ");
		sb.append(box);
		sb.append("\nID: ");
		sb.append(id);
		sb.append("\nID Owner: ");
		sb.append(idOwner);
		sb.append("\nNombre: ");
		sb.append(name);
		sb.append("\nMarca: ");
		sb.append(brand);
		sb.append("\nModelo: ");
		sb.append(model);
		sb.append("\nSerial: ");
		sb.append(serial);
		sb.append("\nCantidad de Núcleos: ");
		sb.append(cores);
		sb.append("\nRAM: ");
		sb.append(ramGB);
		sb.append("\nSistema(s) Operativo(s): ");
		sb.append(OS);
		return sb.toString();
	}

	public int getBox() {
		return box;
	}

	public void setBox(int box) {
		this.box = box;
	}
}
