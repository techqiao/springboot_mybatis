package com.wjq.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.id
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.name
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.sex
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.id_no
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private String idNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.phone
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.source
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.status
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.create_time
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.update_time
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.attr
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private Long attr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.third_id
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private Long thirdId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.cert_passed
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private Boolean certPassed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.locale
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private String locale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table uc_user
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.id
     *
     * @return the value of uc_user.id
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.id
     *
     * @param id the value for uc_user.id
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.name
     *
     * @return the value of uc_user.name
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.name
     *
     * @param name the value for uc_user.name
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.sex
     *
     * @return the value of uc_user.sex
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.sex
     *
     * @param sex the value for uc_user.sex
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.id_no
     *
     * @return the value of uc_user.id_no
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.id_no
     *
     * @param idNo the value for uc_user.id_no
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.phone
     *
     * @return the value of uc_user.phone
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.phone
     *
     * @param phone the value for uc_user.phone
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.source
     *
     * @return the value of uc_user.source
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.source
     *
     * @param source the value for uc_user.source
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.status
     *
     * @return the value of uc_user.status
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.status
     *
     * @param status the value for uc_user.status
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.create_time
     *
     * @return the value of uc_user.create_time
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.create_time
     *
     * @param createTime the value for uc_user.create_time
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.update_time
     *
     * @return the value of uc_user.update_time
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.update_time
     *
     * @param updateTime the value for uc_user.update_time
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.attr
     *
     * @return the value of uc_user.attr
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public Long getAttr() {
        return attr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.attr
     *
     * @param attr the value for uc_user.attr
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setAttr(Long attr) {
        this.attr = attr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.third_id
     *
     * @return the value of uc_user.third_id
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public Long getThirdId() {
        return thirdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.third_id
     *
     * @param thirdId the value for uc_user.third_id
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setThirdId(Long thirdId) {
        this.thirdId = thirdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.cert_passed
     *
     * @return the value of uc_user.cert_passed
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public Boolean getCertPassed() {
        return certPassed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.cert_passed
     *
     * @param certPassed the value for uc_user.cert_passed
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setCertPassed(Boolean certPassed) {
        this.certPassed = certPassed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.locale
     *
     * @return the value of uc_user.locale
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public String getLocale() {
        return locale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.locale
     *
     * @param locale the value for uc_user.locale
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table uc_user
     *
     * @mbggenerated Thu Mar 15 10:17:01 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", idNo=").append(idNo);
        sb.append(", phone=").append(phone);
        sb.append(", source=").append(source);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", attr=").append(attr);
        sb.append(", thirdId=").append(thirdId);
        sb.append(", certPassed=").append(certPassed);
        sb.append(", locale=").append(locale);
        sb.append("]");
        return sb.toString();
    }
}