package com.example.demo.excel;

/**
 * 
 */
public enum FirstTitleEnum {
    ERRSequence(null,"errAfc", 0, "序号", null, 5, 1, 1, 2, 0, 0),
    ERRCheck("orderType","errAfc", 1, "自检/报修", null, 11, 1, 1, 2, 1, 1),
    ERRjiebao(null,"errAfc", 2, "设备故障接报", null, null, 1, 1, 1, 2, 8),
    ERRReduce(null,"errAfc", 9, "故障处理情况", null, null, 1, 1, 1, 9, 21),
    ERRdelay(null,"errAfc", 22, "故障处理延迟", null, null, 1, 1, 1, 22, 23),
    ERRremark("remark","errAfc", 24, "备注", null, null, 1, 1, 2, 24, 24),
    
    SECHEDULINGUSERNAME(null,"downExcelTemplate",0,"用户名",null,12,1),
    SECHEDULINGTIME1(null,"downExcelTemplate",1,"1900-01-01",null,20,1),
    SECHEDULINGTIME2(null,"downExcelTemplate",2,"1900-01-02",null,20,1),
    SECHEDULINGTIME3(null,"downExcelTemplate",3,"1900-01-03",null,20,1),
    SECHEDULINGTIME4(null,"downExcelTemplate",4,"1900-01-04",null,20,1),
    SECHEDULINGTIME5(null,"downExcelTemplate",5,"1900-01-05",null,20,1),
    SECHEDULINGTIME6(null,"downExcelTemplate",6,"1900-01-06",null,20,1),
    SECHEDULINGTIME7(null,"downExcelTemplate",7,"1900-01-07",null,20,1),
    SECHEDULINGTIME8(null,"downExcelTemplate",8,"1900-01-08",null,20,1),
    SECHEDULINGTIME9(null,"downExcelTemplate",9,"1900-01-09",null,20,1),
    ;
    private String key;
    private String type;
    private Integer column;
    private String name;
    private Short heigth;
    private Integer width;
    private Integer rowNum;
    private Integer megerFirstRow; 
    private Integer megerLastRow; 
    private Integer megerFirstCol; 
    private Integer megerLastCol;
    
    private FirstTitleEnum(String key, String type, Integer column, String name, Short heigth, Integer width, Integer rowNum,
            Integer megerFirstRow, Integer megerLastRow, Integer megerFirstCol, Integer megerLastCol) {
        this.key = key;
        this.type = type;
        this.column = column;
        this.name = name;
        this.heigth = heigth;
        this.width = width;
        this.rowNum = rowNum;
        this.megerFirstRow = megerFirstRow;
        this.megerLastRow = megerLastRow;
        this.megerFirstCol = megerFirstCol;
        this.megerLastCol = megerLastCol;
    }
    private FirstTitleEnum(String key, String type, Integer column, String name, Short heigth, Integer width,
            Integer rowNum) {
        this.key = key;
        this.type = type;
        this.column = column;
        this.name = name;
        this.heigth = heigth;
        this.width = width;
        this.rowNum = rowNum;
    }



    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }
    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }
    /**
     * @return the column
     */
    public Integer getColumn() {
        return column;
    }
    /**
     * @param column the column to set
     */
    public void setColumn(Integer column) {
        this.column = column;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the heigth
     */
    public Short getHeigth() {
        return heigth;
    }
    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(Short heigth) {
        this.heigth = heigth;
    }
    /**
     * @return the width
     */
    public Integer getWidth() {
        return width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(Integer width) {
        this.width = width;
    }
    /**
     * @return the rowNum
     */
    public Integer getRowNum() {
        return rowNum;
    }
    /**
     * @param rowNum the rowNum to set
     */
    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }
    /**
     * @return the megerFirstRow
     */
    public Integer getMegerFirstRow() {
        return megerFirstRow;
    }
    /**
     * @param megerFirstRow the megerFirstRow to set
     */
    public void setMegerFirstRow(Integer megerFirstRow) {
        this.megerFirstRow = megerFirstRow;
    }
    /**
     * @return the megerLastRow
     */
    public Integer getMegerLastRow() {
        return megerLastRow;
    }
    /**
     * @param megerLastRow the megerLastRow to set
     */
    public void setMegerLastRow(Integer megerLastRow) {
        this.megerLastRow = megerLastRow;
    }
    /**
     * @return the megerFirstCol
     */
    public Integer getMegerFirstCol() {
        return megerFirstCol;
    }
    /**
     * @param megerFirstCol the megerFirstCol to set
     */
    public void setMegerFirstCol(Integer megerFirstCol) {
        this.megerFirstCol = megerFirstCol;
    }
    /**
     * @return the megerLastCol
     */
    public Integer getMegerLastCol() {
        return megerLastCol;
    }
    /**
     * @param megerLastCol the megerLastCol to set
     */
    public void setMegerLastCol(Integer megerLastCol) {
        this.megerLastCol = megerLastCol;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
