package grey.fable.spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Bean 生命周期.
 *
 * @author GreyFable
 * @since 2024/10/23 9:03
 */
@Component
public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("1. 实例化");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2.1 BeanNameAware, 设置 Bean 名称: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("2.2 BeanFactoryAware, 设置 BeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println("2.3 ApplicationContextAware, 设置应用上下文");
    }

    @PostConstruct
    public void init() {
        System.out.println("4.1 注解方式初始化");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4.2 实现接口方式初始化");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("6.1 注解方式销毁 Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("6.1 实现接口方式销毁 Bean");
    }
}
