package co.yixiang.yshop.module.coupon.service.coupon;

import java.util.*;
import javax.validation.*;
import co.yixiang.yshop.module.coupon.controller.admin.coupon.vo.*;
import co.yixiang.yshop.module.coupon.dal.dataobject.coupon.CouponDO;
import co.yixiang.yshop.framework.common.pojo.PageResult;

/**
 * 优惠券 Service 接口
 *
 * @author yshop
 */
public interface CouponService {

    /**
     * 创建优惠券
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long create(@Valid CouponCreateReqVO createReqVO);

    /**
     * 更新优惠券
     *
     * @param updateReqVO 更新信息
     */
    void update(@Valid CouponUpdateReqVO updateReqVO);

    /**
     * 删除优惠券
     *
     * @param id 编号
     */
    void delete(Long id);

    /**
     * 获得优惠券
     *
     * @param id 编号
     * @return 优惠券
     */
    CouponDO get(Long id);

    /**
     * 获得优惠券列表
     *
     * @param ids 编号
     * @return 优惠券列表
     */
    List<CouponDO> getList(Collection<Long> ids);

    /**
     * 获得优惠券分页
     *
     * @param pageReqVO 分页查询
     * @return 优惠券分页
     */
    PageResult<CouponDO> getPage(CouponPageReqVO pageReqVO);

    /**
     * 获得优惠券列表, 用于 Excel 导出
     *
     * @param exportReqVO 查询条件
     * @return 优惠券列表
     */
    List<CouponDO> getList(CouponExportReqVO exportReqVO);

}
