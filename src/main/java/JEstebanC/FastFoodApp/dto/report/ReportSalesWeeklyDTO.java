package JEstebanC.FastFoodApp.dto.report;

import lombok.Data;

import java.math.BigInteger;

/**
 * @author Juan Esteban Castaño Holguin castanoesteban9@gmail.com 6/13/2022
 */
@Data
public class ReportSalesWeeklyDTO {
    private double weekday;
    private BigInteger total;
}
