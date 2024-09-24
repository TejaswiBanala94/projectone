package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT 
{
	//public static String uname;
	//public static String passwd;
	public static String credentialusername(String sheet, int row ,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\ProjectOne\\DDT\\tejaswi.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String uname = w1.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		//passwd = NumberToTextConverter.toText(w1.getSheet("loginamazon").getRow(0).getCell(1).getNumericCellValue());
		return uname;
		
	}
	public static String credentialpasswd(String sheet, int row ,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\SeleniumBasics\\DDT\\tejaswi.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		//String passwd = w1.getSheet("loginamazon").getRow(row).getCell(cell).getStringCellValue();
		String passwd = NumberToTextConverter.toText(w1.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue());
		return passwd;
		
	}

}
