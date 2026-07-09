// Last updated: 7/9/2026, 6:19:18 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        map.put(0, 1); 
6
7        int currentSum = 0;
8        int count = 0;
9
10        for (int num : nums) {
11            currentSum += num;
12
13            if (map.containsKey(currentSum - k)) {
14                count += map.get(currentSum - k);
15            }
16
17            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
18        }
19
20        return count;
21    }
22}