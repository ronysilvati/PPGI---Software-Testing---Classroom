package br.ufal.ic.testingtools.stack.exercise6;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(ExceptionTest.class)
@SuiteClasses({StackTestExercise6.class})
public class SuiteExceptionTest {
	//@Test public void testPeekNull() {};
}
