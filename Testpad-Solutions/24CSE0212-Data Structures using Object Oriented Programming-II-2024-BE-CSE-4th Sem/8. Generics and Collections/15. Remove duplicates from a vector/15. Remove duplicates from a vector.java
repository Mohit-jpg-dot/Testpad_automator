static void removeDuplicates(Vector<Integer> list) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < list.size(); i++) {
        if (set.contains(list.get(i))) {
            list.remove(i);
            i--;
        } else {
            set.add(list.get(i));
        }
    }
}