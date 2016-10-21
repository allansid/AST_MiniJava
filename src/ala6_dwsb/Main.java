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
		FileInputStream stream = new FileInputStream("prog.txt");
        ANTLRInputStream input = new ANTLRInputStream(stream);
        ala6_dwsbLexer lexer = new ala6_dwsbLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        ala6_dwsbParser parser = new ala6_dwsbParser(tokens);
        //ParseTree tree = parser.goal();
        
        buildAST builder = new buildAST();
        
        
        Program prog = builder.visitGoal(parser.goal());;
        PrettyPrintVisitor ptv = new PrettyPrintVisitor();
        prog.accept(ptv);
	}
}