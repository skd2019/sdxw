#
#	���Աʼ�
#

##	��Ŀ����
	�����Ŀ��������demo�����ڸ�Ϊsdxw�������޸�.project�ļ������⣬res/values/strings.xml/app_nameҲҪ�޸ģ������������յ����š�
	��Ŀ�Ĵ���̾����ϰ汾phone����̣����Ѿ������¼�ˣ�ֻ������һ�����ּܹ���Ϊ��ʷ���
	
##	��Ŀ����
	��Ŀ��2016����������Ͼ���ͽӵ����һ�����app��Ŀ��ֻ���Ҵ�ǰ��ҳ����룬Ҳ����һ��www�ļ��У���ʱ���app��û����񿪷���߱�����������˵�����Ŀ���ڹ��죬
	��Ŀ���Ŀ����������phonegap��mui��ǰ����https://cordova.apache.org/��һ��֧��Ӳ�����ܵ�ע��js���coraova.js��
	������ǰ��·�ɻ�û�н���ʱ��һ���ƶ���ui��ܺ�spa��ܡ�
	Ҫ֪��û�ж���ĸ�����www�ļ������޷�������Ŀ�ģ�cordovaֱ�ӱ�js���������Ҽ����ṹ���ܽ��������⣬�ڴ���Ŀ�ϱ���ָ����δ�ܽ�����⣬
	�����µ����Ҳ�֪���������ķ��򣬶�����˵��һ������ľ�����ƾ�ŶԼ������Ȱ��͹�����ִ������ҵ��ʱ�仹ԭ�������Ŀ��ܣ��Ǹ����ƵĹ��̣����ܺ��������Ŀ�Ѿ��ñ����������������ڵ��۹���������Ҳ���ò��ã���
	�Ȳ�˵�����Ŀ������ô���ӡ��߼���������ο��������ԣ�����phonegap��mui�ṩ��api���ʹ���������������Ժ�����⣬�����Ѿ����롰����Ա���Ľ׶Σ����Ǽܹ�ʦ��Ҫ��������⡣
	��Ŀ��ַ��github: https://github.com/skd2019/sdxw��

##	��������
	IDE��adt bundle 4.3��jdk java 1.8,sdk 19��AVD��׿ģ������mui v3.4.0��
	Phonegap��Ӳ�����ܷ��������ص��������⣬���������Ҳ���ڸ��ӣ�mui��vue��react��angular��������·�ɵ�ǰ�˿�ܴ��棬��H5+Ҳ�����մ���phonegap�������Ŀ���Ѿ���ά������

##	jquery ���°棬������cdn https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.5.1.js��
	mui����Ŀ���ڣ�https://dev.dcloud.net.cn/mui/ui/��
	
##	������mui h5+�汾���������´���
	detailPage = plus.webview.getWebviewById('detail.html');
	����֪��plus��h5 + ��Ӳ�����ܣ�	�����������Ӳ�������ǽ�����PhoneGap�ģ�������δ�����ִ�в��˵ģ�����һ��Ӳ�����ܱ�����һ�����鷳���ǡ�
	1> �޷��ڿ����������ԣ�
	2> �ֻ��Ͽ��������������Ϣ��
	���������Android studio��Ӧ�ÿ��Խ����
	
##	������Ŀ�ģ�һ����mui��һ����phonegap��index.html��detail.html�ܺõ���ʾ�˴������б���������ϸ��һ���͵Ĺ��̣��ұ���������д������Ϊ����е��͵Ĵ����ԡ�
	���ǻ�Ҫphonegap�أ���˵����Ҫ��������ġ�
	
	������������������phone�ģ���㲻Ҫ���ɣ��Ժ���������취��
	��Ϊindex.html��Ĭ��ռ�ö�����û���ṩphonegap���ҳ�����ڣ������Ҫ��������phonegapҳ������������޸�
	MainActivity.java
	public void onCreate(Bundle savedInstanceState) {	
        
		super.onCreate(savedInstanceState);
        
		//TODO:ҳ�����ʱ��ı���ͼƬ�����ҳ����ؿ������һ���ܿ���
		super.setIntegerProperty("splashscreen", R.drawable.splash_sn);
		
		//TODO:���6���Ժ󻹲��ܼ��سɹ�����Ϊ�������
		super.setIntegerProperty("loadUrlTimeoutValue", 60000);
        
		//TODO:������ҳ�棬���Ե�ʱ����Ը�Ϊ��������Ҫ��ҳ��
		//super.loadUrl("file:///android_asset/www/index.html", 1000);
		super.loadUrl("file:///android_asset/www/phonegaps/position/getPosition.html", 1000);
		
    }
   	 �����ֶ����ý����ǵ����ã�����app����spa�����������·�ɡ�webview���ǽ���취��
   	 
 	ʵ����phonegap��apiʹ�÷ǳ��򵥣��������ṩ�Ĺ���Ҳ���ޣ�����ܶ���������ģ�phonegaps�ļ���д��������Щ����д�ģ���Щ����ֱ�Ӹ���
 		http://www.phonegap100.com/doc/cordova_device_device.md.html#Device
 		������������еġ����뻹��򵥡�

##	�����������
	ģʽ��ʵս̫����HBuild��adt bundle�����adb device���ǿ���ֱ��������Ե�,ʵ�����ҽ���󲿷ֵ��Զ���ֱ��ʹ���ҵĻ�Ϊ����10e���Եġ� 		
 		  	 
   	 
	


	