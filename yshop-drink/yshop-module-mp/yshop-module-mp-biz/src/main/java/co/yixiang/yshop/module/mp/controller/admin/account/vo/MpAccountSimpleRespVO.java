package co.yixiang.yshop.module.mp.controller.admin.account.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "管理后台 - 公众号账号精简信息 Response VO")
@Data
public class MpAccountSimpleRespVO {

    @Schema(description = "编号", required = true, example = "1024")
    private Long id;

    @Schema(description = "公众号名称", required = true, example = "yshop")
    private String name;

}
