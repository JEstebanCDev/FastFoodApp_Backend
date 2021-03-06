package JEstebanC.FastFoodApp.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Juan Esteban Castaño Holguin
 * castanoesteban9@gmail.com
 * 2022-01-22
 */
@Getter
@AllArgsConstructor
public enum Status {

	INACTIVE(0),
	ACTIVE(1);
	private final int status;
}
