package co.yixiang.yshop.framework.datapermission.config;

import co.yixiang.yshop.framework.datapermission.core.aop.DataPermissionAnnotationAdvisor;
import co.yixiang.yshop.framework.datapermission.core.db.DataPermissionDatabaseInterceptor;
import co.yixiang.yshop.framework.datapermission.core.rule.DataPermissionRule;
import co.yixiang.yshop.framework.datapermission.core.rule.DataPermissionRuleFactory;
import co.yixiang.yshop.framework.datapermission.core.rule.DataPermissionRuleFactoryImpl;
import co.yixiang.yshop.framework.mybatis.core.util.MyBatisUtils;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * 数据权限的自动配置类
 *
 * @author yshop
 */
@AutoConfiguration
public class YshopDataPermissionAutoConfiguration {

    @Bean
    public DataPermissionRuleFactory dataPermissionRuleFactory(List<DataPermissionRule> rules) {
        return new DataPermissionRuleFactoryImpl(rules);
    }

    @Bean
    public DataPermissionDatabaseInterceptor dataPermissionDatabaseInterceptor(MybatisPlusInterceptor interceptor,
                                                                               DataPermissionRuleFactory ruleFactory) {
        // 创建 DataPermissionDatabaseInterceptor 拦截器
        DataPermissionDatabaseInterceptor inner = new DataPermissionDatabaseInterceptor(ruleFactory);
        // 添加到 interceptor 中
        // 需要加在首个，主要是为了在分页插件前面。这个是 MyBatis Plus 的规定
        MyBatisUtils.addInterceptor(interceptor, inner, 0);
        return inner;
    }

    @Bean
    public DataPermissionAnnotationAdvisor dataPermissionAnnotationAdvisor() {
        return new DataPermissionAnnotationAdvisor();
    }

}
