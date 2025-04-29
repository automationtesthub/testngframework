package JunitExamples;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AnnotationsExample.class,AssertionExamples.class})
public class TestRunner {
}
