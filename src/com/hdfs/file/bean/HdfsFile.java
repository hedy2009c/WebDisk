package com.hdfs.file.bean;

// Generated 2011-3-16 15:10:21 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * HdfsFile generated by hbm2java
 */
public class HdfsFile implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long fileId;
	private String fileName;
	private long parentid;
	private Long size;
	private String fileUrl;
	private Date createTime;
	private Date modifiedTime;
	private Date deadline;
	private Integer safeLevel;
	private int type;
	private long userId;
	private byte[] encryptDataKey;

	public byte[] getEncryptDataKey() {
		return encryptDataKey;
	}

	public void setEncryptDataKey(byte[] encryptDataKey) {
		this.encryptDataKey = encryptDataKey;
	}

	public HdfsFile() {
	}

	public HdfsFile(long fileId, String fileName, long parentid,
			String fileUrl, int type) {
		this.fileId = fileId;
		this.fileName = fileName;
		this.parentid = parentid;
		this.fileUrl = fileUrl;
		this.type = type;
		this.createTime = new Date();
		this.modifiedTime = new Date();

	}

	public HdfsFile(long fileId, String fileName, long parentid, Long size,
			String fileUrl, Date createTime, Date modifiedTime,
			Integer safeLevel, Integer timing, Integer importantLevel,
			Integer fsId, int type, Long userId, byte[] encryptDataKey) {
		this.fileId = fileId;
		this.fileName = fileName;
		this.parentid = parentid;
		this.size = size;
		this.fileUrl = fileUrl;
		this.createTime = createTime;
		this.modifiedTime = modifiedTime;
		this.safeLevel = safeLevel;
		this.type = type;
		this.userId = userId;
		this.encryptDataKey = encryptDataKey;
	}

	public long getFileId() {
		return this.fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getParentid() {
		return this.parentid;
	}

	public void setParentid(long parentid) {
		this.parentid = parentid;
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getSafeLevel() {
		return this.safeLevel;
	}

	public void setSafeLevel(Integer safeLevel) {
		this.safeLevel = safeLevel;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getDeadline() {
		return deadline;
	}

}
