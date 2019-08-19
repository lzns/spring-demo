package com.example.demo.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import com.shankephone.mi.util.DataSwitch;
import com.shankephone.mi.util.FilePath;
import com.shankephone.mi.util.StringUtils;

/**
 * 
 * @author 丁振锋
 * @date 2019年7月4日上午9:45:26
 */

public class ExcelHandlerUtil {
    
    
    public static String exportExcel(String title,boolean isHaveNum, int rows ,String type ,List<Map<String, Object>> list) throws Exception {

        String filePath = FilePath.getImportExcelPath() + UUID.randomUUID().toString() + "tmp.xls";
        File file = new File(filePath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        Workbook wb = new HSSFWorkbook();
        int sheetNum = 0;
        if (list !=null && list.size() > 0) {
            sheetNum = list.size() / rows;//控制有多少个sheet页
        }
        CellStyle cellStyle1 = wb.createCellStyle();
        Font font1 = wb.createFont();
        font1.setFontName("黑体");
        font1.setBold(false);
        font1.setFontHeightInPoints((short)15);
        cellStyle1.setFont(font1);
        CellStyle cellStyle2 = wb.createCellStyle();
        Font font2 = wb.createFont();
        font2.setFontName("黑体");
        font2.setBold(false);
        cellStyle2.setFont(font2);
        CellStyle cellStyle3 = wb.createCellStyle();
        for (int i = 0; i <= sheetNum; i++) {
            Sheet sheet = wb.createSheet("sheet" + i);
            int rowNum = 0;
            //标题
            TitleEnum[] values = TitleEnum.values();
            for (TitleEnum titleEnum : values) {
                if (type.equals(titleEnum.getKey())) {
                    rowNum = titleEnum.getRowNum();
                    Row row = sheet.createRow(rowNum);
                    if (StringUtils.isNotEmpty(title)) {
                        titleEnum.setName(title);
                    }
                    row.setHeight(titleEnum.getHeigth());
                    createCell(wb,false,null,sheet,row,titleEnum.getColumn(),cellStyle1,titleEnum.getName());
                    cellMerged(sheet, titleEnum.getMegerFirstRow(), titleEnum.getMegerLastRow(), titleEnum.getMegerFirstCol(), titleEnum.getMegerLastCol());
                    break;
                }
            }
            //第一行表头
            Row row2 = null;
            FirstTitleEnum[] values2 = FirstTitleEnum.values();
            for (FirstTitleEnum firstTitleEnum : values2) {
                if (type.equals(firstTitleEnum.getType())) {
                    rowNum =  firstTitleEnum.getRowNum();
                    row2 = sheet.createRow(rowNum);
                    break;
                }
            }
            for (FirstTitleEnum firstTitleEnum : values2) {
                if (type.equals(firstTitleEnum.getType())) {
                    createCell(wb,false,firstTitleEnum.getWidth(),sheet,row2,firstTitleEnum.getColumn(),cellStyle2,firstTitleEnum.getName());
                    if (firstTitleEnum.getMegerFirstRow() != null && firstTitleEnum.getMegerLastRow() != null) {
                        cellMerged(sheet, firstTitleEnum.getMegerFirstRow(), firstTitleEnum.getMegerLastRow(), firstTitleEnum.getMegerFirstCol(), firstTitleEnum.getMegerLastCol());
                    }
                }
            }
          //第二行表头
            SecondTitleEnum[] values3 = SecondTitleEnum.values();
            Row row3 =null;
            for (SecondTitleEnum secondTitleEnum : values3) {
                if (type.equals(secondTitleEnum.getType())) {
                    rowNum =  secondTitleEnum.getRowNum();
                    row3 = sheet.createRow(rowNum);
                    break;
                }
            }
            for (SecondTitleEnum secondTitleEnum : values3) {
                if (type.equals(secondTitleEnum.getType())) {
                    createCell(wb,false,secondTitleEnum.getWidth(),sheet,row3,secondTitleEnum.getColumn(),cellStyle2,secondTitleEnum.getName());
                    if (secondTitleEnum.getMegerFirstRow() != null && secondTitleEnum.getMegerLastRow() != null) {
                        cellMerged(sheet, secondTitleEnum.getMegerFirstRow(), secondTitleEnum.getMegerLastRow(), secondTitleEnum.getMegerFirstCol(), secondTitleEnum.getMegerLastCol());
                    }
                }
            }
            //设置正文内容
            if (list !=null && list.size() > 0) {
                int end = 0;
                if (list.size() > (i + 1) * rows) {
                    end = (i + 1) * rows;
                } else {
                    end = list.size();
                }
                int no = 1;
                for(int j = i * rows ;j < end; j++) {
                    Map<String,Object> t = list.get(j);
                    Row row4 = sheet.createRow(++rowNum);
                    if (isHaveNum) {
                        createCell(wb,false,null,sheet,row4,0,cellStyle3,"" + no++);
                    }
                    for (FirstTitleEnum firstTitleEnum : values2) {
                        if (type.equals(firstTitleEnum.getType()) && t.containsKey(firstTitleEnum.getKey())) {
                            createCell(wb,false,null,sheet,row4,firstTitleEnum.getColumn(),cellStyle3,DataSwitch.convertObjectToString(t.get(firstTitleEnum.getKey()))); 
                        }
                    }
                    for (SecondTitleEnum secondTitleEnum : values3) {
                        if (type.equals(secondTitleEnum.getType()) && t.containsKey(secondTitleEnum.getKey())) {
                            createCell(wb,false,null,sheet,row4,secondTitleEnum.getColumn(),cellStyle3,DataSwitch.convertObjectToString(t.get(secondTitleEnum.getKey())));
                        }
                    }    
                }
            }
        }
        wb.write(new FileOutputStream(file));
        wb.close();
        return filePath;
    }
    public static void createCell(Workbook wb,boolean borderFlag,Integer width,Sheet sheet,Row row,int column,CellStyle cellStyle,String value){ 
        Cell cell = row.createCell(column); 
        cell.setCellValue(value); 
        //设置列宽
        if (width != null) {
            sheet.setColumnWidth(column, 256*width+184);
        }
        //设置居中
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        if (borderFlag) {
            cellStyle.setBorderBottom(BorderStyle.THIN);//下边框
            cellStyle.setBorderLeft(BorderStyle.THIN);//左边框  
            cellStyle.setBorderTop(BorderStyle.THIN);//上边框  
            cellStyle.setBorderRight(BorderStyle.THIN);//右边框
        }
        cellStyle.setWrapText(true);//自动换行
        cell.setCellStyle(cellStyle); 
    }
    /**
     * 合并单元格
     * @author 丁振锋
     * @date 2019年6月14日下午3:09:01
     */
    public static void cellMerged(Sheet sheet,int firstRow, int lastRow, int firstCol, int lastCol) {
        sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
    }
}
