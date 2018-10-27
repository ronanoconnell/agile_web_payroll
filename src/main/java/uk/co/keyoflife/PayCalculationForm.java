package uk.co.keyoflife;

import org.apache.wicket.MarkupContainer;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.validation.FormComponentFeedbackBorder;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.validation.validator.StringValidator;

import uk.co.keyoflife.domain.Employee;

@SuppressWarnings("serial")
public class PayCalculationForm extends Form<Employee> {

	public PayCalculationForm(String id, final Employee employeeToPay) {
        super(id, new CompoundPropertyModel<>(employeeToPay));

        // Create a required text field with a max length of 30 characters
        // that edits the book's title
        final TextField<String> nameField = new TextField<>("name");
        nameField.setRequired(true);
        nameField.add(new StringValidator(null, 30));
        
        final MarkupContainer nameFeedback = new FormComponentFeedbackBorder("nameFeedback");
        add(nameFeedback);
        nameFeedback.add(nameField);

	}

	@Override
	protected void onSubmit() {
        final Employee paidEmployee = getModelObject();
        PayCalculationPage payDetails = new PayCalculationPage(paidEmployee);

        setResponsePage(payDetails);
	}
}
