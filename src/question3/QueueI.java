package question3;


/** Interface de file(FIFO), born�e.
 * @see java.util.Queue
 */
public interface QueueI extends Iterable<Integer>{
 
  /** Ajout d'un entier � la file.
   * @param i l'�l�ment � enfiler
   * @throws RuntimeException si la file est pleine
   */
  public void add(int i);
  /** retrait d'un entier � la file.
   * @return l'�l�ment � d�filer
   * @throws RuntimeException si la file est vide
   */  
  public int remove();
  /** Lecture du prochain �l�ment � d�filer.
   * @return l'�l�ment � d�filer
   * @throws RuntimeException si la file est vide
   */ 
  public int element();

  /** Retrait de tous les �l�ments de la file.
   */
  public void clear();
  /* Test de la pr�sence d'un �l�ment.
   * @param i l'�l�ment � tester
   * @retrun true i est pr�sent, false autrement
   */
  public boolean contains(int i);
  /** Obtention du nombre d'�l�ment de la file.
   * @return le nombre d'�l�ment pr�sent
   */
  public int size();
  /** Obtention du nombre maximal d'�l�ment de la file.
   * @return la capacit� de cette file
   */
  public int capacity();
  
  /** Invariant de classe. cf. B. Liskov.
   * @return true si l'invariant est vrai, faux autrement.
   */
  public boolean repOk();
  /** Fonction d'abstraction. cf. B. Liskov.
   * @return la repr�sentation dite abstraite de cette file
   */
  public Object af();
  

  
}
