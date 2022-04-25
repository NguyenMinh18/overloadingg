package advance.dev;

public class SinhVien {
		private String name;
		private int old;
		private	float toan;
		private	float li;
		private	float hoa;
		
		public SinhVien() {
			
			
		}
		public float dtb() {
			return (toan + li + hoa) / 3;
		}
		
		public SinhVien(String name, int old, float toan, float li, float hoa) {
			super();
			this.name = name;
			this.old = old;
			this.toan = toan;
			this.li = li;
			this.hoa = hoa;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getOld() {
			return old;
		}
		public void setOld(int old) {
			this.old = old;
		}
		public float getToan() {
			return toan;
		}
		public void setToan(float toan) {
			this.toan = toan;
		}
		public float getLi() {
			return li;
		}
		public void setLi(float li) {
			this.li = li;
		}
		public float getHoa() {
			return hoa;
		}
		public void setHoa(float hoa) {
			this.hoa = hoa;
		}
		public String toString() {
			return String.format("Name:%s - Old:%d - Dtb:%.1f",name, old, dtb());
		}

}
