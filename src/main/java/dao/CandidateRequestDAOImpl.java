package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import bean.CandidateRequest;

@Component
public class CandidateRequestDAOImpl implements CandidateRequestDAO {

	private final static String QUERY_ALL = "SELECT x FROM CandidateRequest x ORDER BY x.roleId";
	
	// Injected database connection:
    @PersistenceContext 
    private EntityManager entityManager;
    
    @Transactional
    public void persist(CandidateRequest bean) {
    	entityManager.persist(bean);
    }
    
    public List<CandidateRequest> getAll() {
        TypedQuery<CandidateRequest> query = entityManager.createQuery(QUERY_ALL, CandidateRequest.class);
        return query.getResultList();
    }
}
