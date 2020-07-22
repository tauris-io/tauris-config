// Generated from Tauris.g4 by ANTLR 4.6

    package io.tauris.config.ast;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaurisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Integer=13, Float=14, Boolean=15, Null=16, 
		String=17, Environ=18, ID=19, WS=20, LINE_COMMENT=21;
	public static final int
		RULE_pipeline = 0, RULE_pluginGroup = 1, RULE_plugins = 2, RULE_plugin = 3, 
		RULE_pluginName = 4, RULE_assignments = 5, RULE_assignment = 6, RULE_name = 7, 
		RULE_value = 8, RULE_simpleValue = 9, RULE_environValue = 10, RULE_array = 11, 
		RULE_hash = 12, RULE_keyValues = 13, RULE_keyValue = 14, RULE_key = 15, 
		RULE_strings = 16, RULE_integers = 17, RULE_floats = 18, RULE_booleans = 19, 
		RULE_nulls = 20;
	public static final String[] ruleNames = {
		"pipeline", "pluginGroup", "plugins", "plugin", "pluginName", "assignments", 
		"assignment", "name", "value", "simpleValue", "environValue", "array", 
		"hash", "keyValues", "keyValue", "key", "strings", "integers", "floats", 
		"booleans", "nulls"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'.'", "'=>'", "';'", "'input'", "'filter'", "'output'", 
		"'['", "']'", "','", "':'", null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Integer", "Float", "Boolean", "Null", "String", "Environ", "ID", 
		"WS", "LINE_COMMENT"
	};
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

	@Override
	public String getGrammarFileName() { return "Tauris.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaurisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PipelineContext extends ParserRuleContext {
		public List<PluginGroupContext> pluginGroup() {
			return getRuleContexts(PluginGroupContext.class);
		}
		public PluginGroupContext pluginGroup(int i) {
			return getRuleContext(PluginGroupContext.class,i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitPipeline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitPipeline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				pluginGroup();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluginGroupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TaurisParser.ID, 0); }
		public PluginsContext plugins() {
			return getRuleContext(PluginsContext.class,0);
		}
		public PluginGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterPluginGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitPluginGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitPluginGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginGroupContext pluginGroup() throws RecognitionException {
		PluginGroupContext _localctx = new PluginGroupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pluginGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(48);
			plugins();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluginsContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<PluginContext> plugin() {
			return getRuleContexts(PluginContext.class);
		}
		public PluginContext plugin(int i) {
			return getRuleContext(PluginContext.class,i);
		}
		public PluginsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plugins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterPlugins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitPlugins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitPlugins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginsContext plugins() throws RecognitionException {
		PluginsContext _localctx = new PluginsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_plugins);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					assignment();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				plugin();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0) );
			setState(62);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluginContext extends ParserRuleContext {
		public PluginNameContext pluginName() {
			return getRuleContext(PluginNameContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public PluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plugin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterPlugin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitPlugin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitPlugin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginContext plugin() throws RecognitionException {
		PluginContext _localctx = new PluginContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_plugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			pluginName();
			setState(65);
			assignments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluginNameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public PluginNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterPluginName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitPluginName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitPluginName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginNameContext pluginName() throws RecognitionException {
		PluginNameContext _localctx = new PluginNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pluginName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			name();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(68);
				match(T__2);
				setState(69);
				name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentsContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(73);
				assignment();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EnvironValueContext environValue() {
			return getRuleContext(EnvironValueContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public PluginsContext plugins() {
			return getRuleContext(PluginsContext.class,0);
		}
		public PluginContext plugin() {
			return getRuleContext(PluginContext.class,0);
		}
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				name();
				setState(82);
				match(T__3);
				setState(83);
				value();
				setState(84);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				name();
				setState(87);
				match(T__3);
				setState(88);
				environValue();
				setState(89);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				name();
				setState(92);
				match(T__3);
				setState(93);
				assignments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				name();
				setState(96);
				match(T__3);
				setState(97);
				plugins();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				name();
				setState(100);
				match(T__3);
				setState(101);
				plugin();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				name();
				setState(104);
				match(T__3);
				setState(105);
				hash();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TaurisParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public SimpleValueContext simpleValue() {
			return getRuleContext(SimpleValueContext.class,0);
		}
		public EnvironValueContext environValue() {
			return getRuleContext(EnvironValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case Boolean:
			case Null:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				simpleValue();
				}
				break;
			case Environ:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				environValue();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleValueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(TaurisParser.String, 0); }
		public TerminalNode Integer() { return getToken(TaurisParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TaurisParser.Float, 0); }
		public TerminalNode Boolean() { return getToken(TaurisParser.Boolean, 0); }
		public TerminalNode Null() { return getToken(TaurisParser.Null, 0); }
		public SimpleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterSimpleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitSimpleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitSimpleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleValueContext simpleValue() throws RecognitionException {
		SimpleValueContext _localctx = new SimpleValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Float) | (1L << Boolean) | (1L << Null) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironValueContext extends ParserRuleContext {
		public TerminalNode Environ() { return getToken(TaurisParser.Environ, 0); }
		public EnvironValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterEnvironValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitEnvironValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitEnvironValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironValueContext environValue() throws RecognitionException {
		EnvironValueContext _localctx = new EnvironValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_environValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Environ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public IntegersContext integers() {
			return getRuleContext(IntegersContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public FloatsContext floats() {
			return getRuleContext(FloatsContext.class,0);
		}
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public NullsContext nulls() {
			return getRuleContext(NullsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__8);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Integer) {
					{
					setState(121);
					integers();
					}
				}

				setState(124);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__8);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(126);
					strings();
					}
				}

				setState(129);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__8);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Float) {
					{
					setState(131);
					floats();
					}
				}

				setState(134);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__8);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Boolean) {
					{
					setState(136);
					booleans();
					}
				}

				setState(139);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(T__8);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Null) {
					{
					setState(141);
					nulls();
					}
				}

				setState(144);
				match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(T__8);
				setState(146);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashContext extends ParserRuleContext {
		public KeyValuesContext keyValues() {
			return getRuleContext(KeyValuesContext.class,0);
		}
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__0);
			setState(150);
			keyValues();
			setState(151);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValuesContext extends ParserRuleContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public KeyValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterKeyValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitKeyValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitKeyValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuesContext keyValues() throws RecognitionException {
		KeyValuesContext _localctx = new KeyValuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyValues);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			keyValue();
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(T__10);
					setState(155);
					keyValue();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(161);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public SimpleValueContext simpleValue() {
			return getRuleContext(SimpleValueContext.class,0);
		}
		public EnvironValueContext environValue() {
			return getRuleContext(EnvironValueContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_keyValue);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				key();
				setState(165);
				match(T__11);
				setState(166);
				simpleValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				key();
				setState(169);
				match(T__11);
				setState(170);
				environValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(TaurisParser.String, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringsContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(TaurisParser.String); }
		public TerminalNode String(int i) {
			return getToken(TaurisParser.String, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_strings);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(String);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(T__10);
					setState(178);
					match(String);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(184);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegersContext extends ParserRuleContext {
		public List<TerminalNode> Integer() { return getTokens(TaurisParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(TaurisParser.Integer, i);
		}
		public IntegersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterIntegers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitIntegers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitIntegers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegersContext integers() throws RecognitionException {
		IntegersContext _localctx = new IntegersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_integers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(Integer);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(T__10);
					setState(189);
					match(Integer);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(195);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatsContext extends ParserRuleContext {
		public List<TerminalNode> Float() { return getTokens(TaurisParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(TaurisParser.Float, i);
		}
		public FloatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterFloats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitFloats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitFloats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatsContext floats() throws RecognitionException {
		FloatsContext _localctx = new FloatsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_floats);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Float);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(T__10);
					setState(200);
					match(Float);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(206);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleansContext extends ParserRuleContext {
		public List<TerminalNode> Boolean() { return getTokens(TaurisParser.Boolean); }
		public TerminalNode Boolean(int i) {
			return getToken(TaurisParser.Boolean, i);
		}
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleans);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Boolean);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(T__10);
					setState(211);
					match(Boolean);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(217);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullsContext extends ParserRuleContext {
		public List<TerminalNode> Null() { return getTokens(TaurisParser.Null); }
		public TerminalNode Null(int i) {
			return getToken(TaurisParser.Null, i);
		}
		public NullsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nulls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).enterNulls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaurisListener ) ((TaurisListener)listener).exitNulls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaurisVisitor ) return ((TaurisVisitor<? extends T>)visitor).visitNulls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullsContext nulls() throws RecognitionException {
		NullsContext _localctx = new NullsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nulls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(Null);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					match(T__10);
					setState(222);
					match(Null);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(228);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00ea\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\3"+
		"\3\3\3\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\6\4=\n\4\r\4\16\4>\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\5\nu\n\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r}\n\r\3\r\3\r\3\r\5\r\u0082\n\r"+
		"\3\r\3\r\3\r\5\r\u0087\n\r\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\r\5\r\u0091"+
		"\n\r\3\r\3\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17"+
		"\u009f\n\17\f\17\16\17\u00a2\13\17\3\17\5\17\u00a5\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00af\n\20\3\21\3\21\3\22\3\22\3\22\7\22"+
		"\u00b6\n\22\f\22\16\22\u00b9\13\22\3\22\5\22\u00bc\n\22\3\23\3\23\3\23"+
		"\7\23\u00c1\n\23\f\23\16\23\u00c4\13\23\3\23\5\23\u00c7\n\23\3\24\3\24"+
		"\3\24\7\24\u00cc\n\24\f\24\16\24\u00cf\13\24\3\24\5\24\u00d2\n\24\3\25"+
		"\3\25\3\25\7\25\u00d7\n\25\f\25\16\25\u00da\13\25\3\25\5\25\u00dd\n\25"+
		"\3\26\3\26\3\26\7\26\u00e2\n\26\f\26\16\26\u00e5\13\26\3\26\5\26\u00e8"+
		"\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\4"+
		"\2\b\n\25\25\3\2\17\23\u00f7\2-\3\2\2\2\4\61\3\2\2\2\6\64\3\2\2\2\bB\3"+
		"\2\2\2\nE\3\2\2\2\fJ\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22t\3\2\2\2\24v\3"+
		"\2\2\2\26x\3\2\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u009b\3\2\2\2"+
		"\36\u00ae\3\2\2\2 \u00b0\3\2\2\2\"\u00b2\3\2\2\2$\u00bd\3\2\2\2&\u00c8"+
		"\3\2\2\2(\u00d3\3\2\2\2*\u00de\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/"+
		"-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\7\25\2\2\62\63\5\6\4\2\63\5\3"+
		"\2\2\2\648\7\3\2\2\65\67\5\16\b\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;=\5\b\5\2<;\3\2\2\2=>\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?@\3\2\2\2@A\7\4\2\2A\7\3\2\2\2BC\5\n\6\2CD\5\f\7\2D\t\3\2"+
		"\2\2EH\5\20\t\2FG\7\5\2\2GI\5\20\t\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2J"+
		"N\7\3\2\2KM\5\16\b\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2"+
		"PN\3\2\2\2QR\7\4\2\2R\r\3\2\2\2ST\5\20\t\2TU\7\6\2\2UV\5\22\n\2VW\7\7"+
		"\2\2Wn\3\2\2\2XY\5\20\t\2YZ\7\6\2\2Z[\5\26\f\2[\\\7\7\2\2\\n\3\2\2\2]"+
		"^\5\20\t\2^_\7\6\2\2_`\5\f\7\2`n\3\2\2\2ab\5\20\t\2bc\7\6\2\2cd\5\6\4"+
		"\2dn\3\2\2\2ef\5\20\t\2fg\7\6\2\2gh\5\b\5\2hn\3\2\2\2ij\5\20\t\2jk\7\6"+
		"\2\2kl\5\32\16\2ln\3\2\2\2mS\3\2\2\2mX\3\2\2\2m]\3\2\2\2ma\3\2\2\2me\3"+
		"\2\2\2mi\3\2\2\2n\17\3\2\2\2op\t\2\2\2p\21\3\2\2\2qu\5\24\13\2ru\5\26"+
		"\f\2su\5\30\r\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\23\3\2\2\2vw\t\3\2\2w\25"+
		"\3\2\2\2xy\7\24\2\2y\27\3\2\2\2z|\7\13\2\2{}\5$\23\2|{\3\2\2\2|}\3\2\2"+
		"\2}~\3\2\2\2~\u0096\7\f\2\2\177\u0081\7\13\2\2\u0080\u0082\5\"\22\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0096\7\f"+
		"\2\2\u0084\u0086\7\13\2\2\u0085\u0087\5&\24\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0096\7\f\2\2\u0089\u008b\7\13"+
		"\2\2\u008a\u008c\5(\25\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0096\7\f\2\2\u008e\u0090\7\13\2\2\u008f\u0091\5"+
		"*\26\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0096\7\f\2\2\u0093\u0094\7\13\2\2\u0094\u0096\7\f\2\2\u0095z\3\2\2\2"+
		"\u0095\177\3\2\2\2\u0095\u0084\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008e"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\31\3\2\2\2\u0097\u0098\7\3\2\2\u0098"+
		"\u0099\5\34\17\2\u0099\u009a\7\4\2\2\u009a\33\3\2\2\2\u009b\u00a0\5\36"+
		"\20\2\u009c\u009d\7\r\2\2\u009d\u009f\5\36\20\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\r\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\7\16\2"+
		"\2\u00a8\u00a9\5\24\13\2\u00a9\u00af\3\2\2\2\u00aa\u00ab\5 \21\2\u00ab"+
		"\u00ac\7\16\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00af\3\2\2\2\u00ae\u00a6\3"+
		"\2\2\2\u00ae\u00aa\3\2\2\2\u00af\37\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1"+
		"!\3\2\2\2\u00b2\u00b7\7\23\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00b6\7\23\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7\r\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc#\3\2\2\2\u00bd\u00c2\7\17\2\2"+
		"\u00be\u00bf\7\r\2\2\u00bf\u00c1\7\17\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c7\7\r\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7%\3\2\2\2\u00c8\u00cd\7\20\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cc"+
		"\7\20\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2"+
		"\7\r\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\'\3\2\2\2\u00d3"+
		"\u00d8\7\21\2\2\u00d4\u00d5\7\r\2\2\u00d5\u00d7\7\21\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\7\r\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd)\3\2\2\2\u00de\u00e3\7\22\2\2\u00df\u00e0"+
		"\7\r\2\2\u00e0\u00e2\7\22\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e8\7\r\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"+\3\2\2\2\34/8>HNmt|\u0081\u0086\u008b\u0090\u0095\u00a0\u00a4\u00ae\u00b7"+
		"\u00bb\u00c2\u00c6\u00cd\u00d1\u00d8\u00dc\u00e3\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}