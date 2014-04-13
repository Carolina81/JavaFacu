package com.ejercicio5.herencia;

public class Laptop extends PC {
	int ensuranceContract;
	String ensuranceCompany, tactilTechnology, maxResolution, displaySize;
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nPeso: ");
		sb.append(weight);
		sb.append("\nTiempo de Seguro Contratado: ");
		sb.append(ensuranceContract);
		sb.append("\nCompañía de Seguro: ");
		sb.append(ensuranceCompany);
		sb.append("\nTecnoloíga Táctil: ");
		sb.append(tactilTechnology);
		sb.append("\nResolución Pantalla: ");
		sb.append(maxResolution);
		sb.append("\nTamaño Pantalla: ");
		sb.append(displaySize);
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
	
	public int getEnsuranceContract() {
		return ensuranceContract;
	}
	public void setEnsuranceContract(int ensuranceContract) {
		this.ensuranceContract = ensuranceContract;
	}
	public String getEnsuranceCompany() {
		return ensuranceCompany;
	}
	public void setEnsuranceCompany(String ensuranceCompany) {
		this.ensuranceCompany = ensuranceCompany;
	}
	public String getTactilTechnology() {
		return tactilTechnology;
	}
	public void setTactilTechnology(String tactilTechnology) {
		this.tactilTechnology = tactilTechnology;
	}
	public String getMaxResolution() {
		return maxResolution;
	}
	public void setMaxResolution(String maxResolution) {
		this.maxResolution = maxResolution;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	} 
}
