#
#	调试笔记
#

##	项目构建
	这个项目本来名字demo，现在改为sdxw，除了修改.project文件内容外，res/values/strings.xml/app_name也要修改，他本来就是苏电新闻。
	项目的搭建过程就是老版本phone搭建过程，我已经不想记录了，只保留这一个这种架构作为历史纪念。
	
##	项目背景
	项目是2016年初，我在南京润和接到外包一个混合app项目，只给我纯前端页面代码，也就是一个www文件夹，当时混合app还没有如今开发这边便利，对我来说这个项目过于诡异，
	项目核心框架是两个，phonegap和mui，前置是https://cordova.apache.org/的一个支持硬件功能的注入js框架coraova.js，
	后者是前端路由还没有今天时代一个移动端ui框架和spa框架。
	要知道没有额外的辅助纯www文件夹是无法运行项目的，cordova直接报js错误，由于我技术结构不能解决这个问题，在此项目上备受指责，我未能解决问题，
	更可怕的是我不知道解决问题的方向，对我来说是一段辛酸的经历。凭着对技术的热爱和工作的执着我用业余时间还原了这个项目框架，是个反推的过程，尽管后来这个项目已经让别人做啦（从我现在的眼光来看他们也做得不好），
	先不说这个项目技术怎么复杂、高级，首先如何开发、调试？至于phonegap和mui提供的api如何使用则是能启动调试后的问题，那是已经进入“程序员”的阶段，不是架构师所要解决的问题。
	项目地址：github: https://github.com/skd2019/sdxw；

##	开发环境
	IDE是adt bundle 4.3，jdk java 1.8,sdk 19，AVD安卓模拟器，mui v3.4.0。
	Phonegap在硬件功能方法有严重的性能问题，开发环境搭建也过于复杂，mui则被vue、react、angular等其他带路由的前端框架代替，而H5+也将最终代替phonegap，这个项目我已经不维护啦。

##	jquery 最新版，其中以cdn https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.5.1.js。
	mui：项目还在，https://dev.dcloud.net.cn/mui/ui/。
	
##	可能是mui h5+版本，他有如下代码
	detailPage = plus.webview.getWebviewById('detail.html');
	我们知道plus是h5 + 的硬件功能，	而我们这里的硬件功能是借助于PhoneGap的，所以这段代码是执行不了的，另外一旦硬件功能报错是一件很麻烦的是。
	1> 无法在开发环境调试；
	2> 手机上看不到输出错误信息。
	这个问题在Android studio中应该可以解决。
	
##	有两个目的，一个是mui，一个是phonegap，index.html和detail.html很好的演示了从新闻列表到新闻详细这一典型的过程，我保留这两个写法是因为其具有典型的代表性。
	但是还要phonegap呢？我说过还要调试这个的。
	
	首先这个框架是能运行phone的，这点不要怀疑，稍后给出启动办法。
	因为index.html被默认占用而我又没有提供phonegap相关页面的入口，如果想要单独调试phonegap页面可以做如下修改
	MainActivity.java
	public void onCreate(Bundle savedInstanceState) {	
        
		super.onCreate(savedInstanceState);
        
		//TODO:页面加载时候的背景图片，如果页面加载快这个不一定能看到
		super.setIntegerProperty("splashscreen", R.drawable.splash_sn);
		
		//TODO:如果6秒以后还不能加载成功则认为程序出错
		super.setIntegerProperty("loadUrlTimeoutValue", 60000);
        
		//TODO:启动的页面，调试的时候可以改为任意你想要的页面
		//super.loadUrl("file:///android_asset/www/index.html", 1000);
		super.loadUrl("file:///android_asset/www/phonegaps/position/getPosition.html", 1000);
		
    }
   	 这种手动调用仅仅是调试用，真正app会用spa解决，不管是路由、webview都是解决办法。
   	 
 	实际上phonegap的api使用非常简单，不过其提供的功能也有限，这可能都是有问题的，phonegaps文件夹写的内容有些是我写的，有些则是直接复制
 		http://www.phonegap100.com/doc/cordova_device_device.md.html#Device
 		这里的内容运行的。代码还算简单。

##	连接真机调试
	模式器实战太慢，HBuild和adt bundle结合了adb device都是可以直接真机调试的,实际上我今天大部分调试都是直接使用我的华为畅享10e调试的。 		
 		  	 
   	 
	


	
