package ua.lviv.lgs;

import java.util.Comparator;

public class HumanAgeComparator implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		if(o1.getAge()>o2.getAge()) {
			return 1;
		} else if (o1.getAge()<o2.getAge()) {
			return -1;
		}
		return 0;
	}
	
}
