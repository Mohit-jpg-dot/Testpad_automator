public static boolean hasDuplicateMappings(Map<String, String> map) {
    HashSet<String> set = new HashSet<>();
    for(String value : map.values()){
        if(set.contains(value)){
            return true;
        }
        set.add(value);
     }
    return false;
}