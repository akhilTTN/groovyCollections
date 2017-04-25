/**
 * Created by akhil on 21/4/17.
 */
Map map=new HashMap()
map.put("Prashant", 25)
map.put("Gunjan", 24)
map.put("Rahul", 21)
map.put("Akhil", 24)
map.put("Ajay", 23)

map.each { key, value ->
    println key + " " + value
}

map.eachWithIndex { keyValue, index ->
    println index + " " + keyValue
}