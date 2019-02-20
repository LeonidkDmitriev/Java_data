public class Main {
    public static void main(String[] args) {
        HashChain str = new HashChain<>();
        str.put("Иванов","13");
        str.put("Петров","17");
        str.put("Сидоров","11");
        str.put("Орлов","123");
        str.put("Соколов","55");


        System.out.println(str.isKey("Орлов"));

        System.out.println(str.get("Петров","17"));

        System.out.println(str.get("Петров","25"));

    }
}
