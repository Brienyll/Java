import java.util.Hashtbale;

publicclass SimpleHashtable {

  public static void main(String[] args) {
    // create hashtable
    Hashtable ht = new Hashtable();
    
    ht.put("One", new Integer(1));
    ht.put("Two", new Integer(2));
    
    Object obj = ht.get("One");
    System.out.println(obj)
    }
}
