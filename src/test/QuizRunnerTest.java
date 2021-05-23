package test;
import main.Question;
import main.QuizRunner;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuizRunnerTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        Question a = new Question();
        a.setQuestionType("2");
        assertEquals("Checkbox",a.getQuestionType());
    }

    @Test
    public void returnFalseIfLengthGreaterthan80() {
        assertFalse(QuizRunner.validShortAnswer("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void returnTrueIfLengthLessthan80() {
        assertTrue(QuizRunner.validShortAnswer("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void returnFalseIfLengthGreaterthan500() {
        assertFalse(QuizRunner.validParagraph("Let’s examine an inheritance relationship between two classes, Cat and HouseCat. HouseCat is a class that inherits from Cat. When defined, HouseCat thus receives the data and behaviors of Cat. These inherited traits are things like fields, properties, and methods. Any fields and non-constructor methods in Cat are be available to each instance of HouseCat.When we speak about an inheritance relationship, we say that a HouseCat is a Cat, or extends Cat. Indeed, in order to define a class that inherits from another, we use the extends keyword. We say that HouseCat is a subclass, derived class, or child class of Cat, and we say that Cat is the superclass, base class, or parent class of HouseCat. In Java, a class may extend only one class. Classes may extend each other in turn, however. This creates hierarchies of classes. We often visualize these by drawing each class as a box, with an arrow pointing from the subclass to the base class. The shaded portion of these boxes can include additional information about each class. We’ll learn about what we might put here in a little bit. Inheritance is an essential mechanism for sharing data and behavior between related classes. Using it effectively creates organized code with groups of classes that have increasingly specialized behavior. When this happens, we can visualize the inheritance structure with a slightly more complex diagram. Inheritance tree with many nodes. You can see that classes B, C, and D all extend class A. And class E extends class D which itself extends class A. So class E involves an even greater specialization of behavior than class D. Fields and non-constructor methods are directly available to instances of the subclass, subject to any access modifiers. In general, this means that private and package-private members of a base class are not accessible to a subclass. The exception to this is that package-private members are accessible to subclasses within the same package."));
    }

    @Test
    public void returnTrueIfLengthLessthan500() {
        assertTrue(QuizRunner.validParagraph("abcdefghijklmnopqrstuvwxyz"));
    }
}
