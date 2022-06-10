/**
 * 
 */
package JEstebanC.FastFoodApp.service.interfaces;

import java.text.ParseException;
import java.util.Collection;

import JEstebanC.FastFoodApp.dto.ReportClientDTO;
import JEstebanC.FastFoodApp.dto.ReportPayModeDTO;
import JEstebanC.FastFoodApp.dto.ReportProductDTO;
import JEstebanC.FastFoodApp.dto.ReportSalesDTO;

/**
 * @author Juan Esteban Castaño Holguin castanoesteban9@gmail.com 2022-03-16
 */
public interface IReportService {

	Collection<ReportProductDTO> getRankProducts(Long idProduct,Integer limit, String startDate, String endDate);
	
	Collection<ReportClientDTO> getRankClient(String username,String startDate, String endDate) throws ParseException;
	
	Collection<ReportSalesDTO> getSalesByDate(String startDate, String endDate);
	
	Collection<ReportPayModeDTO> getSalesPayModeByDate(String startDate, String endDate);
}
