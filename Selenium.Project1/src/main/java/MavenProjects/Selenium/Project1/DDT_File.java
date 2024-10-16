package MavenProjects.Selenium.Project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_File

{

	String PhoneNumber;
	String Password;
	String email;

	public void Excel_Data() throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\harsh\\eclipse-workspace\\Selenium.Project1\\DDT\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		/*
		 * NameL= w1.getSheet("abc").getRow(1).getCell(0).getStringCellValue();
		 * MobileNum=NumberToTextConverter.toText(w1.getSheet("Register").getRow(1).
		 * getCell(1).getNumericCellValue());
		 * Password=w1.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
		 */

		PhoneNumber = NumberToTextConverter.toText(w1.getSheet("abc").getRow(1).getCell(0).getNumericCellValue());
		// long PhoneNumber =
		// w1.getSheet("abc").getRow(1).getCell(0).getStringCellValue();
		Password = w1.getSheet("abc").getRow(1).getCell(1).getStringCellValue();
		email = w1.getSheet("abc").getRow(1).getCell(2).getStringCellValue();
		System.out.println("Username: " + PhoneNumber);
		System.out.println("Password: " + Password);
		System.out.println("Email: " + email);
	}
}
