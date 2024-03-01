package addition;

import java.util.ArrayList;

public class AdditionHandler {
    public record Input(int numOfOperands, ArrayList<Integer> operandDigits, String type) {}

    public record Output(ArrayList<Object> problems) {}

    public Output getAdditionProblems(Input input) {

        ArrayList<Object> problems = new ArrayList<>();
        // implement logic to generate addition problem set

        return new Output(problems);
    }
}
