package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien arr[] = new SinhVien[2];
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new SinhVien();
				System.out.println("nhap sinh vien thu: " + (i + 1));
				
				System.out.println("nhap ten sinh vien");
				arr[i].setName(sc.nextLine());
				
				System.out.println("nhap tuoi");
				arr[i].setOld(sc.nextInt());
				
				System.out.println("nhap toan");
				arr[i].setToan(sc.nextFloat());
				
				System.out.println("nhap li");
				arr[i].setLi(sc.nextFloat());
				
				System.out.println("nhap hoa");
				arr[i].setHoa(sc.nextFloat());
				sc.nextLine();
			}
		}
		//in danh sach
		float maxDtb = arr[0].dtb();
		for (int i = 0; i < arr.length; i++) {
			if (maxDtb < arr[i].dtb());
			maxDtb = arr[i].dtb();
		}
		for (int i = 0; i < arr.length; i++) {
			if(maxDtb == arr[i].dtb());
			System.out.println(arr[i].toString());
		}
		//sap xep mang theo dtb tang dan
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].dtb() > arr[j].dtb()) {
					SinhVien p = arr[i];
					arr[i] = arr[j];
					arr[j] = p;
				}
			}
		}
	}
		static void print(SinhVien arr[]) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i].toString());
			}
		}
}
