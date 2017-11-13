package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.CandidateRequest;
import dao.CandidateRequestDAO;

//import javax.faces.bean.ManagedBean;
//annotations don't work due to jetty embedded server; must use faces-config.xml
//annotation default name property is same as class name in camel case
//@ManagedBean(name = "name")
//@ManagedBean
@Service
public class SampleService {

	@Autowired
    private CandidateRequestDAO candidateRequestDAO;
	
	public List<String> getSamples(){
		CandidateRequest cr = new CandidateRequest();
		cr.setRoleId(1234);
		
		candidateRequestDAO.persist(cr);
		
		List<String> samples = new ArrayList<String>();

		samples.add("San Francisco");
		samples.add("London");
		samples.add("Paris");
		samples.add("Istanbul");
		samples.add("Berlin");
		samples.add("Barcelona");
		samples.add("Rome");
		
		return samples;
	}

	public CandidateRequestDAO getCandidateRequestDAO() {
		return candidateRequestDAO;
	}

	public void setCandidateRequestDAO(CandidateRequestDAO candidateRequestDAO) {
		this.candidateRequestDAO = candidateRequestDAO;
	}
}
