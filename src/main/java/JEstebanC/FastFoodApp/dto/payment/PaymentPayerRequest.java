package JEstebanC.FastFoodApp.dto.payment;

import lombok.Data;

/**
 * @author Juan Esteban Castaño Holguin castanoesteban9@gmail.com 2022-01-24
 */
@Data
public class PaymentPayerRequest {
    private String entityType;
    private String type;
}