package com.example.demo.excel;

public enum SecondTitleEnum {
    ERRSTATIONNAME("errAfc", 2, "stationName", "车站名称", null, 14, 2),
    ERRDATE("errAfc", 3, "applyDate", "日期", null, 12, 2),
    ERRHOURETIME("errAfc", 4, "applyTime", "时分", null, 8, 2),
    ERRREPORTER("errAfc", 5, "applyUser", "报修人/发现人", null, 12, 2),
    ERRCATEGERYNAME("errAfc", 6, "categoryName", "设备类型", null, 12, 2),
    ERREQUIPMENTNO("errAfc", 7, "equipmentNo", "设备编号", null, 12, 2),
    ERRERRORDIS("errAfc", 8, "breakDescribe", "故障描述", null, 30, 2),
    ERRERRORMODEL("errAfc", 9, "errorModelName", "故障模块", null, 18, 2),
    ERRERRORSUBMODEL("errAfc", 10, "subModelName", "故障子模块", null, 18, 2),
    ERRERRORTYPE("errAfc", 11, "errorType", "故障类型", null, 20, 2),
    ERRERRORREASON("errAfc", 12, "maintenanceDescribe", "故障原因", null, 50, 2),
    ERRHANDLE("errAfc", 13, "processDescribe", "处理措施", null, 50, 2),
    ERRNEEDPART("errAfc", 14, "needSparePart", "所需备件", null, 24, 2),
    ERRISCHANGEPART("errAfc", 15, "isChangeSparePart", "是否更换备件", null, 8, 2),
    ERRREPAIRDATE("errAfc", 16, "overTime", "修复日期", null, 12, 2),
    ERRREPAIRSTART("errAfc", 17, "startTime", "维修起时", null, 8, 2),
    ERRREPAIREND("errAfc", 18, "endTime", "维修止时", null, 8, 2),
    ERRLOSSTIME("errAfc", 19, "lossTime", "耗时", null, 5, 2),
    ERRISFINISH("errAfc", 20, "wasFinished", "是否修复", null, 8, 2),
    ERRREPAIRER("errAfc", 21, "maintenanceUser", "维修人", null, 10, 2),
    ERRISDELAY("errAfc", 22, "wasDelay", "是否延迟", null, 8, 2),
    ERRDELAYREASON("errAfc", 23, "delayReason", "延迟原因", null, 30, 2),
    
    WORKNUM("workSectionManagement", 0, null, "序号", null, 10, 1),
    WORKSECTIONCODE("workSectionManagement", 1, "sectionCode", "工区编码", null, 10, 1),
    WORKSECTIONNAME("workSectionManagement", 2, "sectionName", "工区名称", null, 15, 1),
    WORKLINENAME("workSectionManagement", 3, "lineName", "线路", null, 15, 1),
    WORKHEADPERSON("workSectionManagement", 4, "headPerson", "负责人", null, 10, 1),
    WORKPHONE("workSectionManagement", 5, "phone", "电话", null, 10, 1),
    WORKREMARK("workSectionManagement", 6, "remark", "备注", null, 20, 1),
    WORKSTATUS("workSectionManagement", 7, "status", "状态", null, 10, 1),
    
    WAREHOUSENUM("warehousemanagement", 0, null, "序号", null, 5, 1),
    WAREHOUSPARTTYPE("warehousemanagement", 1, "categoryName", "备件类型", null, 15, 1),
    WAREHOUSEPARTNAME("warehousemanagement", 2, "partName", "备件名称", null, 15, 1),
    WAREHOUSENAME("warehousemanagement", 3, "warehouseName", "仓库", null, 20, 1),
    WAREHOUSECOUNT("warehousemanagement", 4, "account", "数量", null, 10, 1),
    WAREHOUSEPARTSTATUS("warehousemanagement", 5, "status", "备件状态", null, 10, 1),
    
    SHELVESNUM("shelvesmanagement", 0, null, "序号", null, 5, 1),
    SHELVESSECTIONNAME("shelvesmanagement", 1, "sectionName", "所属工区", null, 15, 1),
    SHELVESWAREHOUSENAME("shelvesmanagement", 2, "warehouseName", "所属仓库", null, 20, 1),
    SHELVESCONTAINERTYPE("shelvesmanagement", 3, "containerType", "类型", null, 8, 1),
    SHELVESHOUSENO("shelvesmanagement", 4, "houseNo", "房间号", null, 5, 1),
    SHELVESSHELFNUMBER("shelvesmanagement", 5, "shelfNumber", "货架/货柜编号", null, 10, 1),
    SHELVESSTATUS("shelvesmanagement", 6, "status", "状态", null, 8, 1),
    SHELVESREMARK("shelvesmanagement", 7, "remark", "备注", null, 20, 1),
    
    APPLYNUM("applyManagement", 0, null, "序号", null, 5, 1),
    APPLYAPPLYNO("applyManagement", 1, "applyNo", "单据号", null, 20, 1),
    APPLYAPPLYTIME("applyManagement", 2, "applyTime", "申请时间", null, 25, 1),
    APPLYREMARK("applyManagement", 3, "remark", "备注", null, 20, 1),
    APPLYAPPLYSTATUS("applyManagement", 4, "applyStatus", "状态", null, 10, 1),
    APPLYAPPLYTYPE("applyManagement", 5, "applyType", "申请类型", null, 10, 1),
    APPLYAUDITUSER("applyManagement", 6, "auditUser", "审核人", null, 10, 1),
    APPLYAUDITTIME("applyManagement", 7, "auditTime", "审核时间", null, 25, 1),
    APPLYAUDITREMARK("applyManagement", 8, "auditRemark", "审核意见", null, 20, 1),
    
    APPLYAUDITNUM("applyAuditManagement", 0, null, "序号", null, 5, 1),
    APPLYAUDITOUTWAREHOUSENAME("applyAuditManagement", 1, "outWarehouseName", "出库仓库", null, 25, 1),
    APPLYAUDITAPPLYNO("applyAuditManagement", 2, "applyNo", "单据号", null, 20, 1),
    APPLYAUDITAPPLYUSER("applyAuditManagement", 3, "applyUser", "申请人", null, 10, 1),
    APPLYAUDITAPPLYTIME("applyAuditManagement", 4, "applyTime", "申请时间", null, 25, 1),
    APPLYAUDITSTATUS("applyAuditManagement", 5, "applyStatus", "状态", null, 10, 1),
    APPLYAUDITTYPE("applyAuditManagement", 6, "applyType", "申请类型", null, 12, 1),
    APPLYAUDITAUDITUSER("applyAuditManagement", 7, "auditUser", "审核人", null, 10, 1),
    APPLYAUDITAUDITTIME("applyAuditManagement", 8, "auditTime", "审核时间", null, 25, 1),
    
    USEAPPLYNUM("useApplyInfo", 0, null, "序号", null, 5, 1),
    USEAPPLYAPPLYNO("useApplyInfo", 1, "applyNo", "单据号", null, 20, 1),
    USEAPPLYOUTWAREHOUSENAME("useApplyInfo", 2, "outWarehouseName", "出库仓库", null, 20, 1),
    USEAPPLYAPPLYTIME("useApplyInfo", 3, "applyTime", "申请时间", null, 25, 1),
    USEAPPLYREMARK("useApplyInfo", 4, "remark", "备注", null, 20, 1),
    USEAPPLYAPPLYSTATUS("useApplyInfo", 5, "applyStatus", "状态", null, 10, 1),
    USEAPPLYAUDITUSER("useApplyInfo", 6, "auditUser", "审核人", null, 10, 1),
    USEAPPLYAUDITTIME("useApplyInfo", 7, "auditTime", "审核时间", null, 25, 1),
    USEAPPLYAUDITREMARK("useApplyInfo", 8, "auditRemark", "审核意见", null, 25, 1),
    
    REPAIRAPPLYNUM("repairApply", 0, null, "序号", null, 5, 1),
    REPAIRAPPLYNO("repairApply", 1, "applyNO", "申请单号", null, 20, 1),
    REPAIRAPPLYLINE("repairApply", 2, "lineName", "线路", null, 10, 1),
    REPAIRAPPLYSTATION("repairApply", 3, "stationName", "站点", null, 10, 1),
    REPAIRAPPLYEQUIPMENTNO("repairApply", 4, "equipmentNo", "设备编号", null, 20, 1),
    REPAIRAPPLYCATEGORY("repairApply", 5, "categoryName", "设备类型", null, 10, 1),
    REPAIRAPPLYPHENOMENON("repairApply", 6, "errorPhenomenon", "故障现象", null, 30, 1),
    REPAIRAPPLYUSER("repairApply", 7, "applyUser", "报修人", null, 10, 1),
    REPAIRAPPLYDATE("repairApply", 8, "applyDate", "报修时间", null, 25, 1),
    REPAIRAPLLYTYPE("repairApply", 9, "orderType", "报修类型", null, 20, 1),
    REPAIRAPLLYSTATUS("repairApply", 10, "applyStatus", "状态", null, 10, 1),
    
    REPAIRDISPATHNUM("repairDispath", 0, null, "序号", null, 5, 1),
    REPAIRDISPATHNO("repairDispath", 1, "applyNO", "申请单号", null, 20, 1),
    REPAIRDISPATHLINE("repairDispath", 2, "lineName", "线路", null, 10, 1),
    REPAIRDISPATHSTATION("repairDispath", 3, "stationName", "站点", null, 10, 1),
    REPAIRDISPATHEQUIPMENTNO("repairDispath", 4, "equipmentNo", "设备编号", null, 20, 1),
    REPAIRDISPATHCATEGORY("repairDispath", 5, "categoryName", "设备类型", null, 10, 1),
    REPAIRDISPATHPHENOMENON("repairDispath", 6, "errorPhenomenon", "故障现象", null, 30, 1),
    REPAIRDISPATHUSER("repairDispath", 7, "applyUser", "报修人", null, 10, 1),
    REPAIRDISPATHDATE("repairDispath", 8, "applyDate", "报修时间", null, 25, 1),
    REPAIRDISPATHTYPE("repairDispath", 9, "orderType", "报修类型", null, 20, 1),
    REPAIRDISPATHSTATUS("repairDispath", 10, "applyStatus", "状态", null, 10, 1),
    
    DEVICEREPAIRNUM("deviceRepair", 0, null, "序号", null, 5, 1),
    DEVICEREPAIRNO("deviceRepair", 1, "applyNO", "申请单号", null, 20, 1),
    DEVICEREPAIRLINE("deviceRepair", 2, "lineName", "线路", null, 10, 1),
    DEVICEREPAIRSTATION("deviceRepair", 3, "stationName", "站点", null, 10, 1),
    DEVICEREPAIREQUIPMENTNO("deviceRepair", 4, "equipmentNo", "设备编号", null, 20, 1),
    DEVICEREPAIRCATEGORY("deviceRepair", 5, "categoryName", "设备类型", null, 10, 1),
    DEVICEREPAIRPHENOMENON("deviceRepair", 6, "errorPhenomenon", "故障现象", null, 30, 1),
    DEVICEREPAIRUSER("deviceRepair", 7, "applyUser", "报修人", null, 10, 1),
    DEVICEREPAIRDATE("deviceRepair", 8, "applyDate", "报修时间", null, 25, 1),
    DEVICEREPAIRTYPE("deviceRepair", 9, "orderType", "报修类型", null, 20, 1),
    deviceRepairSTATUS("deviceRepair", 10, "applyStatus", "状态", null, 10, 1),
    
    BREAKDOWNNUM("breakdownInfo", 0, null, "序号", null, 5, 1),
    BREAKDOWNCATEGORY("breakdownInfo", 1, "categoryName", "备件分类", null, 20, 1),
    BREAKDOWNPARENTCATEGORY("breakdownInfo", 2, "parentCategoryName", "父级备件分类", null, 20, 1),
    BREAKDOWNPARTNAME("breakdownInfo", 3, "partName", "备件名称", null, 20, 1),
    BREAKDOWNABBREVIATED("breakdownInfo", 4, "breakAbbreviated", "故障现象", null, 20, 1),
    BREAKDOWNDESCRIPTION("breakdownInfo", 5, "breakDescription", "故障描述", null, 20, 1),
    BREAKDOWNSTATUS("breakdownInfo", 6, "status", "状态", null, 10, 1),
    BREAKDOWNCREATEUSER("breakdownInfo", 7, "createUser", "创建人", null, 10, 1),
    BREAKDOWNINSERTDATE("breakdownInfo", 8, "insertDate", "创建时间", null, 20, 1),
    
    MAINTAINNUM("maintainInfo", 0, null, "序号", null, 5, 1),
    MAINTAINCATEGORY("maintainInfo", 1, "categoryName", "备件分类", null, 20, 1),
    MAINTAINPARENTCATEGORY("maintainInfo", 2, "parentCategoryName", "父级备件分类", null, 20, 1),
    MAINTAINPARTNAME("maintainInfo", 3, "partName", "备件名称", null, 20, 1),
    MAINTAINABBREVIATED("maintainInfo", 4, "breakAbbreviated", "故障现象", null, 20, 1),
    MAINTAINDESCRIPTION("maintainInfo", 5, "breakDescription", "故障描述", null, 20, 1),
    MAINTAINSTATUS("maintainInfo", 6, "status", "状态", null, 10, 1),
    MAINTAINCREATEUSER("maintainInfo", 7, "createUser", "创建人", null, 10, 1),
    MAINTAININSERTDATE("maintainInfo", 8, "insertDate", "创建时间", null, 20, 1),
    ;
    private String type;
    private Integer column;
    private String key;
    private String name;
    private Short heigth;
    private Integer width;
    private Integer rowNum;
    private Integer megerFirstRow; 
    private Integer megerLastRow; 
    private Integer megerFirstCol; 
    private Integer megerLastCol;
    
    
    private SecondTitleEnum(String type, Integer column, String key, String name, Short heigth, Integer width,
            Integer rowNum) {
        this.type = type;
        this.column = column;
        this.key = key;
        this.name = name;
        this.heigth = heigth;
        this.width = width;
        this.rowNum = rowNum;
    }
    private SecondTitleEnum(String type, Integer column, String key, String name, Short heigth, Integer width,
            Integer rowNum, Integer megerFirstRow, Integer megerLastRow, Integer megerFirstCol, Integer megerLastCol) {
        this.type = type;
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
    
}
