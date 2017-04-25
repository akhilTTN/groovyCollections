/**
 * Created by akhil on 21/4/17.
 */


class Question20 {
    static void main(String[] args) {
        Map map = new HashMap()
        map.put("Prashant", 25)
        map.put("Gunjan", 24)
        map.put("Rahul", 21)
        map.put("Akhil", 24)
        map.put("Ajay", 23)

        assert map.containsKey("Gunjan") == true
        println(map.containsKey("Gunjan"))
    }
}