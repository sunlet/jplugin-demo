package jplugin.demo.extensiondev.basic.export;

import java.util.Collection;

import jplugin.demo.extensiondev.basic.api.IDeploymentType;
import jplugin.demo.extensiondev.basic.imp.DeploymentManager;
import net.jplugin.ext.webasic.api.BindServiceExport;

@BindServiceExport(path = "/service")
public class TestServiceExport {
	
	public String svc1() {
		Collection<IDeploymentType> list = DeploymentManager.getList();
		StringBuffer sb = new StringBuffer();
		for (IDeploymentType o:list) {
			sb.append(o.getName()).append("   ");
		}
		return sb.toString();
	}
}
