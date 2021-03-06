package me.tludwig.parsing.peg.expressions.primaries;

import me.tludwig.parsing.peg.Match;
import me.tludwig.parsing.peg.expressions.Expression;

public class EndOfFile extends Expression {
	
	@Override
	public Match match(final String input, final int position) {
		if(position < input.length()) return null;
		
		return new Match(this, position, "");
	}
	
	@Override
	public String toString() {
		return "EOF";
	}
}
