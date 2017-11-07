package bean;

import java.util.Date;

public class CandidateProposal {

	private int roleId;
	private String candidate;
	private String interviewer;
	private String candidateStatus;
	private String interviewerComments;
	private String projectLeadComments;
	private String recruitmentComments;
	private String proposedBy;
	private Date proposedDate;
	private Date interviewAcceptanceDate;	//when interviewer accepts the interview
	private Date interviewerUpdateDate;		//when interviewer accepts/rejects candidate
	private Date projectLeadUpdateDate;		//when project lean accepts/rejects candidate
	private Date recruitmentUpdateDate;		//when recruitment accepts/rejects candidate
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getCandidate() {
		return candidate;
	}
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
	public String getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}
	public String getCandidateStatus() {
		return candidateStatus;
	}
	public void setCandidateStatus(String candidateStatus) {
		this.candidateStatus = candidateStatus;
	}
	public String getInterviewerComments() {
		return interviewerComments;
	}
	public void setInterviewerComments(String interviewerComments) {
		this.interviewerComments = interviewerComments;
	}
	public String getProjectLeadComments() {
		return projectLeadComments;
	}
	public void setProjectLeadComments(String projectLeadComments) {
		this.projectLeadComments = projectLeadComments;
	}
	public String getRecruitmentComments() {
		return recruitmentComments;
	}
	public void setRecruitmentComments(String recruitmentComments) {
		this.recruitmentComments = recruitmentComments;
	}
	public String getProposedBy() {
		return proposedBy;
	}
	public void setProposedBy(String proposedBy) {
		this.proposedBy = proposedBy;
	}
	public Date getProposedDate() {
		return proposedDate;
	}
	public void setProposedDate(Date proposedDate) {
		this.proposedDate = proposedDate;
	}
	public Date getInterviewAcceptanceDate() {
		return interviewAcceptanceDate;
	}
	public void setInterviewAcceptanceDate(Date interviewAcceptanceDate) {
		this.interviewAcceptanceDate = interviewAcceptanceDate;
	}
	public Date getInterviewerUpdateDate() {
		return interviewerUpdateDate;
	}
	public void setInterviewerUpdateDate(Date interviewerUpdateDate) {
		this.interviewerUpdateDate = interviewerUpdateDate;
	}
	public Date getProjectLeadUpdateDate() {
		return projectLeadUpdateDate;
	}
	public void setProjectLeadUpdateDate(Date projectLeadUpdateDate) {
		this.projectLeadUpdateDate = projectLeadUpdateDate;
	}
	public Date getRecruitmentUpdateDate() {
		return recruitmentUpdateDate;
	}
	public void setRecruitmentUpdateDate(Date recruitmentUpdateDate) {
		this.recruitmentUpdateDate = recruitmentUpdateDate;
	}
}
