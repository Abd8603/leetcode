class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> outgoing = new HashSet<>();
        Set<String> incoming = new HashSet<>();
        for(List<String> cities : paths){
            String out = cities.get(0);
            outgoing.add(out);
            if(incoming.contains(out)){
                incoming.remove(out);
            }
            String in = cities.get(1);
            if(!outgoing.contains(in)){
                incoming.add(in);
            }
        }
        for(String x : incoming){
            return x;
        }
        return "";

    }
}