package Java;

import Java.AST.FunctionDeclaration;
import Java.AST.Parse;
import Java.AST.create.generalcreating;
//import Java.AST.visitor_java.visite_general_creating;
import Java.Base.BaseVisitor;
import generated.SQLBaseListener;
import generated.SQLLexer;
import generated.SQLParser;
import netscape.javascript.JSObject;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.omg.CORBA.OBJ_ADAPTER;
import org.*;

//import javax.json.*;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
// D:\Compiler 2 one testing\Compiler 2 one\samples\samples.txt
            // String source = "samples//samples.txt";
            //D:\compiler version seconde semester\Compiler for the seconde semester\Compiler 2 one\samples\samples.txt
            String source="D://compiler version seconde semester//Compiler for the seconde semester//Compiler 2 one//samples//samples.txt";
            CharStream cs = fromFileName(source);
            SQLLexer lexer = new SQLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(token);
            ParseTree tree = parser.parse();
            Parse p = (Parse) new BaseVisitor().visit(tree);
            p.accept(new Java.Visitor.BaseAst_Visitor());
// D:\Compiler 2 one\testing files\Teacher Samples .txt

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
