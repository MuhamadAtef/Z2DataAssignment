import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

	static FileInputStream fis = null ; 
	
	public FileInputStream getFileInputStream() 
	{
		String filePath = "H:\\sw\\Z2DataAssignment\\Task5ExcelTC\\Downloads\\gantt-chart_L.xlsx";
		File srcFile = new File(filePath);
		
		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found. terminating Process !! : Check file path of TestData");
			System.exit(0);
		}
		return fis ; 
	}
	
	public Object[][] getExcelData() throws IOException
	{
		fis = getFileInputStream(); 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);


		int TotalNumberOfRows = (sheet.getLastRowNum()+1);
		//System.out.println("The total number of rows is : "+TotalNumberOfRows);
		int TotalNumberOfCols = sheet.getRow(6).getPhysicalNumberOfCells() ;

		String[][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols] ;
		

		
		wb.close();
		return arrayExcelData; 
	}
}
