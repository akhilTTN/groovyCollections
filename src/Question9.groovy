/**
 * Created by akhil on 21/4/17.
 */

String s = "this string needs to be split"
println s.tokenize(" ")
println s.tokenize()
println s.tokenize(/\s/)


String s1 = "this string needs to be split"
println s1.split(" ")
println s1.split(/\s/)


String s2 = "are.you.trying.to.split.me.mister?"
println s2.tokenize(".")
println s2.split(".")