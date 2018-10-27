package uk.co.keyoflife;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import uk.co.keyoflife.domain.Employee;

@SuppressWarnings("serial")
public class PayCalculationPage extends WebPage {

	public PayCalculationPage(Employee paidEmployee) {
		add(new Label("name", paidEmployee.getName()));
	}

}
