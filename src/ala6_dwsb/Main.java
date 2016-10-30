package ala6_dwsb;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ala6_dwsb.antlr4.ala6_dwsbLexer;
import ala6_dwsb.antlr4.ala6_dwsbParser;
import ast.*;
import visitor.*;

public class Main {
	public static void main(String[] args) throws IOException{
		boolean pt1 = true, pt2 = false;
		
		String inputString[] = {
				"BinarySearch.java",		
				"BinaryTree.java",
				"BubbleSort.java",
				"Factorial.java",
				"LinearSearch.java",
				"LinkedList.java",
				"QuickSort.java",
				"auxBinarySearch.txt",	/*No comments*/
				"auxBubbleSort.txt"	/*No comments*/
		};

		FileInputStream stream = new FileInputStream("input/" + inputString[7]);
		ANTLRInputStream input = new ANTLRInputStream(stream);
		ala6_dwsbLexer lexer = new ala6_dwsbLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ala6_dwsbParser parser = new ala6_dwsbParser(tokens);
		buildAST builder = new buildAST();	
		Program prog = builder.visitGoal(parser.goal());;
		if (pt1) {	// Parte 1, ASTs MiniJava
			System.out.println("ASTs MiniJava" + "\n");
			prog.accept(new PrettyPrintVisitor());
			
		} 
		System.out.println();
		if (pt2) {	// Parte 2, Type-Checking MiniJava
			System.out.println("Type-Checking MiniJava" + "\n");
			BuildSymbolTableVisitor bstv = new BuildSymbolTableVisitor();
			prog.accept(bstv);
			TypeCheckVisitor tcv = new TypeCheckVisitor(bstv.getSymbolTable());
			prog.accept(tcv);
		}
	}
}