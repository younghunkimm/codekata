import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
		int mod = 1_234_567;

		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);

		for (int i = 2; i <= n; i++) {
			int temp = (list.get(i - 2) % mod + list.get(i - 1) % mod) % mod;
			list.add(temp);
		}

		return list.get(n);
    }
}