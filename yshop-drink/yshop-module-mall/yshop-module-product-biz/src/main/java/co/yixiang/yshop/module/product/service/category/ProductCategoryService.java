package co.yixiang.yshop.module.product.service.category;

import co.yixiang.yshop.module.product.controller.admin.category.vo.ProductCategoryCreateReqVO;
import co.yixiang.yshop.module.product.controller.admin.category.vo.ProductCategoryListReqVO;
import co.yixiang.yshop.module.product.controller.admin.category.vo.ProductCategoryUpdateReqVO;
import co.yixiang.yshop.module.product.dal.dataobject.category.ProductCategoryDO;
import co.yixiang.yshop.module.product.dal.dataobject.storeproduct.StoreProductDO;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.validation.Valid;
import java.util.List;

/**
 * 商品分类 Service 接口
 *
 * @author yshop
 */
public interface ProductCategoryService extends IService<ProductCategoryDO> {

    /**
     * 创建商品分类
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createCategory(@Valid ProductCategoryCreateReqVO createReqVO);

    /**
     * 更新商品分类
     *
     * @param updateReqVO 更新信息
     */
    void updateCategory(@Valid ProductCategoryUpdateReqVO updateReqVO);

    /**
     * 删除商品分类
     *
     * @param id 编号
     */
    void deleteCategory(Long id);

    /**
     * 获得商品分类
     *
     * @param id 编号
     * @return 商品分类
     */
    ProductCategoryDO getCategory(Long id);

    /**
     * 校验商品分类
     *
     * @param id 分类编号
     */
    void validateCategory(Long id);

    /**
     * 获得商品分类的层级
     *
     * @param id 编号
     * @return 商品分类的层级
     */
    Integer getCategoryLevel(Long id);

    /**
     * 获得商品分类列表
     *
     * @param listReqVO 查询条件
     * @return 商品分类列表
     */
    List<ProductCategoryDO> getEnableCategoryList(ProductCategoryListReqVO listReqVO);

    /**
     * 获得开启状态的商品分类列表
     *
     * @return 商品分类列表
     */
    List<ProductCategoryDO> getEnableCategoryList(Integer shopId);

}
