package lab11_3;

import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> s = new HashMap<Key, Student>();
		for(Student ss : students) {			
			s.put(new Key(ss.getFirstName(), ss.getLastName()), ss);
		}
		return s;
	}
}
