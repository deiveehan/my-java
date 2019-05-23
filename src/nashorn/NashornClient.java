package nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashornClient {
    public static void main(String[] args) throws ScriptException, FileNotFoundException {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("nashorn");
        engine.eval("print('hello dear')");

        engine.eval(new FileReader("/Users/deiveehannallazhagappan/workspace/xplore-java/supporting/js/demo.js"));
    }
}
