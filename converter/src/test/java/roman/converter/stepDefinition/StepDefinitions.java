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

	@Quando("^informo o numero base (\\d+)$")
	public void informo_o_numero_base(int value) throws Throwable {
	    converter.setValue(value);
	}
	
	@Quando("^informo o numero (\\d+)$")
	public void informo_o_numero(int value) throws Throwable {
	    converter.setValue(value);
	}

	@Então("^o resultado deve ser uma unica letra, I$")
	public void o_resultado_deve_ser_uma_unica_letra_I() throws Throwable {
		assertThat(converter.convert(), equalTo("I"));
	}
	
	@Então("^o resultado deve ser uma unica letra, V$")
	public void o_resultado_deve_ser_uma_unica_letra_V() throws Throwable {
	    assertThat(converter.convert(), equalTo("V"));
	}
	
	@Então("^o resultado deve ser uma unica letra, X$")
	public void o_resultado_deve_ser_uma_unica_letra_X() throws Throwable {
	    assertThat(converter.convert(), equalTo("X"));
	}
	
	@Então("^o resultado deve ser uma unica letra, L$")
	public void o_resultado_deve_ser_uma_unica_letra_L() throws Throwable {
	    assertThat(converter.convert(), equalTo("L"));
	}
	
	@Então("^o resultado deve ser uma unica letra, C$")
	public void o_resultado_deve_ser_uma_unica_letra_C() throws Throwable {
	    assertThat(converter.convert(), equalTo("C"));
	}
	
	@Então("^o resultado deve ser uma unica letra, D$")
	public void o_resultado_deve_ser_uma_unica_letra_D() throws Throwable {
	    assertThat(converter.convert(), equalTo("D"));
	}
	
	@Então("^o resultado deve ser uma unica letra, M$")
	public void o_resultado_deve_ser_uma_unica_letra_M() throws Throwable {
	    assertThat(converter.convert(), equalTo("M"));
	}
	
	@Então("^o resultado deve ser com duas letras, XV$")
	public void o_resultado_deve_ser_com_duas_letras_XV() throws Throwable {
		assertThat(converter.convert(), equalTo("XV"));
	}

	@Então("^o resultado deve ser com duas letras, VI$")
	public void o_resultado_deve_ser_com_duas_letras_VI() throws Throwable {
		assertThat(converter.convert(), equalTo("VI"));
	}

	@Então("^o resultado deve ser com duas letras, LX$")
	public void o_resultado_deve_ser_com_duas_letras_LX() throws Throwable {
		assertThat(converter.convert(), equalTo("LX"));
	}

	@Então("^o resultado deve ser com duas letras, CL$")
	public void o_resultado_deve_ser_com_duas_letras_CL() throws Throwable {
		assertThat(converter.convert(), equalTo("CL"));
	}

	@Então("^o resultado deve ser com duas letras, DV$")
	public void o_resultado_deve_ser_com_duas_letras_DV() throws Throwable {
		assertThat(converter.convert(), equalTo("DV"));
	}

	@Então("^o resultado deve ser com duas letras, ML$")
	public void o_resultado_deve_ser_com_duas_letras_ML() throws Throwable {
		assertThat(converter.convert(), equalTo("ML"));
	}

	@Então("^o resultado deve ser com duas letras, II$")
	public void o_resultado_deve_ser_com_duas_letras_II() throws Throwable {
		assertThat(converter.convert(), equalTo("II"));
	}
	
	@Então("^o resultado deve ser correto, IV$")
	public void o_resultado_deve_ser_correto_IV() throws Throwable {
		assertThat(converter.convert(), equalTo("IV"));
	}

	@Então("^o resultado deve ser correto, IX$")
	public void o_resultado_deve_ser_correto_IX() throws Throwable {
		assertThat(converter.convert(), equalTo("IX"));
	}

	@Então("^o resultado deve ser correto, XIV$")
	public void o_resultado_deve_ser_correto_XIV() throws Throwable {
		assertThat(converter.convert(), equalTo("XIV"));
	}

	@Então("^o resultado deve ser correto, CCCXCIX$")
	public void o_resultado_deve_ser_correto_CCCXCIX() throws Throwable {
		assertThat(converter.convert(), equalTo("CCCXCIX"));
	}

	@Então("^o resultado deve ser correto, CDXXX$")
	public void o_resultado_deve_ser_correto_CDXXX() throws Throwable {
		assertThat(converter.convert(), equalTo("CDXXX"));
	}

	@Então("^o resultado deve ser correto, CM$")
	public void o_resultado_deve_ser_correto_CM() throws Throwable {
		assertThat(converter.convert(), equalTo("CM"));
	}
}
