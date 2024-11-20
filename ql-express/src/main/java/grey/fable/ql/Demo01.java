package grey.fable.ql;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * @author GreyFable
 * @since 2024/11/21 1:21
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 是否需要高精度计算
        boolean isPrecise = true;
        // 是否输出所有的跟踪信息, 主要输出脚本的编译解析过程
        // 需要 Log 级别是 DEBUG, 一般对于业务系统来说关闭之后会提高性能
        boolean isTrace = false;
        ExpressRunner runner = new ExpressRunner(isPrecise, isTrace);

        // 定义表达式
        String express = "a + b * c";
        // 定义上下文
        DefaultContext<String, Object> context = new DefaultContext<>();
        context.put("a", 1);
        context.put("b", 2);
        context.put("c", 3);
        // 执行表达式
        Object execute = runner.execute(express, context, null, false, false);
        System.out.println(execute); // 7
    }
}
