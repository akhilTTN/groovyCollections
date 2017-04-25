/**
 * Created by akhil on 21/4/17.
 */
Map map = new HashMap()
map.put("Prashant", 25)
map.put("Gunjan", 24)
map.put("Robin", 21)
map.put("Akhil", 24)
map.put("Ajay", 23)

Map map1 = new HashMap()
map1.put("Rahul", 25)
map1.put("Arun", 24)

Map map2 = map + map1

assert map2 == [Gunjan:24, Rahul:25, Arun:24, Akhil:24, Prashant:25, Robin:21, Ajay:23]
println(map2)
