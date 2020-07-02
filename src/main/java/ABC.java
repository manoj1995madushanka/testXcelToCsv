/*
import au.com.bytecode.opencsv.CSVWriter;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class ABC {
    void xslTocsv() throws IOException {
        //First we read the Excel file in binary format into FileInputStream
        FileInputStream input_document = new FileInputStream(new File("AccFacilities_25Mar2019.xlsx"));
        // Read workbook into HSSFWorkbook
        HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document);
        // Read worksheet into HSSFSheet
        HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);
        // To iterate over the rows
        Iterator<Row> rowIterator = my_worksheet.iterator();
        // OpenCSV writer object to create CSV file
        FileWriter my_csv=new FileWriter("convertedCSVFile.csv");
        CSVWriter my_csv_output=new CSVWriter(my_csv);
        //Loop through rows.
        while(rowIterator.hasNext()) {
            Row row = rowIterator.next();
            int i=0;//String array
            //change this depending on the length of your sheet
            String[] csvdata = new String[2];
            Iterator<Cell> cellIterator = row.cellIterator();
            while(cellIterator.hasNext()) {
                Cell cell = cellIterator.next(); //Fetch CELL
                switch(cell.getCellType()) { //Identify CELL type
                    //you need to add more code here based on
                    //your requirement / transformations
                    case Cell.CELL_TYPE_STRING:
                        csvdata[i]= cell.getStringCellValue();
                        break;
                }
                i=i+1;
            }
            my_csv_output.writeNext(csvdata);
        }
        my_csv_output.close(); //close the CSV file
        //we created our file..!!
        input_document.close(); //close xls
    }

   */
/* void testTwo() throws IOException, InvalidFormatException {
        Workbook wb = new XSSFWorkbook(new File("AccFacilities_25Mar2019.xlsx"));
        int sheetNo = 0;//Integer.parseInt(args[index++]);
        FormulaEvaluator fe = null;
        if ( index < args.length ) {
            fe = wb.getCreationHelper().createFormulaEvaluator();
        }
        DataFormatter formatter = new DataFormatter();
        PrintStream out = new PrintStream(new FileOutputStream(csvFile),
                true, "UTF-8");
        byte[] bom = {(byte)0xEF, (byte)0xBB, (byte)0xBF};
        out.write(bom);
        {
            Sheet sheet = wb.getSheetAt(sheetNo);
            for (int r = 0, rn = sheet.getLastRowNum(); r <= rn; r++) {
                Row row = sheet.getRow(r);
                if (row == null) {
                    out.println(',');
                    continue;
                }
                boolean firstCell = true;
                for (int c = 0, cn = row.getLastCellNum(); c < cn; c++) {
                    Cell cell = row.getCell(c, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                    if (!firstCell) out.print(',');
                    if (cell != null) {
                        if (fe != null) cell = fe.evaluateInCell(cell);
                        String value = formatter.formatCellValue(cell);
                        if (cell.getCellTypeEnum() == CellType.FORMULA) {
                            value = "=" + value;
                        }
                        out.print(encodeValue(value));
                    }
                    firstCell = false;
                }
                out.println();
            }
        }
    }*//*



    public static void echoAsCSV(Sheet sheet) {
        Row row = null;
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                System.out.print("\"" + row.getCell(j) + "\";");
            }
            System.out.println();
        }
    }

    public void test3() {
        InputStream inp = null;
        try {
            inp = new FileInputStream("AccFacilities_25Mar2019.xlsx");
            Workbook wb = WorkbookFactory.create(inp);

            for(int i=0;i<wb.getNumberOfSheets();i++) {
                System.out.println(wb.getSheetAt(i).getSheetName());
                echoAsCSV(wb.getSheetAt(i));
            }
        } catch (InvalidFormatException ex) {
            //Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
          //  Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inp.close();
            } catch (IOException ex) {
                //Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
*/
