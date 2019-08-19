package com.example.demo.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * excel表格表格到处功能
 * @author 丁振锋
 * @date 2019年6月6日上午10:14:52
 */
public class ExcelUtil {
    public static void main(String[] args) throws Exception{
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        for(int i = 0; i<22;i++) {
            Map<String,String> map = new HashMap<String, String>();
            map.put("name", "丁丁"+i);
            map.put("age", "23"+i);
            map.put("desc", "这是一个是魔法师的发生阿凡达"+i);
            map.put("sex", "男");
            map.put("error", "阿斯顿发顺丰大神的法定");
            map.put("school", "南通苏中大学");
            map.put("高中", "上海高中");
            map.put("初中", "上海初中");
            map.put("小学", "上海小学你懂得");
            list.add(map);
        }
        export(list);
    }

    public static void export(List<Map<String,String>> list) throws Exception {
        String filePath = "/mi/tempPath/" + UUID.randomUUID().toString() + "tmp.xls";
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
//        Workbook wb = WorkbookFactory.create(file);
        Workbook wb = new HSSFWorkbook();
        if (list != null && list.size() > 0) {
            int rows = 10;
            int sheetNum = list.size() / rows;//控制有多少个sheet页
            CellStyle cellStyle = wb.createCellStyle();
            Font font = wb.createFont();
            cellStyle.setFont(font);
            
            
            for (int i = 0; i <= sheetNum; i++) {
                Sheet sheet = wb.createSheet("故障信息" + i);
                int rowNum = 0;
                //标题
                Row row = sheet.createRow(rowNum++);
                createCell(wb,row,0,cellStyle,"故障信息表");
                sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 9));
                //表头
                Row row2 = sheet.createRow(rowNum++);
                createCell(wb,row2,0,cellStyle,"序号");
                createCell(wb,row2,1,cellStyle,"姓名");
                createCell(wb,row2,2,cellStyle,"年龄");
                createCell(wb,row2,3,cellStyle,"描述");
                createCell(wb,row2,4,cellStyle,"性别");
                createCell(wb,row2,5,cellStyle,"故障信息");
                createCell(wb,row2,6,cellStyle,"学校");
                createCell(wb,row2,7,cellStyle,"高中");
                createCell(wb,row2,8,cellStyle,"初中");
                createCell(wb,row2,9,cellStyle,"小学");
                int end = 0;
                if (list.size() > (i + 1) * rows) {
                    end = (i + 1) * rows;
                } else {
                    end = list.size();
                }
                for(int j = i * rows ;j < end; j++) {
                    int no = 1;
                    Map<String,String> t = list.get(j);
                    Row row3 = sheet.createRow(rowNum++);
                    createCell(wb,row3,0,cellStyle,"" + no++);
                    createCell(wb,row3,1,cellStyle,t.get("name"));
                    createCell(wb,row3,2,cellStyle,t.get("age"));
                    createCell(wb,row3,3,cellStyle,t.get("desc"));
                    createCell(wb,row3,4,cellStyle,t.get("sex"));
                    createCell(wb,row3,5,cellStyle,t.get("error"));
                    createCell(wb,row3,6,cellStyle,t.get("school"));
                    createCell(wb,row3,7,cellStyle,t.get("高中"));
                    createCell(wb,row3,8,cellStyle,t.get("初中"));
                    createCell(wb,row3,9,cellStyle,t.get("小学"));
                }
            }
        }
        wb.write(new FileOutputStream(file));
        wb.close();
    }
    /** 
    *创建一个单元格并以某种方式对齐它。
    * 
    * @param wb工作簿
    * @param行在
    * @param列中创建单元格列号以在
    * @param中创建单元格halign 单元格的水平对齐方式。
    * @param valign单元格的垂直对齐方式。
    * **/ 
   private static void createCell(Workbook wb,Row row,int column,CellStyle cellStyle,String value){ 
       Cell cell = row.createCell(column); 
       cell.setCellValue(value); 
       
       
//       cellStyle.setBorderBottom(BorderStyle.THIN);
//       cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
//       cellStyle.setBorderLeft(BorderStyle.THIN);
//       cellStyle.setLeftBorderColor(IndexedColors.GREEN.getIndex());
//       cellStyle.setBorderRight(BorderStyle.THIN);
//       cellStyle.setRightBorderColor(IndexedColors.BLUE.getIndex());
//       cellStyle.setBorderTop(BorderStyle.MEDIUM_DASHED);
//       cellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
       cell.setCellStyle(cellStyle); 
   }
}
