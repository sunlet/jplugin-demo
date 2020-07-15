package jplugin.demo.extensiondev.type2.extension;

import jplugin.demo.extensiondev.basic.api.IDeploymentType;
import net.jplugin.core.kernel.api.BindExtension;

@BindExtension(name = "Node",pointTo = jplugin.demo.extensiondev.Plugin.EP_DEPLOYMENT_TYPE)
public class Type1Deployment2 implements IDeploymentType {

	@Override
	public String getName() {
		return "Nodejs Deployment";
	}

	@Override
	public String getTypeCode() {
		return "Node";
	}

	@Override
	public String handlePublish() {
		System.out.println("deployment 111 ......");
		return "ok";
	}

}
