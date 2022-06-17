package util;

public class excelDataProvider {
	public static void main(String[] args) {
		String excelPath= "C:/Users/LENOVO/eclipse-workspace/test/excel/data.xlsx";
		testData(excelPath,"Sheet1");
	}
	
	public static void testData(String excelPath,String sheetName ) {
		
		excel ex= new excel(excelPath, sheetName);
		int rowCount= ex.getRowCount();
		int colCount= ex.getColCount();
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData= ex.getCellString(i, j);
				System.out.print(cellData+" ");
			}
			System.out.println();
		}
	}

}
