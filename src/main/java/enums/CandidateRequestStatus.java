package enums;

public enum CandidateRequestStatus {

	OPEN, 					//when created
	ACKNOWLEDGED, 			//when recruitment acknowledges it
	IN_PROGRESS, 			//when one candidate has been added	
	CLOSED, 				//when recruitment accepts candidate
	CANCELED, 				//when it is cancelled by project lead and status was OPEN
	CANCELED_WITH_PENALTY	//when it is cancelled by project lead and status was IN_PROGRESS
}