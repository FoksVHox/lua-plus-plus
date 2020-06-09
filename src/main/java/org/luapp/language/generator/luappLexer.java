// Generated from C:/Users/Harry/Desktop/Lua/lpp/src/main/java/org/luapp/language/parser\luapp.g4 by ANTLR 4.8
package org.luapp.language.generator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class luappLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		NAME=67, NORMALSTRING=68, CHARSTRING=69, LONGSTRING=70, INT=71, HEX=72, 
		FLOAT=73, HEX_FLOAT=74, COMMENT=75, LINE_COMMENT=76, WS=77, SHEBANG=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "NAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", "NESTED_STR", 
			"INT", "HEX", "FLOAT", "HEX_FLOAT", "ExponentPart", "HexExponentPart", 
			"EscapeSequence", "DecimalEscape", "HexEscape", "UtfEscape", "Digit", 
			"HexDigit", "COMMENT", "LINE_COMMENT", "WS", "SHEBANG"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'break'", "'goto'", "'do'", "'end'", "'while'", 
			"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
			"','", "'in'", "'function'", "'class'", "'extends'", "'local'", "'return'", 
			"'::'", "'.'", "':'", "'nil'", "'false'", "'true'", "'...'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'or'", "'and'", "'<'", "'>'", "'<='", "'>='", 
			"'~='", "'=='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'//'", "'&'", 
			"'|'", "'~'", "'<<'", "'>>'", "'not'", "'#'", "'^'", "'new'", "'get'", 
			"'set'", "'constructor'", "'++'", "'+='", "'*='", "'/='", "'-='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NAME", "NORMALSTRING", "CHARSTRING", 
			"LONGSTRING", "INT", "HEX", "FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", 
			"WS", "SHEBANG"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public luappLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "luapp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u02a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\3:\3:\3;\3;\3;\3"+
		";\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\7D\u01a6\nD\fD\16D\u01a9\13"+
		"D\3E\3E\3E\7E\u01ae\nE\fE\16E\u01b1\13E\3E\3E\3F\3F\3F\7F\u01b8\nF\fF"+
		"\16F\u01bb\13F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\7H\u01c9\nH\fH\16H"+
		"\u01cc\13H\3H\5H\u01cf\nH\3I\6I\u01d2\nI\rI\16I\u01d3\3J\3J\3J\6J\u01d9"+
		"\nJ\rJ\16J\u01da\3K\6K\u01de\nK\rK\16K\u01df\3K\3K\7K\u01e4\nK\fK\16K"+
		"\u01e7\13K\3K\5K\u01ea\nK\3K\3K\6K\u01ee\nK\rK\16K\u01ef\3K\5K\u01f3\n"+
		"K\3K\6K\u01f6\nK\rK\16K\u01f7\3K\3K\5K\u01fc\nK\3L\3L\3L\6L\u0201\nL\r"+
		"L\16L\u0202\3L\3L\7L\u0207\nL\fL\16L\u020a\13L\3L\5L\u020d\nL\3L\3L\3"+
		"L\3L\6L\u0213\nL\rL\16L\u0214\3L\5L\u0218\nL\3L\3L\3L\6L\u021d\nL\rL\16"+
		"L\u021e\3L\3L\5L\u0223\nL\3M\3M\5M\u0227\nM\3M\6M\u022a\nM\rM\16M\u022b"+
		"\3N\3N\5N\u0230\nN\3N\6N\u0233\nN\rN\16N\u0234\3O\3O\3O\3O\5O\u023b\n"+
		"O\3O\3O\3O\3O\5O\u0241\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u024e\n"+
		"P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\6R\u025a\nR\rR\16R\u025b\3R\3R\3S\3S\3"+
		"T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\7V\u0273\nV\fV\16V\u0276"+
		"\13V\3V\3V\7V\u027a\nV\fV\16V\u027d\13V\3V\3V\7V\u0281\nV\fV\16V\u0284"+
		"\13V\3V\3V\7V\u0288\nV\fV\16V\u028b\13V\5V\u028d\nV\3V\3V\3V\5V\u0292"+
		"\nV\3V\3V\3W\6W\u0297\nW\rW\16W\u0298\3W\3W\3X\3X\3X\7X\u02a0\nX\fX\16"+
		"X\u02a3\13X\3X\3X\3\u01ca\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008f\2\u0091I\u0093J\u0095K\u0097L\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9M\u00abN\u00ad"+
		"O\u00afP\3\2\23\5\2C\\aac|\6\2\62;C\\aac|\4\2$$^^\4\2))^^\4\2ZZzz\4\2"+
		"GGgg\4\2--//\4\2RRrr\f\2$$))^^cdhhppttvvxx||\3\2\62\64\3\2\62;\5\2\62"+
		";CHch\6\2\f\f\17\17??]]\4\2\f\f\17\17\5\2\f\f\17\17]]\4\3\f\f\17\17\5"+
		"\2\13\f\16\17\"\"\2\u02cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\3\u00b1\3\2\2\2\5\u00b3\3\2\2\2\7\u00b5\3\2\2\2\t\u00bb"+
		"\3\2\2\2\13\u00c0\3\2\2\2\r\u00c3\3\2\2\2\17\u00c7\3\2\2\2\21\u00cd\3"+
		"\2\2\2\23\u00d4\3\2\2\2\25\u00da\3\2\2\2\27\u00dd\3\2\2\2\31\u00e2\3\2"+
		"\2\2\33\u00e9\3\2\2\2\35\u00ee\3\2\2\2\37\u00f2\3\2\2\2!\u00f4\3\2\2\2"+
		"#\u00f7\3\2\2\2%\u0100\3\2\2\2\'\u0106\3\2\2\2)\u010e\3\2\2\2+\u0114\3"+
		"\2\2\2-\u011b\3\2\2\2/\u011e\3\2\2\2\61\u0120\3\2\2\2\63\u0122\3\2\2\2"+
		"\65\u0126\3\2\2\2\67\u012c\3\2\2\29\u0131\3\2\2\2;\u0135\3\2\2\2=\u0137"+
		"\3\2\2\2?\u0139\3\2\2\2A\u013b\3\2\2\2C\u013d\3\2\2\2E\u013f\3\2\2\2G"+
		"\u0141\3\2\2\2I\u0144\3\2\2\2K\u0148\3\2\2\2M\u014a\3\2\2\2O\u014c\3\2"+
		"\2\2Q\u014f\3\2\2\2S\u0152\3\2\2\2U\u0155\3\2\2\2W\u0158\3\2\2\2Y\u015b"+
		"\3\2\2\2[\u015d\3\2\2\2]\u015f\3\2\2\2_\u0161\3\2\2\2a\u0163\3\2\2\2c"+
		"\u0165\3\2\2\2e\u0168\3\2\2\2g\u016a\3\2\2\2i\u016c\3\2\2\2k\u016e\3\2"+
		"\2\2m\u0171\3\2\2\2o\u0174\3\2\2\2q\u0178\3\2\2\2s\u017a\3\2\2\2u\u017c"+
		"\3\2\2\2w\u0180\3\2\2\2y\u0184\3\2\2\2{\u0188\3\2\2\2}\u0194\3\2\2\2\177"+
		"\u0197\3\2\2\2\u0081\u019a\3\2\2\2\u0083\u019d\3\2\2\2\u0085\u01a0\3\2"+
		"\2\2\u0087\u01a3\3\2\2\2\u0089\u01aa\3\2\2\2\u008b\u01b4\3\2\2\2\u008d"+
		"\u01be\3\2\2\2\u008f\u01ce\3\2\2\2\u0091\u01d1\3\2\2\2\u0093\u01d5\3\2"+
		"\2\2\u0095\u01fb\3\2\2\2\u0097\u0222\3\2\2\2\u0099\u0224\3\2\2\2\u009b"+
		"\u022d\3\2\2\2\u009d\u0240\3\2\2\2\u009f\u024d\3\2\2\2\u00a1\u024f\3\2"+
		"\2\2\u00a3\u0254\3\2\2\2\u00a5\u025f\3\2\2\2\u00a7\u0261\3\2\2\2\u00a9"+
		"\u0263\3\2\2\2\u00ab\u026c\3\2\2\2\u00ad\u0296\3\2\2\2\u00af\u029c\3\2"+
		"\2\2\u00b1\u00b2\7=\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\6\3\2"+
		"\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9\u00ba\7m\2\2\u00ba\b\3\2\2\2\u00bb\u00bc\7i\2\2\u00bc\u00bd"+
		"\7q\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7q\2\2\u00bf\n\3\2\2\2\u00c0\u00c1"+
		"\7f\2\2\u00c1\u00c2\7q\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\u00c6\7f\2\2\u00c6\16\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9"+
		"\7j\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\20\3\2\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7r\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\22\3\2\2\2\u00d4"+
		"\u00d5\7w\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7k\2\2"+
		"\u00d8\u00d9\7n\2\2\u00d9\24\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7"+
		"h\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7j\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7p\2\2\u00e1\30\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7h\2\2\u00e8\32\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7h\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1\36\3\2\2\2\u00f2\u00f3\7.\2\2\u00f3"+
		" \3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\"\3\2\2\2\u00f7"+
		"\u00f8\7h\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7e\2\2"+
		"\u00fb\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff"+
		"\7p\2\2\u00ff$\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102\7n\2\2\u0102\u0103"+
		"\7c\2\2\u0103\u0104\7u\2\2\u0104\u0105\7u\2\2\u0105&\3\2\2\2\u0106\u0107"+
		"\7g\2\2\u0107\u0108\7z\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7p\2\2\u010b\u010c\7f\2\2\u010c\u010d\7u\2\2\u010d(\3\2\2\2\u010e"+
		"\u010f\7n\2\2\u010f\u0110\7q\2\2\u0110\u0111\7e\2\2\u0111\u0112\7c\2\2"+
		"\u0112\u0113\7n\2\2\u0113*\3\2\2\2\u0114\u0115\7t\2\2\u0115\u0116\7g\2"+
		"\2\u0116\u0117\7v\2\2\u0117\u0118\7w\2\2\u0118\u0119\7t\2\2\u0119\u011a"+
		"\7p\2\2\u011a,\3\2\2\2\u011b\u011c\7<\2\2\u011c\u011d\7<\2\2\u011d.\3"+
		"\2\2\2\u011e\u011f\7\60\2\2\u011f\60\3\2\2\2\u0120\u0121\7<\2\2\u0121"+
		"\62\3\2\2\2\u0122\u0123\7p\2\2\u0123\u0124\7k\2\2\u0124\u0125\7n\2\2\u0125"+
		"\64\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\7c\2\2\u0128\u0129\7n\2\2\u0129"+
		"\u012a\7u\2\2\u012a\u012b\7g\2\2\u012b\66\3\2\2\2\u012c\u012d\7v\2\2\u012d"+
		"\u012e\7t\2\2\u012e\u012f\7w\2\2\u012f\u0130\7g\2\2\u01308\3\2\2\2\u0131"+
		"\u0132\7\60\2\2\u0132\u0133\7\60\2\2\u0133\u0134\7\60\2\2\u0134:\3\2\2"+
		"\2\u0135\u0136\7*\2\2\u0136<\3\2\2\2\u0137\u0138\7+\2\2\u0138>\3\2\2\2"+
		"\u0139\u013a\7]\2\2\u013a@\3\2\2\2\u013b\u013c\7_\2\2\u013cB\3\2\2\2\u013d"+
		"\u013e\7}\2\2\u013eD\3\2\2\2\u013f\u0140\7\177\2\2\u0140F\3\2\2\2\u0141"+
		"\u0142\7q\2\2\u0142\u0143\7t\2\2\u0143H\3\2\2\2\u0144\u0145\7c\2\2\u0145"+
		"\u0146\7p\2\2\u0146\u0147\7f\2\2\u0147J\3\2\2\2\u0148\u0149\7>\2\2\u0149"+
		"L\3\2\2\2\u014a\u014b\7@\2\2\u014bN\3\2\2\2\u014c\u014d\7>\2\2\u014d\u014e"+
		"\7?\2\2\u014eP\3\2\2\2\u014f\u0150\7@\2\2\u0150\u0151\7?\2\2\u0151R\3"+
		"\2\2\2\u0152\u0153\7\u0080\2\2\u0153\u0154\7?\2\2\u0154T\3\2\2\2\u0155"+
		"\u0156\7?\2\2\u0156\u0157\7?\2\2\u0157V\3\2\2\2\u0158\u0159\7\60\2\2\u0159"+
		"\u015a\7\60\2\2\u015aX\3\2\2\2\u015b\u015c\7-\2\2\u015cZ\3\2\2\2\u015d"+
		"\u015e\7/\2\2\u015e\\\3\2\2\2\u015f\u0160\7,\2\2\u0160^\3\2\2\2\u0161"+
		"\u0162\7\61\2\2\u0162`\3\2\2\2\u0163\u0164\7\'\2\2\u0164b\3\2\2\2\u0165"+
		"\u0166\7\61\2\2\u0166\u0167\7\61\2\2\u0167d\3\2\2\2\u0168\u0169\7(\2\2"+
		"\u0169f\3\2\2\2\u016a\u016b\7~\2\2\u016bh\3\2\2\2\u016c\u016d\7\u0080"+
		"\2\2\u016dj\3\2\2\2\u016e\u016f\7>\2\2\u016f\u0170\7>\2\2\u0170l\3\2\2"+
		"\2\u0171\u0172\7@\2\2\u0172\u0173\7@\2\2\u0173n\3\2\2\2\u0174\u0175\7"+
		"p\2\2\u0175\u0176\7q\2\2\u0176\u0177\7v\2\2\u0177p\3\2\2\2\u0178\u0179"+
		"\7%\2\2\u0179r\3\2\2\2\u017a\u017b\7`\2\2\u017bt\3\2\2\2\u017c\u017d\7"+
		"p\2\2\u017d\u017e\7g\2\2\u017e\u017f\7y\2\2\u017fv\3\2\2\2\u0180\u0181"+
		"\7i\2\2\u0181\u0182\7g\2\2\u0182\u0183\7v\2\2\u0183x\3\2\2\2\u0184\u0185"+
		"\7u\2\2\u0185\u0186\7g\2\2\u0186\u0187\7v\2\2\u0187z\3\2\2\2\u0188\u0189"+
		"\7e\2\2\u0189\u018a\7q\2\2\u018a\u018b\7p\2\2\u018b\u018c\7u\2\2\u018c"+
		"\u018d\7v\2\2\u018d\u018e\7t\2\2\u018e\u018f\7w\2\2\u018f\u0190\7e\2\2"+
		"\u0190\u0191\7v\2\2\u0191\u0192\7q\2\2\u0192\u0193\7t\2\2\u0193|\3\2\2"+
		"\2\u0194\u0195\7-\2\2\u0195\u0196\7-\2\2\u0196~\3\2\2\2\u0197\u0198\7"+
		"-\2\2\u0198\u0199\7?\2\2\u0199\u0080\3\2\2\2\u019a\u019b\7,\2\2\u019b"+
		"\u019c\7?\2\2\u019c\u0082\3\2\2\2\u019d\u019e\7\61\2\2\u019e\u019f\7?"+
		"\2\2\u019f\u0084\3\2\2\2\u01a0\u01a1\7/\2\2\u01a1\u01a2\7?\2\2\u01a2\u0086"+
		"\3\2\2\2\u01a3\u01a7\t\2\2\2\u01a4\u01a6\t\3\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u0088\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01af\7$\2\2\u01ab\u01ae\5\u009dO\2\u01ac"+
		"\u01ae\n\4\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b3\7$\2\2\u01b3\u008a\3\2\2\2\u01b4\u01b9\7)\2"+
		"\2\u01b5\u01b8\5\u009dO\2\u01b6\u01b8\n\5\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7)\2\2\u01bd"+
		"\u008c\3\2\2\2\u01be\u01bf\7]\2\2\u01bf\u01c0\5\u008fH\2\u01c0\u01c1\7"+
		"_\2\2\u01c1\u008e\3\2\2\2\u01c2\u01c3\7?\2\2\u01c3\u01c4\5\u008fH\2\u01c4"+
		"\u01c5\7?\2\2\u01c5\u01cf\3\2\2\2\u01c6\u01ca\7]\2\2\u01c7\u01c9\13\2"+
		"\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01cb\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf\7_"+
		"\2\2\u01ce\u01c2\3\2\2\2\u01ce\u01c6\3\2\2\2\u01cf\u0090\3\2\2\2\u01d0"+
		"\u01d2\5\u00a5S\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u0092\3\2\2\2\u01d5\u01d6\7\62\2\2"+
		"\u01d6\u01d8\t\6\2\2\u01d7\u01d9\5\u00a7T\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u0094\3\2"+
		"\2\2\u01dc\u01de\5\u00a5S\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e5\7\60"+
		"\2\2\u01e2\u01e4\5\u00a5S\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01ea\5\u0099M\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01fc\3\2\2\2\u01eb\u01ed\7\60\2\2\u01ec\u01ee\5\u00a5S\2\u01ed\u01ec"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01f3\5\u0099M\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01fc\3\2\2\2\u01f4\u01f6\5\u00a5S\2\u01f5\u01f4\3\2\2"+
		"\2\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fa\5\u0099M\2\u01fa\u01fc\3\2\2\2\u01fb\u01dd\3\2\2"+
		"\2\u01fb\u01eb\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fc\u0096\3\2\2\2\u01fd\u01fe"+
		"\7\62\2\2\u01fe\u0200\t\6\2\2\u01ff\u0201\5\u00a7T\2\u0200\u01ff\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204"+
		"\3\2\2\2\u0204\u0208\7\60\2\2\u0205\u0207\5\u00a7T\2\u0206\u0205\3\2\2"+
		"\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\5\u009bN\2\u020c\u020b\3\2\2"+
		"\2\u020c\u020d\3\2\2\2\u020d\u0223\3\2\2\2\u020e\u020f\7\62\2\2\u020f"+
		"\u0210\t\6\2\2\u0210\u0212\7\60\2\2\u0211\u0213\5\u00a7T\2\u0212\u0211"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0217\3\2\2\2\u0216\u0218\5\u009bN\2\u0217\u0216\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0223\3\2\2\2\u0219\u021a\7\62\2\2\u021a\u021c\t\6\2\2"+
		"\u021b\u021d\5\u00a7T\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\5\u009b"+
		"N\2\u0221\u0223\3\2\2\2\u0222\u01fd\3\2\2\2\u0222\u020e\3\2\2\2\u0222"+
		"\u0219\3\2\2\2\u0223\u0098\3\2\2\2\u0224\u0226\t\7\2\2\u0225\u0227\t\b"+
		"\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228"+
		"\u022a\5\u00a5S\2\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u009a\3\2\2\2\u022d\u022f\t\t\2\2\u022e"+
		"\u0230\t\b\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2"+
		"\2\2\u0231\u0233\5\u00a5S\2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u009c\3\2\2\2\u0236\u0237\7^"+
		"\2\2\u0237\u0241\t\n\2\2\u0238\u023a\7^\2\2\u0239\u023b\7\17\2\2\u023a"+
		"\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0241\7\f"+
		"\2\2\u023d\u0241\5\u009fP\2\u023e\u0241\5\u00a1Q\2\u023f\u0241\5\u00a3"+
		"R\2\u0240\u0236\3\2\2\2\u0240\u0238\3\2\2\2\u0240\u023d\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u009e\3\2\2\2\u0242\u0243\7^"+
		"\2\2\u0243\u024e\5\u00a5S\2\u0244\u0245\7^\2\2\u0245\u0246\5\u00a5S\2"+
		"\u0246\u0247\5\u00a5S\2\u0247\u024e\3\2\2\2\u0248\u0249\7^\2\2\u0249\u024a"+
		"\t\13\2\2\u024a\u024b\5\u00a5S\2\u024b\u024c\5\u00a5S\2\u024c\u024e\3"+
		"\2\2\2\u024d\u0242\3\2\2\2\u024d\u0244\3\2\2\2\u024d\u0248\3\2\2\2\u024e"+
		"\u00a0\3\2\2\2\u024f\u0250\7^\2\2\u0250\u0251\7z\2\2\u0251\u0252\5\u00a7"+
		"T\2\u0252\u0253\5\u00a7T\2\u0253\u00a2\3\2\2\2\u0254\u0255\7^\2\2\u0255"+
		"\u0256\7w\2\2\u0256\u0257\7}\2\2\u0257\u0259\3\2\2\2\u0258\u025a\5\u00a7"+
		"T\2\u0259\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7\177\2\2\u025e\u00a4\3"+
		"\2\2\2\u025f\u0260\t\f\2\2\u0260\u00a6\3\2\2\2\u0261\u0262\t\r\2\2\u0262"+
		"\u00a8\3\2\2\2\u0263\u0264\7/\2\2\u0264\u0265\7/\2\2\u0265\u0266\7]\2"+
		"\2\u0266\u0267\3\2\2\2\u0267\u0268\5\u008fH\2\u0268\u0269\7_\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026b\bU\2\2\u026b\u00aa\3\2\2\2\u026c\u026d\7/\2"+
		"\2\u026d\u026e\7/\2\2\u026e\u028c\3\2\2\2\u026f\u028d\3\2\2\2\u0270\u0274"+
		"\7]\2\2\u0271\u0273\7?\2\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u028d\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0277\u027b\7]\2\2\u0278\u027a\7?\2\2\u0279\u0278\3\2\2\2\u027a\u027d"+
		"\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027e\u0282\n\16\2\2\u027f\u0281\n\17\2\2\u0280\u027f\3"+
		"\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u028d\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0289\n\20\2\2\u0286\u0288\n"+
		"\17\2\2\u0287\u0286\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u026f\3\2"+
		"\2\2\u028c\u0270\3\2\2\2\u028c\u0277\3\2\2\2\u028c\u0285\3\2\2\2\u028d"+
		"\u0291\3\2\2\2\u028e\u028f\7\17\2\2\u028f\u0292\7\f\2\2\u0290\u0292\t"+
		"\21\2\2\u0291\u028e\3\2\2\2\u0291\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\bV\2\2\u0294\u00ac\3\2\2\2\u0295\u0297\t\22\2\2\u0296\u0295\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\bW\3\2\u029b\u00ae\3\2\2\2\u029c\u029d\7%\2"+
		"\2\u029d\u02a1\7#\2\2\u029e\u02a0\n\17\2\2\u029f\u029e\3\2\2\2\u02a0\u02a3"+
		"\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a4\u02a5\bX\2\2\u02a5\u00b0\3\2\2\2*\2\u01a7\u01ad\u01af"+
		"\u01b7\u01b9\u01ca\u01ce\u01d3\u01da\u01df\u01e5\u01e9\u01ef\u01f2\u01f7"+
		"\u01fb\u0202\u0208\u020c\u0214\u0217\u021e\u0222\u0226\u022b\u022f\u0234"+
		"\u023a\u0240\u024d\u025b\u0274\u027b\u0282\u0289\u028c\u0291\u0298\u02a1"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}