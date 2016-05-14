import java.util.HashMap;
 import java.util.Iterator;
 import java.util.Map;

 public class StringToword {
	 
	 public static void main(String[] args) {
	
    String s="siva sudha siva sudha sree kumar siva husband wife sudha siva";
    String[] splitedString=s.split(" ");

    HashMap m = new HashMap();
    int count=1;
    
    for(String s1 :splitedString){ 
    	count =  m.containsKey(s1) ? (Integer) m.get(s1)+1 : 1;
        m.put(s1, count);
        }
    
    Iterator<StringToword> itr=m.entrySet().iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());         
    	}
    }
}