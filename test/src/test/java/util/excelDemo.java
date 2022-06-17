package util;

public class excelDemo {

	public static void main(String[] args) {
		String projectPath= System.getProperty("user.dir");
		excel ex = new excel(projectPath +"/excel/data.xlsx", "Sheet1");
		ex.getRowCount();
		ex.getCellString(0, 0);
		ex.getCellNumber(1, 1);
	}

}
