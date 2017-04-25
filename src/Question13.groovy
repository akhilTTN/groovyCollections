/**
 * Created by akhil on 21/4/17.
 */
List list=['a','b','b','c']
int totalSize=list.size()
list.removeAll('z')
int newSize = list.size()
print(totalSize-newSize)
