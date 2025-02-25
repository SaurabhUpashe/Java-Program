class UsingBuiltMethodOfCharacterClass 
{
	public static void main(String[] args) 
	{
		char ch = 'S';

		System.out.println("ToUppercase: "+Character.isUpperCase(ch));//uppercase
		System.out.println("ToLowercase: "+Character.isLowerCase('P'));
		System.out.println("isDigit: "+Character.isDigit(ch));
		System.out.println("isLetter: "+Character.isLetter(ch));
		System.out.println("ToUppercase: "+Character.isWhitespace(' '));
		
		System.out.println("getNumericValue: "+Character.getNumericValue('3'));
		System.out.println("Compare Charater: "+Character.compare('A','B'));
		System.out.println("ToString: "+Character.toString('C'));

	}
}
