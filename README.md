# universe_project
personal display website for personal study and use

--- 2018/02/12 ---
#### 一. 项目导入提醒
github clone下来之后，导入项目时勾选 search for projects recursively和import maven projects automatically
> 1. search for projects recursively这个会递归查找项目中子模块项目，避免后面要再次add 子模块maven项目
> 2. import maven projects automatically 是在改变pom文件时会自动更新项目，无需手动更新

参考blog:
http://blog.csdn.net/qq496013218/article/details/74910155

#### 二. 项目运行
修改pom文件

```$xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <!--<scope>provided</scope>-->
    </dependency>
```

注释掉`<scope>provided</scope>`,因为在打war时，无需将tomcat的api包打进去，这些jar只在我们开发环境中使用tomcat插件时使用，如果
打进去上传部署项目时，项目可能无法启动，jar会冲突。

do: 本地开发注释掉，打包部署，添加上`<scope>provided</scope>`



--- 2024/05/31 ---

## 官网部署参考
1. [3分钟搞懂阿里云服务器安装Nginx并配置静态访问页面](https://developer.aliyun.com/article/933711)
2. [Nginx 服务器](https://www.arryblog.com/guide/deploy/alibaba-cloud-deployment.html#%E4%B8%89%E3%80%81nginx-%E6%9C%8D%E5%8A%A1%E5%99%A8)

## 防火墙、安全组配置参考
1. [3分钟搞懂阿里云服务器安装Nginx并配置静态访问页面](https://developer.aliyun.com/article/933711)