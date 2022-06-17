package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excel {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excel(String excelPath,String sheetName ) {
		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet= workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		//getRowCount();
		//getColCount();
		//getCellString(0,0);
		//getCellNumber(1,1);
	}

	public static int getRowCount() {
		int rowCount=0;
		try {
			rowCount= sheet.getPhysicalNumberOfRows();
			//System.out.println("No of rows: "+rowCount);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount() {
		int colCount=0;
		try {
			colCount= sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of col: "+colCount);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}
	
	public static String getCellString(int rowNum, int colNum) {
		String cellData = null;
		try {
			 cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	
	public static void getCellNumber(int rowNum, int colNum) {

		try {
			double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
