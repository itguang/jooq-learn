# JOOQ 系列教程


[JOOQ](https://github.com/jOOQ/jOOQ)官网地址

---

## ORM的小清新——JOOQ

JRebel 在 maven/gradle 下不工作解决方案:

http://manuals.zeroturnaround.com/jrebel/standalone/maven.html?_ga=2.80360656.639776813.1554341441-1849987031.1554341441


http://manuals.zeroturnaround.com/jrebel/standalone/gradle.html?_ga=2.183759713.639776813.1554341441-1849987031.1554341441


# JRebel — 使用IDEA热部署插件提高开发效率



JRebel 是一款高效的热部署工具,**官网地址**: <https://jrebel.com/software/jrebel/>

> IDEA dubug 启动项目,改完代码后, 手动 build 也可以实现热部署的效果.

## Why JRebel?

> JRebel fast tracks Java application development by skipping the time-consuming build and redeploy steps in the development process. JRebel helps developers be more productive by viewing code changes in real time and maintaining state.
>
> JRebel通过跳过耗时的构建和重新部署开发过程中的步骤来快速跟踪Java应用程序开发。JRebel通过实时查看代码更改和维护状态来帮助开发人员提高工作效率。

![1](/uploads/43871cbf200af6cbc20f000cf9f6701f/1.png)



如上图所示: 使用 JRebel 后,我们不必 build 和 deploy,可以专注于coding.



总结起来,JRebel 有如下优点:

* **1.实时变更可见性**

> 实时查看Java应用程序的迭代代码和资源更改结果

* **2.简化开发流程**

> 开发人员通过消除通常用于等待应用程序构建和重新部署步骤的停机时间来保持其节奏和焦点。使用JRebel，可以避免这些中断。

* **3.维护应用程序状态**

>  避免重新部署后重现更改前应用程序状态所花费的时间。马上回到你开始的地方！

* **4.可衡量的投资回报率**

> 减少意外加班和未列入预算的人工费用。节省开发时间。投资回报率可在数天或数周内实现！



## 使用环境

适用于所有Java应用程序。桌面，Web，服务和企业。


![image-20190404115206711](/uploads/f06afb504de4491c8ff937d522c3bb02/image-20190404115206711.png)

## 在IDEA 安装 JRebel插件

在IDEA的 Plugins -> Marketplace 搜索 JRebel 安装重启即可.

> JRebel 是收费软件,默认安装有14天试用期,文章最后会给出激活方法,有条件的还是希望大家购买正版.


![image-20190404113955156](/uploads/f49119ca2606acfa59bab6d9655342bf/image-20190404113955156.png)

安装完成后,我们的IDEA中会多出来两个按钮:

![image-20190404114647316](/uploads/16afb0aa295ba2932d6f2fa17eb10c39/image-20190404114647316.png)

我们再启动项目时就可以使用 JRebel 来进行启动了.(注: 只有使用 JRebel 启动的项目才会进行热部署)

之后,我们在开发时,再修改了代码就不用重新部署测试了,有了 JRebel ,我们便可以节省许多等待时间,专注coding.



## 测试热部署功能



我们新建一个 Spring Boot 项目,编写一个Controller:

```java
/**
 * @author guang
 * @since 2019-04-03 18:50
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }
    
}
```

然后以 JRebel 方式启动我们的项目,浏览器访问: http://localhost:8080, 浏览器会返回: 

```
hello
```

接下来我们回到项目, 修改 Controller,

```java
/**
 * @author guang
 * @since 2019-04-03 18:50
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello ,Jebel";
    }

}
```



注意,我们不必重启启动项目,直接在浏览器中刷新,http://localhost:8080,会看到返回:

```
hello ,Jebel
```

至此,我们的JRebel插件已经安装成功,以后我们就可以愉快的进行 编码了.

## JRebel 激活

JRebel有三种激活方式, Team URL,Licence file,Activation code

![image-20190404120542483](/uploads/1e675c23172d1f227355ca722b5f3140/image-20190404120542483.png)

>  我在自己的服务器上搭建了一个 激活服务,地址: <http://itguang.com:8888/>,服务器会不定期失效,阿里云最低配置,不稳定,喜欢折腾的同学,可以在本地搭建自己的服务,参考: <https://github.com/ilanyu/ReverseProxy>



我们只需要把 http://itguang.com:8888/b3cb40b6-9aaf-471f-b404-1efa3f854e87 填入上图所示的位置即可,然后写上自己的邮箱.

**http://itguang.com:8888/ 后面的一串字母叫GUID,JRebel授权地址有GUID检测,如果上面地址失效了,可以去这个地址(http://www.ofmonkey.com/transfer/guid)再生产一个添加到后面即可.**



**最后一步**: **设置为离线模式**(注:如果你有一个稳定的在线验证服务也可以不用设置)

打开IDEA—> Preference -> JRebel

点击 Work offline

![2](/uploads/4289c50dd27f5ff5c300a00ef17d316b/2.png)


**变为离线模式,可以180天内不用再次激活**

![image-20190404121618650](/uploads/a3385d346f67fd2c308aa3e403afc6cf/image-20190404121618650.png)



到此,JRebel激活完成.

> 参考

* <https://www.cnblogs.com/wang1024/p/7211194.html>

* <https://github.com/ilanyu/ReverseProxy>

* <https://jrebel.com/software/jrebel/>