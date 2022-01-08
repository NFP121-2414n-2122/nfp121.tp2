package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
       int fahrenheit = 0;
        float celsius = 0;
        for (int i=0; i<args.length;i++){
            int ff = Integer.parseInt(args[i]);
            float cc = fahrenheitEnCelsius(ff);
            fahrenheit = ff;
            float cc2 = cc*10;
            celsius = (int)cc2/10.0f;
        
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
        }
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       return (f-32) * 5.0f/9.0f;    // à compléter    en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }

}
