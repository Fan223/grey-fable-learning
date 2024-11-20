package grey.fable.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Spring 容器.
 *
 * @author GreyFable
 * @since 2024/10/23 9:04
 */
@ComponentScan("grey.fable.spring")
public class SpringApplication {
    public static void main(String[] args) {
        // 创建应用上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringApplication.class);
        // 关闭应用程序上下文以触发销毁
        ((AbstractApplicationContext) context).close();
    }
}
