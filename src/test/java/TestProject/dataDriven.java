package TestProject;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\hsonawane\\Desktop\\Book1.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		int sheets= workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Landing page")){
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				//identify test case column by scanning entire first row
				
				Iterator<Row> rows= sheet.iterator(); // sheet is collection of rows
				Row firstrow= rows.next();
				Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
				int k=0;
				int coloumn = 0;
				while(ce.hasNext())
				{
				Cell value=ce.next();

				if(value.getStringCellValue().equalsIgnoreCase("Ticket"))

				{
				coloumn=k;

				}

				k++;
				}
				
				System.out.println(coloumn);
				//If column is identified, scan entire values to get desired value
				while(rows.hasNext())
				{
				 Row r= rows.next();
				 if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("ENG-3688")) {
					 
					//If desired column value is found then grab all row values
					 Iterator<Cell> cv=firstrow.cellIterator();
					 while(cv.hasNext())
						{
						System.out.println(cv.next().getStringCellValue());

					    }
				     }
				}
			}

	}

}
}
