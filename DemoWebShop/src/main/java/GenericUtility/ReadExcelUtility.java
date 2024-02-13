package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
	public static String fetchData(String sheet,int row,int cell) throws IOException {
		 FileInputStream fis = new FileInputStream("C:\\Users\\Twinkle Sandilya\\Desktop\\Booknew.xlsx\\");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		Row r=s.getRow(row);
		return r.getCell(cell).toString();
	}
	public static int rowSize(String sheet) throws IOException {
		 FileInputStream fis = new FileInputStream(Iconstant.excel_Path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		Row r=s.getRow(0);
		return r.getRowNum();
	}
	public static int cellSize(String sheet) throws IOException {
		 FileInputStream fis = new FileInputStream(Iconstant.excel_Path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		Row r=s.getRow(0);
		return r.getPhysicalNumberOfCells();
}
	/**
	 * this method is used to fetch all data in excel sheet
	 * @param sheet
	 * @return
	 * @throws IOException
	 */
	public static Object[][] fetchAllData(String sheet) throws IOException {
		 FileInputStream fis = new FileInputStream(Iconstant.excel_Path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheet);
		int rowsize=s.getPhysicalNumberOfRows();
		int cellsize=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d=new Object[rowsize][cellsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<cellsize;j++) {
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
	}}
			
		
