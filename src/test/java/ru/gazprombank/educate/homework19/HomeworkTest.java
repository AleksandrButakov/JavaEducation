package ru.gazprombank.educate.homework19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTest {

    private TestMethod calculateLongestStreakMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework19.Homework");
        calculateLongestStreakMethod = AssertUtils.getMethod(testClass,
                "longestStreak",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: 'hoopla'; answer = 2")
    @Test
    void test1() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("hoopla");
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("str: 'abbCCCddBBBxx'; answer = 3")
    @Test
    void test2() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("abbCCCddBBBxx");
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("str: ''; answer = 0")
    @Test
    void test3() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("");
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("str: 'xyz'; answer = 0")
    @Test
    void test4() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("xyz");
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("str: 'xxyz'; answer = 2")
    @Test
    void test5() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("xxyz");
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("str: 'xyzz'; answer = 2")
    @Test
    void test6() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("xyzz");
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("str: 'abbbcbbbxbbbx'; answer = 3")
    @Test
    void test7() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("abbbcbbbxbbbx");
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("str: 'XXBBBbbxx'; answer = 3")
    @Test
    void test8() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("XXBBBbbxx");
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("str: 'XXBBBBbbxx'; answer = 4")
    @Test
    void test9() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("XXBBBBbbxx");
        assertEquals(4, fine, "Expected string: 4 actual " + fine);
    }

    @DisplayName("str: 'XXBBBbbxxXXXX'; answer = 4")
    @Test
    void test10() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("XXBBBbbxxXXXX");
        assertEquals(4, fine, "Expected string: 4 actual " + fine);
    }

    @DisplayName("str: 'XX2222BBBbbXX2222'; answer = 2")
    @Test
    void test11() {
        int fine = calculateLongestStreakMethod.invokeStaticMethod("XX2222BBBbbXX2222");
        assertEquals(4, fine, "Expected string: 4 actual " + fine);
    }
}
