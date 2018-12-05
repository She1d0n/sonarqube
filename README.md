Sonar PDF Report Plugin
=========================

适用SonarQube版本 : 5.5--5.6.7,6.0--6.2。6.3以上不支持。

## Description / Features

本插件生成PDF格式的sonarqube报告.

报告包括以下内容:

* 概要

* 静态分析

* 动态分析

* 编码问题

* 热点:
  * 违反最多的规则TOP10
  * 违规最多的文件TOP5
  * 复杂度最高的文件TOP5
  * 重复行最多的文件TOP5

* 违规详情

* 子模块信息（只有在存在时生成）


## Installation

1. 将插件复制到SONARQUBE_HOME/extensions/plugins 目录
1. 重启SonarQube

## Usage

SonarQube PDF是一个 post-job任务. 因此，PDF 报告将在SonarQube分析结束后生成.

### Configuration

配置Skip为“否”时生成PDF报告功能启用。

Time表示SonarQube分析多长时间后开始生成报告，默认为1分钟，如果分析时间超过1分钟，则需要调整Time。Time的时间设置必须大于SonarQube分析时长，否则可能无法生成报告或者生成报告不正确。

![Plugin Configuration](configuration.jpg?raw=true "Plugin Configuration")

### Download the report

PDF在仪表盘中下载，如果没有下载界面，需要在“配置控件”中添加该控件
![PDF Report example](output.jpg?raw=true "PDF Report example")