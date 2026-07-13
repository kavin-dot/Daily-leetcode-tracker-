// Last updated: 7/13/2026, 9:24:19 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for (int num : nums) {
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8        PriorityQueue<Map.Entry<Integer, Integer>> pq =
9                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
10        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
11            pq.offer(entry);
12
13            if (pq.size() > k) {
14                pq.poll();
15            }
16        }
17        int[] ans = new int[k];
18
19        for (int i = k - 1; i >= 0; i--) {
20            ans[i] = pq.poll().getKey();
21        }
22
23        return ans;
24    }
25}