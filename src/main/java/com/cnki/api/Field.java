package com.cnki.api;


/**
 * 字段实体类
 *
 */
public class Field implements java.io.Serializable{

	private static final long serialVersionUID = -1162194669355166363L;
	
	// 字段名
    private String fieldName;
    // 字段值
    private Object fieldValue;

//    // 字段类型
//    private String fieldType;
//    // 字段长度
//    private int fieldLength;
//    // 字段显示名
//    private String fieldLabel;
    
	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * @return the fieldValue
	 */
	public Object getFieldValue() {
		return fieldValue;
	}
	/**
	 * @param fieldValue the fieldValue to set
	 */
	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}

//	/**
//	 * @return the fieldType
//	 */
//	public String getFieldType() {
//		return fieldType;
//	}
//	/**
//	 * @param fieldType the fieldType to set
//	 */
//	public void setFieldType(String fieldType) {
//		this.fieldType = fieldType;
//	}
//	/**
//	 * @return the fieldLength
//	 */
//	public int getFieldLength() {
//		return fieldLength;
//	}
//	/**
//	 * @param fieldLength the fieldLength to set
//	 */
//	public void setFieldLength(int fieldLength) {
//		this.fieldLength = fieldLength;
//	}
//	/**
//	 * @return the fieldLabel
//	 */
//	public String getFieldLabel() {
//		return fieldLabel;
//	}
//	/**
//	 * @param fieldLabel the fieldLabel to set
//	 */
//	public void setFieldLabel(String fieldLabel) {
//		this.fieldLabel = fieldLabel;
//	}
}
