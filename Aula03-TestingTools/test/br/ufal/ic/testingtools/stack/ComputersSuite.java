package br.ufal.ic.testingtools.stack;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({DesktopTests.class, MainFrameTests.class})
@SuiteClasses({StackTest.class, ComputersTest.class})

public class ComputersSuite { }
