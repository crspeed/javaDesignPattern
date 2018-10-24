package resource.service;

import java.util.List;

import resource.VO.Person;

public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
