class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                int a = hash.get(nums[i]);
                a++;
                hash.put(nums[i], a);
            }
            else{
                hash.put(nums[i], 1);
            }
        }

        int z=0;

        for(Map.Entry<Integer, Integer> e: hash.entrySet()){
            if(e.getValue()==1) z= e.getKey();
        }

        return z;
    }
}
