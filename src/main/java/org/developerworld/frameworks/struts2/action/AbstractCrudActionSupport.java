package org.developerworld.frameworks.struts2.action;


/**
 * 增删改查的Action
 * 
 * @author Roy Huang
 * @version 20110419
 * 
 */
public abstract class AbstractCrudActionSupport extends
		AbstractBaseActionSupport {

	public final static int DEFAULE_PAGE_SIZE = 15;

	private int pageNum=1;

	private int pageSize=DEFAULE_PAGE_SIZE;

	protected String orderFields;

	protected String orderModels;

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setOrderFields(String orderFields) {
		this.orderFields = orderFields;
	}

	public String getOrderFields() {
		return orderFields;
	}

	public void setOrderModels(String orderModels) {
		this.orderModels = orderModels;
	}

	public String getOrderModels() {
		return orderModels;
	}

	/**
	 * 列表页
	 * 
	 * @return
	 */
	public String index() throws Throwable {
		return INDEX;
	}

	/**
	 * 执行创建
	 * 
	 * @return
	 */
	public String create() throws Throwable {
		return CREATE;
	}

	/**
	 * 执行更新
	 * 
	 * @return
	 */
	public String update() throws Throwable {
		return UPDATE;
	}

	/**
	 * 创建或更新
	 * 
	 * @return
	 * @throws Exception
	 */
	public String save() throws Throwable {
		return SAVE;
	}

	/**
	 * 执行删除
	 * 
	 * @return
	 */
	public String destory() throws Throwable {
		return DESTROY;
	}

	/**
	 * 执行删除
	 * 
	 * @return
	 */
	public String delete() throws Throwable {
		return DELETE;
	}

	/**
	 * 执行内容页
	 * 
	 * @return
	 */
	public String show() throws Throwable {
		return SHOW;
	}

	/**
	 * 执行编辑页
	 * 
	 * @return
	 */
	public String edit() throws Throwable {
		return EDIT;
	}

	/**
	 * 执行创建页
	 * 
	 * @return
	 */
	public String editNew() throws Throwable {
		return EDIT_NEW;
	}

	/**
	 * 初始ACTION的参数 通过拦截器自动调用
	 */
	public void initParams() {
		
	}

}
