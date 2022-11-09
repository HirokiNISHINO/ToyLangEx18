package kut.compiler.lexer;

public final class TokenClass 
{
	public static final int EOF		 		= -1;
	public static final int IntLiteral 		= -2;
	public static final int Identifier 		= -3;
	public static final int INT				= -4;
	public static final int GLOBAL			= -5;
	public static final int LOCAL			= -6;
	public static final int RETURN			= -7;
	public static final int PRINT			= -8;
	public static final int StringLiteral 	= -9;
	public static final int STRING			= -10;
	public static final int ERROR			= -11;
	

	
	public static String getTokenClassString(int c) {
		switch(c){
		case EOF:
			return "EOF";
		
		case IntLiteral:
			return "IntLiteral";
		
		case Identifier:
			return "Identifier";
		
		case INT:
			return "INT";
		
		case GLOBAL:
			return "GLOBAL";
			
		case LOCAL:
			return "LOCAL";
			
		case RETURN:
			return "RETURN";
			
		case PRINT:
			return "PRINT";
			
		case StringLiteral:
			return "StringLiteral";

		case STRING:
			return "STRING";
			
		case ERROR:
			return "ERROR";

		default:
			return "" + (char)c;
		}
		
	}
}
