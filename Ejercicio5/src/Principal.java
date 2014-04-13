package com.ejercicio5.herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Device> device = new ArrayList<Device>();
	static ArrayList<Owner> alOwners = new ArrayList<Owner>();
	static ArrayList<Device> devicesLighterThan = new ArrayList<Device>();
	static Scanner scanner = new Scanner(System.in);
	static int idAutoIncrementalSmartPhone = 1;
	static int idAutoIncrementalPhone = 1;
	static int idAutoIncrementalTablet = 1;
	static int idAutoIncrementalDesktop = 1;
	static int idAutoIncrementalLaptop = 1;
	static int idAutoIncrementalDisplay = 1;
	static int idAutoIncrementalOwners;
	
	public static void main(String[] args) {
		crearOwner();
		
		for (int i = 0; i < device.size(); i++) {
			System.out.println(device.get(i));
		}
		
		System.out.println("Ingresar peso máximo: ");
		int weight;
		weight = scanner.nextInt();
		scanner.nextLine();
		setDevicesLighterThan(weight);
		System.out.println("Los dispositivos con menor peso a " + weight + " son:");
		for (int i = 0; i < devicesLighterThan.size(); i++) {
			System.out.println(devicesLighterThan.get(i));
		}
	}
	
	public static ArrayList<Device> getDevices(){
		return device;
	}
	
	public static void setDevicesLighterThan(double maxWeight){	
		for (int i = 0; i < device.size(); i++) {
			if(device.get(i).getWeight() <= maxWeight){
				devicesLighterThan.add(device.get(i));
			}
		}
	}
	
	private static void crearOwner() {
		Owner owner;
		String name, jobTitle;
		int nro;
		
		do {
			System.out.println("Cantidad de Owners: ");
			nro = scanner.nextInt();
		} while (nro < 0);
		scanner.nextLine(); //limpia el scanner
		
		for (int i = 1; i <= nro; i++) {
			idAutoIncrementalOwners = i;
			System.out.println("Owner " + i);			
			System.out.println("Nombre: ");
			name = scanner.nextLine();
			System.out.println("Título Profesional: ");
			jobTitle = scanner.nextLine();
			scanner.nextLine();
			owner = new Owner();
			owner.setId(idAutoIncrementalOwners);
			owner.setName(name);
			owner.setJobTitle(jobTitle);
			alOwners.add(owner);
			
			crearDisplay();
			crearDesktop();
			crearLaptop();
			crearTablet();
			crearSmartPhone();
			crearPhone();
		}
	}

	private static void crearDisplay() {
		Display display;
		int nro;
		String serial, brand, model, name, tactilTechnology, maxResolution, displaySize;
		
		do {
			System.out.println("Cantidad de Displays: ");
			nro = scanner.nextInt();
		} while (nro < 0);
		scanner.nextLine();
		
		for (int i = 1; i <= nro; i++) {
			System.out.println("Display " + i);
			System.out.println("Serial: ");
			serial = scanner.nextLine();
			System.out.println("Marca: ");
			brand = scanner.nextLine();
			System.out.println("Modelo: ");
			model = scanner.nextLine();
			System.out.println("Nombre: ");
			name = scanner.nextLine();
			System.out.println("Tecnología táctil: ");
			tactilTechnology = scanner.nextLine();
			System.out.println("Máxima Resolución: ");
			maxResolution = scanner.nextLine();
			System.out.println("Tamaño pantalla: ");
			displaySize = scanner.nextLine();
			scanner.nextLine();
			System.out.println(" ");
			display = new Display();
			display.setId(idAutoIncrementalDisplay++);
			display.setIdOwner(idAutoIncrementalOwners);
			display.setSerial(serial);
			display.setBrand(brand);
			display.setModel(model);
			display.setName(name);
			display.setTactilTechnology(tactilTechnology);
			display.setMaxResolution(maxResolution);
			display.setDisplaySize(displaySize);
			device.add(display);
		}
	}

	private static void crearLaptop() {
		Laptop laptop;
		int nro, cores, ramGB, weight, ensuranceContract;
		String oS, ensuranceCompay, serial, brand, model, name, tactilTechnology, maxResolution, displaySize;
		
		do {
			System.out.println("Cantidad de Laptops: ");
			nro = scanner.nextInt();
		} while (nro < 0);
		scanner.nextLine();
		
		for (int i = 1; i <= nro; i++) {
			System.out.println("Laptop " + i);
			System.out.println("Serial: ");
			serial = scanner.nextLine();
			System.out.println("Marca: ");
			brand = scanner.nextLine();
			System.out.println("Modelo: ");
			model = scanner.nextLine();
			System.out.println("Nombre: ");
			name = scanner.nextLine();
			System.out.println("Tecnología táctil: ");
			tactilTechnology = scanner.nextLine();
			System.out.println("Máxima Resolución: ");
			maxResolution = scanner.nextLine();
			System.out.println("Tamaño pantalla: ");
			displaySize = scanner.nextLine();
			System.out.println("Número de Núcleos: ");
			cores = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Memoria RAM: ");
			ramGB = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Peso (en gramos): ");
			weight = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Sistema(s) Operativo(s): ");
			oS = scanner.next();
			scanner.nextLine();
			System.out.println("Compañía de Seguro: ");
			ensuranceCompay = scanner.next();
			scanner.nextLine();
			System.out.println("Tiempo de seguro: ");
			ensuranceContract = scanner.nextInt();
			scanner.nextLine();
			System.out.println(" ");
			laptop = new Laptop();
			laptop.setBrand(brand);
			laptop.setModel(model);
			laptop.setName(name);
			laptop.setSerial(serial);
			laptop.setId(idAutoIncrementalLaptop++);
			laptop.setIdOwner(idAutoIncrementalOwners);
			laptop.setCores(cores);
			laptop.setRamGB(ramGB);
			laptop.setOS(oS);
			laptop.setWeight(weight);
			laptop.setEnsuranceCompany(ensuranceCompay);
			laptop.setEnsuranceContract(ensuranceContract);
			laptop.setTactilTechnology(tactilTechnology);
			laptop.setMaxResolution(maxResolution);
			laptop.setDisplaySize(displaySize);
			device.add(laptop);
		}
	}

	private static void crearDesktop() {
		Desktop desktop;
		int nro, cores, ramGB, box;
		String OS, serial, brand, model, name;
		
		do {
			System.out.println("Cantidad de PC: ");
			nro = scanner.nextInt();
		} while (nro < 0);
		scanner.nextLine();
		
		for (int i = 1; i <= nro; i++) {
			System.out.println("Desktop " + i);
			System.out.println("Serial: ");
			serial = scanner.nextLine();
			System.out.println("Marca: ");
			brand = scanner.nextLine();
			System.out.println("Modelo: ");
			model = scanner.nextLine();
			System.out.println("Nombre: ");
			name = scanner.nextLine();
			System.out.println("Box: ");
			box = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Número de Núcleos: ");
			cores = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Memoria RAM: ");
			ramGB = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Sistema(s) Operativo(s): ");
			OS = scanner.next();
			scanner.nextLine();
			System.out.println(" ");
			desktop = new Desktop();
			desktop.setBrand(brand);
			desktop.setModel(model);
			desktop.setName(name);
			desktop.setSerial(serial);
			desktop.setId(idAutoIncrementalDesktop++);
			desktop.setIdOwner(idAutoIncrementalOwners);
			desktop.setCores(cores);
			desktop.setRamGB(ramGB);
			desktop.setOS(OS);
			desktop.setBox(box); //no se a que se refiere...
			device.add(desktop);
		}
	}

	private static void crearTablet() {
		Tablet tablet;
		int nro, weight;
		String serial, brand, model, name, tactilTechnology, maxResolution, displaySize;
		
		do {
			System.out.println("Cantidad de Tablets: ");
			nro = scanner.nextInt();
		} while (nro < 0);
		scanner.nextLine();
		
		for (int i = 1; i <= nro; i++) {
			System.out.println("Tablet " + i);
			System.out.println("Serial: ");
			serial = scanner.nextLine();
			System.out.println("Marca: ");
			brand = scanner.nextLine();
			System.out.println("Modelo: ");
			model = scanner.nextLine();
			System.out.println("Nombre: ");
			name = scanner.nextLine();
			System.out.println("Tecnología táctil: ");
			tactilTechnology = scanner.nextLine();
			System.out.println("Máxima Resolución: ");
			maxResolution = scanner.nextLine();
			System.out.println("Tamaño pantalla: ");
			displaySize = scanner.nextLine();
			System.out.println("Peso (en gramos): ");
			weight = scanner.nextInt();
			scanner.nextLine();
			System.out.println(" ");
			tablet = new Tablet();
			tablet.setBrand(brand);
			tablet.setModel(model);
			tablet.setName(name);
			tablet.setSerial(serial);
			tablet.setId(idAutoIncrementalTablet++);
			tablet.setIdOwner(idAutoIncrementalOwners);
			tablet.setWeight(weight);
			tablet.setTactilTechnology(tactilTechnology);
			tablet.setMaxResolution(maxResolution);
			tablet.setDisplaySize(displaySize);
			device.add(tablet);
		}
	}

	private static void crearPhone() {
		Phone phone;
		int nro, freeSms, freeCallMinutes, freeInternet, usedSms, usedCallMinutes, usedInternet;
		String serial, brand, model, name, number;
		
		do {
			System.out.println("Cantidad de Phones: ");
			nro = scanner.nextInt();
		} while (nro < 0);
		scanner.nextLine();
		
		for (int i = 1; i <= nro; i++) {
			System.out.println("Phone " + i);
			System.out.println("Serial: ");
			serial = scanner.nextLine();
			System.out.println("Marca: ");
			brand = scanner.nextLine();
			System.out.println("Modelo: ");
			model = scanner.nextLine();
			System.out.println("Nombre: ");
			name = scanner.nextLine();
			System.out.println("SMS Gratis: ");
			freeSms = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Minutos Gratis: ");
			freeCallMinutes = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Internet Gratis: ");
			freeInternet = scanner.nextInt();
			scanner.nextLine();
			System.out.println("SMS usados: ");
			usedSms = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Minutos usados: ");
			usedCallMinutes = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Internet usado: ");
			usedInternet = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Número telefónico: ");
			number = scanner.next();
			scanner.nextLine();
			System.out.println(" ");
			phone = new Phone();
			phone.setBrand(brand);
			phone.setModel(model);
			phone.setName(name);
			phone.setSerial(serial);
			phone.setId(idAutoIncrementalPhone++);
			phone.setIdOwner(idAutoIncrementalOwners);
			phone.setNumber(number);
			phone.setFreeSms(freeSms);
			phone.setFreeCallMinutes(freeCallMinutes);
			phone.setFreeInternet(freeInternet);
			phone.setUsedSms(usedSms);
			phone.setUsedCallMinutes(usedCallMinutes);
			phone.setFreeInternet(usedInternet);
			device.add(phone);
		}
	}

	public static void crearSmartPhone(){
		SmartPhone smartPhone;
		int nro, freeSms, freeCallMinutes, freeInternet, usedSms, usedCallMinutes, usedInternet, weight;
		String serial, brand, model, name, number, tactilTechnology, maxResolution, displaySize;
		
		do {
			System.out.println("Cantidad de SmartPhones: ");
			nro = scanner.nextInt();
		} while (nro < 0);
		scanner.nextLine();
		
		for (int i = 1; i <= nro; i++) {
			System.out.println("Smartphone " + i);
			System.out.println("Serial: ");
			serial = scanner.nextLine();
			System.out.println("Marca: ");
			brand = scanner.nextLine();
			System.out.println("Modelo: ");
			model = scanner.nextLine();
			System.out.println("Nombre: ");
			name = scanner.nextLine();
			System.out.println("SMS Gratis: ");
			freeSms = scanner.nextInt();			
			scanner.nextLine();
			System.out.println("Minutos Gratis: ");
			freeCallMinutes = scanner.nextInt();			
			scanner.nextLine();
			System.out.println("Internet Gratis: ");
			freeInternet = scanner.nextInt();			
			scanner.nextLine();
			System.out.println("SMS usados: ");
			usedSms = scanner.nextInt();			
			scanner.nextLine();
			System.out.println("Minutos usados: ");
			usedCallMinutes = scanner.nextInt();			
			scanner.nextLine();
			System.out.println("Internet usado: ");
			usedInternet = scanner.nextInt();			
			scanner.nextLine();
			System.out.println("Número telefónico: ");
			number = scanner.next();
			scanner.nextLine();
			System.out.println("Tecnología táctil: ");
			tactilTechnology = scanner.next();
			scanner.nextLine();
			System.out.println("Máxima Resolución: ");
			maxResolution = scanner.next();
			scanner.nextLine();
			System.out.println("Tamaño pantalla: ");
			displaySize = scanner.next();
			scanner.nextLine();
			System.out.println("Peso (en gramos): ");
			weight = scanner.nextInt();			
			scanner.nextLine();
			System.out.println(" ");
			smartPhone = new SmartPhone();
			smartPhone.setBrand(brand);
			smartPhone.setModel(model);
			smartPhone.setName(name);
			smartPhone.setSerial(serial);
			smartPhone.setId(idAutoIncrementalPhone++);
			smartPhone.setIdOwner(idAutoIncrementalOwners);
			smartPhone.setNumber(number);
			smartPhone.setFreeSms(freeSms);
			smartPhone.setFreeCallMinutes(freeCallMinutes);
			smartPhone.setFreeInternet(freeInternet);
			smartPhone.setUsedSms(usedSms);
			smartPhone.setUsedCallMinutes(usedCallMinutes);
			smartPhone.setFreeInternet(usedInternet);
			smartPhone.setWeight(weight);
			smartPhone.setTactilTechnology(tactilTechnology);
			smartPhone.setMaxResolution(maxResolution);
			smartPhone.setDisplaySize(displaySize);
			device.add(smartPhone);
		}
	}
}
