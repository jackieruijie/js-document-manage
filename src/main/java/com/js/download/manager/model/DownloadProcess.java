package com.js.download.manager.model;

import java.util.Date;

public class DownloadProcess {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.PK_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String pkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.USER_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.ORGINIZE_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String orginizeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.PROCESS_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String processId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_FILE_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String downloadFileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private Date downloadTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.UPDATE_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.STATUS
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.IS_DELETE
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private Integer isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.ACTION_NAME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String actionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.IP_ADD
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String ipAdd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.FILE_TYPE
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private String fileType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOWNLOAD_PROCESS_CLIENT.END_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.PK_ID
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.PK_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getPkId() {
        return pkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.PK_ID
     *
     * @param pkId the value for DOWNLOAD_PROCESS_CLIENT.PK_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setPkId(String pkId) {
        this.pkId = pkId == null ? null : pkId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.USER_ID
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.USER_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.USER_ID
     *
     * @param userId the value for DOWNLOAD_PROCESS_CLIENT.USER_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.ORGINIZE_ID
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.ORGINIZE_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getOrginizeId() {
        return orginizeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.ORGINIZE_ID
     *
     * @param orginizeId the value for DOWNLOAD_PROCESS_CLIENT.ORGINIZE_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setOrginizeId(String orginizeId) {
        this.orginizeId = orginizeId == null ? null : orginizeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.PROCESS_ID
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.PROCESS_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.PROCESS_ID
     *
     * @param processId the value for DOWNLOAD_PROCESS_CLIENT.PROCESS_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_FILE_ID
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_FILE_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getDownloadFileId() {
        return downloadFileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_FILE_ID
     *
     * @param downloadFileId the value for DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_FILE_ID
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setDownloadFileId(String downloadFileId) {
        this.downloadFileId = downloadFileId == null ? null : downloadFileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_TIME
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public Date getDownloadTime() {
        return downloadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_TIME
     *
     * @param downloadTime the value for DOWNLOAD_PROCESS_CLIENT.DOWNLOAD_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.UPDATE_TIME
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.UPDATE_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.UPDATE_TIME
     *
     * @param updateTime the value for DOWNLOAD_PROCESS_CLIENT.UPDATE_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.STATUS
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.STATUS
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.STATUS
     *
     * @param status the value for DOWNLOAD_PROCESS_CLIENT.STATUS
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.IS_DELETE
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.IS_DELETE
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.IS_DELETE
     *
     * @param isDelete the value for DOWNLOAD_PROCESS_CLIENT.IS_DELETE
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.ACTION_NAME
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.ACTION_NAME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.ACTION_NAME
     *
     * @param actionName the value for DOWNLOAD_PROCESS_CLIENT.ACTION_NAME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.IP_ADD
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.IP_ADD
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getIpAdd() {
        return ipAdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.IP_ADD
     *
     * @param ipAdd the value for DOWNLOAD_PROCESS_CLIENT.IP_ADD
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd == null ? null : ipAdd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.FILE_TYPE
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.FILE_TYPE
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.FILE_TYPE
     *
     * @param fileType the value for DOWNLOAD_PROCESS_CLIENT.FILE_TYPE
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOWNLOAD_PROCESS_CLIENT.END_TIME
     *
     * @return the value of DOWNLOAD_PROCESS_CLIENT.END_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOWNLOAD_PROCESS_CLIENT.END_TIME
     *
     * @param endTime the value for DOWNLOAD_PROCESS_CLIENT.END_TIME
     *
     * @mbg.generated Tue Apr 02 12:17:28 CST 2019
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}