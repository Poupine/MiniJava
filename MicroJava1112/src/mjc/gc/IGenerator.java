package mjc.gc;

public interface IGenerator {

	String generateHeader();
	
	String generateBloc(String att_code);

	String generateConstructor(Clazz construct, String att_code, String nomEtiquette);

	String generateAffectation(String att_code, String att_code2);

	String generateRelativeOperation(String att_lcode, String att_code,
			String att_code2);

	String generateAdditionOperation(String att_lcode, String att_code,
			String att_code2);

	String generateUnaryOperation(String att_code, String att_code2);

	String generateBoolean(boolean b);

	String generateInteger(String att_txt);

	String generateNull();

	String generateInstance(Clazz glob_72_clazz, Signature att_signature);

	String generateReturn(String att_code);

	String generateIfThenElse(String att_code, String att_code2,
			String att_code3);

	String generateSequence(String att_code, String att_code2);

	String generateMinus();

	String generateOr();

	String generatePlus();

	String generateAnd();

	String generateMult();

	String generateMod();

	String generateDiv();

	String generateNEq();

	String generateEq();

	String generateInfEq();

	String generateSupEq();

	String generateInf();

	String generateSup();
	
	String generateNot();

	String generateMultiplicationOperation(String att_lcode, String att_code,
			String att_code2);

	String generateGetAttribute(String attr_name, Clazz clazz);
	
	String generateGetVariable(String name);
	
	String generateMethodCall(MethodList m_list, String m_name);
	
	String generateMethod(String etiquette, String code);
	
	// TODO: mettre des noms de paramètres explicites
	String generateQualification(String toto, String tata);
}
