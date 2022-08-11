import java.util.*;

public class CollectionDemo1 {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add("西瓜");
        collection.add("榴莲");
        collection.add("苹果");
        System.out.println(collection);
//        for (Object ob: collection) {
//            System.out.println(ob);
//        }
        Iterator it = collection.iterator();
        while (it.hasNext()){
            Object o = it.next();
            if (o == "西瓜") {
                it.remove();
            }
            System.out.println(o);

        }
        System.out.println(collection);
    }
}
