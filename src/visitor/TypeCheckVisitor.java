package visitor;

import symboltable.Class;
import symboltable.Method;
import symboltable.SymbolTable;
import symboltable.Variable;
import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDeclExtends;
import ast.ClassDeclSimple;
import ast.False;
import ast.Formal;
import ast.Identifier;
import ast.IdentifierExp;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.While;

public class TypeCheckVisitor implements TypeVisitor {

	private SymbolTable symbolTable;

	private Class currClass;
	private Method currMethod;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}
	
	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	public void setSymbolTable(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	public Class getCurrClass() {
		return currClass;
	}

	public void setCurrClass(Class currClass) {
		this.currClass = currClass;
	}

	public Method getCurrMethod() {
		return currMethod;
	}

	public void setCurrMethod(Method currMethod) {
		this.currMethod = currMethod;
	}
	


	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		
		for (int x = 0; x < n.cl.size(); x++)	n.cl.elementAt(x).accept(this);
		
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		currClass = symbolTable.getClass(n.i1.s);

		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);

		currClass = null;

		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		currClass = symbolTable.getClass(n.i.s);

		n.i.accept(this);
		
		for (int x = 0; x < n.vl.size(); x++)	n.vl.elementAt(x).accept(this);
		
		for (int x = 0; x < n.ml.size(); x++)	n.ml.elementAt(x).accept(this);

		currClass = null;

		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		currClass = symbolTable.getClass(n.i.s);

		n.i.accept(this);
		n.j.accept(this);
		
		for (int x = 0; x < n.vl.size(); x++)	n.vl.elementAt(x).accept(this);
		
		for (int x = 0; x < n.ml.size(); x++)	n.ml.elementAt(x).accept(this);

		currClass = null;

		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.t.accept(this);
		n.i.accept(this);
	
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		currMethod = currClass.getMethod(n.i.s);

		Type tType = n.t.accept(this);
		Type iType = n.i.accept(this);
		
		Type[] flType = new Type[n.fl.size()];
		for (int i = 0; i < n.fl.size(); i++)	flType[i] = n.fl.elementAt(i).accept(this);
		
		Type[] vlType = new Type[n.vl.size()];
		for (int i = 0; i < n.vl.size(); i++)	vlType[i] = n.vl.elementAt(i).accept(this);
		
		Type[] slType = new Type[n.sl.size()];
		for (int i = 0; i < n.sl.size(); i++)	slType[i] = n.sl.elementAt(i).accept(this);
		
		Type eType = n.e.accept(this);
		if (!(symbolTable.compareTypes(tType, eType))) {
			System.out.println(n.i.s + " possui retorno inválido");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		
		currMethod = null;

		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		
		return null;
	}

	public Type visit(IntArrayType n) {
		IntArrayType aux = new IntArrayType(); 
		return aux;
	}

	public Type visit(BooleanType n) {
		BooleanType aux = new BooleanType();
		return aux;
	}

	public Type visit(IntegerType n) {
		IntegerType aux = new IntegerType();
		return aux;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++)	n.sl.elementAt(i).accept(this);
		
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		Type eType = n.e.accept(this);
		Type s1Type = n.s1.accept(this);
		Type s2Type = n.s2.accept(this);
				
		if (!(eType instanceof BooleanType)) {
			System.out.println("If: " + n.e.toString() + " não é Boolean");
			n.accept(new PrettyPrintVisitor());
		}
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		Type eType = n.e.accept(this);
		Type sType = n.s.accept(this);
		
		if (!(eType instanceof BooleanType)) {
			System.out.println("While: " + n.e.toString() + " não é Boolean");
			n.accept(new PrettyPrintVisitor());
		}
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		Type eType = n.e.accept(this);
	
		if (!(eType instanceof Type)) {
			System.out.println(n.e.toString() + " não é de um tipo");
			n.accept(new PrettyPrintVisitor());
		}
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		Type iType = n.i.accept(this);
		Type eType = n.e.accept(this);
		
		if (!symbolTable.compareTypes(iType, eType)) {
			System.out.println(n.i.s + " e " + n.e.toString() + " são de tipos diferentes");
			n.accept(new PrettyPrintVisitor());
		}
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		Type iType = n.i.accept(this);
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if (!(e1Type instanceof IntegerType)) {
			System.out.println(n.e1.toString() + " não é Int");
			n.accept(new PrettyPrintVisitor());
		}
		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if (e1Type == null || e2Type == null)	return null;
		
		if (!(e1Type instanceof BooleanType)) {
			System.out.println(e1Type + " não é Boolean");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		if (!(e2Type instanceof BooleanType)) {
			System.out.println(e2Type + " não é Boolean");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if (e1Type == null || e2Type == null) return null;
		
		if (!(e1Type instanceof IntegerType)) {
			System.out.println("LessThan: " + e1Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		if (!(e2Type instanceof IntegerType)) {
			System.out.println("LessThan: " + e2Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if (e1Type == null || e2Type == null) return null;

		if (!(e1Type instanceof IntegerType)) {
			System.out.println("Plus: " + e1Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		if (!(e2Type instanceof IntegerType)) {
			System.out.println("Plus: " + e2Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if (e1Type == null || e2Type == null)	return null;
		
		if (!(e1Type instanceof IntegerType)) {
			System.out.println("Minus: " + e1Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		if (!(e2Type instanceof IntegerType)) {
			System.out.println("Minus: " + e2Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if (e1Type == null || e2Type == null)	return null;
		
		if (!(e1Type instanceof IntegerType)) {
			System.out.println("Times: " + e1Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		if (!(e2Type instanceof IntegerType)) {
			System.out.println("Times: " + e2Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if (e1Type == null || e2Type == null) return null;
		
		if (!(e1Type instanceof IntArrayType)) {
			System.out.println(e1Type + " não é Int[]");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		if (!(e2Type instanceof IntegerType)) {
			System.out.println(e2Type + " não é Int");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return new IntegerType();
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		Type eType = n.e.accept(this);
		
		if (eType == null)	return null;
		
		IntegerType aux = null;
		if (eType instanceof IntArrayType) {
			aux = new IntegerType();
		} else {
			System.out.println(eType + " não é Int[]");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return aux;
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		Type eType = n.e.accept(this);
		Type vt1 = null;
		if (eType instanceof IdentifierType) {
			if (symbolTable.containsClass(((IdentifierType) eType).s)) {
				Class objectClass = symbolTable.getClass(((IdentifierType) eType).s);
				if (objectClass.containsMethod(n.i.s)) {
					Class tempClass = currClass;
					this.currClass = objectClass;
					Method tempMethod = currMethod;
					currMethod = null;
					n.i.accept(this);
					this.currMethod = currClass.getMethod(n.i.s);
					vt1 = currClass.getMethod(n.i.s).type();
					this.currClass = tempClass;
					this.currMethod = tempMethod;
					for (int i = 0; i < n.el.size(); i++) {
						n.el.elementAt(i).accept(this);
					}
				} else {
					System.out.println("Nenhum metodo " + n.i.s + "encontrado na classe "
							+ ((IdentifierType) eType).s + ".");
				}
			} else {
				System.out.println("Nenhuma classe " + ((IdentifierType) eType).s + " encontrada.");
			}
		}
		return vt1;
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		IntegerType aux = new IntegerType();
		return aux;
	}

	public Type visit(True n) {
		BooleanType aux = new BooleanType();
		return aux;
	}

	public Type visit(False n) {
		BooleanType aux = new BooleanType();
		return aux;
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return symbolTable.getVarType(currMethod, currClass, n.s);
	}

	public Type visit(This n) {
		return currClass.type();
	}

	// Exp e;
	public Type visit(NewArray n) {
		Type eType = n.e.accept(this);

		if (eType == null)	return null;
		
		IntArrayType aux = null;
		if (eType instanceof IntegerType) {
			aux = new IntArrayType();
		} else {
			System.out.println(eType + " não é Int");
			n.accept(new PrettyPrintVisitor());
			System.out.println("");
			return null;
		}
		return aux;
	}

	// Identifier i;
	public Type visit(NewObject n) {
		Type iType = n.i.accept(this);
		
		if (iType == null)	return null;
		
		IdentifierType aux = null;
		if (symbolTable.containsClass(n.i.s)) {
			aux = new IdentifierType(n.i.s);
		} else {
			System.out.println(n.i.s + " não existe");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return aux;
	}

	// Exp e;
	public Type visit(Not n) {
		Type eType = n.e.accept(this);
		
		if (eType == null)	return null;
		
		BooleanType aux = null;
		if (eType instanceof BooleanType) {
			aux = new BooleanType();
		} else {
			System.out.println(eType + " não é Boolean");
			n.accept(new PrettyPrintVisitor());
			return null;
		}
		return aux;
	}

	// String s;
	public Type visit(Identifier n) {
		return symbolTable.getVarType(currMethod, currClass, n.s);
	}
}