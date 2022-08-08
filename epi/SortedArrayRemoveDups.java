package epi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import epi.test_framework.TimedExecutor;
public class SortedArrayRemoveDups {
  // Returns the number of valid entries after deletion.
  public static int deleteDuplicates(List<Integer> A) {
    // TODO - you fill in here.
	Map<Integer, Integer> map = new HashMap<>();
	List<Integer> l = new ArrayList<>();
	for(int i=0;i<A.size();i++) {
		if(map.containsKey(A.get(i))) {
			continue;
		}else {
			map.put(A.get(i),0);
			l.add(A.get(i));
		}
	}
	Collections.sort(l);
	Collections.copy(A, l);
//	System.out.println(map);
//	System.out.println(map.size());
    return map.size();
  }
  @EpiTest(testDataFile = "sorted_array_remove_dups.tsv")
  public static List<Integer> deleteDuplicatesWrapper(TimedExecutor executor,
                                                      List<Integer> A)
      throws Exception {
    int end = executor.run(() -> deleteDuplicates(A));
    return A.subList(0, end);
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "SortedArrayRemoveDups.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
