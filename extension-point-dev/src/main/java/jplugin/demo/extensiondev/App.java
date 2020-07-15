package jplugin.demo.extensiondev;

import net.jplugin.core.kernel.PluginApp;
import net.jplugin.core.kernel.api.PluginAutoDetect;

/**
 * 启动这个demo类以后，调用以下URL体验：
 * http://localhost:8080/service/svc1.do
 */
public class App 
{
    public static void main( String[] args )
    {
    	PluginAutoDetect.addAutoDetectPackage("jplugin.demo");
        PluginApp.main(null);
    }
}
