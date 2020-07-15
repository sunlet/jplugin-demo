package jplugin.demo.extensiondev.basic.imp;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import jplugin.demo.extensiondev.basic.api.IDeploymentType;
import net.jplugin.core.ctx.api.BindRuleService;
import net.jplugin.core.kernel.api.Initializable;
import net.jplugin.core.kernel.api.PluginEnvirement;
import net.jplugin.core.kernel.api.RefExtensionMap;
import net.jplugin.core.service.api.BindService;


public class DeploymentManager {
	static Map<String,IDeploymentType> map ;
	
	public static void init() {
		map = PluginEnvirement.getInstance().getExtensionMap(jplugin.demo.extensiondev.Plugin.EP_DEPLOYMENT_TYPE,IDeploymentType.class);
	}

	
	public static IDeploymentType getType(String code) {
		return map.get(code);
	}
	
	public static Collection<IDeploymentType> getList(){
		return map.values();
	}
}
