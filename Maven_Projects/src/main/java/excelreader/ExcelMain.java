package excelreader;
import java.io.IOException;
public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String d =ExcelCode.getStringData(0,1);
		System.out.println(d);
		String e =ExcelCode.getIntegerData(1,1);
		System.out.println(e);
		

	}

}
