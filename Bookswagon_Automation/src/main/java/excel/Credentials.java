package excel;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Credentials {
    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public Credentials (String excelPath)
    {
        File src = new File(excelPath);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(src);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getData(int sheetNumber,int row,int column)
    {
        sheet1 = wb.getSheetAt(sheetNumber);
        String data = sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}
