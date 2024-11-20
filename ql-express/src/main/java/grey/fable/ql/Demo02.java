package grey.fable.ql;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

import java.util.HashMap;

/**
 * @author GreyFable
 * @since 2024/11/21 1:23
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner(true, false);
        // 定义表达式
        String express = "c = a + b; result.put(\"c\", c); c";
        // 定义上下文
        DefaultContext<String, Object> context = new DefaultContext<>();
        context.put("a", 1);
        context.put("b", 2);
        context.put("result", new HashMap<>());
        System.out.println(context); // {result={}, a=1, b=2}
        // 执行表达式
        Object execute = runner.execute(express, context, null, false, false);
        System.out.println(execute); // 3
        System.out.println(context); // {result={c=3}, a=1, b=2, c=3}
    }
}
