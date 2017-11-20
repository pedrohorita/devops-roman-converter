package roman.converter.stepDefinition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import roman.converter.Converter;


public class StepDefinitions {
	
	Converter converter;
	
	@Dado("^um Converter$")
	public void um_Converter() throws Throwable {
	     converter = new Converter();
	}

	@Quando("^informo o numero base \\+?(-?\\d+)")
	public void informo_o_numero_base(int value) throws Throwable {
	    converter.setValue(value);
	}
	

	@Então("^o resultado deve ser o algarismo romano ([^\"]*)$")
	public void o_resultado_deve_ser_uma_unica_letra_I(String tipo) throws Throwable {
		assertThat(converter.convert(), equalTo(tipo));
	}

}
