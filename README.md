1. 整合Spring
    1. 配置`applicationContext.xml`
        1. 包扫描，只扫除了`@Controller`以外的
2. 整合Spring MVC
    1. 配置`web.xml`
        1. servlet配置前端控制器`DispatcherServlet`
        2. filter配置中文过滤器`CharacterEncodingFilter`
        3. **listener配置Spring监听器（`<listener>`、`<context-param>`）**
    2. 配置`springmvc.xml`
        1. 包扫描`@Controller`
        2. 配置视图解析器`InternalResourceViewResolver`
        3. 过滤静态资源
        4. 开启mvc注解支持
