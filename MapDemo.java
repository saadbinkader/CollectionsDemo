import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/27/13
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MapDemo {

    // unique ID

    private Map <Integer,String> hashMap = new HashMap<Integer,String>() ;
    // unordered, unsorted, allows one null key and multiple null value
    private Map <Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>() ;
    // ordered, unsorted, allows one null key and multiple null value
    private Map <Integer,String> hashTable = new Hashtable<Integer, String>() ;
    //synchronized, unordered, unsorted, allows NO null key and null value
    private Map <Integer,String> treeMap = new TreeMap<Integer, String>() ;
    // sorted

    public MapDemo( String[] stringArray ) {
        int id = 1 ;
        for ( String string : stringArray ) {
            hashMap.put(id,string) ;
            linkedHashMap.put(id,string) ;
            hashTable.put(id,string) ;
            treeMap.put(id,string) ;
            id++;
        }
    }

    public void printAll() {
        System.out.println("HashMap :");

        if ( hashMap.size() == 0 )
            System.out.println("HashMap Empty!!!") ;
        else
            for ( Map.Entry<Integer,String> mapEntry : hashMap.entrySet() ) {
                System.out.println("ID : " + mapEntry.getKey() + " Value : " + mapEntry.getValue() ) ;
            }

        System.out.println("LinkedHashMap :");

        if ( linkedHashMap.size() == 0 )
            System.out.println("LinkedHashMap Empty!!!") ;
        else
            for ( Map.Entry<Integer,String> mapEntry : linkedHashMap.entrySet() ) {
                System.out.println("ID : " + mapEntry.getKey() + " Value : " + mapEntry.getValue() ) ;
            }

        System.out.println("Hashtable :");
        if ( hashTable.size() == 0 )
            System.out.println("HashMap Empty!!!") ;
        else
            for ( Map.Entry<Integer,String> mapEntry : hashTable.entrySet() ) {
                System.out.println("ID : " + mapEntry.getKey() + " Value : " + mapEntry.getValue() ) ;
            }

        System.out.println("TreeMap :");
        if ( treeMap.size() == 0 )
            System.out.println("HashMap Empty!!!") ;

        else
            for ( Map.Entry<Integer,String> mapEntry : treeMap.entrySet() ) {
                System.out.println("ID : " + mapEntry.getKey() + " Value : " + mapEntry.getValue() ) ;
            }
    }

    public void deleteAll() {
        Set<Integer> keyList = new HashSet<Integer>(hashMap.keySet());
        for ( Integer key : keyList )
            hashMap.remove(key)  ;
        keyList = new HashSet<Integer>(linkedHashMap.keySet());
        for ( Integer key : keyList )
            linkedHashMap.remove(key)  ;
        keyList = new HashSet<Integer>(hashTable.keySet());
        for ( Integer key : keyList )
            hashTable.remove(key)  ;
        keyList = new HashSet<Integer>(treeMap.keySet());
        for ( Integer key : keyList )
            treeMap.remove(key)  ;
    }
}
