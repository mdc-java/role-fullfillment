package dao;

import java.util.List;

import bean.CandidateRequest;

public interface CandidateRequestDAO {

	void persist(CandidateRequest bean);
	
	List<CandidateRequest> getAll();
}
