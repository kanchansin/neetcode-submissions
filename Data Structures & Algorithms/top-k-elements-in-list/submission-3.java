class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int freq = entry.getValue();
            if(buckets[freq]==null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(entry.getKey());
        }
        int index = 0;
        int[] result = new int[k];
        for(int freq = buckets.length-1; freq>=0 && index<k; freq--){
            if(buckets[freq] == null) continue;
            for(int num : buckets[freq]){
                result[index++] = num;
            }
            if(index==k) break;
        }
        return result;
    }
}
