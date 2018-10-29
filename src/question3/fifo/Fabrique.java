package question3.fifo;

import java.util.*;

public class Fabrique{
  

  public static <E> FileI<E> creerFile(int capacite){
    return new FileImpl<E>( capacite);
  }
    
  public static <E extends Comparable<? super E>> FileI<E > creerFileAvecPriorite(int capacite){
    return new FileAvecPriorite<E>(capacite, Collections.reverseOrder());
  }
  
  public static <E extends Comparable<? super E>> FileI<E > 
            creerFileAvecPriorite(int capacite, Comparator<E> comparator){
    return new FileAvecPriorite<E>(capacite, comparator);
  }


  /** M�thodes avec une �criture possible, qui devraient fonctionner,
   *  mais attention : pas de m�thode equals sur des instances de PriorityQueue,
   *  la m�thode equals classe AdapaterQueue a du �tre adapt�e... et reste � valider
   *  de plus la m�thode it�rator ne retourne pas les �l�ments dans l'ordre prescrit ...,
   *  "The elements are in no particular order." cf javadoc
   *  
   */
//   public static <E extends Comparable<? super E>> FileI<E > 
//             creerFileAvecPriorite(int capacite){
//     return new AdapterQueue<E>( capacite, new PriorityQueue<E>(Collections.reverseOrder()));
//   }
//   
//   public static <E extends Comparable<? super E>> FileI<E > 
//             creerFileAvecPriorite(int capacite, Comparator<E> comparator){
//     return new AdapterQueue<E>( capacite, new PriorityQueue<E>(comparator));
//   }
//   
//  
//   public static <E> FileI<E> creerFile(int capacite){
//     return new AdapterQueue<E>( capacite, new LinkedList<E>());
//   }
//   public static <E> FileI<E> creerFile(int capacite, Class<?> clazz) throws Exception{
//     return new AdapterQueue<E>( capacite, (Queue<E>)clazz.newInstance());
//   }
  

}
