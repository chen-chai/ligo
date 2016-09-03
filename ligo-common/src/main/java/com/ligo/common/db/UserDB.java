package com.ligo.common.db;


/**
 * 
 * User
 * @author auto-generator
 * 2016-09-03 47:17:49
 */
public class UserDB {
	/**
	 * 主键ID
	 */
	private java.lang.Integer id;
	/**
	 * guid 查询用
	 */
	private java.lang.String userGuid;
	/**
	 * 手机号（加密）
	 */
	private java.lang.String phoneNo;
	/**
	 * 登录名
	 */
	private java.lang.String loginName;
	/**
	 * 登录密码（加密）
	 */
	private java.lang.String password;
	/**
	 * 用户名
	 */
	private java.lang.String userName;
	/**
	 * 性别（0：女 1：男）
	 */
	private java.lang.Integer sex;
	/**
	 * 个性签名
	 */
	private java.lang.String signature;
	/**
	 * 所属省份
	 */
	private java.lang.Integer provinceId;
	/**
	 * 城市Id
	 */
	private java.lang.Integer cityId;
	/**
	 * districtId
	 */
	private java.lang.Integer districtId;
	/**
	 * 级别Id
	 */
	private java.lang.Integer levelId;
	/**
	 * score
	 */
	private java.lang.Long score;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;
	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date updateTime;
	/**
	 * 版本号
	 */
	private java.lang.Long versionNo;

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setUserGuid(java.lang.String value) {
		this.userGuid = value;
	}
	public java.lang.String getUserGuid() {
		return this.userGuid;
	}
	public void setPhoneNo(java.lang.String value) {
		this.phoneNo = value;
	}
	public java.lang.String getPhoneNo() {
		return this.phoneNo;
	}
	public void setLoginName(java.lang.String value) {
		this.loginName = value;
	}
	public java.lang.String getLoginName() {
		return this.loginName;
	}
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	public java.lang.String getPassword() {
		return this.password;
	}
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	public java.lang.String getUserName() {
		return this.userName;
	}
	public void setSex(java.lang.Integer value) {
		this.sex = value;
	}
	public java.lang.Integer getSex() {
		return this.sex;
	}
	public void setSignature(java.lang.String value) {
		this.signature = value;
	}
	public java.lang.String getSignature() {
		return this.signature;
	}
	public void setProvinceId(java.lang.Integer value) {
		this.provinceId = value;
	}
	public java.lang.Integer getProvinceId() {
		return this.provinceId;
	}
	public void setCityId(java.lang.Integer value) {
		this.cityId = value;
	}
	public java.lang.Integer getCityId() {
		return this.cityId;
	}
	public void setDistrictId(java.lang.Integer value) {
		this.districtId = value;
	}
	public java.lang.Integer getDistrictId() {
		return this.districtId;
	}
	public void setLevelId(java.lang.Integer value) {
		this.levelId = value;
	}
	public java.lang.Integer getLevelId() {
		return this.levelId;
	}
	public void setScore(java.lang.Long value) {
		this.score = value;
	}
	public java.lang.Long getScore() {
		return this.score;
	}
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	public void setVersionNo(java.lang.Long value) {
		this.versionNo = value;
	}
	public java.lang.Long getVersionNo() {
		return this.versionNo;
	}

}

