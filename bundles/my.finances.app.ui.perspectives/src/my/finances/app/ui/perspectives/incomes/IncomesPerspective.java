package my.finances.app.ui.perspectives.incomes;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import my.finances.app.ui.views.views.IncomesView;

public class IncomesPerspective implements IPerspectiveFactory {

	public static final String ID = "my.finances.app.incomes_perspective";

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
	}

}
