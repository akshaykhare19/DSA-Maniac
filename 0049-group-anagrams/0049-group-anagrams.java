class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char charArr[] = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if(!map.containsKey(sortedStr))
                map.put(sortedStr, new ArrayList<>());
            List<String> tempList = map.get(sortedStr);
            tempList.add(str);
            map.put(sortedStr, tempList);
        }
        map.forEach((key, value) -> res.add(value));
        return res;
    }
}