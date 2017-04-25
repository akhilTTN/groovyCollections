/**
 * Created by akhil on 19/4/17.
 */
List list =[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
List list1=[]
list.eachWithIndex{p,index -> if(index%2!=0) list1.add(index) }
list.removeAll(list1)
println list
