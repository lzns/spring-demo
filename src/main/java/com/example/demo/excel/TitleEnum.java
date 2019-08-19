package com.example.demo.excel;

/**
 * 头部标题枚举类
 * @author 丁振锋
 * @date 2019年7月3日下午2:39:06
 */
public enum TitleEnum {
    AFC(0, "errAfc", null, (short)440, null, 0, 0, 0 , 0, 24),
    WORKSECTIONMANAGEMENT(0,"workSectionManagement","工区管理详情",(short)440,null,0,0,0,0,7),
    WAREHOUSEMANAGEMENT(0,"warehousemanagement","库存管理详情",(short)440,null,0,0,0,0,6),
    SHELVESMANAGEMENT(0,"shelvesmanagement","库存管理详情",(short)440,null,0,0,0,0,6),
    APPLYMANAGEMENT(0,"applyManagement","申请管理详情",(short)440,null,0,0,0,0,8),
    APPLYAUDITMANAGEMENT(0,"applyAuditManagement","申请审核详情",(short)440,null,0,0,0,0,8),
    USEAPPLY(0,"useApplyInfo","领用申请详情",(short)440,null,0,0,0,0,8),

	REPAIRAPPLY(0,"repairApply","报修申请详情",(short)440,null,0,0,0,0,10),
	REPAIRDISPATH(0,"repairDispath","报修派工详情",(short)440,null,0,0,0,0,10),
	DEVICEREPAIR(0,"deviceRepair","设备维修详情",(short)440,null,0,0,0,0,10),
	BREAKDOWNINFO(0,"breakdownInfo","故障信息详情",(short)440,null,0,0,0,0,8),
	MAINTAININFO(0,"maintainInfo","维修信息详情",(short)440,null,0,0,0,0,8),
    
    SECHEDULING(0,"downExcelTemplate",null,(short)1000,123,0,0,0,0,9),
    ;
    
    private Integer column;
    private String key;
    private String name;
    private short heigth;
    private Integer width;
    private Integer rowNum;
    private Integer megerFirstRow; 
    private Integer megerLastRow; 
    private Integer megerFirstCol; 
    private Integer megerLastCol;
    
    private TitleEnum(Integer column, String key, String name, short heigth, Integer width, Integer rowNum,
            Integer megerFirstRow, Integer megerLastRow, Integer megerFirstCol, Integer megerLastCol) {
        this.column = column;
        this.key = key;
        this.name = name;
        this.heigth = heigth;
        this.width = width;
        this.rowNum = rowNum;
        this.megerFirstRow = megerFirstRow;
        this.megerLastRow = megerLastRow;
        this.megerFirstCol = megerFirstCol;
        this.megerLastCol = megerLastCol;
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
    public short getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(short heigth) {
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
   
}
