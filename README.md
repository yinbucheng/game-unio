# game-union
这是一个多模块的项目集成dubbo的使用

## 项目结构
web web层dubbo端的消费者

servcie dubbo端的服务者,提供服务

base  base层中主要是实体对象和业务接口提供给 web层何service层使用


## 如何分开打包部署

1.service 进入到service层下面的pom.xml下面鼠标右键git base here 输入 mvn clean install

2. web层 进入到web层下面的pom.xml 下面鼠标右键 git base here 输入 mvn clean install

3.启动执行输入 java -jar xxxx.jar

## 注意事情
mvn打包前要删掉test包下面的类。不知道为啥输入 mvn clean install -Dskip Tests总提示Tests无效

