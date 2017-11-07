package enums;

public enum CandidateStatus {

	ACCEPTED_BY_RECRUITMNET,	//when recruitment accepts the candidate (accepted offer)
	ACCEPTED_BY_PROJECT,		//when project lead accepts the candidate
	ACCEPTED_BY_INTERVIEWER,	//when interviewer accepts the candidate
	REJECTED_BY_PROJECT,		//when project lead rejects the candidate or accepted other	
	REJECTED_BY_INTERVIEWER,	//when interviewer rejects the candidate	
	REJECTED_BY_RECRUITMENT,	//when recruitment rejects the candidate (step out of process, declined offer, etc.)
	ON_INTERVIEW,				//when interviewer accepts interview
	PROPOSED					//when anyone proposes the candidate to role request
}