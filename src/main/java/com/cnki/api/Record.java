package com.cnki.api;


import java.util.List;

/**
 * 数据记录实体类
 * 
 */
public class Record implements java.io.Serializable{

	private static final long serialVersionUID = -1162194669355166363L;
	
	// 数据库名
    private String dbName;
    // 数据表名
    private String tableName;
    // 数据ID
    private String ID;
    // 记录字段对象List
    private List<Field> fieldList;
    
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<Field> getFieldList() {
		return fieldList;
	}
	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}
    
}
