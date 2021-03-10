package readerUtilities;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcelFiles {

    XSSFWorkbook xssfWorkbook = null;
    XSSFSheet xssfSheet = null;
    XSSFRow xssfRows = null;
    XSSFCell xssfCell = null;

    FileOutputStream fio = null;
    int numberOfRows, numberOfCol, rowNum;

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/readerUtilities/TestData.xlsx";

        ReadExcelFiles excel = new ReadExcelFiles();
        String[][] studentData = null;

        try {
            studentData = excel.excelStringReader2D(path, "StudentInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (studentData != null) {

            for (String[] array : studentData) {
                for (String s : array) {
                    System.out.println(s);
                }
            }
            System.out.println();
        }
    }

    /**
     * READER & WRITER METHODS (String)
     */

    // RETURNS ARRAY OF STRING ARRAYS (XSSF) - Excel sheet should have header row (this method will skip header row)
    public String[][] excelStringReader2D(String path, String sheetName) throws IOException {
        String[][] data;
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows][numberOfCol];

        for (int i = 1; i <= numberOfRows; i++) {
            xssfRows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                xssfCell = xssfRows.getCell(j);
                String cellData = getCellValue(xssfCell);
                data[i-1][j] = cellData;
            }
        }
        return data;
    }

    // RETURNS STRING ARRAY (XSSF)
    public String[] excelStringReader(String path, String sheetName) throws IOException {
        String[] data;
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();

        data = new String[numberOfRows];

        for (int i = 1; i <= numberOfRows; i++) {
            xssfRows = xssfSheet.getRow(i);
            xssfCell = xssfRows.getCell(0);
            String cellData = getCellValue(xssfCell);
            data[i-1] = cellData;
        }
        return data;
    }

    // CREATES EXCEL WORKBOOK AND WRITES STRING VALUES INTO A SHEET (XSSF)
    public void excelStringWriter(String value, String path) throws IOException {
        xssfWorkbook = new XSSFWorkbook();
        xssfSheet = xssfWorkbook.createSheet();
        xssfRows = xssfSheet.createRow(rowNum);
        xssfRows.setHeightInPoints(10);

        fio = new FileOutputStream(new File(path));
        xssfWorkbook.write(fio);
        for (int i = 0; i < xssfRows.getLastCellNum(); i++) {
            xssfRows.createCell(i);
            xssfCell.setCellValue(value);
        }
        fio.close();
        xssfWorkbook.close();
    }

    /**
     * READER & WRITER METHODS (Integer)
     */

    // RETURNS ARRAY OF INTEGER ARRAYS (XSSF)
    public int[][] excelIntegerReader2D(String path, String sheetName) throws IOException {
        int[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        data = new int[numberOfRows + 1][numberOfCol + 1];

        for (int i = 0; i < data.length; i++) {
            xssfRows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                xssfCell = xssfRows.getCell(j);
                int cellData = (int) xssfCell.getNumericCellValue();
                data[i][j] = cellData;
            }
        }
        return data;
    }

    // RETURNS INTEGER ARRAY (XSSF)
    public int[] excelIntegerReader(String path, String sheetName) throws IOException {
        int[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        xssfWorkbook = new XSSFWorkbook(fis);
        xssfSheet = xssfWorkbook.getSheet(sheetName);
        numberOfRows = xssfSheet.getLastRowNum();
        numberOfCol = xssfSheet.getRow(0).getLastCellNum();
        data = new int[numberOfRows + 1];

        for (int i = 0; i < data.length; i++) {
            xssfRows = xssfSheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                xssfCell = xssfRows.getCell(j);
                int cellData = (int) xssfCell.getNumericCellValue();
                data[i] = cellData;
            }
        }
        return data;
    }

    // CREATES EXCEL WORKBOOK AND WRITES INTEGER VALUES INTO A SHEET (XSSF)
    public void excelIntegerWriter(int value, String path) throws IOException {
        xssfWorkbook = new XSSFWorkbook();
        xssfSheet = xssfWorkbook.createSheet();
        xssfRows = xssfSheet.createRow(rowNum);
        xssfRows.setHeightInPoints(10);

        fio = new FileOutputStream(new File(path));
        xssfWorkbook.write(fio);
        for (int i = 0; i < xssfRows.getLastCellNum(); i++) {
            xssfRows.createCell(i);
            xssfCell.setCellValue(value);
        }
        fio.close();
        xssfWorkbook.close();
    }



    // HELPER METHODS TO GET VALUES FROM INDIVIDUAL CELLS - CALLED WITHIN READER METHODS
    public String getCellValue(XSSFCell cell) {
        Object value;

        CellType dataType = cell.getCellType();
        switch (dataType) {
            case NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case STRING:
                value = cell.getStringCellValue();
                break;
            case BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
            default:
                value = cell.getRawValue();
        }

        return value.toString();
    }

}
