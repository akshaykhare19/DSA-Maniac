class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char charArr[] = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
            //can be replaced with above line completely.
            /*if(!map.containsKey(sortedStr))
                map.put(sortedStr, new ArrayList<>());
            List<String> tempList = map.get(sortedStr);
            tempList.add(str);*/

            // map.put(sortedStr, tempList); //not needed, since tempList has the same instance. Hence, this can be removed.
        }
        map.forEach((key, value) -> res.add(value));
        return res;
    }
}