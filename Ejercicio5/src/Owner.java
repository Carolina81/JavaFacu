package com.ejercicio5.herencia;


public class Owner {
	int id;
	String name, jobTitle;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nID: ");
		sb.append(id);
		sb.append("\nNombre: ");
		sb.append(name);
		sb.append("\nTítulo Profesional: ");
		sb.append(jobTitle);
		return sb.toString();
	}
}
