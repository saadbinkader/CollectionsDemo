/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/27/13
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        String[] nameList = { "Dipto", "Bibhash", "Raqib" };
        ListDemo listDemo = new ListDemo(nameList) ;
        listDemo.printAll();
        listDemo.deleteAll();
        listDemo.printAll();

        System.out.println();
        System.out.println();

        SetDemo setDemo = new SetDemo(nameList) ;
        setDemo.printAll();
        setDemo.addAll(nameList);
        setDemo.deleteAll();
        setDemo.addAll(nameList);
        setDemo.printAll();

        MapDemo mapDemo = new MapDemo(nameList) ;
        mapDemo.printAll();
        mapDemo.deleteAll();
        mapDemo.printAll();

    }
}
