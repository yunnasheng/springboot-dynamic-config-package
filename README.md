# springboot-dynamic-config-package 动态配置与动态打包

> 通常在开发环境和生产环境，我们的应用程序会需要很多动态配置信息，有的应用程序的jar包也需要根据不同环境来动态打包。
> 要实现两点核心功能：
> 1. 在pom.xml中根据环境配置变量，供Java代码或properties.xml中获取变量内容
> 2. maven打包时可动态指定环境编译出不同环境配置的app。

