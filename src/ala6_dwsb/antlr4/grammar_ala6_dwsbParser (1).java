// Generated from grammar_ala6_dwsb.g4 by ANTLR 4.4
package ala6_dwsb.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammar_ala6_dwsbParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, OPERATOR=31, IDENTIFIER=32, 
		INTEGER_LITERAL=33, WHITESPACE=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'='", "'extends'", "'}'", "'if'", 
		"'int'", "'('", "'this'", "','", "'false'", "'.'", "'boolean'", "'System.out.println'", 
		"'['", "'String'", "']'", "'public'", "'!'", "'static'", "'else'", "')'", 
		"OPERATOR", "IDENTIFIER", "INTEGER_LITERAL", "WHITESPACE"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_formalList = 6, RULE_formal = 7, 
		RULE_statement = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "formalList", "formal", "statement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "grammar_ala6_dwsb.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammar_ala6_dwsbParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(grammar_ala6_dwsbParser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); mainClass();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(21); classDeclaration();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(grammar_ala6_dwsbParser.IDENTIFIER, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(grammar_ala6_dwsbParser.IDENTIFIER); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(T__24);
			setState(30); match(IDENTIFIER);
			setState(31); match(T__20);
			setState(32); match(T__4);
			setState(33); match(T__2);
			setState(34); match(T__21);
			setState(35); match(T__29);
			setState(36); match(T__14);
			setState(37); match(T__6);
			setState(38); match(T__7);
			setState(39); match(T__5);
			setState(40); match(IDENTIFIER);
			setState(41); match(T__0);
			setState(42); match(T__20);
			setState(43); statement();
			setState(44); match(T__17);
			setState(45); match(T__17);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(grammar_ala6_dwsbParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(grammar_ala6_dwsbParser.IDENTIFIER); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(T__24);
			setState(48); match(IDENTIFIER);
			setState(51);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(49); match(T__18);
				setState(50); match(IDENTIFIER);
				}
			}

			setState(53); match(T__20);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(54); varDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(60); methodDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(T__17);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(grammar_ala6_dwsbParser.IDENTIFIER, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); type();
			setState(69); match(IDENTIFIER);
			setState(70); match(T__22);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(grammar_ala6_dwsbParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(T__4);
			setState(73); type();
			setState(74); match(IDENTIFIER);
			setState(75); match(T__14);
			setState(77);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(76); formalList();
				}
			}

			setState(79); match(T__0);
			setState(80); match(T__20);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81); varDeclaration();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(87); statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(T__25);
			setState(94); expression(0);
			setState(95); match(T__22);
			setState(96); match(T__17);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(grammar_ala6_dwsbParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(T__15);
				setState(99); match(T__7);
				setState(100); match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); match(IDENTIFIER);
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

	public static class FormalListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(grammar_ala6_dwsbParser.IDENTIFIER, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitFormalList(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); type();
			setState(107); match(IDENTIFIER);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(108); match(T__12);
				setState(109); formal();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(grammar_ala6_dwsbParser.IDENTIFIER, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); type();
			setState(116); match(IDENTIFIER);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(grammar_ala6_dwsbParser.IDENTIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(T__20);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(119); statement();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125); match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); match(T__16);
				setState(127); match(T__14);
				setState(128); expression(0);
				setState(129); match(T__0);
				setState(130); statement();
				setState(131); match(T__1);
				setState(132); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(T__23);
				setState(135); match(T__14);
				setState(136); expression(0);
				setState(137); match(T__0);
				setState(138); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); match(T__8);
				setState(141); match(T__14);
				setState(142); expression(0);
				setState(143); match(T__0);
				setState(144); match(T__22);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146); match(IDENTIFIER);
				setState(147); match(T__19);
				setState(148); expression(0);
				setState(149); match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151); match(IDENTIFIER);
				setState(152); match(T__7);
				setState(153); expression(0);
				setState(154); match(T__5);
				setState(155); match(T__19);
				setState(156); expression(0);
				setState(157); match(T__22);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(grammar_ala6_dwsbParser.INTEGER_LITERAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(grammar_ala6_dwsbParser.IDENTIFIER, 0); }
		public TerminalNode OPERATOR() { return getToken(grammar_ala6_dwsbParser.OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_ala6_dwsbListener ) ((grammar_ala6_dwsbListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(162); match(T__3);
				setState(163); expression(2);
				}
				break;
			case 2:
				{
				setState(164); match(INTEGER_LITERAL);
				}
				break;
			case 3:
				{
				setState(165); match(T__26);
				}
				break;
			case 4:
				{
				setState(166); match(T__11);
				}
				break;
			case 5:
				{
				setState(167); match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(168); match(T__13);
				}
				break;
			case 7:
				{
				setState(169); match(T__27);
				setState(170); match(T__15);
				setState(171); match(T__7);
				setState(172); expression(0);
				setState(173); match(T__5);
				}
				break;
			case 8:
				{
				setState(175); match(T__27);
				setState(176); match(IDENTIFIER);
				setState(177); match(T__14);
				setState(178); match(T__0);
				}
				break;
			case 9:
				{
				setState(179); match(T__14);
				setState(180); expression(0);
				setState(181); match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(186); match(OPERATOR);
						setState(187); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(189); match(T__7);
						setState(190); expression(0);
						setState(191); match(T__5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(194); match(T__10);
						setState(195); match(T__28);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(197); match(T__10);
						setState(198); match(IDENTIFIER);
						setState(199); match(T__14);
						setState(208);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__26) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__3) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
							{
							setState(200); expression(0);
							setState(205);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(201); match(T__12);
								setState(202); expression(0);
								}
								}
								setState(207);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(210); match(T__0);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\3\6\3\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b"+
		"\3\t\3\t\3\t\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ce"+
		"\n\13\f\13\16\13\u00d1\13\13\5\13\u00d3\n\13\3\13\7\13\u00d6\n\13\f\13"+
		"\16\13\u00d9\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\2\u00ef\2\26"+
		"\3\2\2\2\4\37\3\2\2\2\6\61\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\fj\3\2\2\2\16"+
		"l\3\2\2\2\20u\3\2\2\2\22\u00a1\3\2\2\2\24\u00b9\3\2\2\2\26\32\5\4\3\2"+
		"\27\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\b\2\2 !"+
		"\7\"\2\2!\"\7\f\2\2\"#\7\34\2\2#$\7\36\2\2$%\7\13\2\2%&\7\3\2\2&\'\7\22"+
		"\2\2\'(\7\32\2\2()\7\31\2\2)*\7\33\2\2*+\7\"\2\2+,\7 \2\2,-\7\f\2\2-."+
		"\5\22\n\2./\7\17\2\2/\60\7\17\2\2\60\5\3\2\2\2\61\62\7\b\2\2\62\65\7\""+
		"\2\2\63\64\7\16\2\2\64\66\7\"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3"+
		"\2\2\2\67;\7\f\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<"+
		"A\3\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"BD\3\2\2\2CA\3\2\2\2DE\7\17\2\2E\7\3\2\2\2FG\5\f\7\2GH\7\"\2\2HI\7\n\2"+
		"\2I\t\3\2\2\2JK\7\34\2\2KL\5\f\7\2LM\7\"\2\2MO\7\22\2\2NP\5\16\b\2ON\3"+
		"\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7 \2\2RV\7\f\2\2SU\5\b\5\2TS\3\2\2\2UX\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2W\\\3\2\2\2XV\3\2\2\2Y[\5\22\n\2ZY\3\2\2\2["+
		"^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\7\2\2`a\5\24"+
		"\13\2ab\7\n\2\2bc\7\17\2\2c\13\3\2\2\2de\7\21\2\2ef\7\31\2\2fk\7\33\2"+
		"\2gk\7\27\2\2hk\7\21\2\2ik\7\"\2\2jd\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2"+
		"\2\2k\r\3\2\2\2lm\5\f\7\2mr\7\"\2\2no\7\24\2\2oq\5\20\t\2pn\3\2\2\2qt"+
		"\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tr\3\2\2\2uv\5\f\7\2vw\7\"\2\2"+
		"w\21\3\2\2\2x|\7\f\2\2y{\5\22\n\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\177\3\2\2\2~|\3\2\2\2\177\u00a2\7\17\2\2\u0080\u0081\7\20\2\2\u0081"+
		"\u0082\7\22\2\2\u0082\u0083\5\24\13\2\u0083\u0084\7 \2\2\u0084\u0085\5"+
		"\22\n\2\u0085\u0086\7\37\2\2\u0086\u0087\5\22\n\2\u0087\u00a2\3\2\2\2"+
		"\u0088\u0089\7\t\2\2\u0089\u008a\7\22\2\2\u008a\u008b\5\24\13\2\u008b"+
		"\u008c\7 \2\2\u008c\u008d\5\22\n\2\u008d\u00a2\3\2\2\2\u008e\u008f\7\30"+
		"\2\2\u008f\u0090\7\22\2\2\u0090\u0091\5\24\13\2\u0091\u0092\7 \2\2\u0092"+
		"\u0093\7\n\2\2\u0093\u00a2\3\2\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7\r"+
		"\2\2\u0096\u0097\5\24\13\2\u0097\u0098\7\n\2\2\u0098\u00a2\3\2\2\2\u0099"+
		"\u009a\7\"\2\2\u009a\u009b\7\31\2\2\u009b\u009c\5\24\13\2\u009c\u009d"+
		"\7\33\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\7\n\2"+
		"\2\u00a0\u00a2\3\2\2\2\u00a1x\3\2\2\2\u00a1\u0080\3\2\2\2\u00a1\u0088"+
		"\3\2\2\2\u00a1\u008e\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0099\3\2\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a4\b\13\1\2\u00a4\u00a5\7\35\2\2\u00a5\u00ba\5\24"+
		"\13\4\u00a6\u00ba\7#\2\2\u00a7\u00ba\7\6\2\2\u00a8\u00ba\7\25\2\2\u00a9"+
		"\u00ba\7\"\2\2\u00aa\u00ba\7\23\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\7"+
		"\21\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\7\33\2"+
		"\2\u00b0\u00ba\3\2\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4"+
		"\7\22\2\2\u00b4\u00ba\7 \2\2\u00b5\u00b6\7\22\2\2\u00b6\u00b7\5\24\13"+
		"\2\u00b7\u00b8\7 \2\2\u00b8\u00ba\3\2\2\2\u00b9\u00a3\3\2\2\2\u00b9\u00a6"+
		"\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00a9\3\2\2\2\u00b9"+
		"\u00aa\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2"+
		"\2\2\u00ba\u00d7\3\2\2\2\u00bb\u00bc\f\17\2\2\u00bc\u00bd\7!\2\2\u00bd"+
		"\u00d6\5\24\13\20\u00be\u00bf\f\16\2\2\u00bf\u00c0\7\31\2\2\u00c0\u00c1"+
		"\5\24\13\2\u00c1\u00c2\7\33\2\2\u00c2\u00d6\3\2\2\2\u00c3\u00c4\f\r\2"+
		"\2\u00c4\u00c5\7\26\2\2\u00c5\u00d6\7\4\2\2\u00c6\u00c7\f\f\2\2\u00c7"+
		"\u00c8\7\26\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00d2\7\22\2\2\u00ca\u00cf\5"+
		"\24\13\2\u00cb\u00cc\7\24\2\2\u00cc\u00ce\5\24\13\2\u00cd\u00cb\3\2\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\7 \2\2\u00d5\u00bb\3\2\2\2\u00d5\u00be\3\2"+
		"\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\25\3\2\2\2\u00d9\u00d7\3\2\2"+
		"\2\22\32\65;AOV\\jr|\u00a1\u00b9\u00cf\u00d2\u00d5\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}