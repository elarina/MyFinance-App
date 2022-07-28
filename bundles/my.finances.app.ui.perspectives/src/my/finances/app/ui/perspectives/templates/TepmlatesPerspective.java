package my.finances.app.ui.perspectives.templates;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import my.finances.app.ui.views.views.IncomesView;
import my.finances.app.ui.views.views.OutcomesView;
import my.finances.app.ui.views.views.PeriodsView;

public class TepmlatesPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
	}

}
