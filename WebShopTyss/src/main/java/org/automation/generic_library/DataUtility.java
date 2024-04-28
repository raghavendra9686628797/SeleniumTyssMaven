package org.automation.generic_library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility implements FrameWorkConstant {
	public String property_data(String key) throws IOException {
		FileInputStream f = new FileInputStream(properties_path);

		Properties p = new Properties();

		p.load(f);

		String res = p.getProperty(key);
		return res;
	}

	public String excell_data(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(excel_path);
		Workbook book = WorkbookFactory.create(f);
		String value = book.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}

	public static Object[][] getMultipleData(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(excel_path);
		Workbook book = WorkbookFactory.create(f);
		Sheet sh = book.getSheet(sheetname);
		int rownum = sh.getPhysicalNumberOfRows();
		int cellnum = sh.getRow(0).getPhysicalNumberOfCells();
		Object arr[][] = new Object[rownum - 1][cellnum];
		for (int i = 1; i < rownum; i++) {
			for (int j = 0; j < cellnum; j++) {
				arr[i - 1][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}
}
