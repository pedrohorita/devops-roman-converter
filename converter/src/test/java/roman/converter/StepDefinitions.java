package roman.converter;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/roman/converter/features",
        glue = "roman.converter.StepDefinitions",
        plugin = { 
                    "pretty",
                    "html:target/converter",
                } 

        )
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
	    Assert.assertEquals("I", Converter.convert());
	}
	
	@Então("^o resultado deve ser uma unica letra, V$")
	public void o_resultado_deve_ser_uma_unica_letra_V() throws Throwable {
	    Assert.assertEquals("V", Converter.convert());
	}
	
	@Então("^o resultado deve ser uma unica letra, X$")
	public void o_resultado_deve_ser_uma_unica_letra_X() throws Throwable {
	    Assert.assertEquals("X", Converter.convert());
	}
	
	@Então("^o resultado deve ser uma unica letra, L$")
	public void o_resultado_deve_ser_uma_unica_letra_L() throws Throwable {
	    Assert.assertEquals("L", Converter.convert());
	}
	
	@Então("^o resultado deve ser uma unica letra, C$")
	public void o_resultado_deve_ser_uma_unica_letra_C() throws Throwable {
	    Assert.assertEquals("C", Converter.convert());
	}
	
	@Então("^o resultado deve ser uma unica letra, D$")
	public void o_resultado_deve_ser_uma_unica_letra_D() throws Throwable {
	    Assert.assertEquals("D", Converter.convert());
	}
	
	@Então("^o resultado deve ser uma unica letra, M$")
	public void o_resultado_deve_ser_uma_unica_letra_M() throws Throwable {
	    Assert.assertEquals("M", Converter.convert());
	}
	
	@Então("^o resultado deve ser com duas letras, XV$")
	public void o_resultado_deve_ser_com_duas_letras_XV() throws Throwable {
		Assert.assertEquals("XV", Converter.convert());
	}

	@Então("^o resultado deve ser com duas letras, VI$")
	public void o_resultado_deve_ser_com_duas_letras_VI() throws Throwable {
		Assert.assertEquals("VI", Converter.convert());
	}

	@Então("^o resultado deve ser com duas letras, LX$")
	public void o_resultado_deve_ser_com_duas_letras_LX() throws Throwable {
		Assert.assertEquals("LX", Converter.convert());
	}

	@Então("^o resultado deve ser com duas letras, CL$")
	public void o_resultado_deve_ser_com_duas_letras_CL() throws Throwable {
		Assert.assertEquals("CL", Converter.convert());
	}

	@Então("^o resultado deve ser com duas letras, DV$")
	public void o_resultado_deve_ser_com_duas_letras_DV() throws Throwable {
		Assert.assertEquals("DV", Converter.convert());
	}

	@Então("^o resultado deve ser com duas letras, ML$")
	public void o_resultado_deve_ser_com_duas_letras_ML() throws Throwable {
		Assert.assertEquals("ML", Converter.convert());
	}

	@Então("^o resultado deve ser com duas letras, II$")
	public void o_resultado_deve_ser_com_duas_letras_II() throws Throwable {
		Assert.assertEquals("II", Converter.convert());
	}
	
	@Então("^o resultado deve ser correto, IV$")
	public void o_resultado_deve_ser_correto_IV() throws Throwable {
		Assert.assertEquals("IV", Converter.convert());
	}

	@Então("^o resultado deve ser correto, IX$")
	public void o_resultado_deve_ser_correto_IX() throws Throwable {
		Assert.assertEquals("IX", Converter.convert());
	}

	@Então("^o resultado deve ser correto, XIV$")
	public void o_resultado_deve_ser_correto_XIV() throws Throwable {
		Assert.assertEquals("XIV", Converter.convert());
	}

	@Então("^o resultado deve ser correto, CCCXCIX$")
	public void o_resultado_deve_ser_correto_CCCXCIX() throws Throwable {
		Assert.assertEquals("CCCXCIX", Converter.convert());
	}

	@Então("^o resultado deve ser correto, CDXXX$")
	public void o_resultado_deve_ser_correto_CDXXX() throws Throwable {
		Assert.assertEquals("CDXXX", Converter.convert());
	}

	@Então("^o resultado deve ser correto, CM$")
	public void o_resultado_deve_ser_correto_CM() throws Throwable {
		Assert.assertEquals("CM", Converter.convert());
	}
}
