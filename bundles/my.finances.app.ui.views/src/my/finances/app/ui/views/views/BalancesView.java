package my.finances.app.ui.views.views;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class BalancesView extends ViewPart {

	public static final String ID = "my.finances.app.ui.views.views.BalancesView";
	
	@Override
	public void createPartControl(Composite parent) {
		TableViewer viewer = new TableViewer(parent);	
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
