package streamsjava9.ch03_functionalinterfaces;

import streamsjava9.Employee;

import java.util.function.Function;

public class ComposingFunction {

    Function<Employee, String> getName = Employee::getName;
    Function<String, Character> firstLetter = name -> name.charAt(0);

    Function<Employee, Character> initial = getName.andThen(firstLetter);
    Function<Employee, Character> initial2 = firstLetter.compose(getName);

}
