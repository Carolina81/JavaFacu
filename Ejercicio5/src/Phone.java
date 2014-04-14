public class Phone extends Device {
	int freeSms, usedSms, freeCallMinutes, freeInternet, usedCallMinutes, usedInternet;
	String number;
	
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
		sb.append(freeSms);
		sb.append("\nMinutos Gratis: ");
		sb.append(freeCallMinutes);
		sb.append("\nInternet Gratis: ");
		sb.append(freeInternet);
		sb.append("\nSMS Usados: ");
		sb.append(usedSms);
		sb.append("\nMinutos Usados: ");
		sb.append(usedCallMinutes);
		sb.append("\nInternet Usado: ");
		sb.append(usedInternet);
		sb.append("\nNúmero de Teléfono: ");
		sb.append(number);
		return sb.toString();
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getFreeSms() {
		return freeSms;
	}
	public void setFreeSms(int freeSms) {
		this.freeSms = freeSms;
	}
	public int getUsedSms() {
		return usedSms;
	}
	public void setUsedSms(int usedSms) {
		this.usedSms = usedSms;
	}
	public int getFreeCallMinutes() {
		return freeCallMinutes;
	}
	public void setFreeCallMinutes(int freeCallMinutes) {
		this.freeCallMinutes = freeCallMinutes;
	}
	public int getFreeInternet() {
		return freeInternet;
	}
	public void setFreeInternet(int freeInternet) {
		this.freeInternet = freeInternet;
	}
	public int getUsedCallMinutes() {
		return usedCallMinutes;
	}
	public void setUsedCallMinutes(int usedCallMinutes) {
		this.usedCallMinutes = usedCallMinutes;
	}
	public int getUsedInternet() {
		return usedInternet;
	}
	public void setUsedInternet(int usedInternet) {
		this.usedInternet = usedInternet;
	}
	
	public int getRemainingSms(){
		int remainingSms = 0;		
		return remainingSms;
	}
	
	public double getRemainingCallMinutes(){
		double remainingCallMinutes = 0.0;
		return remainingCallMinutes;
	}
	
	public double getRemainingInternet(){
		double reaminingInternet = 0.0;
		return reaminingInternet;
	}
}
