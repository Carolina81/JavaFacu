package com.ejercicio5.herencia;

public class Tablet extends Device {
	String tactilTechnology, maxResolution, displaySize;
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
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
		sb.append("\nSMS Gratis: ");
		sb.append("\nPeso: ");
		sb.append(weight);
		sb.append("\nTecnología Táctil: ");
		sb.append(tactilTechnology);
		sb.append("\nResolución Pantalla: ");
		sb.append(maxResolution);
		sb.append("\nTamaño Pantalla: ");
		sb.append(displaySize);
		return sb.toString();
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
