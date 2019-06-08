
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Poem1", (a) -> "ABC" + a + "abc");
        poemBeautifier.beautify("Poem2", (a) -> a.toUpperCase());
        poemBeautifier.beautify("Poem3", String::toLowerCase);
        poemBeautifier.beautify("Poem4", (a)-> a.substring(2,a.length()-2));
        poemBeautifier.beautify("Poem5", (a)-> a.replace("m","s"));
    }

}
