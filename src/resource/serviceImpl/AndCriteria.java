package resource.serviceImpl;

import java.util.List;

import resource.VO.Person;
import resource.service.Criteria;

public class AndCriteria implements Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;


	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		 List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
	     return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}