加载dialog 
===================================  
  
### 库实现功能 
    仿ios和MD风格加载dialog。            
  
###效果预览
![image](https://github.com/lieweisi/LoadingDialog/blob/master/loading.gif)
   
###LoadingUtil
   TYPE_1 仿ios
   TYPE_2 MD风格
### 1.在项目bulid.gradle中添加
    allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
### 2.在app的bulid.gradle中添加引用  
    compile 'com.github.lieweisi:LoadingDialog:v1.0'
    
### 参考代码
    LoadingDialog dialog=new LoadingDialog(this, LoadingUtil.TYPE_1);
    dialog.setCancelable(false);
    dialog.setCanceledOnTouchOutside(false);
    dialog.show();
    
   
