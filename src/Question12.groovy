/**
 * Created by akhil on 21/4/17.
 */
List list = 'a'..'z'
//print(list)
List list1 = 'a'..'j'
println list - list1


println("////////////////////////////////////////////////////////////////////////////////////////////////")

list = list.findAll { it > 'j' }
println(list)

println("////////////////////////////////////////////////////////////////////////////////////////////////")

list = 'a'..'z'
list.each {print(it>'j'?it+" ":'')}