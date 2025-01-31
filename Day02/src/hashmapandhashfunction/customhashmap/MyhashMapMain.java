package hashmapandhashfunction.customhashmap;

public class MyhashMapMain {
    public static void main(String[] args) {
        MyhashMap map = new MyhashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(1001, 30);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(1001));

        map.remove(1);
        System.out.println(map.get(1));
    }

}
