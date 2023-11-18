package com.novizit.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.novizit.constant.AppConstants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelExporter {

    // Write Data to excel....
    public static ByteArrayInputStream dataToExcel(String sheetName, String[] Headers, List<String[]> data) {
        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
            Sheet sheet = workbook.createSheet(sheetName);
            // Header
            Row headerRow = sheet.createRow(0);
            for (int col = 0; col < Headers.length; col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(Headers[col]);
            }
            int rowIdx = 1;

            for (String[] row : data) {
                
                Row excelRow = sheet.createRow(rowIdx++);
                int columnCounter = 0;
                for (String d : row) {
                    excelRow.createCell(columnCounter++).setCellValue(d);
                }
            }
            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("Not able to generate excel sheet: " + e.getMessage());
        }
    }
	public static boolean hasExcelFormat(MultipartFile file) {
		if (!AppConstants.TYPE_EXCEL.equals(file.getContentType())) {
			log.info("This is not an excel file.");
			return false;
		}
		log.info("Proceeding as received an excel file...");
		return true;
	}
	
	public static String returnStringValue(Cell cell) {

		if(cell == null) return "";
			
	    CellType cellType = cell.getCellType();

	    switch (cellType) {
	        case NUMERIC:
	            // Check if the numeric cell represents a date and time value
	            // Check if the numeric cell represents a date and time value
	            if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
	            	// Returns the date and time as a string
	            	 DataFormatter dataFormatter = new DataFormatter();
	                 return dataFormatter.formatCellValue(cell);
	            } else {
	                return NumberToTextConverter.toText(cell.getNumericCellValue());
	            }
	        case STRING:
	            return cell.getStringCellValue();
	        case ERROR:
	            return String.valueOf(cell.getErrorCellValue());
	        case BLANK:
	            return "";
	        case FORMULA:
	            return cell.getCellFormula();
	        case BOOLEAN:
	            return String.valueOf(cell.getBooleanCellValue());
            default:
                break;
	    }
	    return "error decoding string value of the cell";
	}	
}
