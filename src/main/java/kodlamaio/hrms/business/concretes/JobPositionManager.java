package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service //Projede service görevi görecek bilgisini spring e veriyoruz.
public class JobPositionManager implements JobPositionService {

	@Autowired
	private JobPositionDao jobPositionDao;
	
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
