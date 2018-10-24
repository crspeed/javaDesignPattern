package resource.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import resource.VO.Person;
import resource.service.Criteria;

public class CriteriaMale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		 List<Person> malePersons = new ArrayList<Person>();
	      for (Person person : persons) {
	         if(person.getGender().equalsIgnoreCase("MALE")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	}

}
