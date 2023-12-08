package co.yixiang.yshop.module.product.controller.admin.category.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
* 商品分类 Base VO，提供给添加、修改、详细的子 VO 使用
* 如果子 VO 存在差异的字段，请不要添加到这里，影响 Swagger 文档生成
*/
@Data
public class ProductCategoryBaseVO {

    /**
     * 店铺id
     */
    private Integer shopId;

    /**
     * 店铺名称
     */
    private String shopName;

    @Schema(description = "父分类编号", required = true, example = "1")
    //@NotNull(message = "父分类编号不能为空")
    private Long parentId;

    @Schema(description = "分类名称", required = true, example = "办公文具")
    @NotBlank(message = "分类名称不能为空")
    private String name;

    @Schema(description = "分类图片", required = true)
    @NotBlank(message = "分类图片不能为空")
    private String picUrl;

    @Schema(description = "分类排序", required = true, example = "1")
    private Integer sort;

    @Schema(description = "分类描述", required = true, example = "描述")
    private String description;

    @Schema(description = "开启状态", required = true, example = "0")
    @NotNull(message = "开启状态不能为空")
    private Integer status;

}
