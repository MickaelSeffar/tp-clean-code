package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilitaires pour la gestion des dates
 */
public class DateUtils {
    /**
     * Pattern de formatage par défaut
     */
    private static final String DEFAULT_FORMAT = "dd/MM/yyyy";

    /**
     * Formate la date en String avec le pattern par défaut
     *
     * @param date date à formater
     * @return String
     */
    public static String convertDate(Date date) {
        return convertDate(date, DEFAULT_FORMAT);
    }

    /**
     * Formate la date en String avec un pattern spécifié
     *
     * @param date date à formater
     * @param pattern pattern de formatage
     * @return String
     */
    public static String convertDate(Date date, String pattern) {
        if (date == null || pattern == null || pattern.isEmpty()) {
            throw new IllegalArgumentException("La date et le pattern ne doivent pas être null ou vides");
        }

        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }
}
