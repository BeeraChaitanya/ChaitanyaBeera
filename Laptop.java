package projecttt;
//-model,price,processor,ram
public class Laptop {
		private String lapmodel;
		private int lapprice;
		private String lapprocessor;
		private int ram;
		public Laptop(String lapmodel, int lapprice, String lapprocessor, int ram) {
			super();
			this.lapmodel = lapmodel;
			this.lapprice = lapprice;
			this.lapprocessor = lapprocessor;
			this.ram = ram;
		}
		@Override
		public String toString() {
			return "Laptop [lapmodel=" + lapmodel + ", lapprice=" + lapprice + ", lapprocessor=" + lapprocessor
					+ ", ram=" + ram + "]";
		}
		public String getLapmodel() {
			return lapmodel;
		}
		public void setLapmodel(String lapmodel) {
			this.lapmodel = lapmodel;
		}
		public int getLapprice() {
			return lapprice;
		}
		public void setLapprice(int lapprice) {
			this.lapprice = lapprice;
		}
		public String getLapprocessor() {
			return lapprocessor;
		}
		public void setLapprocessor(String lapprocessor) {
			this.lapprocessor = lapprocessor;
		}
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		

	
	}