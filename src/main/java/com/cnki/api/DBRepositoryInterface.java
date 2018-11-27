package com.cnki.api;

import java.util.List;
import java.util.Map;



public interface DBRepositoryInterface {

	/**
	 * 根据传入的分页参数，计算总页数
	 * 
	 * @param intPageSize
	 *            页面大小，即页面显示条数
	 * @param intRowCount
	 *            总记录数
	 * @return 总页数 int
	 */
	public int getTotalPageNum(int intPageSize, int intRowCount) ;

		

	/**
	 * 通过Record对象方式插入数据（包含：dbName、tableName、List<Field>）。
	 * 
	 * @param record
	 *            数据记录对象
	 * @return 是否插入成功 boolean
	 */
	public boolean insert(Record record) throws Exception ;
	/**
	 * 通过Record对象方式，根据数据ID，修改数据。
	 * 
	 * @param record
	 *            数据记录对象
	 * @return 是否插入成功 boolean
	 */
	public boolean update(Record record) ;
	/**
	 * 根据数据ID，删除数据。需要传入dbName、tableName、id
	 * 
	 * @param record
	 *            数据记录对象
	 * @return 是否删除成功 boolean
	 */
	public boolean delete(Record record) ;
	/**
	 * 根据数据ID，读取数据。
	 * 
	 * @param record
	 *            数据记录对象
	 * @return 以List<Record>方式拼装的记录 List<Record>
	 */
	public List<Field[]> getRecordByID(Record record) ;

	/**
	 * 通过 SQL语句插入数据。SQL中的参数必须使用？作为占位符，所有参数必须通过参数列表传入
	 * 
	 * @param strDBName
	 *            数据库名
	 * @param strSQL
	 *            输入的SQL语句
	 * @param objParams
	 *            拼装参数对象数组，可以替换SQL中的“？”对应的值
	 * @return 是否插入成功 boolean
	 */
	public boolean insertBySQL(String strSQL, Object[] objParams,String scheme) ;
	/**
	 * 通过SQL语句修改数据。SQL中的参数必须使用？作为占位符，所有参数必须通过参数列表传入
	 * 
	 * @param strDBName
	 *            数据库名
	 * @param strSQL
	 *            输入的SQL语句
	 * @param objParams
	 *            拼装参数对象数组，可以替换SQL中的“？”对应的值
	 * @return 是否修改成功 boolean
	 */
	public boolean updateBySQL(String strSQL, Object[] objParams,String scheme);
	/**
	 * 通过SQL语句删除数据。SQL中的参数必须使用？作为占位符，所有参数必须通过参数列表传入
	 * 
	 * @param strDBName
	 *            数据库名
	 * @param strSQL
	 *            输入的SQL语句
	 * @param objParams
	 *            拼装参数对象数组，可以替换SQL中的“？”对应的值
	 * @return 是否删除成功 boolean
	 */
	public boolean deleteBySQL( String strSQL, Object[] objParams,String scheme) ;
	/**
	 * 通过SQL语句查询数据，返回List<Object>对象。一条数据也通过此方法查询。
	 * SQL中的参数必须使用？作为占位符，所有参数必须通过参数列表传入
	 * 
	 * @param strDBName
	 *            数据库名
	 * @param strSQL
	 *            输入的SQL语句
	 * @param objParams
	 *            拼装参数对象数组，可以替换SQL中的“？”对应的值
	 * @return 是否删除成功 boolean
	 */
	public List<Map<String, Object>> listBySQL(String strSQL, Object[] objParams,String scheame,User user);
	/**
	 * 通过SQL语句查询数据，返回List<Map>对象。一条数据也通过此方法查询。
	 * 
	 * @param strDBName
	 *            数据库名
	 * @param strSQL
	 *            输入的SQL语句
	 * @param intPageSize
	 *            页面数据条数
	 * @param intPageNum
	 *            页面
	 * @param strDbType
	 *            数据库类型：oracle/mysql
	 * @return 以List<Map>方式组装的查询结果集 List<Map>
	 */
	public List<Map<String, Object>> listPageDataBySQL( String strSQL, Object[] objParams,
			int intPageSize, int intPageNum, String strDbType,String scheme);
	/**
	 * 通过SQL语句查询数据，返回List<Map>对象。 该方法可传递in动态参数，具体操作方法如下： 示例：Sql ："select * from
	 * table where a =:name and b in(:names)" 参数由Map mapParams传递 , 其中Map中参数的key与
	 * SQL中"："匹配的参数名相对应,以下为组成方法
	 * 
	 * List list = new ArrayList(); list.add("name1"); list.add("name2");
	 * ........ mapParams.put("name","条件1") // 与：name对应
	 * mapParams.put("names",list) // 与：names对应 然后调用 ，
	 * listBySQL（strSQ,mapParamsL）
	 * 
	 * @param strDBName
	 *            数据库名
	 * @param strSQL
	 *            输入的SQL语句
	 * @param mapParams
	 *            拼装参数对象数组，可以替换SQL中的“:name”对应的值
	 * @return 是否删除成功 boolean
	 */
	@SuppressWarnings({ "rawtypes" })
	public List<Map<String, Object>> listBySQL(String strSQL, Map mapParams,String scheame) ;

	/**
	 * 通过SQL语句查询数据，返回List<Map>对象。 该方法可传递in动态参数，具体操作方法如下： 示例：Sql ："select * from
	 * table where a =:name and b in(:names)" 参数由Map mapParams传递 , 其中Map中参数的key与
	 * SQL中"："匹配的参数名相对应,以下为组成方法
	 * 
	 * List list = new ArrayList(); list.add("name1"); list.add("name2");
	 * ........ mapParams.put("name","条件1") // 与：name对应
	 * mapParams.put("names",list) // 与：names对应 然后调用 ，
	 * listBySQL（strSQ,mapParamsL）
	 * 
	 * @param strDBName
	 *            数据库名
	 * @param strSQL
	 *            输入的SQL语句
	 * @param mapParams
	 *            拼装参数对象数组，可以替换SQL中的“:name”对应的值
	 * @return 是否删除成功 boolean
	 */
	@SuppressWarnings({ "rawtypes" })
	public List<Map<String, Object>> listPageDataBySQL(String strSQL, Map mapParams,
			int intPageSize, int intPageNum, String strDbType,String scheme) ;

	
}

