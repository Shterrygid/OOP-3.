import java.util.*;

public class SetExample {
    private Set<Integer> set;
    private int n;

    public SetExample(int n) {
        this.n = n;
        set = new HashSet<Integer>();
    }

    public void add(int num) {
        set.add(num);
    }

    public Set<Integer> getSet() {
        return set;
    }

    public Set<Integer> intersection(Set<Integer> otherSet) {
        Set<Integer> result = new HashSet<Integer>(set);
        result.retainAll(otherSet);
        return result;
    }

    public Set<Integer> union(Set<Integer> otherSet) {
        Set<Integer> result = new HashSet<Integer>(set);
        result.addAll(otherSet);
        return result;
    }

    public static void main(String[] args) {
        SetExample set1 = new SetExample(5);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        SetExample set2 = new SetExample(5);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Set 1: " + set1.getSet());
        System.out.println("Set 2: " + set2.getSet());

        Set<Integer> intersection = set1.intersection(set2.getSet());
        System.out.println("Intersection: " + intersection);

        Set<Integer> union = set1.union(set2.getSet());
        System.out.println("Union: " + union);
    }
} 