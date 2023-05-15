package buggyCarsAutomation.util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class ExcelUtil {

    //Get the test data file
    public static final String TEST_DATA_FILE = "TestData.xlsx";

    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;

    //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheet name as Arguments to this method
    public static void setExcelFile(String Path, String SheetName) throws Exception {
        // Open the Excel file
        FileInputStream ExcelFile = new FileInputStream(Path);
        // Access the required tests data sheet
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
    }

    //This method is to read the tests data from the Excel cell, in this we are passing parameters as Row num and Col num
    public static String getCellData(int RowNum, int ColNum) throws Exception {
        Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
        return Cell.toString();
    }

    public static String getCellData(int RowNum) throws Exception {
        return getCellData(RowNum, 2);
    }

    public static Double getCellDataAsDouble(int RowNum) throws Exception {
        Cell = ExcelWSheet.getRow(RowNum).getCell(2);
        return Cell.getNumericCellValue();
    }
}
