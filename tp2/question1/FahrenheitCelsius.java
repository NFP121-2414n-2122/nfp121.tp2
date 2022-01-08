package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
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
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        return (f-32) * 5.0f/9.0f;
    }

}
