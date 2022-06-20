package Utility;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pareametrizes {
public static String getData(int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\Akash\\Documents\\Auromation 2\\KiteZerodhaa\\src\\test\\resources\\ZerodhaloginCredentials.xlsx");
	String value = WorkbookFactory.create(file).getSheet("Credentilas").getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	
}
}
