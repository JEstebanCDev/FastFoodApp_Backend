package JEstebanC.FastFoodApp.dto.payment;

import lombok.Data;

/**
 * @author Juan Esteban Castaño Holguin castanoesteban9@gmail.com 2022-01-24
 */
@Data
public class PaymentAdditionalInfoPayerRequest {

    private String firstName;
    private String lastName;
    private PhoneRequest phoneRequest;
}
