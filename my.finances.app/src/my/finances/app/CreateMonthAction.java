package my.finances.app;

import java.net.URL;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.*;
import org.osgi.framework.Bundle;


public class CreateMonthAction extends Action {
	
	private final IWorkbenchWindow window;
	
	public CreateMonthAction(IWorkbenchWindow window, String label) {
		this.window = window;
        setText(label);
        // The id is used to refer to the action in a menu or toolbar
		setId(ICommandIds.CMD_CREATE_MONTH);
        // Associate the action with a pre-defined command, to allow key bindings.
		setActionDefinitionId(ICommandIds.CMD_CREATE_MONTH);
        Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
        URL fileURL = bundle.getEntry("/icons/sample2.gif");
        setImageDescriptor(ImageDescriptor.createFromURL(fileURL));
	}
	
	@Override
	public void run() {
		
	}
}
