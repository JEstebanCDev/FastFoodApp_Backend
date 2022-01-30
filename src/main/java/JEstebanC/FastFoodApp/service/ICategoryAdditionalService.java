/**
 * 
 */
package JEstebanC.FastFoodApp.service;

import java.util.Collection;

import JEstebanC.FastFoodApp.model.CategoryAdditional;

/**
 * @author Juan Esteban Castaño Holguin castanoesteban9@gmail.com 2022-01-23
 */
public interface ICategoryAdditionalService {

    CategoryAdditional create(CategoryAdditional categoryAdditional);

    CategoryAdditional update(CategoryAdditional categoryAdditional);

    Boolean delete(Long idCategoryAdditional);

    Collection<CategoryAdditional> list();

    Boolean exist(Long idCategoryAdditional);

}
