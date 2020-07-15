package jplugin.demo.extensiondev.type1.extension;

import jplugin.demo.extensiondev.basic.api.IDeploymentType;
import net.jplugin.core.kernel.api.BindExtension;

@BindExtension(name = "Java",pointTo = jplugin.demo.extensiondev.Plugin.EP_DEPLOYMENT_TYPE)
public class Type1Deployment implements IDeploymentType {

	@Override
	public String getName() {
		return "Java Deployment";
	}

	@Override
	public String getTypeCode() {
		return "Java";
	}

	@Override
	public String handlePublish() {
		System.out.println("deployment ......");
		return "ok";
	}

}
