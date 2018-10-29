package question3;


import question3.fifo.*;

public class QueueAf extends QueueDecorator{
  
  public QueueAf( QueueI q){
    super(q);
  }
  


  public void add(int i){
    FileI<Integer> queue = (FileI)super.af();
    assert queue!=null : " pre af add invalide !";
// � compl�ter
// 
// 
// 
// 
// 
// 
// 
// 
    assert queue.equals(super.af()) : " post af add invalide !";  // deux listes �gales
  }
  public int remove(){
    FileI<Integer> queue = (FileI<Integer>)super.af();
    assert queue != null : " pre af remove  invalide !";
    int res = -1, resAf=0;
// � compl�ter
// 
// 

    assert resAf == res : " post af remove invalide !";
    return res;
  }
  public void clear(){
    FileI<Integer> queue = (FileI<Integer>)super.af();
    assert queue != null : " pre af clear  invalide !";
// � compl�ter
// 
// 
    assert queue.taille()==0 & queue.equals(super.af()) : "  post af clear  invalide !";
  }  
  @Override
  public boolean contains(int i){
    FileI<Integer> queue = (FileI<Integer>)super.af();
    assert queue != null : " pre af contains  invalide !";
    boolean res = false, resAf = true;
// � compl�ter
// 
// 
    assert resAf == res : " post af contains invalide !";
    return res;
  } 
  public int size(){
    FileI<Integer> queue = (FileI<Integer>)super.af();
    assert queue != null : " pre af size  invalide !";
    int nombreAf = 0, nombre = 1;
// � compl�ter
// 
// 
    assert nombreAf == nombre : " post af size invalide !";
    return nombre;
  }
  public int capacity(){
    FileI queue = (FileI)super.af();
    assert queue != null : " pre capacity af invalide !";  
        int nombreAf = 0, nombre = 1;
// � compl�ter
// 
// 
    assert nombre == nombreAf : " post capacity af invalide !";
    return nombre;
  }


}
