/**
 * Created by akhil on 19/4/17.
 */
class Question0 {
    public static void main(String[] args) {
        List l=[]
        l[11] = "myelement"
        println l[11]
        println l.get(5)
        println l

        assert l[11] == "myelement"
        assert l.get(5) == null
        assert l == [null, null, null, null, null, null, null, null, null, null, null, "myelement"]

    }
}
