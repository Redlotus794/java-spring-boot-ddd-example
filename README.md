# java-spring-boot-ddd-example

An example for Java Spring Boot Project with DDD Designed

## 概述

这是一个基于DDD的Spring Boot 例子项目，主要用于展示DDD项目的分层结构、文件目录结构、命名规范、代码风格等内容。

## 技术栈

| 技术    | 版本            | 备注             |
|-------|---------------|----------------|
| Java  | 1.8           | JVM            |
| Maven | 3.5+          | 构建工具，用于管理项目依赖  |
| Spring Boot | 2.0.7.RELEASE | Spring Boot 框架 |

测试工具 surefire 需要maven有一定版本的支持. (比如: 3.0.0-M7 需要maven 3.2.5+)

## 根目录结构

- `AGENTS.md`：AI 协作约束、项目结构和工程规范说明。
- `pom.xml`：Maven 构建入口，管理依赖、插件和打包流程。
- `README.md`：项目说明、运行方式和基础使用指引。
- `docs/`：项目文档目录，包含开发、运维、需求、测试等资料，详见 [docs](docs/README.md)。
- `src/main/java/`：业务源码目录（DDD 分层实现）。
- `src/main/resources/`：运行时资源目录（配置文件、i18n、静态资源等）。
- `src/test/java/`：测试代码目录（单元测试与集成测试）。
- `src/test/resources/`：测试资源目录（测试数据、文档、图片等）。
- `target/`：Maven 构建输出目录（编译、测试和打包产物）。
