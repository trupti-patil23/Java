package java_interview;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(23);
		list.add(9);
		list.add(6);
		list.add(2);
		list.add(23);
		list.add(12);
		list.add(9);
		list.add(79);
		list.add(129);

		Set<Integer> set = new HashSet<Integer>();
		for (Integer i : list) {
			set.add(i);
			System.out.print(i + " ");
		}
		System.out.println("\n Duplicates removed using sets");
		for (Integer i : set) {
			System.out.print(i + " ");
		}
		
		// ------------------------------------------------------------------------------
		System.out.println("\n Other Method::by traversing ArrayList");
		list.sort(null); //
		int size = list.size();	
		for (int cnt = 0; cnt < size; cnt++) {
			if (cnt != size - 1) {
				if (list.get(cnt) == list.get(cnt + 1)) {
					list.remove(cnt);
					size--;
				}
			}		
		}
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		//-----------------------------------------------------------------------------------
		ArrayList<Integer> listWithoutDuplicates = (ArrayList<Integer>) list.stream()
																			.distinct()								
																			.collect(Collectors.toList());
		
		System.out.println("\n Using Stream API: "+listWithoutDuplicates);
		
	}

}
