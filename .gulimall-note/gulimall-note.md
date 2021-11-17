# 谷粒商城（分布式）学习笔记

## Part 1：项目初始化

### 1. 环境配置

#### 1.1 Linux虚拟机

#### 1.2 Linux安装docker

#### 1.3 配置git与ssh工具

#### 1.4 项目结构初始化

#### 1.5 数据库初始化

### 2. 项目框架搭建

#### 2.1 人人开源快速搭建后台管理系统

- 将人人开源项目renren-fast克隆到本地，然后添加到idea工程里面。

- 「后端项目注意」

  - 出现ClassNotFoundException，删除数据库里面关于定时任务的数据。
  - [连接服务器数据库后报获取定时任务CronTrigger出现异常](https://www.renren.io/detail/10297)
  - 在启动renren-fast后台管理系统之前，需要将`guli_admin`数据库里面定时任务表`qrtz_xxx_xxx`里面的数据都删掉。

- 前端项目使用VScode打开，然后npm install进行打包。

- 「前端项目注意」

  1. 计算机需要安装python环境，windows电脑最好直接从microsoft商店里面下载python。

  2. node版本使用最新的，但是最好还是安装cnpm来进行打包。cnpm install比较稳定

  3. npm run dev出现module build failed错误的时候，找到build错误发生的包的位置，将这个包直接卸载，再重新安装就可以了。

     ```shell
     Module build failed: Error: Node Sass does not yet support your current environment: Windows 64
     $ npm uninstall --save node-sass
     $ npm install --save node-sass
     ```

#### 2.2 逆向工程搭建 & 使用

1. 用人人开源的代码生成器，生成项目所需要的增删改查CRUD代码
   1. 在代码生成器的配置文件里面修改要生成代码的目标数据库。
   2. 启动逆向工程，进入到逆向工程的界面，下载生成好的CRUD代码。
   3. 将下载来的代码复制到工程中，是将生成好的整个main文件都复制到项目对应的main路径中。替代原有的main文件。
2. 人人开源生成的代码使用的权限框架都是shiro的，我们使用springboot security进行权限认证，需要在代码生成模板里面注释掉shiro相关的注解。

3. 代码复制好之后，新建一个gulimall.common包将代码模板所需要的许多工具类都封装到这个common包里面。例如`PageUtils`类。这个类是renren-generator里面所需要的一个工具类，将这个类复制到gulimall.common包下面。让common包成为其他包所需要的公共依赖。

![image-20211116210751084](D:\SoftwareDevelopment\JavaProjects\SpringBootProject\gulimall\.gulimall-note\springboot2-note-image\image-20211116210751084.png)

​	common包要从renren-generator里面复制这些公共的工具类。

4. common包建立好之后，要在每一个module的启动类前面添加一个`@MapperScan("path")`注解。为了让mybatis可以知道sql的mapper映射类的位置。
5. **注意：**生成的代码的主启动类一定要在当前项目的根路径下。自动生成的脚手架代码会将主启动类包括在一个文件夹里内，一定，一定要将主启动类从这个文件夹里面取出来。放到项目的根路径之下。

### 3. 分布式组件的使用



## Part 2：服务搭建

