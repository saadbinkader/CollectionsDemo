import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/27/13
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class SetDemo {

    // Unique

    private Set<String> hashSet = new HashSet<String>() ;
    // Unsorted, Unordered
    private Set<String> linkedHashSet = new LinkedHashSet<String>() ;
    // Unsorted, Ordered
    private Set<String> treeSet = new TreeSet<String>() ;
    // Sorted, unordered

    public SetDemo( String[] stringArray ) {
        for ( String string : stringArray ) {
            hashSet.add(string) ;
            linkedHashSet.add(string) ;
            treeSet.add(string) ;
        }
    }

    public void addAll( String[] stringArray ) {
        for ( String string : stringArray ) {
            if ( hashSet.add(string) )
                System.out.println( "Added to HashSet " + string ) ;
            else
                System.out.println("Already has " + string + " in HashSet " );

            if ( linkedHashSet.add(string) )
                System.out.println( "Added to LinkedHashSet " + string ) ;
            else
                System.out.println("Already has " + string + " in LinkedHashSet" );
            if ( treeSet.add(string) )
                System.out.println( "Added to TreeSet " + string ) ;
            else
                System.out.println("Already has " + string + " in TreeMap" );
        }
    }

    public void deleteAll() {
         for ( Iterator<String> iterator = hashSet.iterator() ; iterator.hasNext() ; ) {
             iterator.next() ;
             iterator.remove();
         }
         for ( Iterator<String> iterator = linkedHashSet.iterator() ; iterator.hasNext() ; ) {
             iterator.next() ;
             iterator.remove();
         }
         for ( Iterator<String> iterator = treeSet.iterator() ; iterator.hasNext() ; ) {
             iterator.next() ;
             iterator.remove();
         }
    }

    public void printAll() {
        System.out.println("HashSet: ");
        if ( hashSet.size() == 0 )
            System.out.print("Empty!");
        else
            for ( String string : hashSet ) {
                System.out.print(string + " ");
            }
        System.out.println();

        System.out.println("LinkedHashSet: ");
        if ( linkedHashSet.size() == 0 )
            System.out.print("Empty!");
        else
            for ( String string : linkedHashSet ) {
                System.out.print(string + " ");
            }
        System.out.println();

        System.out.println("TreeSet: ");
        if ( treeSet.size() == 0 )
            System.out.print("Empty!");
        else
            for ( String string : treeSet ) {
                System.out.print(string + " ");
            }
        System.out.println();
    }

}
