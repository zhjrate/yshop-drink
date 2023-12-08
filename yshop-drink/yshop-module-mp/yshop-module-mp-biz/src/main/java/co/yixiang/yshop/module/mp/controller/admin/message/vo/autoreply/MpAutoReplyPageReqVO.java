package co.yixiang.yshop.module.mp.controller.admin.message.vo.autoreply;

import co.yixiang.yshop.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Schema(description = "管理后台 - 公众号自动回复的分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MpAutoReplyPageReqVO extends PageParam {

    @Schema(description = "公众号账号的编号", required = true, example = "1")
    @NotNull(message = "公众号账号的编号不能为空")
    private Long accountId;

}
