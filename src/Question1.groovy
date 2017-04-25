/**
 * Created by akhil on 19/4/17.
 */

println("Way 1")
Range range = 1..10
range.each { a -> if (a % 2) print(a + "\t") }
println()
println()
println("Way 2")
def result = range.findAll { it % 2 == 0 }
println result
println()
println()

assert result == [2, 4, 6, 8, 10]

println("Way 3")
def result1 = range.groupBy { it % 2 == 0 }
print result1
println()
println()
println("Way 4")
List list = 1..10
println list.class
list.each {
    if (it % 2 == 0)
        print(it +" ")
}
println()
println()

println("Way 5")

10.times {
    print(it % 2 == 0 ? it+" " : '')
}
println()
println()
println("Way 6")
0.step(10,2){
    print it+" "
}


