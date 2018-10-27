package uk.co.keyoflife;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import uk.co.keyoflife.domain.Employee;

import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		Employee employeeToPay = new Employee();
		
		final FeedbackPanel feedbackPanel = new FeedbackPanel("feedback");
		add(feedbackPanel);
		add(new PayCalculationForm("paycalculationForm", employeeToPay));
	}
}
