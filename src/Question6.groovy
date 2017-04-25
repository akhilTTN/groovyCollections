/**
 * Created by akhil on 20/4/17.
 */
List list=[1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
list.eachWithIndex {p,i->println list.get(i).getClass()}
println list.get(6).get(9)
