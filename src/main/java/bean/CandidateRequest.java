package bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CandidateRequest {

	@Id
	private int roleId;
	private String capability;
	private String account;
	private Date startDate;
	private String primarySkill;
	private String secondarySkill;
	private List<String> skills;
	private int careerLevel;
	private String status;
	private String acknowledgedBy;
	private Date acknowledgedDate;
	private String createdBy;
	private Date createdDate;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getCapability() {
		return capability;
	}
	public void setCapability(String capability) {
		this.capability = capability;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	public String getSecondarySkill() {
		return secondarySkill;
	}
	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public int getCareerLevel() {
		return careerLevel;
	}
	public void setCareerLevel(int careerLevel) {
		this.careerLevel = careerLevel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAcknowledgedBy() {
		return acknowledgedBy;
	}
	public void setAcknowledgedBy(String acknowledgedBy) {
		this.acknowledgedBy = acknowledgedBy;
	}
	public Date getAcknowledgedDate() {
		return acknowledgedDate;
	}
	public void setAcknowledgedDate(Date acknowledgedDate) {
		this.acknowledgedDate = acknowledgedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}	
}
