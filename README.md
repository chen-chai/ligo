构建时指定目标环境的方法
-----------------------

为了构建出适应不同运行环境的程序，需要根据不同目标环境（test、pro等）拷贝不同的配置文件（sc目录下），可以在执行 gradle 命令时指定目标环境参数，形式如下：

    gradlew clean build -P deploy.profile=pro

执行上面的命令时gradle会将`sc`目录下对应的配置文件拷贝到类路径根目录下覆盖原有文件，构建出适合指定环境的程序。

其中 -P 参数定义构建的目标环境，预定义的值有"dev, test, qa, gray, pro"。

如果没有指定 -P 参数，默认的目标环境是“dev”。


构建部署所需目录和文件
---------------------

为了和部署流程中使用的 java_deploy 程序兼容，gradle 脚本需要能在执行 build 任务后在 $project/build/deploy 目录下放入构建文件。
引入这个功能的步骤是：

1)  在 root project 的 build.gradle 中引入 "deploy.gradle" 文件。写法如下：

    apply from: "$rootDir/deploy.gradle"
    
2)  说明本项目是一个"jar"类型还是"war"类型，"jar"类型对应部署描述文件中的"work"类型；"war"类型对应部署描述文件中的"webapp"类型。写法如下：

    prepareDeploy {
        deployType = "war"
    }

3)  运行 gradle build 后即可从 build/deploy 目录获取部署需要的文件。


