# demo-spring-ioc-container
这是学习Spring IOC容器过程中编写的示例代码。参考文档如下，

`https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans`



不同功能点的使用采用独立的package组织代码，每个独立的Application\<N\>可以单独运行。

功能点及代码结构组织如下，

1. 容器创建及bean的几种获取方式

   * annotation/S01/Application: 基于注解的容器
   * xml/S01/Application: 基于XML的容器

2. bean的定义描述

   构造器注入，setter注入，property，init & destroy method，import

   * annotation/S02/Application: 多Configuration类定义bean
   * xml/S02/Application: 多XML文件定义bean
   * annotation/S02/Application2: 单Configuration类import其他Configuration类定义bean
   * xml/S02/Application2: 单个XML文件import其他XML文件定义bean

3. Comonent注解

   Component，PostConstruct,  PreDestroy，Autowired

   * annotation/S03/Application: 采用Component注解生成bean

4. Component与Configuration区别

   @Bean注解的方法在Component和Configuration中的区别

   * annotation/S03/Application2: Configuration的使用
   * annotation/S03/Application3: Component的使用

5. annotation与XML混合使用

   * annotation/S03/Application4: XML容器扫描annotation定义的bean
   * xml/S03/Application: annotation容器读取XML定义的bean

6. ComponentScan注解

   annotation中的包扫描

   * annotation/S04/Application: 包扫描bean的定义

7. 多个同类型的bean注入选择

   定义多个同类型bean后，注入点如何选择哪一个bean

   * annotation/S05/Application: 通过名字准确选择对应的bean
   * annotation/S05/Application2: 通过@Primary选择默认
   * annotation/S05/Application3: 通过@Qualifier选择名字

8. Scope及Lookup注解

   singleton周期的bean引用prototype周期的bean

   * annotation/S06/Application: singleton及prototype的bean的生存周期
   * annotation/S06/Application2: 使用@Lookup注解方法获取prototype周期的bean

9. property参数获取

   如何从指定的配置文件获取参数

   * annotation/S07/Application: @PropertySource指定配置文件，@Value注入参数

10. Profiles

    通过profile区分不同的配置，在不同的场景下加载不同的bean配置

    * annotation/S08/Application: 通过annotation容器api接口设置指定的profile
    * annotation/S08/Application2: 通过启动参数-Dspring.profiles.active设置指定的profile