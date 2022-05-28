 import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelEx {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("TestData.xls");
		Workbook workbook= Workbook.getWorkbook(fis);
		Sheet sheet=workbook.getSheet(0);
		int noOfrows=sheet.getRows();
		int noOfCol=sheet.getColumns();
		for(int i=0;i<noOfCol;i++) {
			
			for(int j=0;j<noOfrows;j++) {
				Cell cell=sheet.getCell(i, j);
				String val=cell.getContents(); 
				System.out.println(val);
				
				
			}
		}
		

	}

}
