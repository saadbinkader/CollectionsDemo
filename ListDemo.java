import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/27/13
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListDemo {

    // All ORDERED

    private List<String> arrayList = new ArrayList<String>() ;
    // random access, asynchronized methods, slow insertion deletion

    private List<String> vector = new Vector<String>() ;
    // random access, synchoronized methods, slow insertion deletion

     private List<String> linkedList = new LinkedList<String>() ;
    // no random access, fast insertion deletion, asynchronized

    public ListDemo( String[] stringArray ) {
          for ( String string : stringArray ) {
              arrayList.add(string) ;
              vector.add(string) ;
              linkedList.add(string) ;
          }
    }

    public void printAll() {
        System.out.println("ArrayList: ");
        if ( arrayList.size() == 0 )
            System.out.print("Empty!");
        else
            for ( String string : arrayList ) {
                System.out.print(string + " ");
            }
         System.out.println();

        System.out.println("Vector: ");
        if ( vector.size() == 0 )
            System.out.print("Empty!");
        else
            for ( String string : vector ) {
                System.out.print(string + " ");
            }
        System.out.println();

        System.out.println("LinkedList: ");
        if ( linkedList.size() == 0 )
            System.out.print("Empty!");
        else
            for ( String string : linkedList ) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    public void deleteAll() {
        for (ListIterator<String> iterator = arrayList.listIterator(); iterator.hasNext() ;  ) {
            iterator.next() ;
            iterator.remove(); // remove the object returned by last next() or previous() call
        }
        System.out.println();
        for (ListIterator<String> iterator = vector.listIterator(); iterator.hasNext() ;  ) {
            iterator.next() ;
            iterator.remove(); // remove the object returned by last next() or previous() call
        }
        System.out.println();
        for (ListIterator<String> iterator = linkedList.listIterator(); iterator.hasNext() ;  ) {
            iterator.next() ;
            iterator.remove(); // remove the object returned by last next() or previous() call
        }
    }
}
