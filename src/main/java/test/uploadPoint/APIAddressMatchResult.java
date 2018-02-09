package test.uploadPoint;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;


/**
 * 地址解析返回结果
 */
public class APIAddressMatchResult implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	private String id;
	/**
	 * x坐标
	 */
	private double x;
	 
	/**
	 * y坐标
	 */
	private double y;
	
	/**
	 * 结果类型:1代表成功，2代表地址解析失败，3代表点查面失败
	 */
	private int resultType;
	
	/**
	 * 结果内容
	 */
	@JsonIgnore
	private String resultInfo;
	
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String  city;
	/**
	 * 区
	 */
	private String county;
	/**
	 * ADMINCODE
	 */
	private String admincode;
	/**
	 * town
	 */
	private String town;
	/**
	 * 区号
	 */
	private String aCode;
	/**
	 * 评分
	 */
	@JsonIgnore
	private double score = 0;
	

	public int getResultType() {
		return resultType;
	}

	public void setResultType(int resultType) {
		this.resultType = resultType;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode;
    }

    public String getAdmincode() {
		return admincode;
	}

	public void setAdmincode(String admincode) {
		this.admincode = admincode;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public APIAddressMatchResult(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "APIAddressMatchResult{" +
				"id='" + id + '\'' +
				", x=" + x +
				", y=" + y +
				", resultType=" + resultType +
				", resultInfo='" + resultInfo + '\'' +
				", province='" + province + '\'' +
				", city='" + city + '\'' +
				", county='" + county + '\'' +
				", admincode='" + admincode + '\'' +
				", score=" + score +
				'}';
	}

	public APIAddressMatchResult() {
	}

}
