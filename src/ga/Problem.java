package ga;

public interface Problem<E extends Individual> {

    // Cette m�thode renvoie un nouvel individu.

    E getNewIndividual();
}
