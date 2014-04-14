public class PC extends Device {
	int cores, ramGB;
	String OS;

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}

	public int getRamGB() {
		return ramGB;
	}

	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}
}
