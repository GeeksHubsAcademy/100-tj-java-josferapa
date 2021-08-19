package es.geekshubs.academy;

public class FizzBuzz {

  /**
   * Apply Method
   * @param count
   * @return
   */
  public String apply(final int count) {
    
    String resultado = "";
    int i;

    for(i = 1; i <= count){
      if( i % (15) == 0){  //Va primero porque 15 es multiplo de 3 y 5, y este tiene que tener preferencia 
        resultado += "GeekHubs";
      } else if(i % 5 == 0){
        resultado += "Hubs";
      } else if(i % 3 == 0){
        resultado += "Geeks";
      } else {
        resultado += count;
      }
      
      resultado += "\n";
    }

    return resultado;
  }

}
