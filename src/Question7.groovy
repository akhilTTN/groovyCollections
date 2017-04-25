/**
 * Created by akhil on 20/4/17.
 */
List list = [14, 12, 11, 10, 16, 15, 12, 10, 99, 90, 14, 16, 35]
list.unique()
list.sort { a, b -> b <=> a }
println list

println "////////////////////////////////////////////////////////////////////////////"
List list1 = [14, 12, 11, 10, 16, 15, 12, 10, 99, 90, 14, 16, 35]
Set set11 = list1.toSet().toSorted().reverse()
println set11

println "////////////////////////////////////////////////////////////////////////////"
List list2 = [14, 12, 11, 10, 16, 15, 12, 10, 99, 90, 14, 16, 35]
Set set2 = list2 as SortedSet
println set2.toSorted { a, b -> b - a }


