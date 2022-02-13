/**
 * 
 */
package JEstebanC.FastFoodApp.security;

/**
 * @author Juan Esteban Castaño Holguin castanoesteban9@gmail.com 2022-02-03
 */
public final class OperationUtil {

	private static final String KEYWORD = "FASTFOODAPP_22";

	private OperationUtil() {
		throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
	}

	public static String keyValue() {
		return KEYWORD;
	}
}
