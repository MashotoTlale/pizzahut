package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(
            String filePath,
            String sheetName,
            int rowNumber,
            int columnNumber) throws Exception {

        FileInputStream file =
                new FileInputStream(filePath);

        Workbook workbook =
                new XSSFWorkbook(file);

        Sheet sheet =
                workbook.getSheet(sheetName);

        Row row =
                sheet.getRow(rowNumber);

        DataFormatter formatter =
                new DataFormatter();

        String value =
                formatter.formatCellValue(
                        row.getCell(columnNumber)
                );

        workbook.close();
        file.close();

        return value;
    }
}
