package co.yixiang.yshop.module.order.controller.app.order.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @ClassName PayDto
 * @Author hupeng <610796224@qq.com>
 * @Date 2013/6/20
 **/
@Data
public class AppPayParam implements Serializable {

    @Schema(description = "来源", required = true)
    private String from;

    @NotBlank(message = "选择支付类型 PayTypeEnum类型(alipay weixin yue)")
    @Schema(description = "支付类型", required = true)
    private String paytype;

    @NotBlank(message = "参数错误")
    @Schema(description = "订单ID", required = true)
    private String uni;

//    @Schema(description = "服务商id 当不是余额支付必填1-阿里支付 3-微信支付 这里当编号与数据库id对应", required = true)
//    private String detailsId;
}
