class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
              Set<Integer> onBulbs = new HashSet<>();
        
        for (int bulb : bulbs) {
            if (onBulbs.contains(bulb)) {
                onBulbs.remove(bulb);   // turn OFF
            } else {
                onBulbs.add(bulb);      // turn ON
            }
        }
        
        List<Integer> result = new ArrayList<>(onBulbs);
        Collections.sort(result);
        return result;
    }
}