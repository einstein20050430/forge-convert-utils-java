基于JAVA实现SVF数据导出3d-tiles数据集
作者：59135929@qq.com

通过AutoCAD软件可以将模型导出SVF数据格式，本文将介绍如何将SVF数据转换为3d-tiles数据集。
这是一个Java应用程序库，旨在转换SVF并创建用于Cesium JavaScript库的数据集瓦片。Ceium可以在您的web浏览器中创建交互式3D地球，从而将数据集模型展现在场景中。Cesium为模型数据提供了许多不同的来源，开发者可以使用Cesium3DTileset类加载当前应用程序生成的数据集。

一、SVF的数据模型结构。
![image](https://github.com/einstein20050430/forge-convert-utils-java/blob/main/SVF.png)

1、FragmentList  
场景构件列表，用于存储场景中所有的构件；  

2、GeometryMetadata  
几何对象列表，用于存储场景中所有的几何对象，构件和几何对象的关系是多对一的关系，也就是说几何对象是被构件复用的。
