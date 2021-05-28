/*package whatever //do not write package name here */

import java.io.*;

class GFG { Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;

}