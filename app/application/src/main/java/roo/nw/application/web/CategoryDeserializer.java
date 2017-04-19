package roo.nw.application.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import roo.nw.model.Category;
import roo.nw.service.api.CategoryService;

/**
 * = CategoryDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Category.class)
public class CategoryDeserializer extends JsonObjectDeserializer<Category> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CategoryService categoryService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param categoryService
     * @param conversionService
     */
    @Autowired
    public CategoryDeserializer(@Lazy CategoryService categoryService, ConversionService conversionService) {
        this.categoryService = categoryService;
        this.conversionService = conversionService;
    }
}
