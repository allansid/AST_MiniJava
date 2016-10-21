package ala6_dwsb;

import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDecl;
import ast.ClassDeclExtends;
import ast.ClassDeclList;
import ast.ClassDeclSimple;
import ast.Exp;
import ast.ExpList;
import ast.False;
import ast.Formal;
import ast.FormalList;
import ast.Identifier;
import ast.IdentifierExp;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.MethodDeclList;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.Statement;
import ast.StatementList;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.VarDeclList;
import ast.While;

import java.util.List;

// para utilizar as classes equivalentes _Context
import org.antlr.v4.runtime.tree.TerminalNode;
import ala6_dwsb.antlr4.ala6_dwsbParser.ClassDeclarationContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.ExpressionContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.FormalContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.FormalListContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.GoalContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.MainClassContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.MethodDeclarationContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.StatementContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.TypeContext;
import ala6_dwsb.antlr4.ala6_dwsbParser.VarDeclarationContext;

public class buildAST {

	MainClass mainClass;
	ClassDeclList classDeclList;

	// get + set + constructor
	public buildAST() {
		// super();
		mainClass = new MainClass(null, null, null);
	}

	public MainClass getMainClass() {
		return mainClass;
	}

	public void setMainClass(MainClass mainClass) {
		this.mainClass = mainClass;
	}

	public ClassDeclList getClassDeclList() {
		return classDeclList;
	}

	public void setClassDeclList(ClassDeclList classDeclList) {
		this.classDeclList = classDeclList;
	}

	/*
	 * Instanciar para as classes da AST Para cada "tipo" visitado, retornar um
	 * objeto instanciado a classe equivalente a ele (Context)
	 */

	public Program visitGoal(GoalContext goal) {
		Program aux;
		mainClass = visitMainClass(goal.mainClass());
		classDeclList = visitClassDeclList(goal.classDeclaration());
		aux = new Program(mainClass, classDeclList);
		return aux;
	}

	private MainClass visitMainClass(MainClassContext mainClass2) {
		MainClass aux;
		Identifier identifier1 = this.visitIdentifier(mainClass2.IDENTIFIER(0));
		Identifier identifier2 = this.visitIdentifier(mainClass2.IDENTIFIER(1));
		Statement statement = this.visitStatement(mainClass2.statement());
		aux = new MainClass(identifier1, identifier2, statement);
		return aux;
	}

	private Statement visitStatement(StatementContext statement) {
		if (statement.isEmpty()) {
			return null;
		} else if (statement.getChild(0).getText().equals("{")) {
			return this.visitBlock(statement.statement());
		} else if (statement.getChild(0).getText().equals("if")) {
			return new If(this.visitExpression(statement.expression(0)), this.visitStatement(statement.statement(0)),
					this.visitStatement(statement.statement(1)));
		} else if (statement.getChild(0).getText().equals("while")) {
			return new While(this.visitExpression(statement.expression(0)),
					this.visitStatement(statement.statement(0)));
		} else if (statement.getChild(0).getText().equals("System.out.println")) {
			return new Print(this.visitExpression(statement.expression(0)));
		} else if (statement.getChild(1).getText().equals("=")) {
			return this.visitAssign(statement.IDENTIFIER(), statement.expression(0));
		} else {
			return this.visitArrayAssign(statement.IDENTIFIER(), statement.expression(0), statement.expression(1));
		}
	}

	private Statement visitArrayAssign(TerminalNode identifier, ExpressionContext expression,
			ExpressionContext expression2) {
		return new ArrayAssign(this.visitIdentifier(identifier), this.visitExpression(expression),
				this.visitExpression(expression2));
	}

	private Statement visitAssign(TerminalNode identifier, ExpressionContext expression) {
		return new ArrayAssign(this.visitIdentifier(identifier), this.visitExpression(expression),
				this.visitExpression(expression));
	}

	private Statement visitBlock(List<StatementContext> statement) {
		return new Block(this.visitStatementList(statement));
	}

	private StatementList visitStatementList(List<StatementContext> statement) {
		StatementList aux = new StatementList();
		for (StatementContext stctx : statement) {
			aux.addElement(this.visitStatement(stctx));
		}
		return aux;
	}

	private Exp visitExpression(ExpressionContext expression) {
		Exp aux = null;
		TerminalNode oper = expression.OPERATOR();
		TerminalNode id = expression.IDENTIFIER();

		TerminalNode no = expression.INTEGER_LITERAL();
		if (oper != null) {
			Exp expre1 = this.visitExpression(expression.expression().get(0));
			Exp expre2 = this.visitExpression(expression.expression().get(1));
			if (oper.equals("<")) {
				aux = new LessThan(expre1, expre2);
			} else if (oper.equals("&&")) {
				aux = new And(expre1, expre2);
			} else if (oper.equals("-")) {
				aux = new Minus(expre1, expre2);
			} else if (oper.equals("*")) {
				aux = new Times(expre1, expre2);
			} else if (oper.equals("+")) {
				aux = new Plus(expre1, expre2);
			}
		} else if (expression.expression().size() >= 1 && id != null) {
			aux = new Call(this.visitExpression(expression.expression().get(0)), new Identifier(id.getText()),
					this.visitExpList(expression.expression().subList(1, expression.expression().size())));
		} else if (expression.getText().equals("this")) {
			aux = new This();
		} else if (expression.getText().equals("true")) {
			aux = new True();
		} else if (expression.getText().equals("false")) {
			aux = new False();
		} else if (expression.expression().size() == 2) {
			aux = new ArrayLookup(this.visitExpression(expression.expression().get(0)),
					this.visitExpression(expression.expression().get(1)));
		} else if (expression.expression().size() == 1 && expression.getText().equals("new")) {
			aux = new ArrayLength(this.visitExpression(expression.expression().get(0)));
		} else if (no != null) {
			aux = new IntegerLiteral(Integer.parseInt(no.getText()));
		} else if (id != null && !expression.getText().equals("new")) {
			aux = new IdentifierExp(id.getText());
		} else if (expression.getText().equals("new")) {
			if (expression.expression().size() == 1) {
				aux = new NewArray(this.visitExpression(expression.expression().get(0)));
			} else {
				aux = new NewObject(new Identifier(id.getText()));
			}
		} else if (expression.getText().equals("!")) {
			aux = new Not(this.visitExpression(expression.expression().get(0)));
		} else {
			aux = this.visitExpression(expression.expression().get(0));
		}
		return aux;
	}

	private ExpList visitExpList(List<ExpressionContext> subList) {
		ExpList expL = new ExpList();
		for (int i = 0; i < subList.size(); i++) {
			expL.addElement(this.visitExpression(subList.get(i)));
		}
		return expL;
	}

	private ClassDeclList visitClassDeclList(List<ClassDeclarationContext> classDeclaration) {
		ClassDeclList classDecList = new ClassDeclList();
		for (ClassDeclarationContext c : classDeclaration) {
			if (c.IDENTIFIER().size() > 1)
				classDecList.addElement(this.visitClassDeclExtends(c));
			else {
				classDecList.addElement(this.visitClassDecl(c));
			}
		}
		return classDecList;
	}

	private ClassDecl visitClassDecl(ClassDeclarationContext c) {
		ClassDeclSimple aux;
		Identifier identifier = this.visitIdentifier(c.IDENTIFIER(0));
		VarDeclList varList = this.visitVarDeclList(c.varDeclaration());
		MethodDeclList method = this.visitMethodDeclList(c.methodDeclaration());
		aux = new ClassDeclSimple(identifier, varList, method);
		return aux;
	}

	private MethodDeclList visitMethodDeclList(List<MethodDeclarationContext> methodDeclaration) {
		MethodDeclList method = new MethodDeclList();
		for (MethodDeclarationContext m : methodDeclaration) {
			method.addElement(this.visitMethodDecl(m));
		}
		return method;
	}

	private MethodDecl visitMethodDecl(MethodDeclarationContext m) {
		MethodDecl aux;
		Type type = this.visitType(m.type());
		Identifier identifier = this.visitIdentifier(m.IDENTIFIER());
		FormalList formal =  null; //= this.visitFormalList(m.formalList());
		VarDeclList vdl = this.visitVarDeclList(m.varDeclaration());
		StatementList statement = this.visitStatementList(m.statement());
		Exp exp = this.visitExpression(m.expression());
		aux = new MethodDecl(type, identifier, formal, vdl, statement, exp);
		return aux;
	}

	private Formal visitFormal(FormalContext ctx) {
		Identifier identifier = this.visitIdentifier(ctx.IDENTIFIER());
		Type type = this.visitType(ctx.type());
		return new Formal(type, identifier);
	}

	private FormalList visitFormalList(FormalListContext flc) {
		Type type = this.visitType(flc.type());
		FormalList formal = new FormalList();
		Identifier identifier = this.visitIdentifier(flc.IDENTIFIER());
		formal.addElement(new Formal(type, identifier));
		for (FormalContext ctx : flc.formal()) {
			formal.addElement(this.visitFormal(ctx));
		}
		return formal;
	}

	private Identifier visitIdentifier(TerminalNode identifier) {
		String id = identifier.toString();
		Identifier aux = new Identifier(id);
		return aux;
	}

	private Type visitType(TypeContext type) {
		Type aux = null;
		if (type.getText().equals("int[]") || type.getText().equals("int []")) {
			aux = new IntArrayType();
		} else if (type.getText().equals("int")) {
			aux = new IntegerType();
		} else if (type.getText().equals("boolean")) {
			aux = new BooleanType();
		}
		// Diogo, vê se não precisa adc o Identifier aqui, por favor.
		return aux;
	}

	private VarDeclList visitVarDeclList(List<VarDeclarationContext> varDeclaration) {
		VarDeclList vdl = new VarDeclList();
		for (VarDeclarationContext ctx : varDeclaration) {
			vdl.addElement(this.visitVarDecl(ctx));
		}
		return vdl;
	}

	private VarDecl visitVarDecl(VarDeclarationContext ctx) {
		return new VarDecl(this.visitType(ctx.type()), this.visitIdentifier(ctx.IDENTIFIER()));
	}

	private ClassDecl visitClassDeclExtends(ClassDeclarationContext c) {
		ClassDeclExtends aux;
		Identifier identifier1 = this.visitIdentifier(c.IDENTIFIER(0));
		Identifier identifier2 = this.visitIdentifier(c.IDENTIFIER(1));
		VarDeclList varList = this.visitVarDeclList(c.varDeclaration());
		MethodDeclList method = this.visitMethodDeclList(c.methodDeclaration());
		aux = new ClassDeclExtends(identifier1, identifier2, varList, method);
		return aux;
	}

}
// VarDeclList , MethodDeclList tem o mesmo formato, da p colocar em uma função
// só?