package ga.geneticOperators;

import ga.Individual;

public class RecombinationUniform<I extends Individual> extends Recombination<I> {

    public RecombinationUniform(double probability) {
        super(probability);
    }

    public void run(Individual ind1, Individual ind2) {
    }

    @Override
    public String toString() {
        return "uniform recombination (" + probability + ")";
    }
}