import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class Est {
    public void convertExcelToCSV(Sheet sheet, String sheetName) {
        StringBuilder data = new StringBuilder();
        try {
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    CellType type = cell.getCellTypeEnum();
                    if (type == CellType.BOOLEAN) {
                        data.append(cell.getBooleanCellValue());
                    } else if (type == CellType.NUMERIC) {
                        data.append(cell.getNumericCellValue());
                    } else if (type == CellType.STRING) {
                        data.append(cell.getStringCellValue());
                    } else if (type == CellType.BLANK) {
                    } else {
                        data.append(cell + "");
                    }
                    data.append(",");
                }
                data.append('\n');
            }
            Files.write(Paths.get("AccFacilities_25Mar2019" + ".csv"),
                    data.toString().getBytes("UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void estt()
    {
        Est app = new Est();
        String path =  "AccFacilities_25Mar2019.xlsx";
        //InputStream inp = null;
        try (InputStream inp = new FileInputStream(path)) {
            Workbook wb = WorkbookFactory.create(inp);

            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                System.out.println(wb.getSheetAt(i).getSheetName());
                app.convertExcelToCSV(wb.getSheetAt(i), wb.getSheetAt(i).getSheetName());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
