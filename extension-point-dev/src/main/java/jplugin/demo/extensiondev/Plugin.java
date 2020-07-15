package jplugin.demo.extensiondev;

import jplugin.demo.extensiondev.basic.api.IDeploymentType;
import jplugin.demo.extensiondev.basic.imp.DeploymentManager;
import net.jplugin.core.kernel.api.AbstractPlugin;
import net.jplugin.core.kernel.api.ExtensionPoint;
import net.jplugin.core.kernel.api.PluginAnnotation;

@PluginAnnotation
public class Plugin extends AbstractPlugin {

	public static final String  EP_DEPLOYMENT_TYPE = "EP_DEPLOYMENT_TYPE";

	public Plugin() {
		this.addExtensionPoint(ExtensionPoint.create(EP_DEPLOYMENT_TYPE,IDeploymentType.class,true));
	}
	@Override
	public void init() {
		DeploymentManager.init();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@initing...............................");

	}

	@Override
	public int getPrivority() {
		return 0;
	}

}
