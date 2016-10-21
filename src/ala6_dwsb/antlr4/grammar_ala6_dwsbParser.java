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
		RULE_methodDeclaration = 4, RULE_formalList = 5, RULE_formal = 6, RULE_type = 7, 
		RULE_statement = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"formalList", "formal", "type", "statement", "expression"
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
			setState(71); match(T__4);
			setState(72); type();
			setState(73); match(IDENTIFIER);
			setState(74); match(T__14);
			setState(76);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(75); formalList();
				}
			}

			setState(78); match(T__0);
			setState(79); match(T__20);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80); varDeclaration();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(86); statement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); match(T__25);
			setState(93); expression(0);
			setState(94); match(T__22);
			setState(95); match(T__17);
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
		enterRule(_localctx, 10, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); type();
			setState(98); match(IDENTIFIER);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(99); match(T__12);
				setState(100); formal();
				}
				}
				setState(105);
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
		enterRule(_localctx, 12, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); type();
			setState(107); match(IDENTIFIER);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(T__15);
				setState(110); match(T__7);
				setState(111); match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); match(IDENTIFIER);
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
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(T__20);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(118); statement();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124); match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(T__16);
				setState(126); match(T__14);
				setState(127); expression(0);
				setState(128); match(T__0);
				setState(129); statement();
				setState(130); match(T__1);
				setState(131); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133); match(T__23);
				setState(134); match(T__14);
				setState(135); expression(0);
				setState(136); match(T__0);
				setState(137); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); match(T__8);
				setState(140); match(T__14);
				setState(141); expression(0);
				setState(142); match(T__0);
				setState(143); match(T__22);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145); match(IDENTIFIER);
				setState(146); match(T__19);
				setState(147); expression(0);
				setState(148); match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150); match(IDENTIFIER);
				setState(151); match(T__7);
				setState(152); expression(0);
				setState(153); match(T__5);
				setState(154); match(T__19);
				setState(155); expression(0);
				setState(156); match(T__22);
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
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(161); match(T__3);
				setState(162); expression(2);
				}
				break;
			case 2:
				{
				setState(163); match(INTEGER_LITERAL);
				}
				break;
			case 3:
				{
				setState(164); match(T__26);
				}
				break;
			case 4:
				{
				setState(165); match(T__11);
				}
				break;
			case 5:
				{
				setState(166); match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(167); match(T__13);
				}
				break;
			case 7:
				{
				setState(168); match(T__27);
				setState(169); match(T__15);
				setState(170); match(T__7);
				setState(171); expression(0);
				setState(172); match(T__5);
				}
				break;
			case 8:
				{
				setState(174); match(T__27);
				setState(175); match(IDENTIFIER);
				setState(176); match(T__14);
				setState(177); match(T__0);
				}
				break;
			case 9:
				{
				setState(178); match(T__14);
				setState(179); expression(0);
				setState(180); match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(185); match(OPERATOR);
						setState(186); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(188); match(T__7);
						setState(189); expression(0);
						setState(190); match(T__5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(193); match(T__10);
						setState(194); match(T__28);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(196); match(T__10);
						setState(197); match(IDENTIFIER);
						setState(198); match(T__14);
						setState(207);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__26) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__3) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
							{
							setState(199); expression(0);
							setState(204);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(200); match(T__12);
								setState(201); expression(0);
								}
								}
								setState(206);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(209); match(T__0);
						}
						break;
					}
					} 
				}
				setState(214);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\7\6T\n\6\f"+
		"\6\16\6W\13\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tv\n\t\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cd\n\13"+
		"\f\13\16\13\u00d0\13\13\5\13\u00d2\n\13\3\13\7\13\u00d5\n\13\f\13\16\13"+
		"\u00d8\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\2\u00ee\2\26\3\2"+
		"\2\2\4\37\3\2\2\2\6\61\3\2\2\2\bF\3\2\2\2\nI\3\2\2\2\fc\3\2\2\2\16l\3"+
		"\2\2\2\20u\3\2\2\2\22\u00a0\3\2\2\2\24\u00b8\3\2\2\2\26\32\5\4\3\2\27"+
		"\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\35\3\2\2\2\34\32\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\b\2\2 !\7\""+
		"\2\2!\"\7\f\2\2\"#\7\34\2\2#$\7\36\2\2$%\7\13\2\2%&\7\3\2\2&\'\7\22\2"+
		"\2\'(\7\32\2\2()\7\31\2\2)*\7\33\2\2*+\7\"\2\2+,\7 \2\2,-\7\f\2\2-.\5"+
		"\22\n\2./\7\17\2\2/\60\7\17\2\2\60\5\3\2\2\2\61\62\7\b\2\2\62\65\7\"\2"+
		"\2\63\64\7\16\2\2\64\66\7\"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2"+
		"\2\2\67;\7\f\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3"+
		"\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3"+
		"\2\2\2CA\3\2\2\2DE\7\17\2\2E\7\3\2\2\2FG\5\20\t\2GH\7\"\2\2H\t\3\2\2\2"+
		"IJ\7\34\2\2JK\5\20\t\2KL\7\"\2\2LN\7\22\2\2MO\5\f\7\2NM\3\2\2\2NO\3\2"+
		"\2\2OP\3\2\2\2PQ\7 \2\2QU\7\f\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2V[\3\2\2\2WU\3\2\2\2XZ\5\22\n\2YX\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\7\2\2_`\5\24\13\2`a\7\n\2\2"+
		"ab\7\17\2\2b\13\3\2\2\2cd\5\20\t\2di\7\"\2\2ef\7\24\2\2fh\5\16\b\2ge\3"+
		"\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2lm\5\20\t\2m"+
		"n\7\"\2\2n\17\3\2\2\2op\7\21\2\2pq\7\31\2\2qv\7\33\2\2rv\7\27\2\2sv\7"+
		"\21\2\2tv\7\"\2\2uo\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\21\3\2\2\2"+
		"w{\7\f\2\2xz\5\22\n\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2"+
		"\2}{\3\2\2\2~\u00a1\7\17\2\2\177\u0080\7\20\2\2\u0080\u0081\7\22\2\2\u0081"+
		"\u0082\5\24\13\2\u0082\u0083\7 \2\2\u0083\u0084\5\22\n\2\u0084\u0085\7"+
		"\37\2\2\u0085\u0086\5\22\n\2\u0086\u00a1\3\2\2\2\u0087\u0088\7\t\2\2\u0088"+
		"\u0089\7\22\2\2\u0089\u008a\5\24\13\2\u008a\u008b\7 \2\2\u008b\u008c\5"+
		"\22\n\2\u008c\u00a1\3\2\2\2\u008d\u008e\7\30\2\2\u008e\u008f\7\22\2\2"+
		"\u008f\u0090\5\24\13\2\u0090\u0091\7 \2\2\u0091\u0092\7\n\2\2\u0092\u00a1"+
		"\3\2\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7\r\2\2\u0095\u0096\5\24\13\2"+
		"\u0096\u0097\7\n\2\2\u0097\u00a1\3\2\2\2\u0098\u0099\7\"\2\2\u0099\u009a"+
		"\7\31\2\2\u009a\u009b\5\24\13\2\u009b\u009c\7\33\2\2\u009c\u009d\7\r\2"+
		"\2\u009d\u009e\5\24\13\2\u009e\u009f\7\n\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"w\3\2\2\2\u00a0\177\3\2\2\2\u00a0\u0087\3\2\2\2\u00a0\u008d\3\2\2\2\u00a0"+
		"\u0093\3\2\2\2\u00a0\u0098\3\2\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\b\13\1"+
		"\2\u00a3\u00a4\7\35\2\2\u00a4\u00b9\5\24\13\4\u00a5\u00b9\7#\2\2\u00a6"+
		"\u00b9\7\6\2\2\u00a7\u00b9\7\25\2\2\u00a8\u00b9\7\"\2\2\u00a9\u00b9\7"+
		"\23\2\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad\7\31\2\2"+
		"\u00ad\u00ae\5\24\13\2\u00ae\u00af\7\33\2\2\u00af\u00b9\3\2\2\2\u00b0"+
		"\u00b1\7\5\2\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\7\22\2\2\u00b3\u00b9\7"+
		" \2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7 \2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00a2\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00a6\3\2"+
		"\2\2\u00b8\u00a7\3\2\2\2\u00b8\u00a8\3\2\2\2\u00b8\u00a9\3\2\2\2\u00b8"+
		"\u00aa\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00d6\3\2"+
		"\2\2\u00ba\u00bb\f\17\2\2\u00bb\u00bc\7!\2\2\u00bc\u00d5\5\24\13\20\u00bd"+
		"\u00be\f\16\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\5\24\13\2\u00c0\u00c1"+
		"\7\33\2\2\u00c1\u00d5\3\2\2\2\u00c2\u00c3\f\r\2\2\u00c3\u00c4\7\26\2\2"+
		"\u00c4\u00d5\7\4\2\2\u00c5\u00c6\f\f\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8"+
		"\7\"\2\2\u00c8\u00d1\7\22\2\2\u00c9\u00ce\5\24\13\2\u00ca\u00cb\7\24\2"+
		"\2\u00cb\u00cd\5\24\13\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\7 \2\2\u00d4\u00ba\3\2\2\2\u00d4\u00bd\3\2\2\2\u00d4\u00c2\3\2"+
		"\2\2\u00d4\u00c5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d6\3\2\2\2\22\32\65;ANU[iu{\u00a0"+
		"\u00b8\u00ce\u00d1\u00d4\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}