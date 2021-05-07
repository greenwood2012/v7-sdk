# v7-sdk

本sdk基于Darabonba开发

### 2021-4-29 

工程初步搭建完成，各模块也分配妥当，目前只有授权、获取账套、保存凭证，主要是验证基于授权、账套等信息，能够完成一个具体而又略微复杂的业务。凭证保存能完成，那么认为别的业务也基本能完成。

### 2021-5-7

    增加java一键生成脚本，运行后将在sdk/java目录下生成对应的项目（目前只加了kenerl、auth、account、business/fi/voucher）
    增加java mvn install 将sdk/java目录下的java项目一键生成jar包（新增项目需从buildscript将packageforjar.bat拷贝到对应的java项目根目录下执行）
	