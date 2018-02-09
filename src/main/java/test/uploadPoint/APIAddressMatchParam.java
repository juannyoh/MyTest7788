package test.uploadPoint;

import java.io.Serializable;

/**
 * 
 * <p>Title: AddressMatchParam</p>
 * Description:		地址匹配的参数
 */
public class APIAddressMatchParam implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 顺序
	 */
	private String id;
	/**
	 * 地址
	 */
	private String address;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public APIAddressMatchParam(String id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	public APIAddressMatchParam() {
		super();
	}

	@Override
	public String toString() {
		return "APIAddressMatchParam{" +
				"id='" + id + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
