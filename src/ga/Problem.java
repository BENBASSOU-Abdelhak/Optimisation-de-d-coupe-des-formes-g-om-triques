package ga;

public interface Problem<E extends Individual> {

    // Cette méthode renvoie un nouvel individu.

    E getNewIndividual();
}
