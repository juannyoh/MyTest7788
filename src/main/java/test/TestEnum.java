package test;

public enum TestEnum {
	/**
	 * 添加
	 */
	ADD(1),
	/**
	 * 修改
	 */
	UPDATE(2),
	/**
	 * 删除
	 */
	DELETE(3);
	
	/**
	 * 操作类型对应的数值
	 */
	private int optCode;

	private TestEnum(int optCode) {
		this.optCode = optCode;
	}
	
	/**
	 * 获取操作类型对应的数值
	 * @return
	 * @see
	 */
	public  int getOptCode(){
		return optCode;
	}
}
