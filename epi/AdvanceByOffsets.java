package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.List;
public class AdvanceByOffsets {
  @EpiTest(testDataFile = "advance_by_offsets.tsv")
  public static boolean canReachEnd(List<Integer> maxAdvanceSteps) {
    // TODO - you fill in here.
	int furthest = 0; int end = maxAdvanceSteps.size()-1;
	for(int i=0;i<=furthest&&furthest<end;i++) {
		furthest = Math.max(furthest, i+maxAdvanceSteps.get(i));
	}
	//System.out.println(furthest);
    return furthest>=end;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "AdvanceByOffsets.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
