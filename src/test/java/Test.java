import me.tludwig.parsing.PEGParser;
import me.tludwig.parsing.peg.PEGrammar;

public class Test {
	// public static void main(final String[] args) throws IOException {
	// final PEGrammar parser = new ABNFParser();
	//
	// String text = "";
	//
	// for(final String line : Files.readAllLines(Paths.get("bin/selfdefin.abnf"))) {
	// text += line + "\r\n";
	// }
	//
	// System.out.println(text);
	//
	// System.out.println(parser.match(text));
	// }
	
	public static void main(final String[] args) {
		final PEGrammar parser = new PEGParser();
		
		System.out.println(parser.toString());
	}
	
	// public static void main(final String[] args) {
	// final ANBN anbn = new ANBN();
	//
	// test("", anbn);
	// test("ab", anbn);
	// test("aabb", anbn);
	// test("aaabbb", anbn);
	// test("aaaabbbb", anbn);
	//
	// System.out.println("S <- " + anbn.definitions.get("S"));
	// }
	
	private static void test(final String input, final PEGrammar parser) {
		System.out.println(input);
		System.out.println(parser.match(input));
	}
	
	public static class ANBN extends PEGrammar {
		
		public ANBN() {
			super("S");
		}
		
		@Override
		public void init() {
			def("S", choice(seq(character('a'), def("S"), character('b')), string("")));
		}
	}
}
